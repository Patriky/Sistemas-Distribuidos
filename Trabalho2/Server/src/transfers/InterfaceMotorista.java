package transfers;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMotorista extends Remote {
    void ofertar(InterfaceMotorista interfaceMotorista) throws RemoteException; //Método para o motorista entrar com os dados de cotação

}
