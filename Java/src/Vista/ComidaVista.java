package Vista;

import Modelo.Comida;

import java.util.Scanner;

public class ComidaVista {
    private Scanner scanner= new Scanner(System.in);

    public String pedirComida(){
        System.out.println("Introduce el nombre de la comida: ");
        return scanner.nextLine();
    }
    public String pedirTamanio(){
        System.out.println("Introduce el tamaño de tu comida (Pequeña/Mediana/Grande)");
        return scanner.nextLine();
    }
    public String pedirBebida(){
        System.out.println("¿Que deseas para beber? (Pepsi/Coca-Cola/Aquarius) ");
        return scanner.nextLine();
    }
    public String pedirtamioBebida(){
        System.out.println("Introduce el tamaño de tu bebida (Pequeña/Mediana/Grande)");
        return scanner.nextLine();
    }

    public static void mostrarComida(Comida comida1){
        System.out.println("\n---Datos de la orden---");
        System.out.println("Hamburguesa: "+comida1.getNombre());
        System.out.println("Tamaño: "+comida1.getTamanio());
        System.out.println("Bebida: "+comida1.getBebida());
        System.out.println("Tamaño: "+comida1.getTamanioBebida());
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
