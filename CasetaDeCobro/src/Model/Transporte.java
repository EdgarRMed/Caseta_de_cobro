package Model;

public abstract class Transporte {
    protected int entradaKm;
    protected String placa, numeroSerie;

    public Transporte(String placa, String numeroSerie) {
        this.placa = placa;
        this.numeroSerie = numeroSerie;
    }

    public void setEntradaKm(int entradaKm) {
        this.entradaKm = entradaKm;
    }

    public String getPlaca() {
        return placa;
    }

    protected abstract double calcularTarifa(double tarifa, int salidaKm);
}
