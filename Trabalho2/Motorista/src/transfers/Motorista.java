package transfers;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Motorista {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        InterfaceServidor referencia = (InterfaceServidor) Naming.lookup("ServicoServidor");

        InterfaceMotorista_Impl motorista = new InterfaceMotorista_Impl(referencia);
    }
}
