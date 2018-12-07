package bot;
import de.*;
import Iles.*;


import java.util.Random;

import static Iles.Carte.*;
import static Iles.Carte.ENIGME;
import static Iles.Carte.NULL;

/* Un joueur possède (est caractérisé par) 2 Dés (d1 et d2) et d'un sac (son inventaire) */
public class Joueur {

    private De d1 = new De();
    private De d2 = new De();
    private Inventaire Sac;

    /* Constructeur du joueur */
    public Joueur(){
        d1.initDe1();
        d2.initDe2();
        Sac = new Inventaire();



    }
    /* retourne l'inventaire du joueur */
    public Inventaire getInventaireJoueur(){return this.Sac;}
    /* retourne le dé d1 */
    public De getD1() {
        return this.d1;
    }
    /* retourne le dé d2 */
    public De getD2() {
        return this.d2;
    }


    /*public Face ancienneFace(){
        Face FaceMinD1 = this.d1.FACEMIN();
        Face FaceMinD2 = this.d2.FACEMIN();
        if (FaceMinD1 == FaceMinD2 ) return FaceMinD1;
        if (de.compare2Face(FaceMinD1,FaceMinD2) == FaceMinD1) return FaceMinD1;
        else return FaceMinD2;
    }*/

    /* prend en parametre la nouvelle face , cette méthode remplace la plus petite
    Face parmi toutes les faces (du d1 et du d2) par la Face donnée en parametre */
    public void changementFace(Face Achat){
        Face FaceMinD1 = this.d1.faceMin();
        Face FaceMinD2 = this.d2.faceMin();
        if (FaceMinD1 == FaceMinD2 ) this.d1.setFACE(Achat);
        if (De.compare2Face(FaceMinD1,FaceMinD2) == FaceMinD1) this.d1.setFACE(Achat);
        else this.d2.setFACE(Achat);
    }
    /* retourne un chiffre aléatoire entre 0 et 1 */
    private int rand() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
    /*  Achat d'une Face dans la limite des moyens du joueur  */
    public Face acheterFace() {
        Sanctuaire Jardin = new Sanctuaire();
        int x = this.getInventaireJoueur().getNbOR();// x : le nombre d'Or possedant le joueur
        int rand = rand();
        if (x == 2) {
            this.getInventaireJoueur().setNbOR(x - 2);
            if (rand == 0) return Jardin.getSanctuaire(2);
            else {
                return Jardin.getSanctuaire(1);
            }
        }

        if (x == 3) {
            this.getInventaireJoueur().setNbOR(x - 3);
            if (rand == 0) return Jardin.getSanctuaire(3);
            else return Jardin.getSanctuaire(4);

        }

        if (x == 4 | x == 5) {
            this.getInventaireJoueur().setNbOR(x - 4);
            return Jardin.getSanctuaire(5);
        }

        if (x == 6 | x == 7) {
            this.getInventaireJoueur().setNbOR(x - 6);
            return Jardin.getSanctuaire(6);
        }

        if (x == 8 | x == 9 | x == 10 | x == 11) {
            this.getInventaireJoueur().setNbOR(x - 8);
            if (rand == 0) return Jardin.getSanctuaire(7);
            else return Jardin.getSanctuaire(8);

        }
        if ( x >= 12 ){
            this.getInventaireJoueur().setNbOR(x - 12);
            return Jardin.getSanctuaire(9);}
        return De.compare2Face(d1.faceMin(), d2.faceMin());
    }


