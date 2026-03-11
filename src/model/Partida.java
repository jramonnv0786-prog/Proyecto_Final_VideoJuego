package model;

public class Partida {
    private String nombreJugador;
    private int puntuacionTotal;
    private int nivelActual;

    public Partida(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.puntuacionTotal = 0;
        this.nivelActual = 1;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public void sumarPuntos(int puntos) {
        this.puntuacionTotal += puntos;
    }
}
