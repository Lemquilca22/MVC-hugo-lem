package Modelo;

public class Comida {
    private String comida;
    private String bebida;
    private String postres;

    public Comida(String comida, String bebida, String postres) {
        this.comida = comida;
        this.bebida = bebida;
        this.postres = postres;
    }

    public String getComida() {
        return comida;
    }
    public void setComida(String nombre) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostres() {
        return postres;
    }
    public void setPostres(String tamanio) {
        this.postres = postres;
    }
}
