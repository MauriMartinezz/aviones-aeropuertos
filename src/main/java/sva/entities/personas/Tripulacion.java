package sva.entities.personas;

import java.time.LocalDate;
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
        //TODO
        return null;
    }


    //... parametros variables , puede haber 1 o varios pero SIEMPRE que sean de clase Personal

    public void agregarPersonal(Personal ... personal){
        //Primer parametro el array que le queres agregar
        //El segundo parametro lo que queres agregar

        Collections.addAll(this.personal, personal);
    }

}
