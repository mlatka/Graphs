package sample;

public class Student implements Comparable <Student> {

    private int age;
    private double gpa;
    private String name;

    public Student(int age, double gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return name + " : " + age + " : " + gpa;
    }
}
