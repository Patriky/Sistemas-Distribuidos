package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCliente extends Remote {
    void notificacaoCli() throws RemoteException;
}