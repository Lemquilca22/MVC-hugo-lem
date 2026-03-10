package Vista;

import Modelo.Comida;
import Modelo.Persona;
import Modelo.Bebida;

import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public void mostrarPanes(Comida comida) {
        System.out.println("\n--- Selecciona el Pan ---");
        for (int i = 0; i < comida.cantidadPan(); i++) {
            System.out.println(i + ". " + comida.getPan(i));
        }
    }

    public void mostrarTamanios(Comida comida) {
        System.out.println("\n--- Selecciona el Tamaño ---");

        for (int i = 0; i < 3; i++) {
            System.out.println(i + ". " + comida.gettamanio(i));
        }
    }

    public void mostrarIngredientes(Comida comida) {
        System.out.println("\n--- Selecciona los Ingredientes ---");
        for (int i = 0; i < 6; i++) {
            System.out.println(i + ". " + comida.getingrediente(i));
        }
    }

    public void mostrarCarnes(Comida comida) {
        System.out.println("\n--- Selecciona la Carne ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ". " + comida.getcarne(i));
        }
    }

    public String pedirNombre() {
        System.out.print("\nIntroduce el nombre de tu hamburguesa: ");
        return sc.nextLine();
    }

    public int pedirOpcion() {
        System.out.print("Selecciona un número: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public int pedirBebida() {
        System.out.print("Ingresa el número de la bebida que deseas beber: ");
        return sc.nextInt();
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
    public void mostrarResumen(Comida c) {
        System.out.println("\n===============================");
        System.out.println("   ¡ORDEN LISTA: " + c.getNomhamburguesa() + "!");
        System.out.println("===============================");
        System.out.println("Tamaño: " + c.getTamanioH());
        System.out.println("Pan Superior: " + c.getPanTop());
        System.out.println("Ingrediente 1: " + c.getIngredientes1());
        System.out.println("Carne: " + c.getTipocarne());
        System.out.println("Ingrediente 2: " + c.getIngredientes2());
        System.out.println("Pan Inferior: " + c.getPanbottom1());
        System.out.println("===============================\n");
    }
}