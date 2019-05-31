package transfers;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {

        try {
            //para obter uma referência de objeto remoto
            //ser: Referencia de objeto remoto
            //"ServicoCliente": serviço disponível
            InterfaceServidor serv = (InterfaceServidor) Naming.lookup("ServicoServidor");


            InterfaceCliente_Impl referenciaCliente = new InterfaceCliente_Impl(serv);
            //Usando a referencia para acessar o método e passando a propria referencia como parametro




        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
