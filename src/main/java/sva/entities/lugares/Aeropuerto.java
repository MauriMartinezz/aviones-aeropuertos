package sva.entities.lugares;

import java.time.LocalDate;

public class Aeropuerto {
    private Ciudad ciudad;
    public Integer cantVuelosEnEscalas(){
        //TODO
        return null;
    }

    public Integer cantVuelosQueLlegaronEl(LocalDate unDia){
        //TODO
        return null;
    }

    public Integer cantVuelosQuePartieronEl(LocalDate unDia){
        //TODO
        return null;
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
