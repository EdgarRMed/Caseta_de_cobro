package Exceptions;

public class NumeroNegativoException extends Exception {
    public String getMessage(){
        return "No ingrese numeros negativos.";
    }
}

