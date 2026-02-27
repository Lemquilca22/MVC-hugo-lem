package Controlador;

import Modelo.Persona;
import Vista.PersonaVista;

public class PersonaControlador {
    private Persona modelo;
    private PersonaVista vista;

    public PersonaControlador(Persona modelo, PersonaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void menuRegistro () {
        vista.mensajeUsuario("== REGISTRO DE USUARIO ==");
        vista.nombreUsuario();

        String nombre = vista.nombreUsuario();
        int edad = vista.edadUsuario();
        String correo = vista.correoUsuario();

        modelo.setNombre(nombre);
        modelo.setEdad(edad);
        modelo.setCorreo(correo);

        Persona usuario1 = new Persona("Hugo González Ortega", 18, "gonzalezhugoortega@gmail.com");
        PersonaVista.mostrarusuario1(usuario1);

    }
}