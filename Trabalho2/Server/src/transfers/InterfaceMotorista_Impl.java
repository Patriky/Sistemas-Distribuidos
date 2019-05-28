package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterfaceMotorista_Impl extends UnicastRemoteObject implements InterfaceMotorista {

    protected InterfaceMotorista_Impl() throws RemoteException {
    }

    @Override
    public void ofertar(InterfaceMotorista interfaceMotorista) throws RemoteException {
        System.out.println("Motorista: "+ interfaceMotorista.toString());

    }

}
