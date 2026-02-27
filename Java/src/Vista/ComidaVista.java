package Vista;

import Modelo.Comida;

import java.util.Scanner;

public class ComidaVista {
    private Scanner scanner=new Scanner(System.in);

    public String pedirComida(){
        System.out.println("Introduce el nombre de tu Hamburguesa");
        return scanner.nextLine();
    }
    public String pedirtamanio(){
        System.out.println("¿De qué tamaño la deseas? (Pequeña/Mediana/Grande) ");
        return scanner.nextLine();
    }

    public String pedirBebida(){
        System.out.println("¿Qué bebida deseas para acompañar tu Hamburguesa? (Pepsi/Coca-Cola/Seven-up/Aquarius/) ");
        return scanner.nextLine();
    }
    public String pedirtamanioBebida(){
        System.out.println("¿De qué tamaño la deseas? (Pequeña/Mediana/Grande) ");
        return scanner.nextLine();
    }

}
