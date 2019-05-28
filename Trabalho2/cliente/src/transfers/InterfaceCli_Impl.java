package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterfaceCli_Impl extends UnicastRemoteObject implements InterfaceCliente {


    protected InterfaceCli_Impl() throws RemoteException {

    }

    @Override
    public void notificacaoCli() throws RemoteException {
        System.out.println("Echo");
    }
}
