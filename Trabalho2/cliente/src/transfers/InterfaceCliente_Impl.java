package transfers;

import javax.swing.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class InterfaceCliente_Impl extends UnicastRemoteObject implements InterfaceCliente {

    Scanner in = new Scanner(System.in);
    protected InterfaceCliente_Impl(InterfaceServidor servidor) throws RemoteException {

        servidor.cotar(this);
    }

    //Notificação para o cliente aceitar ou sugerir um novo preço
    @Override
    public double notificacaoCli(double preco,String motorista) throws RemoteException {
        System.out.println("\n**** Notificação recebida! **** \n(1. ler)");
        in.nextInt();
        if (preco ==0){
            int proposta = JOptionPane.showConfirmDialog(null,"Motorista: "+ motorista);

            if (proposta == 0){
                return 0;
            /*Chamar notificacao para motorista informando que a corrida foi aceita e parar
              de receber notificação
            */
            } else{
                return Double.parseDouble(JOptionPane.showInputDialog("Digite a proposta!"));

            }
        }else{
            int proposta = JOptionPane.showConfirmDialog(null, motorista + " deseja diminuir o valor" +
                    "\nNovo preço proposto: R$"+preco + "\nAceita?");

            return proposta;
        }
    }

    //Notificação de confirmação de reserva de transfer
    @Override
    public void notificacaoConfirmacao() throws RemoteException {
        System.out.println("\n**** Notificação recebida!\n[1] para ler: ****");
        in.nextInt();
        JOptionPane.showMessageDialog(null, "Transfer reservado!");
        //Chamar algum metodo para notificar o cliente e tirar ambos do
    }
}
