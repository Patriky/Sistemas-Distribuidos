package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class InterfaceServidorCliente_Impl extends UnicastRemoteObject implements InterfaceServidorCliente {

    Map<InterfaceCliente, Cotacao> m = new HashMap();
    InterfaceServidorCliente_Impl() throws RemoteException {
        super();
    }


    @Override
    public void cotar(InterfaceCliente interfaceCli) throws RemoteException {
        m.put(interfaceCli,new Cotacao());
        System.out.println("interfaceCli: " + interfaceCli.toString());


        interfaceCli.notificacaoCli();
    }
}
