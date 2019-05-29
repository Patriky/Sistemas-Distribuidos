package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidorCliente extends Remote {
    void cotar(InterfaceCliente interfaceCli) throws RemoteException; //Método para o cliente entrar com os dados de cotação
}
