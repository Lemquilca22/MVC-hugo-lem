package Vista;

import java.util.Scanner;

public class ComidaVista {
    private Scanner scanner= new Scanner(System.in);

    public String pedirnombre(){
        return scanner.nextLine();
    }
    public String pedirTamanio(){
        return scanner.nextLine();
    }
    public String pedirBebida(){
        return scanner.nextLine();
    }
    public String pedirtamioBebida(){
        return scanner.nextLine();
    }

    public void mostrarComida(String nombre, String tamanio, String bebida, String tamanioBebida){
        System.out.println("\n---Datos de la orden---");
        System.out.println("Hamburguesa: "+nombre);
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Bebida: "+bebida);
        System.out.println("Tamaño: "+tamanioBebida);
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
