package example.clock;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerClock {
    public static void main(String[] args) {
        try {
            try {
                LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            } catch (Exception e) {
            }

            ClockImplem obj = new ClockImplem(5679);
            Naming.rebind("DumbClock", obj);
            System.out.println("Servidor do relogio bobo pronto!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
