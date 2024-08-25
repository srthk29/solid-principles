import demo2.DistinctionDecider;
import demo2.Student;
import demo2.ArtsDistinctionDecider;
import demo2.ArtsStudent;
import demo2.ScienceDistinctionDecider;
import demo2.ScienceStudent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** A demo without OCP. ***");

        List<demo1.Student> enrolledStudents = enrollStudents();

        // Display all results
        System.out.println("===Results:===");
        for (demo1.Student student: enrolledStudents) {
            System.out.println(student);
        }

        System.out.println("===Distinctions:===");
        demo1.DistinctionDecider distinctionDecider = new demo1.DistinctionDecider();

        // Evaluate distinctions
        for (demo1.Student student: enrolledStudents) {
            distinctionDecider.evaluateDistinction(student);
        }

        System.out.println("*** A demo that follows the OCP.***");
        List<Student> scienceStudents = enrollScienceStudents();
        List<Student> artsStudents = enrollArtsStudents();

        // Display all results.
        System.out.println("===Results:===");
        for (Student student : scienceStudents) {
            System.out.println(student);
        }
        for (Student student : artsStudents) {
            System.out.println(student);
        }

        // Evaluate distinctions.
        DistinctionDecider scienceDistinctionDecider =
                new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider =
                new ArtsDistinctionDecider();

        System.out.println("===Distinctions:===");
        for (Student student : scienceStudents) {
            scienceDistinctionDecider.evaluateDistinction(student);
        }
        for (Student student : artsStudents) {
            artsDistinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam","R1",81.5,"Comp.Sc.");
        Student bob = new ScienceStudent("Bob","R2",72,"Physics");
        List<Student> scienceStudents = new ArrayList<>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71,"History");
        Student kate = new ArtsStudent("Kate", "R4", 66.5,"English");
        List<Student> artsStudents = new ArrayList<>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }

    private static List<demo1.Student> enrollStudents() {
        demo1.Student sam = new demo1.Student("Sam", "R1", 81.5, "Comp.Sc.");
        demo1.Student bob = new demo1.Student("Bob", "R2", 72, "Physics");
        demo1.Student john = new demo1.Student("John", "R3", 71, "History");
        demo1.Student kate = new demo1.Student("Kate", "R4", 66.5, "English");

        List<demo1.Student> students = new ArrayList<>();
        students.add(sam);
        students.add(bob);
        students.add(john);
        students.add(kate);
        return students;
    }
}