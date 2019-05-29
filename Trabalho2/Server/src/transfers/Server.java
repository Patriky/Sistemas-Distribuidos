package transfers;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {

        try {
            Registry referenceServiceNames = LocateRegistry.createRegistry(1099);

            InterfaceServidorCliente_Impl servicoCliente = new InterfaceServidorCliente_Impl();
            InterfaceServidorMotorista_impl servidorMotorista = new InterfaceServidorMotorista_impl();


            referenceServiceNames.rebind("ServicoMotorista", servidorMotorista);
            referenceServiceNames.rebind("ServicoCliente", servicoCliente);
            System.out.printf("\nIniciando servidor...\n");


        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
