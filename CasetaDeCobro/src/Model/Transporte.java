package Model;

import Exceptions.CampoVacioException;
import Exceptions.NumeroNegativoException;

public abstract class Transporte {
    protected int entradaKm;
    protected String placa;

    public Transporte(String placa) throws CampoVacioException {
        if (placa.equals(""))
            throw new CampoVacioException();
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
    
    public abstract double calcularTarifa(double tarifa, int salidaKm) throws NumeroNegativoException;
}
