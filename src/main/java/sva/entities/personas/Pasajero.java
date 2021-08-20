package sva.entities.personas;

import sva.entities.lugares.Ciudad;
import sva.entities.viajes.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona{
    private List<Vuelo> vuelos;

    public Pasajero(){
        this.vuelos = new ArrayList<>();
    }

    public Integer cantVecesQueVisitateste(Ciudad unaCiudad){
//        Integer totalVisitas = 0;
//
//        for (int i = 0; i < totalVisitas; i++) {
//            Vuelo unVuelo = this.vuelos.get(i);
//
//            if (unVuelo.tuDestinoEs(unaCiudad)) {
//                totalVisitas++;
//            }
//        }
//        return totalVisitas;

        return (int) this.vuelos.stream().filter(v -> v.tuDestinoEs(unaCiudad)).count();
    }


    public Integer cantVuelosQueRealizaste(Ciudad unaCiudad){
        return this.vuelos.size();
    }
}
