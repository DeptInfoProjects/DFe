package De;
import java.lang.*;
import java.util.Random;


public class De {
    public Face FACE1;
    public Face FACE2;
    public Face FACE3;
    public Face FACE4;
    public Face FACE5;
    public Face FACE6;
    public De() {}

    public void InitDe1(){
        FACE1 = new Face(1, Ressource.OR);

        FACE2 = new Face(1, Ressource.OR);

        FACE3 = new Face(1, Ressource.OR);

        FACE4 = new Face(1, Ressource.OR);

        FACE5 = new Face(1, Ressource.OR);

        FACE6 = new Face(1, Ressource.SOLAIRE);
    }
    public void InitDe2(){
        FACE1 = new Face(1, Ressource.OR);

        FACE2 = new Face(1, Ressource.OR);

        FACE3 = new Face(1, Ressource.OR);

        FACE4 = new Face(1, Ressource.OR);

        FACE5 = new Face(1, Ressource.LUNAIRE);

        FACE6 = new Face(2, Ressource.VICTOIRE);
    }
    public  int Rand(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public Face getFace(){
        int rand = Rand();
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

    private Integer Minimum(int a ,int b , int c , int d , int e,int f){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,Math.min(e,f))))) ;
    }

    private int ValeurMin(){
        return Minimum(FACE1.getValeur() ,FACE2.getValeur() ,FACE3.getValeur() ,FACE4.getValeur() ,FACE5.getValeur() ,FACE6.getValeur());
    }


    private Face FACEMIN(){
        int ValeurMin = Minimum(FACE1.getValeur() ,FACE2.getValeur() ,FACE3.getValeur() ,FACE4.getValeur() ,FACE5.getValeur() ,FACE6.getValeur());

        if (ValeurMin == FACE1.getValeur()&& FACE1.getRes() == Ressource.OR) return FACE1;
        if (ValeurMin == FACE2.getValeur()&& FACE2.getRes() == Ressource.OR) return FACE2;
        if (ValeurMin == FACE3.getValeur()&& FACE3.getRes() == Ressource.OR) return FACE3;
        if (ValeurMin == FACE4.getValeur()&& FACE4.getRes() == Ressource.OR) return FACE4;
        if (ValeurMin == FACE5.getValeur()&& FACE5.getRes() == Ressource.OR) return FACE5;
        if (ValeurMin == FACE6.getValeur()&& FACE6.getRes() == Ressource.OR) return FACE6;
        return FACE1;
    }


    public void setFACE(Face Choix){
        FACEMIN().setValeur(Choix.getValeur());
        FACEMIN().setRes(Choix.getRes());

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

