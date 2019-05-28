package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InterfaceMotorista_Impl extends UnicastRemoteObject implements InterfaceMotorista {

    private InterfaceMotorista interfaceMotorista = null;
    protected InterfaceMotorista_Impl(InterfaceMotorista interfaceMotorista) throws RemoteException {
        this.interfaceMotorista = interfaceMotorista;

    }

    @Override
    public void notificacaoMot() throws RemoteException {
        System.out.println("NotificacaoMot OK");

    }
}
