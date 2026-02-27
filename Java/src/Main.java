import Controlador.PersonaControlador;
import Modelo.Persona;
import Vista.PersonaVista;

public class Main {
    public static void main (String[] args) {

        Persona modelo = new Persona("Hugo González Ortega", 18, "gonzalezhugoortega@gmail.com");
        PersonaVista vista = new PersonaVista();
        PersonaControlador controlador = new PersonaControlador(vista, modelo);

    }
}
