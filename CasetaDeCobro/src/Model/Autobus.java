package Model;

import Exceptions.CampoVacioException;
import Exceptions.NumeroNegativoException;

public class Autobus extends Transporte {
    public Autobus(String placa) throws CampoVacioException {
        super(placa);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) throws NumeroNegativoException {
        if (salidaKm < 0)
            throw new NumeroNegativoException();
        return tarifa * Math.abs(salidaKm - entradaKm) * 4;
    }
}
