package transfers;

import javax.swing.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InterfaceServidor_Impl extends UnicastRemoteObject implements InterfaceServidor {


    ArrayList<Cotacao> cotacoes = new ArrayList();
    ArrayList<Oferta> ofertas = new ArrayList();


    InterfaceServidor_Impl() throws RemoteException {
        super();
    }

    // Método disponível para Clientes
    @Override
    public void cotar(InterfaceCliente interfaceCli) throws RemoteException {

        Cotacao cot =new Cotacao(interfaceCli);
        cotacoes.add(cot);

        verificaInteresse(cot, interfaceCli);
    }

    //Método disponível para Motoristas
    @Override
    public void ofertar(InterfaceMotorista interfaceMotorista) throws RemoteException {

        Oferta ofer =new Oferta(interfaceMotorista);
        ofertas.add(ofer);
    }
    // VERIFICA SE HA ALGUMA COTAÇÃO
    public void verificaInteresse(Cotacao cotacao , InterfaceCliente interfaceCli) throws RemoteException {
        /**
         * Caminhando por todos os motoristas disponíveis
         * */
        for(Oferta of : ofertas) {
            /**
             * Verifica se o motorista disponível tem as mesmas caracteristas que
             * o solicitado pelo cliente
             * */
            if (cotacao.getTipo_veiculo() == of.getTipo_veiculo() && cotacao.getNum_passageiro() <= of.getNum_passageiro()){

                InterfaceMotorista motorista = (InterfaceMotorista) of.getMotorista(); //instancia um obj do motorista
                /**
                 * Verifica se motorista aceita o preco inicial proposto pelo cliente
                 * 0 = Aceitou
                 * 1 = Motorista decidiu diminuir o valor
                 * -1= Nada, mas buga o código. Se der tempo, corrigir isso.
                 * */
                double respostaMotorista = motorista.notificacaoMot(cotacao.getPreço(), cotacao.getItinerario());
                if (respostaMotorista == 0){

                    //Notificando o cliente e passando o nome do motorista
                    double respostaCLiente = interfaceCli.notificacaoCli(0,"João da Silva");
                    if (respostaCLiente == 0){
                        interfaceCli.notificacaoConfirmacao();
                        motorista.notificacaoConfirmacao();
                        System.out.println("Corrida aceita");
                        //deletar os dois do array
                        cotacoes.remove(cotacao);
                        ofertas.remove(of);
                    }
                }else{
                    double respostaCLiente = interfaceCli.notificacaoCli(respostaMotorista,"João da Silva");
                    if (respostaCLiente==0){
                        interfaceCli.notificacaoConfirmacao();
                        motorista.notificacaoConfirmacao();
                        System.out.println("Corrida aceita");
                        //deletar os dois do array
                        cotacoes.remove(cotacao);
                        ofertas.remove(of);
                    }
                }
                break;
            }else {
                System.out.println("CARROS DIFERENTES");
            }
        }
    }





}
