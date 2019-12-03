package Exceptions;

public class TransporteNoExisteException extends Exception{
    public String getMessage(){
        return "El vehiuculo no existe";
    }
}
