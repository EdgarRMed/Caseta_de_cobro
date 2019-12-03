package Model;

import java.util.ArrayList;

public class Caseta {
    public ArrayList<Transporte> transportes;
    public int longitudCarretera, ubicacionCaseta;
    private double tarifa;
    public final String password = "ps";

    public void agregarTransporte(Transporte t) {
        this.agregarTransporte(t, ubicacionCaseta);
    }

    public void agregarTransporte(Transporte t, int entradaKm) {
        t.setEntradaKm(entradaKm);
        transportes.add(t);
    }

    public void setCaseta(int longitudCarretera, int ubicacionCaseta, double tarifa) {
        this.longitudCarretera = longitudCarretera;
        this.ubicacionCaseta = ubicacionCaseta;
        this.tarifa = tarifa;
    }

    public double cobrarTransporte(String placa) {
        for (Transporte t: transportes) {
            if (t.getPlaca().equals(placa)) {
                return t.calcularTarifa(tarifa, ubicacionCaseta);
                //TODO: Hacer algo con cobro
            }
        }
        return -1;
    }
}
