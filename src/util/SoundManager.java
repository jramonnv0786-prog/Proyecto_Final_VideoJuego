package util;

import javax.sound.sampled.*;
import java.io.InputStream;

public class SoundManager {

    private static SoundManager instancia;

    private Clip clipSecundario; // Música del menú
    private Clip clipPrincipal; // Música de preguntas

    private boolean musicaActiva = true;
    private boolean efectosActivos = true;

    private SoundManager() {
    }

    public static SoundManager getInstancia() {
        if (instancia == null)
            instancia = new SoundManager();
        return instancia;
    }

    // -----------------------
    // Música del menú
    // -----------------------
    public void reproducirMusicaSecundaria(String ruta) {
        if (!musicaActiva)
            return;
        pararMusicaSecundaria();
        clipSecundario = crearClip(ruta);
        if (clipSecundario != null) {
            clipSecundario.loop(Clip.LOOP_CONTINUOUSLY);
            clipSecundario.start();
        }
    }

    public void pararMusicaSecundaria() {
        if (clipSecundario != null && clipSecundario.isRunning())
            clipSecundario.stop();
    }

    public boolean isMusicaSecundariaActiva() {
        return clipSecundario != null && clipSecundario.isRunning();
    }

    // -----------------------
    // Música de preguntas
    // -----------------------
    public void reproducirMusicaPrincipal(String ruta) {
        if (!musicaActiva)
            return;
        pararMusicaPrincipal();
        clipPrincipal = crearClip(ruta);
        if (clipPrincipal != null) {
            clipPrincipal.loop(Clip.LOOP_CONTINUOUSLY);
            clipPrincipal.start();
        }
    }

    public void pararMusicaPrincipal() {
        if (clipPrincipal != null && clipPrincipal.isRunning())
            clipPrincipal.stop();
    }

    public boolean isMusicaPrincipalActiva() {
        return clipPrincipal != null && clipPrincipal.isRunning();
    }

    // -----------------------
    // Efectos de sonido
    // -----------------------
    public void reproducirEfecto(String ruta) {
        if (!efectosActivos)
            return;
        Clip clip = crearClip(ruta);
        if (clip != null)
            clip.start();
    }

    // -----------------------
    // Control global
    // -----------------------
    public void setMusicaActiva(boolean activa) {
        musicaActiva = activa;
        if (!musicaActiva) {
            pararMusicaSecundaria();
            pararMusicaPrincipal();
        }
    }

    public void setEfectosActivos(boolean activa) {
        efectosActivos = activa;
    }

    // -----------------------
    // Método interno para crear clips
    // -----------------------
    private Clip crearClip(String ruta) {
        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);
            InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            return clip;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}