package Modelo;

public class Bebida extends Producto {
    private boolean temperatura;

    public Bebida(String nombre, boolean oferta, int precio, String tamano, boolean temperatura) {
        super(nombre, oferta, precio, tamano);
        this.temperatura = temperatura;
    }

    public boolean isTemperatura() {
        return temperatura;
    }
    public void setTemperatura(boolean temperatura) {
        this.temperatura = temperatura;
    }

    private String[] bebidas = {
            "Coca-Cola", "Fanta Naranja", "Sprite",
            "Nestea", "Agua", "Cerveza",
            "Batido Chocolate", "Batido Vainilla", "Batido Fresa"
    };

    private double[] precios = {
            2.50, 2.50, 2.50,
            2.50, 2.00, 3.00,
            3.50, 3.50, 3.50
    };

    public static String[] getBebidas() {
        return bebidas;
    }

    public static double[] getPrecios() {
        return precios;
    }

    public static String getNombre(int opcion) {
        return bebidas[opcion - 1];
    }

    public static double getPrecio(int opcion) {
        return precios[opcion - 1];
    }
}


