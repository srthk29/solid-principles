import demo1.UserInterface;
import demo2.Database;
import demo2.MySQLDatabase;
import demo2.OracleDatabase;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** A demo without DIP.***");
        UserInterface userInterface = new UserInterface();
        userInterface.saveEmployeeId("E0001");

        System.out.println("*** A demo that follows the DIP ***");

        Database database = new OracleDatabase();
        demo2.UserInterface userInterface1 = new demo2.UserInterface(database);

        userInterface1.saveEmployeeId("E0001");

        database = new MySQLDatabase();
        userInterface1 = new demo2.UserInterface(database);
        userInterface1.saveEmployeeId("E0002");
    }
}