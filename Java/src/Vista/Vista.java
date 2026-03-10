package Vista;

import Modelo.Comida;
import Modelo.Persona;
import Modelo.Bebida;

import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public String nombreUsuario() {
        System.out.print("Introduce tu nombre completo: ");
        return sc.nextLine();
    }

    public String correoUsuario() {
        System.out.print("Introduce tu correo electronico: ");
        return sc.nextLine();
    }

    public int edadUsuario() {
        System.out.print("Introduce tu edad: ");
        return sc.nextInt();
    }

    public void mostrarUsuario(String nombre, String correo, int edad) {
        System.out.println("== DATOS DEL USUARIO ==");
        System.out.println("Nombre: " + nombre + " | Correo: " + correo + " | Edad: " + edad);

    }

    public static void mostrarMensaje(String mostrarMensaje) {
        System.out.println(mostrarMensaje);
    }

    public int pedirBebida() {
        System.out.print("Ingresa el número de la bebida que deseas beber: ");
        return sc.nextInt();
    }

    public void mostrarMenu(String menu) {
        System.out.println(menu);
    }

    public void mostrarBebidas(String bebidas) {
        System.out.println(bebidas);
    }
    public static void mostrarRecibo(Bebida bebida) {
        System.out.println("\n══════════════════════════════");
        System.out.println("        🧾 TU ORDEN           ");
        System.out.println("══════════════════════════════");
        System.out.println("🥤 Bebida      : " + bebida.getNombreBebida() + " - " + bebida.getPrecioBebida() + "€");
        System.out.println("──────────────────────────────");
        System.out.println("💰 TOTAL       : €");
        System.out.println("══════════════════════════════");
    }
}