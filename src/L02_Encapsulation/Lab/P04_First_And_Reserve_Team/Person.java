package L02_Encapsulation.Lab.P04_First_And_Reserve_Team;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3)
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3)
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        else
            this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new IllegalArgumentException("Age cannot be zero or negative integer");

        else
            this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460.0)
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");

        else
            this.salary = salary;
    }

    public void increaseSalary(double bonus) {
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