    /* Achat d'une carte dans limite des moyens du joueur */
    public Exploit acheterCarte() {
        int x1 = this.getInventaireJoueur().getNbLunaire(); /* ressources en lunaire */
        int x2 = this.getInventaireJoueur().getNbSolaire();/* ressources en solaire  */
        int x3 = this.getInventaireJoueur().getNbVictoire();/* ressources en victoire  */
        int rand = rand();
        if ((rand == 0) & (x1 == 1)){
            Carte.MARTEAU.applyEffet(this);
            MARTEAU.modStock();
            this.getInventaireJoueur().addCartes(Carte.MARTEAU);
            this.getInventaireJoueur().setNbLunaire(x1 - MARTEAU.prix.getPrix());
            return MARTEAU;
        }
        else if (( rand == 1) & x1 == 1){
            Carte.COFFRE.applyEffet(this);
            COFFRE.modStock();
            this.getInventaireJoueur().addCartes(Carte.COFFRE);
            this.getInventaireJoueur().setNbLunaire(x1 - COFFRE.prix.getPrix());
            return COFFRE;
        }
        if (x1 == 2){
            Carte.SABOTS.applyEffet(this);
            SABOTS.modStock();
            this.getInventaireJoueur().addCartes(Carte.SABOTS);
            this.getInventaireJoueur().setNbLunaire(x1 - SABOTS.prix.getPrix());
            return SABOTS;
        }

        if (x1 == 3){
            Carte.SATYRES.applyEffet(this);
            SATYRES.modStock();
            this.getInventaireJoueur().addCartes(Carte.SATYRES);
            this.getInventaireJoueur().setNbLunaire(x1 - SATYRES.prix.getPrix());
            return SATYRES;
        }

        if (( rand == 0 ) & (x2 == 1)){
            Carte.ANCIEN.applyEffet(this);
            ANCIEN.modStock();
            this.getInventaireJoueur().addCartes(Carte.ANCIEN);
            this.getInventaireJoueur().setNbSolaire(x2 - ANCIEN.prix.getPrix());
            return ANCIEN;
        }
        else if ((rand == 1)&(x2 ==1)){
            Carte.HERBES.applyEffet(this);
            HERBES.modStock();
            this.getInventaireJoueur().addCartes(Carte.HERBES);
            this.getInventaireJoueur().setNbSolaire(x2 - HERBES.prix.getPrix());
            return HERBES;
        }
        if (x2 == 2){
            Carte.AILES.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.AILES);
            this.getInventaireJoueur().setNbSolaire(x2 - AILES.prix.getPrix());
            return AILES;
        }
        if (x2 == 3){
            Carte.MINOTAURE.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.MINOTAURE);
            this.getInventaireJoueur().setNbSolaire(x2 - MINOTAURE.prix.getPrix());
            return MINOTAURE;
        }
        if (x1 == 4){
            Carte.PASSEUR.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.PASSEUR);
            this.getInventaireJoueur().setNbLunaire(x1 - PASSEUR.prix.getPrix());
            return PASSEUR;
        }
        if (x1 == 5){
            Carte.CASQUE.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.CASQUE);
            this.getInventaireJoueur().setNbLunaire(x1 - CASQUE.prix.getPrix());
            return CASQUE;
        }

        if (x1 == 6){
            Carte.PINCE.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.PINCE);
            this.getInventaireJoueur().setNbLunaire(x1 - PINCE.prix.getPrix());
            return PINCE;
        }

        if ((x1 > 4)&(x2 > 4)){
            Carte.HYDRE.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.HYDRE);
            this.getInventaireJoueur().setNbLunaire(x1 - 5);
            this.getInventaireJoueur().setNbSolaire(x2 - 5);
            return HYDRE;
        }

        if (x2 == 4){
            Carte.MEDUSE.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.MEDUSE);
            this.getInventaireJoueur().setNbSolaire(x2 - MEDUSE.prix.getPrix());
            return MEDUSE;
        }

        if (x2 == 5){
            Carte.MIRROIR.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.MIRROIR);
            this.getInventaireJoueur().setNbSolaire(x2 - MIRROIR.prix.getPrix());
            return MIRROIR;
        }

        if (x2 == 6){
            Carte.ENIGME.applyEffet(this);
            this.getInventaireJoueur().addCartes(Carte.ENIGME);
            this.getInventaireJoueur().setNbSolaire(x2 - ENIGME.prix.getPrix());
            return ENIGME;
        }
        return NULL;

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




