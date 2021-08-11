package sva.entities.personas;

import org.junit.Assert;
import org.junit.Test;

public class TripulacionTest {

    @Test
    public void tripulacionTieneCuatroPersonasTest(){
        Tripulacion unaTripulacion = new Tripulacion();

        Personal p1 = new Personal();
        Personal p2 = new Personal();
        Personal p3 = new Personal();
        Personal p4 = new Personal();

        unaTripulacion.agregarPersonal(p1,p2,p3,p4);
        Assert.assertEquals(4, unaTripulacion.cantPersonal().intValue());
        System.out.println(unaTripulacion.cantPersonal());
    }
}
