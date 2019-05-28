package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMotorista extends Remote {
    void notificacaoMot() throws RemoteException;
}