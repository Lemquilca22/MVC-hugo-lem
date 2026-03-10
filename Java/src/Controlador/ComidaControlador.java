package Controlador;

import Modelo.Comida;
import Vista.ComidaVista;

public class ComidaControlador {
    private static Comida modelo;
    private static ComidaVista vista;

    public ComidaControlador(Comida modelo, ComidaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public static void menuComidas () {
        String comida = vista.pedirComida();
        String bebida = vista.pedirBebida();
        String postres = vista.pedirPostres();

        modelo.setComida(comida);
        modelo.setBebida(bebida);
        modelo.setPostres(postres);

        vista.mostrarComida(modelo.getComida(), modelo.getBebida(), modelo.getPostres());
    }

    public static void iniciar () {
        menuComidas();
    }
}