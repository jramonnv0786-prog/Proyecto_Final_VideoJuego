package util;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class SoundManager {

    private Clip musicaPrincipal;
    private Clip musicaSecundaria;

    private boolean musicaActivada = true;
    private boolean efectosActivados = true;

    private static SoundManager instancia;

    private SoundManager() {
    }

    public static SoundManager getInstancia() {
        if (instancia == null) {
            instancia = new SoundManager();
        }
        return instancia;
    }

    private Clip cargarClip(String ruta) {
        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);
            InputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream ais = AudioSystem.getAudioInputStream(bufferedIn);

            Clip clip = AudioSystem.getClip();
            clip.open(ais);

            return clip;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // MUSICA PRINCIPAL
    public void reproducirMusicaPrincipal(String ruta) {
        if (!musicaActivada)
            return;

        pararMusicaPrincipal();

        musicaPrincipal = cargarClip(ruta);

        if (musicaPrincipal != null) {
            musicaPrincipal.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void pararMusicaPrincipal() {
        if (musicaPrincipal != null && musicaPrincipal.isRunning()) {
            musicaPrincipal.stop();
            musicaPrincipal.close();
        }
    }

    // MUSICA SECUNDARIA
    public void reproducirMusicaSecundaria(String ruta) {
        if (!musicaActivada)
            return;

        pararMusicaSecundaria();

        musicaSecundaria = cargarClip(ruta);

        if (musicaSecundaria != null) {
            musicaSecundaria.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void pararMusicaSecundaria() {
        if (musicaSecundaria != null && musicaSecundaria.isRunning()) {
            musicaSecundaria.stop();
            musicaSecundaria.close();
        }
    }

    // EFECTOS DE SONIDO
    public void reproducirEfecto(String ruta) {
        if (!efectosActivados)
            return;

        try {
            Clip efecto = cargarClip(ruta);
            if (efecto != null) {
                efecto.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // AJUSTES
    public void activarMusica(boolean activar) {
        musicaActivada = activar;

        if (!activar) {
            pararMusicaPrincipal();
            pararMusicaSecundaria();
        }
    }

    public void activarEfectos(boolean activar) {
        efectosActivados = activar;
    }

    public boolean isMusicaActivada() {
        return musicaActivada;
    }

    public boolean isEfectosActivados() {
        return efectosActivados;
    }
}