package transfers;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            InterfaceServidor_Impl servicoCliente = new InterfaceServidor_Impl();
            registry.rebind("ServicoServidor", servicoCliente);
            System.out.printf("\nIniciando servidor...\n");



        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
