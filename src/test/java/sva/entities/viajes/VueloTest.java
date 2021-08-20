package sva.entities.viajes;

import org.junit.Assert;
import org.junit.Test;
import sva.entities.personas.Pasajero;

public class VueloTest {
    @Test
    public void vueloConDiezPasajeros(){
        Avion avion = new Avion(100);
        Vuelo vuelo = new Vuelo(avion);

        int pasajeros = 10;
        for (int i = 0; i < pasajeros; i++) {
            Pasajero pasajeroNuevo = new Pasajero();
            vuelo.agregarPasajero(pasajeroNuevo);
        }

        int cantAsientosOcupadaEsperada = (vuelo.cantPasajeros()*100) / avion.getCantAsientosTotales();
        Assert.assertEquals(cantAsientosOcupadaEsperada, vuelo.capacidadOcupadaPorPasajeros().intValue());

        Assert.assertEquals(10, vuelo.cantPasajeros().intValue());
    }
}


