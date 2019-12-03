package Model;

public class Autobus extends Transporte {
    public Autobus(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm) * 4;
    }
}
