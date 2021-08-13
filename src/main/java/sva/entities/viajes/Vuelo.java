package sva.entities.viajes;

import sva.entities.lugares.Aeropuerto;
import sva.entities.personas.Pasajero;
import sva.entities.personas.Tripulacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private Aeropuerto origen, destino;
    private Avion avion;
    private LocalDateTime fechaHoraSalida;
    private Double duracionAproxEnMins;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public Vuelo(){
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    public Double capacidadOcupadaPorPasajeros(){
        //TODO
        return null;
    }

    public Integer cantPasajeros(){
        return this.pasajeros.size();
    }

    public Double getDuracionAproxEnMins(){
        return duracionAproxEnMins;
    }

    public LocalDateTime fechaHoraAproxLlegada(){
        //TODO
        return null;
    }
}
