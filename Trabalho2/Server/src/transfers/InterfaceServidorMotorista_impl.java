package transfers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class InterfaceServidorMotorista_impl extends UnicastRemoteObject implements InterfaceServidorMotorista {

    Map<InterfaceCliente, Cotacao> m = new HashMap();
    InterfaceMotorista motorista = null;

    protected InterfaceServidorMotorista_impl() throws RemoteException {
    }


    @Override
    public void print(InterfaceServidorMotorista interfaceServidorMotorista) throws RemoteException {
        System.out.println("Motorista: "+ interfaceServidorMotorista.toString());
        motorista.notificacaoMot();

    }
}
