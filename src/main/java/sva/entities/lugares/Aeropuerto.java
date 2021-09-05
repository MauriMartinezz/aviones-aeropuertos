package sva.entities.lugares;

import sva.entities.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aeropuerto {
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public Aeropuerto(){
        this.vuelos = new ArrayList<>();
    }
    public Integer cantVuelosEnEscalas(){
        Integer count = 0;
        for (int i = 0; i < this.vuelos.size(); i++) {
            if(vuelos.get(i).tuDestinoEs(this.ciudad)){
                count += 1;
            }
        }
        return count;
    }

    public Integer cantVuelosQueLlegaronEl(LocalDate unDia){
        return this.vuelosQueLlegaronElDia(unDia).size();
    }

    public List<Vuelo> vuelosQueLlegaronElDia(LocalDate unDia){
        return this.vuelos.stream()
                .filter((Vuelo v) -> v.fechaHoraLllegada().toLocalDate().isEqual(unDia))
                .collect(Collectors.toList());
                //Filter devuelve un Stream, pero necesitamos devolver un List<Vuelo>
                //.collect(Collectors.toList() vuelve a hacer un List
    }

    public List<Vuelo> cantVuelosQuePartieronEl(LocalDate unDia){
        return this.vuelos.stream()
                .filter((Vuelo v)-> v.getFechaHoraSalida().toLocalDate().isEqual(unDia))
                .collect(Collectors.toList());
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public boolean estasEn(Ciudad unaCiudad) {
        //equals compara 2 objetos
        //compara si la ciudad de Aeropuerto es la misma que le pasas como parametro
        return this.ciudad.equals(unaCiudad);
    }
}
