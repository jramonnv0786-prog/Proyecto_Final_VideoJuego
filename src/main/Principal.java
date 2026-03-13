package main;

import view.Ventana;
import view.PanelMenu;
import view.PanelCategorias;
import view.PanelEntornos;
import view.PanelLenguajeMarca;
import view.PanelDigitalizacion;
import view.PanelSistemas;
import view.PanelSostenibilidad;
import view.PanelJuego;
import view.PanelCreditos;
import model.Partida;

public class Principal {

        public static void main(String[] args) {

                Partida partida = new Partida("Jugador 1");

                new Ventana();
                new PanelMenu(partida);
                new PanelCategorias(partida);
                new PanelEntornos(partida);
                new PanelLenguajeMarca(partida);
                new PanelDigitalizacion(partida);
                new PanelSistemas(partida);
                new PanelSostenibilidad(partida);
                new PanelJuego(partida, 0);
                new PanelCreditos();

        }

}
