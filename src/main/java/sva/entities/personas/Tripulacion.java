package sva.entities.personas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tripulacion {
    private List<Personal> personal;

    public Tripulacion(){
        this.personal = new ArrayList<>();
    }


    public Integer cantPersonal(){
        return this.personal.size();
    }

    public Integer cantVuelosQueRealizasteEntre(LocalDate fechaInicial, LocalDate fechaFinal){
//        Period.between(fechaInicial, fechaFinal);
        Integer count = 0;
        if(fechaFinal.isAfter(fechaFinal)){
            count += 1;
        }
        return count;

    }


    //... parametros variables , puede haber 1 o varios pero SIEMPRE que sean de clase Personal

    public void agregarPersonal(Personal ... personal){
        //Primer parametro el array que le queres agregar
        //El segundo parametro lo que queres agregar

        Collections.addAll(this.personal, personal);
    }

}
