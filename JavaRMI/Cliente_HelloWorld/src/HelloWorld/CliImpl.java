package HelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CliImpl extends UnicastRemoteObject implements InterfaceCli {

    InterfaceServ cliente = null;
    public CliImpl(InterfaceServ serv) throws RemoteException{
        this.cliente = serv;
        cliente.chamar( "Cliente1", this);

    }

    public void echo(String str) throws RemoteException {
        System.out.printf("[echo]: " + str);


    }
}
