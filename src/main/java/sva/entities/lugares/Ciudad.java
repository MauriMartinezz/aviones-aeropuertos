package sva.entities.lugares;

import sva.entities.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private List<Aeropuerto> aeropuertos;

    public Ciudad(){
        this.aeropuertos = new ArrayList<>();
    }

    public void agregarAeropuerto(Aeropuerto ... aeropuertos){
        Collections.addAll(this.aeropuertos, aeropuertos);
    }

    public Integer cantAeropuertos(){
        return this.aeropuertos.size();
    }

    /**
     * @param unDia Es el dia que me interesa saber cuantos pasajeros llegaron
     * @return Devuelve la cantidad de pasajeros que llegaron en un dia determinado
     */
    public Integer cantPasajerosQuellegaronEl(LocalDate unDia){
        /**
         * TENGO UNA COLECCION DE AEROPUERTOS
         * A CADA AEROPUERTO ME INTERESA PEDIRLE LOS VUELOS
         * QUE LLEGARON EN UN DIA EN PARTICULAR -> COLECCION DE VUELOS
         * A CADA VUELO, ME INTERESA PEDIRLE LA CANT DE PASAJEROS -> COLECCION DE NUMEROS
         * UNA VEZ LO TENGO -> SUMO
         */

        /**
         * flatMap Lo que hace es reducir una colección de colecciones.
         * Cuando tenemos una colección de A que contiene una colección de B flatMap nos devuelve una colección de todas las B que hay dentro de las colecciones A.
         */

        List<Vuelo> vuelosQueLlegaronEseDia = this.aeropuertos
                .stream()
                .flatMap((Aeropuerto a) -> a.vuelosQueLlegaronElDia(unDia).stream())
                        .collect(Collectors.toList());
        //Solo se puede llamar al :: si no recibe parametros
        return vuelosQueLlegaronEseDia.stream().mapToInt(Vuelo::cantPasajeros).sum();
    }
}
