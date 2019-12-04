package Exceptions;

public class PlacaYaExistenteException extends Exception {
    public String getMessage() {
        return "La placa que quiere ingresar ya existe.";
    }
}
