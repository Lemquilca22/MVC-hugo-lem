package Controlador;

import Modelo.Bebida;
import Vista.Vista;

public class Controlador {

    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;

        String[] bebidas = Bebida.getBebidas();
        double[] precios = Bebida.getPrecios();

        vista.mostrarBebidas("══════════════════════════════\n" +
                "           🥤 BEBIDAS         \n" +
                "══════════════════════════════\n" +
                "1. Coca-Cola ............. 2.5€\n" +
                "2. Fanta Naranja ......... 2.5€\n" +
                "3. Sprite ................ 2.5€\n" +
                "4. Nestea ................ 2.5€\n" +
                "5. Agua .................. 2.0€\n" +
                "6. Cerveza ............... 3.0€\n" +
                "7. Batido Chocolate ...... 3.5€\n" +
                "8. Batido Vainilla ....... 3.5€\n" +
                "9. Batido Fresa .......... 3.5€\n" +
                "══════════════════════════════");

        for (int i = 1; i < bebidas.length; i++) {
            System.out.println(i + ". " + bebidas[i] + " - " + precios[i] + "€");

            int numBebida = vista.pedirBebida();

            String nombreBebida = Bebida.getNombre(numBebida);
            double precioBebida = Bebida.getPrecio(numBebida);


        }
    }
}