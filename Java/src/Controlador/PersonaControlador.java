package Controlador;

import Modelo.Persona;
import Vista.Vista;

public class PersonaControlador {
    private static Persona modelo;
    private static Vista vista;

    public PersonaControlador(Persona modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public static void menuRegistro () {
        String nombre = vista.nombreUsuario();
        String correo = vista.correoUsuario();
        int edad = vista.edadUsuario();

        modelo.setNombre(nombre);
        modelo.setCorreo(correo);
        modelo.setEdad(edad);

        vista.mostrarUsuario(modelo.getNombre(), modelo.getCorreo(), modelo.getEdad());
    }

    public static void iniciar () {
        menuRegistro();
    }
}