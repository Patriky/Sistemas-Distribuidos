package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidor extends Remote {
    void ofertar(InterfaceMotorista interfaceMotorista) throws RemoteException;
}
