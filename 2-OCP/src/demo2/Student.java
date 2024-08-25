package demo2;

public abstract class Student {
    String name;
    String regNumber;
    String department;
    double score;

    public Student(String name,
                   String regNumber,
                   double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
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
