package demo1;

public class Student {
    String name;
    String regNumber;
    String department;
    double score;

    public Student(String name, String regNumber, double score, String dept) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
        this.department = dept;
    }

    @Override
    public String toString() {
        return ("Name: " + name +
                "\nReg Number: " + regNumber +
                "\nDept: " + department +
                "\nMarks: " + score +
                "\n******");
    }
}
