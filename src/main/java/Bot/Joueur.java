package Bot;
import De.*;
import Iles.*;

import java.util.Random;


public class Joueur {

    private De d1 = new De();
    private De d2 = new De();
    private Inventaire Sac;


    public Joueur(){
        d1.InitDe1();
        d2.InitDe2();
        Sac = new Inventaire();



    }
    public Inventaire getInventaireJoueur(){return this.Sac;}

    public De getD1() {
        return this.d1;
    }

    public De getD2() {
        return this.d2;
    }



    public void changementFace(Face Achat){
        Face FaceMinD1 = this.d1.FACEMIN();
        Face FaceMinD2 = this.d2.FACEMIN();
        if (FaceMinD1 == FaceMinD2 ) this.d1.setFACE(Achat);
        if (De.compare2Face(FaceMinD1,FaceMinD2) == FaceMinD1) this.d1.setFACE(Achat);
        else this.d2.setFACE(Achat);
    }

    private int Rand(Integer x) {
        Random rand = new Random();
        return rand.nextInt(x);
    }

    public Face AcheterFace(Joueur J1) {
        Sanctuaire Jardin = new Sanctuaire();
        int x = J1.getInventaireJoueur().getNbOR();
        int rand = Rand(2);
        if (x == 2) {
            J1.getInventaireJoueur().setNbOR(x - 2);
            if (rand == 0) return Jardin.getSanctuaire(2);
            else {
                return Jardin.getSanctuaire(1);
            }
        }

        if (x == 3) {
            J1.getInventaireJoueur().setNbOR(x - 3);
            if (rand == 0) return Jardin.getSanctuaire(3);
            else return Jardin.getSanctuaire(4);

        }

        if (x == 4 | x == 5) {
            J1.getInventaireJoueur().setNbOR(x - 4);
            return Jardin.getSanctuaire(5);
        }

        if (x == 6 | x == 7) {
            J1.getInventaireJoueur().setNbOR(x - 6);
            return Jardin.getSanctuaire(6);
        }

        if (x == 8 | x == 9 | x == 10 | x == 11) {
            J1.getInventaireJoueur().setNbOR(x - 8);
            if (rand == 0) return Jardin.getSanctuaire(7);
            else return Jardin.getSanctuaire(8);

        }
        if ( x >= 12 ){
        J1.getInventaireJoueur().setNbOR(x - 12);
        return Jardin.getSanctuaire(9);}
        return De.compare2Face(d1.FACEMIN(), d2.FACEMIN());
    }

    public String toString(){
        String vide;
        vide =  "Dé 1 :" + '\t' + '\t'  +'\t' +"Dé 2 : " + '\t' +'\t' +  "Inventaire : " + '\n' +
                d1.FACE1.getRes() + " " + d1.FACE1.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE1.getRes() + " " + d2.FACE1.getValeur() + '\t' + "Or       :  "     + Sac.getNbOR()      + '\n' +
                d1.FACE2.getRes() + " " + d1.FACE2.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE2.getRes() + " " + d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + Sac.getNbSolaire() + '\n' +
                d1.FACE3.getRes() + " " + d1.FACE3.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE3.getRes() + " " + d2.FACE3.getValeur() + '\t' + "Lunaire :  "      + Sac.getNbLunaire() + '\n' +
                d1.FACE4.getRes() + " " + d1.FACE4.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE4.getRes() + " " + d2.FACE4.getValeur() + '\t' + "Victoire :  "     + Sac.getNbVictoire()+ '\n' +
                d1.FACE5.getRes() + " " + d1.FACE5.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE5.getRes() + " " + d2.FACE5.getValeur() + '\n' +
                d1.FACE6.getRes() + " " + d1.FACE6.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE6.getRes() + " " + d2.FACE6.getValeur() + '\n';
        return vide;
    }
}




