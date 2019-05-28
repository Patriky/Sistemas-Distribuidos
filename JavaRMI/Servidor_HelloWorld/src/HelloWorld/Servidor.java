package HelloWorld;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) throws RemoteException {

        //Iniciando SERVIÇO DE NOMES, na porta 1099
        Registry referencia = LocateRegistry.createRegistry(1099);

        //Criando um obj que implementa a interface do servidor
        ServImpl inter = new ServImpl();

        //Registrando no serviço RMI com o nome de HelloWorld, para que possa ser encontrado pelos clientes
        referencia.rebind("HelloWorld", inter);
        System.out.printf("Server init...\n");

    }
}
