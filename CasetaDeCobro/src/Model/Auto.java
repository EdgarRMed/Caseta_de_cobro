package Model;

public class Auto extends Transporte {
    public Auto(int entradaKm, String placa, String numeroSerie) {
        super(placa, numeroSerie);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm) * 1.5;
    }
}
