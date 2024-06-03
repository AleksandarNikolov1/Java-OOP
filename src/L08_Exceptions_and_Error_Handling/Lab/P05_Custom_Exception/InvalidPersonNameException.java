package L08_Exceptions_and_Error_Handling.Lab.P05_Custom_Exception;

public class InvalidPersonNameException extends RuntimeException{
    public InvalidPersonNameException(String message){
        super(message);
    }
}
