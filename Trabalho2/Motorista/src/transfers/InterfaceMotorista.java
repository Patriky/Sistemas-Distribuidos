package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMotorista extends Remote {
    double notificacaoMot(double preco,String itinerario) throws RemoteException;
    void notificacaoConfirmacao() throws RemoteException;
}