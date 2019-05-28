package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMotorista extends Remote {
//    void ofertar(InterfaceMotorista interfaceMotorista) throws RemoteException;
    void notificacaoMot() throws RemoteException;
}