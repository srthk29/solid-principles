import demo1.Employee;
import demo2.EmployeeIdGenerator;
import demo2.SeniorityChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** A demo without SRP ***");
        Employee robin = new Employee("Robin", "Smith", 7.5);
        showEmpDetails(robin);

        System.out.println("\n*********\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        showEmpDetails(kevin);

        System.out.println("\n*** A demo that follows the SRP ***");
        demo2.Employee r = new demo2.Employee("Robin", "Smith", 7.5);
        showEmpDetails(r);

        System.out.println("\n*********\n");

        demo2.Employee k = new demo2.Employee("Kevin", "Proctor", 3.2);
        showEmpDetails(k);
    }

    private static void showEmpDetails(Employee emp) {
        emp.displayEmpDetail();
        //System.out.println("The employee id: " + emp.generateEmpId(emp.firstName));
        //System.out.println("The employee is a " + emp.checkSeniority(emp.experienceInYears) + " employee.");

        System.out.println(STR."The employee id: \{emp.generateEmpId(emp.firstName)}");
        System.out.println(STR."The employee is a \{emp.checkSeniority(emp.experienceInYears)} employee.");
    }

    private static void showEmpDetails(demo2.Employee emp) {
        emp.displayEmpDetail();

        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        String empId = idGenerator.generateEmpId(emp.firstName);
        System.out.println("The employee id: " + empId);

        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("The employee id a " +
                seniorityChecker.checkSeniority(emp.experienceInYears) +
                " employee.");
    }
}
