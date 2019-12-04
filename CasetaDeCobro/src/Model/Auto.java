package Model;

import Exceptions.CampoVacioException;
import Exceptions.NumeroNegativoException;

public class Auto extends Transporte {
    public Auto(String placa) throws CampoVacioException {
        super(placa);
        nombre="Auto";
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) throws NumeroNegativoException {
        if (salidaKm < 0)
            throw new NumeroNegativoException();
        return tarifa * Math.abs(salidaKm - entradaKm) * 1.5;
    }
}
