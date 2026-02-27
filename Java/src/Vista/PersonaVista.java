package Vista;

import Modelo.Persona;

import java.util.Scanner;

public class PersonaVista {
    Scanner sc = new Scanner(System.in);

    public String nombreUsuario () {
        System.out.print("Introduce tu nombre completo: ");
        return sc.nextLine();
    }
    public int edadUsuario () {
        System.out.print("Introduce tu edad: ");
        return sc.nextInt();
    }
    public String correoUsuario () {
        System.out.println("Introduce tu correo electronico: ");
        return sc.nextLine();
    }

    public void mensajeUsuario (String registro) {
        System.out.println(registro);
    }

    public static void mostrarusuario1(Persona usuario1) {
    }
}
