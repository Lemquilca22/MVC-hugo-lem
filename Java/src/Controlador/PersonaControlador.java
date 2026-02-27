package Controlador;

import Modelo.Persona;
import Vista.PersonaVista;

public class PersonaControlador {
    private Persona modelo;
    private PersonaVista vista;

    public PersonaControlador(PersonaVista vista, Persona modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void menuRegistro () {
        vista.mensajeUsuario("== REGISTRO DE USUARIO ==");

        String nombre = vista.nombreUsuario();
        int edad = vista.edadUsuario();
        String correo = vista.correoUsuario();

        modelo.setNombre(nombre);
        modelo.setEdad(edad);
        modelo.setCorreo(correo);

    }
}