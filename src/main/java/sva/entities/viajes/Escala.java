package sva.entities.viajes;

import sva.entities.lugares.Aeropuerto;

public class Escala {
    private Aeropuerto aeropuerto;
    private Double duracionEnMins;

    public Escala(){
    }

    public Aeropuerto getAeropuerto() {
        return this.aeropuerto;
    }

    public void setDuracionEnMins(Double duracionEnMins) {
        this.duracionEnMins = duracionEnMins;
    }

    public Double getDuracionEnMins() {
        return duracionEnMins;
    }
}
