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

        //PEDIDOS
        Comida modelo1 = new Comida(2, 3);
        ComidaVista vista1 = new ComidaVista();
        ComidaControlador controlador1 = new ComidaControlador(modelo1, vista1);
        controlador1.iniciar();

        //USUARIOS
        Persona modelo2 = new Persona("", 0, "");
        PersonaVista vista2 = new PersonaVista();
        PersonaControlador controlador2 = new PersonaControlador(modelo2, vista2);
        controlador.iniciar();

    }
}
