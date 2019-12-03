package Model;

public class Moto extends Transporte {
    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(double tarifa, int salidaKm) {
        return tarifa * Math.abs(salidaKm - entradaKm);
    }
}
