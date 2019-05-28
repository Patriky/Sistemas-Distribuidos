package transfers;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Motorista {
    public static void main(String[] args) throws RemoteException, NotBoundException {

            Registry registry = LocateRegistry.getRegistry();


            InterfaceMotorista serv = (InterfaceMotorista) registry.lookup("ServicoMotorista");

            InterfaceMotorista_Impl teste = new InterfaceMotorista_Impl(serv);

    }
}
