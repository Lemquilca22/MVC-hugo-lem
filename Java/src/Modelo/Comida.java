package Modelo;

public class Comida {
    private String[] pan1={"Pan brioche","Pan air","Pan tipo cristal"};
    private String[] ingrediente1={"tomate","lechuga","cebolla"};
    private String[] carne={"ternera", "pollo", "cerdo"};
    private String[] ingrediente2={"queso", "tocino", "huevo"};
    private String[] pan2={"Pan brioche","Pan air","Pan tipo cristal"};

    private String pantop;
    private String ingredientes1;
    private String tipocarne;
    private String ingredientes2;
    private String panbottom;

    public Comida(String pantop, String ingredientes1, String tipocarne, String ingredientes2, String panbottom) {
        this.pantop = pantop;
        this.ingredientes1 = ingredientes1;
        this.tipocarne = tipocarne;
        this.ingredientes2 = ingredientes2;
        this.panbottom = panbottom;
    }

    public String getPantop() {
        return pantop;
    }

    public void setPantop(String pantop) {
        this.pantop = pantop;
    }

    public String getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(String ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public String getTipocarne() {
        return tipocarne;
    }

    public void setTipocarne(String tipocarne) {
        this.tipocarne = tipocarne;
    }

    public String getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(String ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public String getPanbottom() {
        return panbottom;
    }

    public void setPanbottom(String panbottom) {
        this.panbottom = panbottom;
    }
}