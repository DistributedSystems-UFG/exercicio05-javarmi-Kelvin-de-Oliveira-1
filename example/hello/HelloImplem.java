package example.hello;

import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImplem extends UnicastRemoteObject implements Hello {

    public HelloImplem(int port) throws RemoteException {
        super(port);
    }

    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }

    public int soma (int a, int b) throws RemoteException {
        return a + b;
    }

    public double multiplicar(double a, double b) throws RemoteException{
        return a * b;
    }

    public double dividir(double a, double b) throws RemoteException{
        if (b == 0){
            return -1;
        }
        return a / b;
    }

    public int subtrair(int a, int b) throws RemoteException {
        return a - b;
    }
}
