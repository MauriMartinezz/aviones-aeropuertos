package sva.entities.viajes;

import org.junit.Assert;
import org.junit.Test;
import sva.entities.personas.Pasajero;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class VueloTest {

    @Test
    public void vueloConDiezPasajeros(){
        Avion avion = new Avion(100);
        Vuelo vuelo = new Vuelo(avion);

        for (int i = 0; i < 10; i++) {
            Pasajero pasajeroNuevo = new Pasajero();
            vuelo.agregarPasajero(pasajeroNuevo);
        }

        int cantAsientosOcupadaEsperada = (vuelo.cantPasajeros()*100) / avion.getCantAsientosTotales();
        Assert.assertEquals(cantAsientosOcupadaEsperada, vuelo.capacidadOcupadaPorPasajeros().intValue());

        Assert.assertEquals(10, vuelo.cantPasajeros().intValue());
    }

    @Test
    public void vueloDuraUnDia(){
        Vuelo vuelo = new Vuelo();

        vuelo.setDuracionAproxEnMins(1440.0);
        vuelo.setFechaHoraSalida(LocalDateTime.of(2021,9,22,15,0,0));

        LocalDateTime fechaRandom = LocalDateTime.of(2021, 9, 22, 15,0,0);
        LocalDateTime fechaRandom2 = LocalDateTime.of(2021,9,23, 15,0,0);
        Assert.assertEquals(fechaRandom, vuelo.getFechaHoraSalida());
        Assert.assertEquals(fechaRandom2, vuelo.fechaHoraLllegada());
    }
}


