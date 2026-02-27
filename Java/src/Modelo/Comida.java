package Modelo;

public class Comida {
    private String nombre;
    private String tamanio;
    private String bebida;
    private String tamanioBebida;

    public Comida(String nombre, String tamanio, String bebida, String tamanioBebida) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.bebida = bebida;
        this.tamanioBebida = tamanioBebida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getTamanioBebida() {
        return tamanioBebida;
    }

    public void setTamanioBebida(String tamanioBebida) {
        this.tamanioBebida = tamanioBebida;
    }
}
