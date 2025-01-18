import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            DatabaseService service = (DatabaseService) registry.lookup("DatabaseService");
            
            List<Student> students = service.getAllStudents();
            
            System.out.println("Students from database:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.err.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}