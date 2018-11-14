package Bot;
import De.*;


public class Joueur {

    public De d1 = new De();
    public De d2 = new De();
    public Inventaire Sac;


    public Joueur(){
        d1.InitDe1();
        d2.InitDe1();
        Sac = new Inventaire();

    }


    public String toString() {
        String vide;
        vide =  "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\n' +
                d1.FACE1.getRes() + " " + d1.FACE1.getValeur() + '\t'+ d2.FACE1.getRes() + " " + d2.FACE1.getValeur() + '\t' + "Or       :  "     + Sac.getNbOR()      + '\n' +
                d1.FACE2.getRes() + " " + d1.FACE2.getValeur() + '\t'+ d2.FACE2.getRes() + " " + d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + Sac.getNbSolaire() + '\n' +
                d1.FACE3.getRes() + " " + d1.FACE3.getValeur() + '\t'+ d2.FACE3.getRes() + " " + d2.FACE3.getValeur() + '\t' + "Lunaiare :  "     + Sac.getNbLunaire() + '\n' +
                d1.FACE4.getRes() + " " + d1.FACE4.getValeur() + '\t'+ d2.FACE4.getRes() + " " + d2.FACE4.getValeur() + '\t' + "Victoire :  "     + Sac.getNbVictoire()+ '\n' +
                d1.FACE5.getRes() + " " + d1.FACE5.getValeur() + '\t'+ d2.FACE5.getRes() + " " + d2.FACE5.getValeur() + '\n' +
                d1.FACE6.getRes() + " " + d1.FACE6.getValeur() + '\t'+ d2.FACE6.getRes() + " " + d2.FACE6.getValeur() + '\n';
        return vide;
    }
}


