package sva.entities.viajes;

public class Avion {
    private Aerolinea aerolinea;
    private Integer cantAsientosTotales;

    public Avion(Integer cantAsientosTotales) {
        this.cantAsientosTotales = cantAsientosTotales;
    }

    public Integer getCantAsientosTotales() {
        return cantAsientosTotales;
    }


}
