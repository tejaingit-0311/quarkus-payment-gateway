package payment.gateway.exceptions;

public class SignatureMismatchException extends Exception{
    public SignatureMismatchException(String message){
        //new line added in SignatureMismatchExeception.java file
        // additional changes made test
        super(message);
    }
}
