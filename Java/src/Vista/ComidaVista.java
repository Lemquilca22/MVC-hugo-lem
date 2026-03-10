package Vista;

import Modelo.Comida;

import java.util.Scanner;

public class ComidaVista {
    private Scanner scanner= new Scanner(System.in);

    public String pedirComida(){
        System.out.print("Introduce lo que quieres de comer: ");
        return scanner.nextLine();
    }
    public String pedirBebida(){
        System.out.print("¿Que deseas beber? (Pepsi/Coca-Cola/Aquarius) ");
        return scanner.nextLine();
    }
    public String pedirPostres(){
        System.out.print("Introduce el postre que desas tomar: ");
        return scanner.nextLine();
    }

    public void mostrarComida(String comida, String bebida, String postres){
        System.out.println("\n== PEDIDO ==");
        System.out.println("Comida: " + comida + " | Bebida: " + bebida + " | Postres: " + postres);
    }
    public void mostrarMensaje(String mostrarMensaje){
        System.out.println(mostrarMensaje);
    }

}
