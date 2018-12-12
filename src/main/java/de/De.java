package de;
import java.lang.*;
import java.util.Random;


import static de.Type.*;
/*   Dé comportant 6 attributs de type Face*/
public class De {
    public Face FACE1;
    public Face FACE2;
    public Face FACE3;
    public Face FACE4;
    public Face FACE5;
    public Face FACE6;

    /* Constructeur du dé (avec 6 faces "vides" ) */
    public De() {}

    /* Initialisation du 1er dé avec les 6 faces donées */
    public void initDe1(){
        FACE1 = new Face(1, Ressource.OR,NORMAL);
        FACE2 = new Face(1, Ressource.OR,NORMAL);
        FACE3 = new Face(1, Ressource.OR,NORMAL);
        FACE4 = new Face(1, Ressource.OR,NORMAL);
        FACE5 = new Face(1, Ressource.OR,NORMAL);
        FACE6 = new Face(1, Ressource.SOLAIRE,NORMAL);
    }

    /* Initialisation du 2eme dé avec les 6 faces donées */
    public void initDe2(){
        FACE1 = new Face(1, Ressource.OR,NORMAL);
        FACE2 = new Face(1, Ressource.OR,NORMAL);
        FACE3 = new Face(1, Ressource.OR,NORMAL);
        FACE4 = new Face(1, Ressource.OR,NORMAL);
        FACE5 = new Face(1, Ressource.LUNAIRE,NORMAL);
        FACE6 = new Face(2, Ressource.VICTOIRE,NORMAL);
    }
    /* méthode retournant un chiffre aléatoire entre 1 et 6*/
    private  int rand(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    /* Retourne le resultat d'un lancé de dé (une Face aléatoire)*/
    public Face getFace(){
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

   /*private int ValeurMin(){
        return Minimum(FACE1.getValeur() ,FACE2.getValeur() ,FACE3.getValeur() ,FACE4.getValeur() ,FACE5.getValeur() ,FACE6.getValeur());
    }*/

    /* retourne la Face la moins importante (plus petite) */
    public Face faceMin(){
        int ValeurMin = minimum(FACE1.getValeur() ,FACE2.getValeur() ,FACE3.getValeur() ,FACE4.getValeur() ,FACE5.getValeur() ,FACE6.getValeur());

        if (ValeurMin == FACE1.getValeur()&& FACE1.getRes() == Ressource.OR) return FACE1;
        if (ValeurMin == FACE2.getValeur()&& FACE2.getRes() == Ressource.OR) return FACE2;
        if (ValeurMin == FACE3.getValeur()&& FACE3.getRes() == Ressource.OR) return FACE3;
        if (ValeurMin == FACE4.getValeur()&& FACE4.getRes() == Ressource.OR) return FACE4;
        if (ValeurMin == FACE5.getValeur()&& FACE5.getRes() == Ressource.OR) return FACE5;
        if (ValeurMin == FACE6.getValeur()&& FACE6.getRes() == Ressource.OR) return FACE6;
        return FACE1;
    }

    /* remplace la Face minimale par la Face récupérée en parametre */
    public void setFACE(Face Choix){
        Face Facemin = this.faceMin();
        Facemin.setValeur(Choix.getValeur());
        Facemin.setRes(Choix.getRes());

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

    /* Affichage d'un Dé*/
    public String toString() {
        String vide;
        vide =  FACE1.AfficheFace() + '\n'+
                FACE2.AfficheFace() + '\n' +
                FACE3.AfficheFace() + '\n' +
                FACE4.AfficheFace() + '\n' +
                FACE5.AfficheFace() + '\n' +
                FACE6.AfficheFace();
        return vide;
    }

}

