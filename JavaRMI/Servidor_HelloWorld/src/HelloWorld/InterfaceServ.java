package HelloWorld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServ extends Remote {
    void chamar(String str, InterfaceCli interfaceCLi) throws RemoteException;
}
