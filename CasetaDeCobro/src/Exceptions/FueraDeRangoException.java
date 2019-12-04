package Exceptions;

public class FueraDeRangoException extends Exception {
    public String getMessage(){
        return "El km excede la longitud de la carretera.";
    }
}
