package Exceptions;

public class CampoVacioException extends Exception {
    public String getMessage() {
        return "Alguno(s) de los campos está(n) vacío(s). Llénelos todos.";
    }
}
