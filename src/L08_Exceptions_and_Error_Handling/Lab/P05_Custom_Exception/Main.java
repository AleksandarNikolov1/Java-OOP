package L08_Exceptions_and_Error_Handling.Lab.P05_Custom_Exception;

public class Main {
    public static void main(String[] args) {

        try {
            Student student = new Student("Alek0 leko", "email");
        }
        catch (InvalidPersonNameException e){
            System.out.println(e.getMessage());
        }
    }
}
