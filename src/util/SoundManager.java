package util;

import javax.sound.sampled.*;
import java.io.InputStream;

public class SoundManager {

    private static SoundManager instancia;

    private Clip clipMusica; // música de fondo
    private boolean musicaActiva = true;

    private Clip clipEfecto; // efectos de sonido
    private boolean efectosActivos = true;

    private SoundManager() {
    }

    public static SoundManager getInstancia() {
        if (instancia == null)
            instancia = new SoundManager();
        return instancia;
    }

    // ----------------- Música -----------------
    public void reproducirMusica(String ruta) {
        if (!musicaActiva)
            return;

        // si ya está sonando, no hacer nada
        if (clipMusica != null && clipMusica.isRunning())
            return;

        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);
            if (audioSrc == null)
                return;

            InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            clipMusica = AudioSystem.getClip();
            clipMusica.open(audioStream);
            clipMusica.loop(Clip.LOOP_CONTINUOUSLY);
            clipMusica.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pararMusica() {
        if (clipMusica != null) {
            clipMusica.stop();
            clipMusica.close();
            clipMusica = null;
        }
    }

    public void setMusicaActiva(boolean activar, String ruta) {
        musicaActiva = activar;
        if (activar) {
            reproducirMusica(ruta);
        } else {
            pararMusica();
        }
    }

    public boolean isMusicaActiva() {
        return musicaActiva;
    }

    // ----------------- Efectos -----------------
    public void reproducirEfecto(String ruta) {
        if (!efectosActivos)
            return;

        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);
            if (audioSrc == null)
                return;

            InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            clipEfecto = AudioSystem.getClip();
            clipEfecto.open(audioStream);
            clipEfecto.start(); // se reproduce una vez

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEfectosActivos(boolean activar) {
        efectosActivos = activar;
    }

    public boolean isEfectosActivos() {
        return efectosActivos;
    }
}