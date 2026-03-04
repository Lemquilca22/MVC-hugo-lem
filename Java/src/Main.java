import Controlador.ComidaControlador;
import Controlador.PersonaControlador;
import Modelo.Comida;
import Modelo.Persona;
import Vista.ComidaVista;
import Vista.PersonaVista;

public class Main {
    public static void main (String[] args) {
        Comida modelo= new Comida(0,0);
        ComidaVista vista = new ComidaVista();
        ComidaControlador controlador= new ComidaControlador(modelo, vista);
        controlador.iniciar();

    }
}
