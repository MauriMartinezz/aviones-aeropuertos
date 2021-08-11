package sva.entities.viajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Viaje {
    private List<Escala> escalas;
    private List<Vuelo> vuelos;

    public Viaje(){
        this.escalas = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public void agregarEscala(Escala ... escalas){

        Collections.addAll(this.escalas, escalas);
    }

    public void agregarVuelo(Vuelo ... vuelos)
    {
        Collections.addAll(this.vuelos, vuelos);

    }

    public Double duracionAproxEnMins(){
        //TODO
        return null;
    }
}
