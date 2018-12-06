package de;
import java.lang.*;
import java.util.Random;


import static de.Type.*;

public class De {  /*   Dé comportant 6 attributs de type Face*/
    public Face FACE1;
    public Face FACE2;
    public Face FACE3;
    public Face FACE4;
    public Face FACE5;
    public Face FACE6;
    public De() {}    /* Constructeur du dé (avec 6 faces "vides" ) */

    public void initDe1(){/* Initialisation du 1er dé avec les 6 faces donées */
        FACE1 = new Face(1, Ressource.OR,NORMAL);
        FACE2 = new Face(1, Ressource.OR,NORMAL);
        FACE3 = new Face(1, Ressource.OR,NORMAL);
        FACE4 = new Face(1, Ressource.OR,NORMAL);
        FACE5 = new Face(1, Ressource.OR,NORMAL);
        FACE6 = new Face(1, Ressource.SOLAIRE,NORMAL);
    }
    public void initDe2(){/* Initialisation du 2eme dé avec les 6 faces donées */
        FACE1 = new Face(1, Ressource.OR,NORMAL);
        FACE2 = new Face(1, Ressource.OR,NORMAL);
        FACE3 = new Face(1, Ressource.OR,NORMAL);
        FACE4 = new Face(1, Ressource.OR,NORMAL);
        FACE5 = new Face(1, Ressource.LUNAIRE,NORMAL);
        FACE6 = new Face(2, Ressource.VICTOIRE,NORMAL);
    }
    private  int rand(){  /* méthode retournant un chiffre aléatoire entre 1 et 6*/
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public Face getFace(){/* Retourne le resultat d'un lancé de dé (une Face aléatoire)*/
        int rand = rand();
        Face compte ;

        switch(rand){
            case 1:
                compte =  FACE1;
                break;
            case 2:
                compte = FACE2;
                break;
            case 3:
                compte = FACE3;
                break;
            case 4:
                compte = FACE4;
                break;
            case 5:
                compte = FACE5;
                break;
            default:
                compte = FACE6;
                break ;

        }
        return compte;
    }

    /* prend en parametre 6 entiers et retourne le minimum */
    private Integer minimum(int a ,int b , int c , int d , int e,int f){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,Math.min(e,f))))) ;
    }


    public Face faceMin(){   /* return la petite face (qui contient la plus petite valeur) d'un dé*/
        int ValeurMin = minimum(FACE1.getValeur() ,FACE2.getValeur() ,FACE3.getValeur() ,FACE4.getValeur() ,FACE5.getValeur() ,FACE6.getValeur());

        if (ValeurMin == FACE1.getValeur()&& FACE1.getRes() == Ressource.OR) return FACE1;
        if (ValeurMin == FACE2.getValeur()&& FACE2.getRes() == Ressource.OR) return FACE2;
        if (ValeurMin == FACE3.getValeur()&& FACE3.getRes() == Ressource.OR) return FACE3;
        if (ValeurMin == FACE4.getValeur()&& FACE4.getRes() == Ressource.OR) return FACE4;
        if (ValeurMin == FACE5.getValeur()&& FACE5.getRes() == Ressource.OR) return FACE5;
        if (ValeurMin == FACE6.getValeur()&& FACE6.getRes() == Ressource.OR) return FACE6;
        return FACE1;
    }


    public void setFACE(Face Choix){/* remplace la Face minimale par la Face récupérée en parametre */
        Face faceAchanger = faceMin() ;
        faceAchanger.setValeur(Choix.getValeur());
        faceAchanger.setRes(Choix.getRes());

    }

    /* prend en parametre 2 Faces et retourne la Face plus petite */
    public static Face compare2Face(Face Face1, Face Face2) {
        if (Face1.getRes() == Face2.getRes()) return Face1;
        if (Face1.getRes() == Face2.getRes() && Face1.getValeur() < Face2.getValeur()) return Face1;
        if (Face1.getRes() == Face2.getRes() && Face1.getValeur() > Face2.getValeur()) return Face2;

        if (Face1.getRes() == Ressource.OR && Face2.getRes() == Ressource.LUNAIRE) return Face1;
        if (Face1.getRes() == Ressource.OR && Face2.getRes() == Ressource.SOLAIRE) return Face1;
        if (Face1.getRes() == Ressource.OR && Face2.getRes() == Ressource.VICTOIRE) return Face1;
        if (Face2.getRes() == Ressource.OR && Face1.getRes() == Ressource.LUNAIRE) return Face2;
        if (Face2.getRes() == Ressource.OR && Face1.getRes() == Ressource.SOLAIRE) return Face2;
        if (Face2.getRes() == Ressource.OR && Face1.getRes() == Ressource.VICTOIRE) return Face2;

        if (Face1.getRes() == Ressource.LUNAIRE && Face2.getRes() == Ressource.SOLAIRE) return Face1;
        if (Face1.getRes() == Ressource.LUNAIRE && Face2.getRes() == Ressource.VICTOIRE) return Face1;
        if (Face2.getRes() == Ressource.LUNAIRE && Face1.getRes() == Ressource.SOLAIRE) return Face2;
        if (Face2.getRes() == Ressource.LUNAIRE && Face1.getRes() == Ressource.VICTOIRE) return Face2;

        if (Face1.getRes() == Ressource.SOLAIRE && Face2.getRes() == Ressource.VICTOIRE) return Face1;
        if (Face2.getRes() == Ressource.SOLAIRE && Face1.getRes() == Ressource.VICTOIRE) return Face2;
        else return Face1;

    }


    public String toString() {
        String vide;
        vide =  FACE1.getRes() + " " + FACE1.getValeur() + '\n'+
                FACE2.getRes() + " " + FACE2.getValeur() + '\n' +
                FACE3.getRes() + " " + FACE3.getValeur() + '\n' +
                FACE4.getRes() + " " + FACE4.getValeur() + '\n' +
                FACE5.getRes() + " " + FACE5.getValeur() + '\n' +
                FACE6.getRes() + " " + FACE6.getValeur();
        return vide;
    }

}

