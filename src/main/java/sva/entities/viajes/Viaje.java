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

    public Integer cantEscalas(){
        return this.escalas.size();
    }

    public void agregarVuelo(Vuelo ... vuelos){
        Collections.addAll(this.vuelos, vuelos);
    }

    public Integer cantPasajerosTotales(){
//        Integer cantPasajeros = 0;
//        for(Vuelo vuelo: this.vuelos){
//            cantPasajeros += vuelo.cantPasajeros();
//        }
//        return cantPasajeros;
        //Stream

        //[v1, v2, v3, ...vn]
        //[300,210, 150, ... 155] -> mapToInt
        //Necesitamos sumarlos , esto se lo conoce como reducir o aplanar
        //El metodo sum() hace esto

//        System.out.println(this.vuelos.stream().mapToInt(vuelo -> vuelo.cantPasajeros()));
        return this.vuelos.stream().mapToInt((Vuelo v)-> v.cantPasajeros()).sum();
    }

    public Integer cantVuelos(){
        return this.vuelos.size();
    }

    private Double duracionTotalDeVuelosEnMins(){
        Double totalMins = 0.0;
        for(Vuelo vuelo : this.vuelos ){
            totalMins += vuelo.getDuracionAproxEnMins();
        }
        return totalMins;
    }

    private Double duracionTotalDeEscalasEnMins(){
        Double totalMins = 0.0;
        for(int i = 0; i < this.escalas.size(); i++){
            Escala unaEscala = this.escalas.get(i);

//            totalMins += this.escalas.get(i).getDuracionEnMins();
            totalMins += unaEscala.getDuracionEnMins();
        }
        return totalMins;
    }

    public Double duracionAproxEnMins(){
        return this.duracionTotalDeEscalasEnMins() + this.duracionTotalDeVuelosEnMins();
    }
}
