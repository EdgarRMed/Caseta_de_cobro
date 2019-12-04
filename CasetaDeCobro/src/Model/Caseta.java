package Model;

import Exceptions.FueraDeRangoException;
import Exceptions.NumeroNegativoException;
import Exceptions.PlacaYaExistenteException;

import java.util.ArrayList;

public class Caseta {
    public ArrayList<Transporte> transportes = new ArrayList<>();
    public int longitudCarretera, ubicacionCaseta;
    public double tarifa;
    public final String password = "ps";

    public void agregarTransporte(Transporte t) throws NumeroNegativoException, FueraDeRangoException, PlacaYaExistenteException {
        this.agregarTransporte(t, ubicacionCaseta);
    }

    public void agregarTransporte(Transporte t, int entradaKm) throws NumeroNegativoException, FueraDeRangoException, PlacaYaExistenteException {
        if (entradaKm < 0)
            throw new NumeroNegativoException();
        else if (entradaKm > longitudCarretera)
            throw new FueraDeRangoException();

        for (Transporte t2: transportes) {  //checa si la placa se repite
            if (t2.placa.equals(t.placa))
                throw new PlacaYaExistenteException();
        }

        t.setEntradaKm(entradaKm);
        transportes.add(t);
    }

    public void setCaseta(int longitudCarretera, int ubicacionCaseta, double tarifa) throws NumeroNegativoException, FueraDeRangoException {
        if (longitudCarretera < 0 || ubicacionCaseta < 0 || tarifa < 0)
            throw new NumeroNegativoException();
        else if (ubicacionCaseta > longitudCarretera)
            throw new FueraDeRangoException();

        this.longitudCarretera = longitudCarretera;
        this.ubicacionCaseta = ubicacionCaseta;
        this.tarifa = tarifa;
    }

  
}
