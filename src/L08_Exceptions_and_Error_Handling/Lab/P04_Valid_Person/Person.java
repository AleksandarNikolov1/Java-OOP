package L08_Exceptions_and_Error_Handling.Lab.P04_Valid_Person;

public class Person {
    private String firsName;
    private String lastName;
    private int age;

    public Person(String firsName, String lastName, int age) {
        setFirsName(firsName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
       isNullOrEmpty(firsName, "first");
       this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        isNullOrEmpty(lastName, "last");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120)
            throw new IllegalArgumentException("Age should be in the range [0 ... 120]");

        this.age = age;
    }

    private void isNullOrEmpty(String str, String nameType){
        if (str == null || str.trim().isEmpty()){
            throw new IllegalArgumentException("The " + nameType + " name cannot be null or empty");
        }
    }
}
