package transfers;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {

        try {
            //Utilizando o metodo getRegistry para obter uma referencia do SN que está executando no Servidor
            Registry referenciaServicoNomes = LocateRegistry.getRegistry();

            //para obter uma referência de objeto remoto
            //ser: Referencia de objeto remoto
            //"ServicoCliente": serviço disponível
            InterfaceServidor serv = (InterfaceServidor) referenciaServicoNomes.lookup("ServicoCliente");


            InterfaceCli_Impl referenciaCliente = new InterfaceCli_Impl();
            //Usando a referencia para acessar o método e passando a propria referencia como parametro
            serv.cotar(referenciaCliente);




        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
