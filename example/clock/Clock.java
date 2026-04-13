package example.clock;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Clock  extends Remote {
    public String whatTimeIsIt() throws RemoteException;
    public String whatDateIsIt() throws RemoteException;
}
