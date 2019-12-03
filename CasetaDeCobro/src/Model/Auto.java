package Model;

public class Auto extends Transporte {
    public Auto(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm) * 1.5;
    }
}
