package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMotorista extends Remote {
    double notificacaoMot(double preco,String itinerario) throws RemoteException;
    //Recebe oferta e diz se aceita ou aumenta o valor // Parametro info e doble valor

    void notificacaoConfirmacao() throws RemoteException;
}