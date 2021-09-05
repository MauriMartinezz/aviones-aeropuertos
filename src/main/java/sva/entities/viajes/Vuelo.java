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

    public Vuelo(){
        this.pasajeros = new ArrayList<>();
    }

    public Vuelo(Avion avion){
        this.avion = avion;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }

    public Double capacidadOcupadaPorPasajeros(){
        return (this.cantPasajeros()*100.0)/this.avion.getCantAsientosTotales();
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

//    public String formatTime(LocalDateTime fechaHora) {
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formatDateTime = fechaHora.format(format);
//        return formatDateTime;
//    }
//
//    public LocalDateTime formatStr(String fechaHora){
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        LocalDateTime dateTime = LocalDateTime.parse(fechaHora, format);
//
//        return dateTime;
//    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
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

    public LocalDateTime fechaHoraLllegada(){
        return this.fechaHoraSalida.plusMinutes(this.duracionAproxEnMins.longValue());
    }
}
