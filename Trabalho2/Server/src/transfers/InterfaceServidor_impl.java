package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class InterfaceServidor_impl extends UnicastRemoteObject implements InterfaceServidor {

    Map<InterfaceCliente, Cotacao> m = new HashMap();
    protected InterfaceServidor_impl() throws RemoteException {

    }

    @Override
    public void cotar(InterfaceCliente interfaceCli) throws RemoteException {
        m.put(interfaceCli,new Cotacao());

        System.out.println("Chamou Cotar");
        interfaceCli.notificacaoCli();
    }
}
