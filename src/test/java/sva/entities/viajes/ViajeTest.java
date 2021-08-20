package sva.entities.viajes;

import org.junit.Assert;
import org.junit.Test;
import sva.entities.personas.Pasajero;

import java.time.LocalDateTime;

public class ViajeTest {
    @Test
    public void viajeTest(){
        Viaje viaje = new Viaje();

        int cantEscalas = 3;
        for (int i = 0; i < cantEscalas; i++) {
            Escala escala = new Escala();
            escala.setDuracionEnMins(15.0);
            viaje.agregarEscala(escala);
        }

        int cantVuelos = 4;
        int cantPasajeros = 50;
        for (int i = 0; i < cantVuelos; i++) {
            Vuelo vuelo = new Vuelo(new Avion(50));
            vuelo.setDuracionAproxEnMins(10.0);
            System.out.println(vuelo.formatTime(LocalDateTime.now()));
            for (int j = 0; j < cantPasajeros; j++) {
                Pasajero pasajero = new Pasajero();
                vuelo.agregarPasajero(pasajero);
            }
            viaje.agregarVuelo(vuelo);
        }

        Assert.assertEquals(cantVuelos*cantPasajeros, viaje.cantPasajerosTotales().intValue());
        Assert.assertEquals(3, viaje.cantEscalas().intValue());
        Assert.assertEquals(4, viaje.cantVuelos().intValue());
        System.out.println(viaje.duracionAproxEnMins());
        System.out.println();
    }

}
