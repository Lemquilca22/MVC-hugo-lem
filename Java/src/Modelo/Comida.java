package Modelo;

public class Comida {
    private String[] pan1={"Pan brioche","Pan air","Pan tipo cristal"};
    private String[] tamanio={"pequeña","mediana","grande"};
    private String[] ingrediente1={"tomate","lechuga","cebolla","queso", "tocino", "huevo"};
    private String[] carne={"ternera", "pollo", "cerdo"};

    private String nomhamburguesa;
    private String tamanioH;
    private String panbottom1;
    private String ingredientes1;
    private String tipocarne;
    private String ingredientes2;
    private String panTop;

    public Comida(String nomhamburguesa, String tamanioH, String pantop, String ingredientes1, String tipocarne, String ingredientes2, String panbottom) {
        this.nomhamburguesa = nomhamburguesa;
        this.tamanioH = tamanioH;
        this.panbottom1 = pantop;
        this.ingredientes1 = ingredientes1;
        this.tipocarne = tipocarne;
        this.ingredientes2 = ingredientes2;
        this.panTop = panbottom;
    }

    public String getPan(int opcion) {
        return pan1[opcion];
    }
    public String gettamanio(int opcion) {
        return tamanio[opcion];
    }
    public String getingrediente(int opcion) {
        return ingrediente1[opcion];
    }
    public String getcarne(int opcion) {
        return carne[opcion];
    }

    public String getNomhamburguesa() {
        return nomhamburguesa;
    }

    public void setNomhamburguesa(String nomhamburguesa) {
        this.nomhamburguesa = nomhamburguesa;
    }
    public int cantidadPan() {
        return pan1.length;
    }

    public String getTamanioH() {
        return tamanioH;
    }

    public void setTamanioH(String tamanioH) {
        this.tamanioH = tamanioH;
    }

    public String getPanbottom1() {
        return panbottom1;
    }

    public void setPanbottom1(String panbottom1) {
        this.panbottom1 = panbottom1;
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

    public String getPanTop() {
        return panTop;
    }

    public void setPanTop(String panTop) {
        this.panTop = panTop;
    }
}