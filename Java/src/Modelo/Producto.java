package Modelo;

public class Producto {
    private String nombre;
    private int precio;
    private String tamano;
    private boolean oferta;

    public Producto(String nombre, boolean oferta, int precio, String tamano) {
        this.nombre = nombre;
        this.oferta = oferta;
        this.precio = precio;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
