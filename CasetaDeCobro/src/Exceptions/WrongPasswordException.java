package Exceptions;

public class WrongPasswordException extends Exception {
    public String getMessage() {
        return "Contraseña incorrecta, vuelva a intentarlo.";
    }
}
