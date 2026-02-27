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

        String nombre = vista.pedirComida();
        String tamanio = vista.pedirTamanio();
        String bebida = vista.pedirBebida();
        String tamanioBebida= vista.pedirtamioBebida();

//        modelo.setTamanioBebida(nombre);
//        modelo.setTamanio(tamanio);
//        modelo.setTamanioBebida(bebida);
//        modelo.setTamanio(tamanioBebida);

        Comida comida = new Comida(nombre,tamanio,bebida,tamanioBebida);
        comida.setTamanio("XL");
        ComidaVista.mostrarComida(comida);

    }


}
