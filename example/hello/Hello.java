package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
    int soma(int a, int b) throws RemoteException;
    int subtrair(int a, int b) throws RemoteException;
    double multiplicar(double a, double b) throws RemoteException;
    double dividir(double a, double b) throws RemoteException;

}
