package Model;

public class Moto extends Transporte {
    public Moto(int entradaKm, String placa, String numeroSerie) {
        super(placa, numeroSerie);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm);
    }
}
