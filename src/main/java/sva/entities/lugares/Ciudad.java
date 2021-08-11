package sva.entities.lugares;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public Integer cantPasajerosQuellegaronEl(LocalDate unDia){
        //TODO
        return null;
    }

}
