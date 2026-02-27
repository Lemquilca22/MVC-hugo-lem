package Controlador;

import Modelo.Comida;
import Vista.ComidaVista;

public class ComidaControlador {
    private Comida modelo;
    private ComidaVista vista;

    public ComidaControlador(Comida modelo, ComidaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
        vista.mostrarMensaje("Registro de comida y bebida");
    }
}
