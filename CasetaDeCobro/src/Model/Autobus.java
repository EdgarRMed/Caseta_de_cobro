package Model;

public class Autobus extends Transporte {
    public Autobus(int entradaKm, String placa, String numeroSerie) {
        super(placa);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm) * 4;
    }
}
