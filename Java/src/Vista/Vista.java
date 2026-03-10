package Vista;

import Modelo.Comida;
import Modelo.Persona;

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


    private Scanner scanner = new Scanner(System.in);

    public int pedirBebida() {
        System.out.print("Ingresa el número de la bebida que deseas beber: ");
        return scanner.nextInt();
    }

    public void mostrarMenu(String menu) {
        System.out.println(menu);
    }

    public void mostrarBebidas(String bebidas) {
        System.out.println(bebidas);
    }

    public static void mostrarComida(Comida comida) {
        System.out.println("\n══════════════════════════════");
        System.out.println("        🧾 TU ORDEN           ");
        System.out.println("══════════════════════════════");
        System.out.println("🍔 Hamburguesa : " + comida.getNombreHamburguesa()
                + " - " + comida.getPrecioHamburguesa() + "€");
        System.out.println("🥤 Bebida      : " + comida.getNombre()
                + " - " + comida.getPrecioBebida() + "€");
        System.out.println("──────────────────────────────");
        System.out.println("💰 TOTAL       : " + comida.getTotal() + "€");
        System.out.println("══════════════════════════════");
    }
}