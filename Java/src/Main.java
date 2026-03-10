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

        //USUARIOS
        Persona modelo = new Persona("", 0, "");
        PersonaVista vista = new PersonaVista();
        PersonaControlador controlador = new PersonaControlador(modelo, vista);
        controlador.iniciar();

        //PEDIDOS
        Comida modelo1 = new Comida("", "", "");
        ComidaVista vista1 = new ComidaVista();
        ComidaControlador controlador1 = new ComidaControlador(modelo1, vista1);
        controlador1.iniciar();

    }
}
