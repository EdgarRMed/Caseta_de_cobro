package Model;

import java.util.ArrayList;

public class Caseta {
    public ArrayList<Transporte> transportes = new ArrayList();
    public int longitudCarretera, ubicacionCaseta;
    public double tarifa;
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

  
}
