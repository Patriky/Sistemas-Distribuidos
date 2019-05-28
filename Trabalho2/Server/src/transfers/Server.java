package transfers;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {

        try {
            Registry referenceServiceNames = LocateRegistry.createRegistry(1099);

            InterfaceServidor_impl servicoCliente = new InterfaceServidor_impl();
            InterfaceMotorista_Impl servicoMotorista = new InterfaceMotorista_Impl();

            referenceServiceNames.rebind("ServicoCliente", servicoCliente);
            referenceServiceNames.rebind("ServicoMotorista", servicoMotorista);
            System.out.printf("\nIniciando servidor...\n");


        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
