package L02_Encapsulation.Lab.P02_Salary_Increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (this.getAge() < 30)
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));

        else
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.######");
        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), df.format(salary));
    }
}
