package de;


import static de.Ressource.*;
import static de.Type.CHOIX;
import static de.Type.NORMAL;
import static de.Type.PLUS;

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
    private Integer nbOR;
    private Integer nbLUN;
    private Integer nbSOL;
    private Integer nbVICT;
    private Type type;


    // CONSTRUCTEUR D'UNE FACE SIMPLE//


    public Face(Type type, Integer valeur, Ressource res){
        this.valeur = valeur;
        this.res = res;
        this.type = type;
    }

    // CONSTRUCTEUR FACE HYBRIDE //

    public Face(Type type, Integer nbOR, Integer nbLUN, Integer nbSOL, Integer nbVICT){
        this.nbOR = nbOR;
        this.nbLUN = nbLUN;
        this.nbSOL = nbSOL;
        this.nbVICT = nbVICT;
        this.type = type;
    }

    //  GETTER & SETTER VALEUR  //
    public Integer getNbOR() {
        return nbOR;
    }

    public void setNbOR(Integer nbOR) {
        this.nbOR = nbOR;
    }

    public Integer getNbLUN() {
        return nbLUN;
    }

    public void setNbLUN(Integer nbLUN) {
        this.nbLUN = nbLUN;
    }

    public Integer getNbSOL() {
        return nbSOL;
    }

    public void setNbSOL(Integer nbSOL) {
        this.nbSOL = nbSOL;
    }

    public Integer getNbVICT() {
        return nbVICT;
    }

    public void setNbVICT(Integer nbVICT) {
        this.nbVICT = nbVICT;
    }

    //  GETTER & SETTER RESSOURCE //
    public Integer getValeur() {
        return valeur;
    }

    public Ressource getRes() {
        return res;
    }

    //  GETTER & SETTER TYPE //
    public void setType(Type type){this.type = type;}

    public Type getType(){return type;}

    public String AfficheFace() {
        Ressource res = this.res;
        if (this.type == NORMAL && res == OR) {
            return YELLOW + getValeur() + " " + getRes() + RESET;
        }
        if (this.type == NORMAL && res == SOLAIRE) {
            return RED + getValeur() + " " + getRes() + RESET;
        }
        if (this.type == NORMAL && res == LUNAIRE) {
            return BLUE + getValeur() + " " + getRes() + RESET;
        }
        if (this.type == NORMAL && res == VICTOIRE) {
            return GREEN + getValeur() + " " + getRes() + RESET;
        }
        // multi1
        if (this == new Face(PLUS,2,1, 0 ,0)) {
            return YELLOW + "2" + BLACK + " + " + BLUE + "1" + "      " + RESET;
        }
        // choix1
        if (this == new Face(CHOIX, 1, 1, 1 , 0)) {
            return YELLOW + "1"  + BLACK + " ? " + BLUE + "1" + BLACK + " ? " + RED + "1" + "   " + RESET;
        }
        // multi2
        if (this == new Face(PLUS, 0, 0,1, 1)) {
            return RED + "1" + BLACK + " + " + GREEN + "1" + "   " + RESET;
        }
        // choix2
        if (this == new Face(CHOIX,3, 0, 0, 2)) {
            return YELLOW + "3"  + BLACK + " ? " + GREEN + "2" + "   " + RESET;
        }
        // choix3
        if (this == new Face(CHOIX, 2, 2, 2, 0)) {
            return YELLOW + "2"  + BLACK + " ? " + BLUE + "2" + BLACK + " ? " + RED + "2" + "   " + RESET;
        }
        // multi4
        if (this == new Face(PLUS, 0, 2, 0, 2)) {
            return BLUE + "2" + BLACK + " + " + GREEN + "2" + "   " + RESET;
        }

        return YELLOW + "1"  + BLACK + "+ " + BLUE + "1" + BLACK + " + " + RED + "1" + BLACK + "+ " + GREEN + "1" + RESET;


    }
}
