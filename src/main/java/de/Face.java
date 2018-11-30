package de;

public class Face {  /* Face comportant un attribut valeur et un attribut ressource  */
    private Integer valeur;
    private Ressource res;
    private Type type;

    // CONSTRUCTEUR D'UNE FACE //

    public Face(Integer valeur, Ressource res,Type type){
        this.valeur = valeur;
        this.res = res;
        this.type = type;
    }

    //  GETTER & SETTER VALEUR  //
    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur)  {
        this.valeur = valeur;
    }

    //  GETTER & SETTER RESSOURCE //
    public void setRes(Ressource res){
        this.res = res;
    }

    public Ressource getRes() {
        return res;
    }

    //  GETTER & SETTER TYPE //
    public void setType(Type type){this.type = type;}

    public Type getType(){return type;}

    public String AfficheFace(){
        return getValeur() + " " + getRes();
    }

}
