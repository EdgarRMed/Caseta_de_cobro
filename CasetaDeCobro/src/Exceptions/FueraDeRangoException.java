package Exceptions;

public class FueraDeRangoException extends Exception {
    public String getMessage(){
        return "Cantidad excedida.";
    }
}
