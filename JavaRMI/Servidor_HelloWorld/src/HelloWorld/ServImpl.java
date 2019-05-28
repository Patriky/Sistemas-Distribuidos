package HelloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServImpl extends UnicastRemoteObject implements InterfaceServ {

    public ServImpl() throws RemoteException{

    }

    public void chamar(String str,InterfaceCli interfaceCLi) throws RemoteException {
        System.out.println("CLiente: " + str); //str é o nome do cliente, instanciado no outro projeto
        interfaceCLi.echo("Ok"); // Chama o metodo echo, que está no lado do cliente, passando uma str qualquer

    }
}
