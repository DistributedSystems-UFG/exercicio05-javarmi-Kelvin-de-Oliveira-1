package example.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        System.out.println("Initiating client");
        
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            //Registry registry = LocateRegistry.getRegistry(host);
            //System.out.println("Registry has been located");
            //Hello stub = (Hello) registry.lookup("Hello");

            Hello stub = (Hello) Naming.lookup("rmi://" + host + "/MyHello"); 
            System.out.println("Found server");

            String response = stub.sayHello();
            System.out.println("Response: " + response);

            int result = stub.soma(100,1000);
            System.out.println("Response from soma: " + result);

            int resultS =  stub.subtrair(7, 3);
            System.out.println("Response from subtrair: " + resultS);

            double resultM = stub.multiplicar(2, 3);
            System.out.println("Response from multiplicar: " + resultM);

            double resultD = stub.dividir(2, 0);
            System.out.println("Response from dividir (com divisor igual a zero): " + resultD);

            resultD = stub.dividir(2, 4);
            System.out.println("Response from dividir: " + resultD);
            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
