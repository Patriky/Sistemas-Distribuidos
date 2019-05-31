package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCliente extends Remote {
    double notificacaoCli(double preco,String motorista) throws RemoteException;
    void notificacaoConfirmacao() throws RemoteException;
}