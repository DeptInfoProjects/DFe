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
    private Type type;
    private Integer valeur2;
    private Ressource res2;
    private Integer valeur3;
    private Ressource res3;
    private Integer valeur4;
    private Ressource res4;


    public Face(Integer valeur, Ressource res, Integer valeur2 , Ressource res2 ,Type type){
        this.valeur = valeur;
        this.res = res;
        this.valeur2 = valeur2;
        this.res2 = res2;
        this.type = type;
    }

    public Face(int i, Ressource lunaire, int i1, Ressource solaire, int i2, Ressource or, Type choix) {
        this.valeur = i;
        this.res = lunaire;
        this.valeur2 = i1;
        this.res2 = solaire;
        this.valeur3 = i2;
        this.res3 = or ;
        this.type = choix;
    }

    public Face(int i, Ressource or, int i1, Ressource lunaire, int i2, Ressource solaire, int i3, Ressource victoire, Type plus) {
        this.valeur = i;
        this.res = or;
        this.valeur2 = i1;
        this.res2 = lunaire;
        this.valeur3 = i2;
        this.res3 = solaire ;
        this.valeur4 = i3;
        this.res4 = victoire;
        this.type = plus;
    }


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

    public Integer getValeur2(){return valeur2;}

    public Integer getValeur3(){return valeur3;}

    public Integer getValeur4(){return valeur4;}

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

    public Ressource getRes2() {
        return res2;
    }
    public Ressource getRes3() {
        return res3;
    }
    public Ressource getRes4() {
        return res4;
    }
    //  GETTER & SETTER TYPE //
    public void setType(Type type){this.type = type;}

    public Type getType(){return type;}

    public String AfficheFace() {
        Ressource res = this.res;
        if (res == OR && this.type == NORMAL) {
            return YELLOW + getValeur() + " " + getRes() + RESET;
        }
        if (res == SOLAIRE && this.type == NORMAL) {
            return RED + getValeur() + " " + getRes() + RESET;
        }
        if (res == LUNAIRE && this.type == NORMAL) {
            return BLUE + getValeur() + " " + getRes() + RESET;
        }
        if (res == VICTOIRE && this.type == NORMAL) {
            return GREEN + getValeur() + " " + getRes() + RESET;
        }
        // multi1
        if (this.type == PLUS &&   this.res == OR  && this.valeur == 2   &&   this.res2 == LUNAIRE   &&   this.valeur2 == 1){
            return YELLOW + getValeur() + BLACK +  " + " +  BLUE + getValeur2() +"      "+ RESET ;
        }
        // choix1
        if (this.type == CHOIX   && this.res == LUNAIRE && this.res2 == OR      &&   this.res2 == SOLAIRE && this.valeur == 1 && this.valeur2 == 1 && this.valeur3 == 1){
            return YELLOW + getValeur() + BLACK +  " ? " +  BLUE + getValeur2() + BLACK + " ? " + RED + getValeur3() + RESET ;
        }
        // multi2
        if (this.type == PLUS   && this.res == VICTOIRE  && this.valeur == 1 &&this.res2 == LUNAIRE && this.valeur2 == 1){
            return GREEN + getValeur() + BLACK +  " + " +  BLUE + getValeur2() +"      "+ RESET ;
        }
        // choix2
        if (this.type == CHOIX  && this.res == OR  && this.valeur == 3 && this.res2 == VICTOIRE && this.valeur2 == 2){
            return YELLOW + getValeur() + BLACK +  " + " +  GREEN + getValeur2() +"      "+ RESET ;
        }
        // choix3
        if (this.type == CHOIX  && this.res == OR && this.res2 == LUNAIRE  && this.res3 == SOLAIRE && this.valeur == 2 && this.valeur2 == 2 && this.valeur3 == 2){
            return YELLOW + getValeur() + BLACK +  " ? " +  BLUE + getValeur2() + BLACK + " ? " + RED + getValeur3() + RESET ;
        }
        // multi4
        if (this.type == PLUS   && this.res == VICTOIRE  && this.valeur == 2 && this.res2 == LUNAIRE && this.valeur2 == 2){
            return GREEN + getValeur() + BLACK +  " + " +  BLUE + getValeur2() +"      "+ RESET ;
        }
        return YELLOW + getValeur() + BLACK + " + " + BLUE + getValeur2()+ BLACK +" + " + RED + getValeur3()+ BLACK + " + " + GREEN + getValeur4();
    }
}
