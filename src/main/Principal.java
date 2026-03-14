package main;

import view.Ventana;
import view.PanelMenu;

public class Principal {

        public static void main(String[] args) {

                model.Partida partida = new model.Partida("Jugador 1");

                new Ventana();
                new PanelMenu(partida);

        }

}
