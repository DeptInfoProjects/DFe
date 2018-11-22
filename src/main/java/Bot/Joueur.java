package Bot;
import De.*;


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

    public String toString() {
        String vide;
        vide =  "Dé 1 :" + '\t' + '\t'  +'\t' +"Dé 2 : " + '\t' +'\t' +  "Inventaire : " + '\n' +
                d1.FACE1.getRes() + " " + d1.FACE1.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE1.getRes() + " " + d2.FACE1.getValeur() + '\t' + "Or       :  "     + Sac.getNbOR()      + '\n' +
                d1.FACE2.getRes() + " " + d1.FACE2.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE2.getRes() + " " + d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + Sac.getNbSolaire() + '\n' +
                d1.FACE3.getRes() + " " + d1.FACE3.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE3.getRes() + " " + d2.FACE3.getValeur() + '\t' + "Lunaire :  "     + Sac.getNbLunaire() + '\n' +
                d1.FACE4.getRes() + " " + d1.FACE4.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE4.getRes() + " " + d2.FACE4.getValeur() + '\t' + "Victoire :  "     + Sac.getNbVictoire()+ '\n' +
                d1.FACE5.getRes() + " " + d1.FACE5.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE5.getRes() + " " + d2.FACE5.getValeur() + '\n' +
                d1.FACE6.getRes() + " " + d1.FACE6.getValeur() + '\t' +'\t' +'\t' +'\t'+ d2.FACE6.getRes() + " " + d2.FACE6.getValeur() + '\n';
        return vide;
    }
}


