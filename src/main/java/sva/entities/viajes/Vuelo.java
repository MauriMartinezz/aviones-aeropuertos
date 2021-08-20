package sva.entities.viajes;

import sva.entities.lugares.Aeropuerto;
import sva.entities.lugares.Ciudad;
import sva.entities.personas.Pasajero;
import sva.entities.personas.Tripulacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private Aeropuerto origen, destino;
    private Avion avion;
    private LocalDateTime fechaHoraSalida;
    private Double duracionAproxEnMins;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public Vuelo(Avion avion){
        this.avion = avion;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    public Double capacidadOcupadaPorPasajeros(){
        return (this.cantPasajeros()*100.0)/this.avion.getCantAsientosTotales();
    }

    public String formatTime(LocalDateTime fechaHora) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatDateTime = fechaHora.format(format);
        return formatDateTime;
    }

    public String fechaHoraLllegada(){
        String format = formatTime(this.fechaHoraSalida.plusMinutes(this.duracionAproxEnMins.longValue()));
        return format;
    }
    public Integer cantPasajeros(){
        return this.pasajeros.size();
    }

    public Double getDuracionAproxEnMins(){
        return duracionAproxEnMins;
    }

    public void setDuracionAproxEnMins(Double duracionAproxEnMins) {
        this.duracionAproxEnMins = duracionAproxEnMins;
    }

    public boolean tuDestinoEs(Ciudad unaCiudad){
        return this.destino.estasEn(unaCiudad);
    }

    public LocalDateTime fechaHoraAproxLlegada(){
        //TODO
        return null;
    }
}
