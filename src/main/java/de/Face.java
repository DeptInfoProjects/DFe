package de;

import static de.Ressource.*;

public class Face {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";


    /* Face comportant un attribut valeur , un attribut ressource  et son Type */
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

    public String AfficheFace() {
        Ressource x = this.res;
        if (x == OR) {
            return YELLOW + getValeur() + " " + getRes() + RESET;
        }
        if (x == SOLAIRE) {
            return RED + getValeur() + " " + getRes() + RESET;
        }
        if (x == LUNAIRE) {
            return BLUE + getValeur() + " " + getRes() + RESET;
        }
        if (x == VICTOIRE) {
            return GREEN + getValeur() + " " + getRes() + RESET;
        }
        return BLACK  + getValeur() + " " + getRes() + RESET;
    }
}
