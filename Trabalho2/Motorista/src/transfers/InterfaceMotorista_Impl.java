package transfers;

import javax.swing.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class InterfaceMotorista_Impl extends UnicastRemoteObject implements InterfaceMotorista {

    Scanner in = new Scanner(System.in);
    public InterfaceMotorista_Impl(InterfaceServidor servidor) throws RemoteException {
        servidor.ofertar(this);

    }

    @Override
    public double notificacaoMot(double preco, String itinerario) throws RemoteException {
        System.out.println("\n**** Notificação recebida! **** \n[1] para ler:");
        in.nextInt();

        int resposta = JOptionPane.showConfirmDialog(null, "Para: "+itinerario + "\nR$"+ preco + "\n[Sim]Aceitar \n[Não]diminuir?");
        if (resposta == 0){
            return 0;
        }else{
            if (resposta == 1){
                double proposta = Double.parseDouble( JOptionPane.showInputDialog("Sugira um novo valor!"));
                return proposta;

            }
        }
        return -1;
    }

    //Reservando Transfer
    @Override
    public void notificacaoConfirmacao() throws RemoteException {
        System.out.println("\n**** Notificação recebida!\n[1] para ler: ****");
        in.nextInt();
        JOptionPane.showMessageDialog(null, "Corrida aceita!");
        //Chamar algum metodo para notificar o cliente e tirar ambos do
    }


}
