package example.clock;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.LocalTime;

public class ClockImplem extends UnicastRemoteObject implements Clock {

    public ClockImplem(int port) throws RemoteException {
        super(port);
    }

    public String whatTimeIsIt() throws RemoteException {
        return LocalTime.now().toString();
    }

    public String whatDateIsIt() throws RemoteException {
        return LocalDate.now().toString();
    }
}
