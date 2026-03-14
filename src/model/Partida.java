package model;

public class Partida {

    private String nombreJugador;
    private int puntuacionTotal;

    public Partida(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.puntuacionTotal = 0;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void sumarPuntos(int puntos) {
        puntuacionTotal += puntos;
    }

    public void reiniciarPuntuacion() {
        puntuacionTotal = 0;
    }
}