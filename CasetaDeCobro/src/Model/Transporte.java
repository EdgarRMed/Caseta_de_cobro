package Model;

public abstract class Transporte {
    protected int entradaKm;
    protected String placa;

    public Transporte(String placa) {
        this.placa = placa;
    }

    public void setEntradaKm(int entradaKm) {
        this.entradaKm = entradaKm;
    }

    public String getPlaca() {
        return placa;
    }

    public int getEntradaKm() {
        return entradaKm;
    }
    
    public abstract double calcularTarifa(double tarifa, int salidaKm);
}
