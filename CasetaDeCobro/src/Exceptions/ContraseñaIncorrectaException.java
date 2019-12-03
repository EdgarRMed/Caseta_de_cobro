package Exceptions;

public class ContraseñaIncorrectaException extends Exception {
    public String getMessage(){
        return "Contraseña incorrecta, vuelva a intentarlo";
    }
}
