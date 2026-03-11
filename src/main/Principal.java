package main;

import view.Ventana;
import view.PanelCategorias;
import view.PanelJuego;
import view.PanelCreditos;
import view.PanelMenu;

public class Principal {

        public static void main(String[] args) {

                new Ventana();
                new PanelJuego();
                new PanelMenu();
                new PanelJuego();
                new PanelCategorias();
                new PanelCreditos();

        }

}
