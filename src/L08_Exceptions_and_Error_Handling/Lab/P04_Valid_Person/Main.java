package L08_Exceptions_and_Error_Handling.Lab.P04_Valid_Person;

public class Main {
    public static void main(String[] args) {
        try {
            Person peter = new Person("Franco", "Aimee", 19);
            Person noName = new Person("   ", "Aimee", 19);
            Person noLastName = new Person("Franco", null, 19);
            Person negativeAge = new Person("Franco", "Aimee", -1);
            Person tooOldForThisProgram = new Person("Franco", "Aimee", 121);
        }

        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
