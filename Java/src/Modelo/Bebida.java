package Modelo;

public class Bebida {
    private String nombreBebida;
    private int precioBebida;
    private String tamanoBebida;
    private boolean temperaturaBebida;

    public Bebida(String nombre, int precio, String tamano, boolean temperatura) {
        this.nombreBebida = nombre;
        this.precioBebida = precio;
        this.tamanoBebida = tamano;
        this.temperaturaBebida = temperatura;
    }

    public static void setBebidas(String[] bebidas) {
        Bebida.bebidas = bebidas;
    }
    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }
    public int getPrecioBebida() {
        return precioBebida;
    }

    public void setPrecioBebida(int precioBebida) {
        this.precioBebida = precioBebida;
    }
    public static void setPrecios(double[] precios) {
        Bebida.precios = precios;
    }

    public String getTamanoBebida() {
        return tamanoBebida;
    }
    public void setTamanoBebida(String tamanoBebida) {
        this.tamanoBebida = tamanoBebida;
    }

    public boolean isTemperaturaBebida() {
        return temperaturaBebida;
    }
    public void setTemperaturaBebida(boolean temperaturaBebida) {
        this.temperaturaBebida = temperaturaBebida;
    }

    private static String[] bebidas = {
            "Coca-Cola", "Fanta Naranja", "Sprite",
            "Nestea", "Agua", "Cerveza",
            "Batido Chocolate", "Batido Vainilla", "Batido Fresa"
    };

    private static double[] precios = {
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


