import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface DatabaseService extends Remote {
    List<Student> getAllStudents() throws RemoteException;
}
