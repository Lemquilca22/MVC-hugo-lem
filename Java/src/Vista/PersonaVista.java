package Vista;

import Modelo.Persona;

import java.util.Scanner;

public class PersonaVista {
    Scanner sc = new Scanner(System.in);

    public String nombreUsuario () {
        System.out.print("Introduce tu nombre completo: ");
        return sc.nextLine();
    }

    public String correoUsuario () {
        System.out.print("Introduce tu correo electronico: ");
        return sc.nextLine();
    }

    public int edadUsuario () {
        System.out.print("Introduce tu edad: ");
        return sc.nextInt();
    }

    public void mostrarUsuario (String nombre, String correo, int edad) {
        System.out.println("== DATOS DEL USUARIO ==");
        System.out.println("Nombre: " + nombre + " | Correo: " + correo + " | Edad: " + edad);

    }

    public static void mostrarMensaje(String mostrarMensaje) {
        System.out.println(mostrarMensaje);
    }
}
