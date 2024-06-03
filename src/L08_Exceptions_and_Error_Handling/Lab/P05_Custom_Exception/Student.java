package L08_Exceptions_and_Error_Handling.Lab.P05_Custom_Exception;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        setName(name);
        this.email = email;
    }

    private void setName(String name) {
        if (name.matches(".*[\\d\\W].*")) {
            throw new InvalidPersonNameException("Invalid name: " + name);
        }

        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
