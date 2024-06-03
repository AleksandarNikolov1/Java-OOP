package L01_Working_with_Abstraction.Lab.P03_Student_System;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStatusByGrade(){
        if (grade >= 5)
            return "Excellent student.";

        else if (grade < 5.00 && grade >= 3.50)
            return "Average student.";

        else
            return "Very nice person.";
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s", name, age, getStatusByGrade());
    }
}
