package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidor extends Remote {
    void cotar(InterfaceCliente interfaceCliente) throws RemoteException; //Método para o cliente entrar com os dados de cotação
}
