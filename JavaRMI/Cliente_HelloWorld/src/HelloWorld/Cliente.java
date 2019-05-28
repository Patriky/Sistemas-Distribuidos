package HelloWorld;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) throws RemoteException {

        try {
            //Utilizando o metodo getRegistry para obter uma referencia do SN que está executando no Servidor
            Registry referenciaServicoNomes = LocateRegistry.getRegistry();

            //para obter uma referência de objeto remoto -- serviço disponível
            InterfaceServ serv = (InterfaceServ) referenciaServicoNomes.lookup("HelloWorld");
            //HelloWOrld eh o nome do serviço do servidor ---- serv é a referencia do SN

            CliImpl cli =  new CliImpl(serv);


        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nFora do Try");
    }

}
