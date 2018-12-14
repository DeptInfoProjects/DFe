package de;


import static de.Ressource.*;
import static de.Type.NORMAL;

public class Face {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

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

    //  GETTER VALEUR  //
    public Integer getNbOR() {
        return nbOR;
    }


    public Integer getNbLUN() {
        return nbLUN;
    }



    public Integer getNbSOL() {
        return nbSOL;
    }


    public Integer getNbVICT() {
        return nbVICT;
    }



    //  GETTER RESSOURCE //
    public Integer getValeur() {
        return valeur;
    }

    public Ressource getRes() {
        return res;
    }

    //  GETTER  TYPE //

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
        if ( this.nbOR==2 &&this.nbLUN == 1 && this.nbSOL==0&&this.nbVICT==0  ) {
            return YELLOW + "2" + BLACK + " + " + BLUE + "1" + "      " + RESET;
        }
        // choix1
        if (this.nbOR==1 &&this.nbLUN == 1 && this.nbSOL==1&&this.nbVICT==0  ) {
            return YELLOW + "1"  + BLACK + " ? " + BLUE + "1" + BLACK + " ? " + RED +  "1  " + RESET;
        }
        // multi2
        if (this.nbOR==0 &&this.nbLUN == 0 && this.nbSOL==1&&this.nbVICT==1  )  {
            return RED + "1" + BLACK + " + " + GREEN + "1      "  + RESET;
        }
        // choix2
        if (this.nbOR==3 &&this.nbLUN == 0 && this.nbSOL==0&&this.nbVICT==2  ){
            return YELLOW + "3"  + BLACK + " ? " + GREEN + "2      "  + RESET;
        }
        // choix3
        if (this.nbOR==2 && this.nbLUN == 2 && this.nbSOL==2 &&this.nbVICT==0  )
        {
            return YELLOW + "2"  + BLACK + " ? " + BLUE + "2" + BLACK + "?" + RED + "2"  + RESET;
        }
        // multi4
        if (this.nbOR==0 &&this.nbLUN == 2 && this.nbSOL==0&&this.nbVICT==2  )  {
            return BLUE + "2" + BLACK + " + " + GREEN + "2      " + RESET;
        }
        if (this.nbOR==1 &&this.nbLUN == 1 && this.nbSOL==1&&this.nbVICT==1  ){
            return YELLOW + "1"  + BLACK + "+" + BLUE + "1" + BLACK + "+" + RED + "1" + BLACK + "+" + GREEN + "1    " + RESET;}

        return "echec";
    }
}

