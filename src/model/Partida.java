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

    private boolean musicaActiva = true;
    private boolean efectosActivos = true;

    public boolean isMusicaActiva() {
        return musicaActiva;
    }

    public void setMusicaActiva(boolean activa) {
        musicaActiva = activa;
    }

    public boolean isEfectosActivos() {
        return efectosActivos;
    }

    public void setEfectosActivos(boolean activa) {
        efectosActivos = activa;
    }
}