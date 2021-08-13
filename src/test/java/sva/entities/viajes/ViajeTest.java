package sva.entities.viajes;

import org.junit.Test;

public class ViajeTest {

    @Test
    public void viajeTest(){
        Viaje viaje = new Viaje();

        Escala escala1 = new Escala();
        Escala escala2 = new Escala();
        viaje.agregarEscala(escala1);
        viaje.agregarEscala(escala2);


        System.out.println(viaje.cantEscalas());
    }
}
