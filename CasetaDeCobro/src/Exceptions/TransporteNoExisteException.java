package Exceptions;

public class TransporteNoExisteException extends Exception{
    public String getMessage(){
        return "El vehículo a cobrar no existe.";
    }
}
