package sva.entities.lugares;

import org.junit.Assert;
import org.junit.Test;

public class CiudadTest {

    @Test
    public void ciudadTest(){
        Ciudad ciudad = new Ciudad();

        Aeropuerto ezeiza = new Aeropuerto();
        Aeropuerto palomar = new Aeropuerto();
        Aeropuerto aeropuertoMilitar = new Aeropuerto();
        Aeropuerto emergencia = new Aeropuerto();

        ciudad.agregarAeropuerto(ezeiza, palomar, aeropuertoMilitar,emergencia);

        Assert.assertEquals(4, ciudad.cantAeropuertos().intValue());
        System.out.println(ciudad.cantAeropuertos());
    }
}
