package bot;
import de.*;
import iles.*;
import partie.Tours;


import java.util.Random;

import static iles.Carte.*;
import static iles.Carte.ENIGME;
import static iles.Carte.NULL;

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

    private static final String CYAN = "\u001B[36m";
    private static final String BLACK = "\u001B[30m";

    /*public Face ancienneFace(){
        Face FaceMinD1 = this.d1.FACEMIN();
        Face FaceMinD2 = this.d2.FACEMIN();
        if (FaceMinD1 == FaceMinD2 ) return FaceMinD1;
        if (de.compare2Face(FaceMinD1,FaceMinD2) == FaceMinD1) return FaceMinD1;
        else return FaceMinD2;
    }*/



    public String getJoueur(){
        if (this == Tours.joueur1) return ("Joueur1 ");
        else return ("Joueur2 ");
    }

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
        int x = this.Sac.getNbOR();// x : le nombre d'Or possedant le joueur
        if (x == 2) {
            this.Sac.setNbOR(x - 2);
            return Jardin.getSanctuaire(1);
            }


        if (x == 3) {
            this.Sac.setNbOR(x - 3);
            return Jardin.getSanctuaire(2);

        }

        if (x == 4) {
            this.Sac.setNbOR(x - 4);
            return Jardin.getSanctuaire(3);
        }
        if (x == 5) {
            this.Sac.setNbOR(x - 5);
            return Jardin.getSanctuaire(4);
        }

        if (x == 6 | x == 7) {
            this.Sac.setNbOR(x - 6);
            return Jardin.getSanctuaire(5);
        }

        if (x == 8 | x == 9 | x == 10 | x == 11) {
            this.Sac.setNbOR(x - 8);
            return Jardin.getSanctuaire(6);

        }
        if ( x >= 12 ){
            this.Sac.setNbOR(x - 12);
            return Jardin.getSanctuaire(7);}
        return De.compare2Face(d1.faceMin(), d2.faceMin());
    }

    //CHANGER ORDRE  PAIEMENT RECOPERACTION APPLICATION EFFET

    /* Achat d'une carte dans limite des moyens du joueur */
    public Exploit acheterCarte() {
        int invLun = this.Sac.getNbLunaire(); /* ressources en lunaire */
        int invSol = this.Sac.getNbSolaire();/* ressources en solaire  */
        int invVic = this.Sac.getNbVictoire();/* ressources en Victoire  */
        Choix Courant = new Choix();
        Courant.addChoixList();
        int rand = Courant.getChoixList(2);

        String joueurActif = getJoueur();
        if ((rand == 0) && (invLun == 1) && MARTEAU.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ MARTEAU.getNom());

            this.Sac.setNbLunaire(invLun - MARTEAU.prix.getPrix());
            MARTEAU.modStock();
            this.Sac.addCartes(Carte.MARTEAU);
            Carte.MARTEAU.applyEffet(this);
            return MARTEAU;
        }
        if (( rand == 1) && invLun == 1 && COFFRE.stock>0 ) {
            System.out.println(CYAN+joueurActif+ "veut acheter la Carte " + BLACK+ COFFRE.getNom());
            this.Sac.setNbLunaire(invLun - COFFRE.prix.getPrix());
            COFFRE.modStock();
            this.Sac.addCartes(Carte.COFFRE);
            Carte.COFFRE.applyEffet(this);
            return COFFRE;
        }
        if ((invLun >= 5)&&(invSol >= 5) && HYDRE.stock>0){
            System.out.println(CYAN+joueurActif+  "veut acheter la Carte " + BLACK+ HYDRE.getNom());
            Carte.HYDRE.applyEffet(this);
            HYDRE.modStock();
            this.Sac.addCartes(Carte.HYDRE);
            this.Sac.setNbSolaire(invSol - 5);
            this.Sac.setNbLunaire(invLun - 5);

            return HYDRE;

        }
        if (invLun == 2 && SABOTS.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ SABOTS.getNom());
            Carte.SABOTS.applyEffet(this);
            SABOTS.modStock();
            this.Sac.addCartes(Carte.SABOTS);
            this.Sac.setNbLunaire(invLun - SABOTS.prix.getPrix());
            return SABOTS;
        }

        if (invLun == 3 && SATYRES.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ SATYRES.getNom());
            Carte.SATYRES.applyEffet(this);
            SATYRES.modStock();
            this.Sac.addCartes(Carte.SATYRES);
            this.Sac.setNbLunaire(invLun - SATYRES.prix.getPrix());
            return SATYRES;
        }

        if (( rand == 0 ) && (invSol == 1) && ANCIEN.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ ANCIEN.getNom());
            Carte.ANCIEN.applyEffet(this);
            ANCIEN.modStock();
            this.Sac.addCartes(Carte.ANCIEN);
            this.Sac.setNbSolaire(invSol - ANCIEN.prix.getPrix());
            return ANCIEN;
        }
        else if ((rand == 1)&&(invSol ==1) && HERBES.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ HERBES.getNom());
            Carte.HERBES.applyEffet(this);
            HERBES.modStock();
            this.Sac.addCartes(Carte.HERBES);
            this.Sac.setNbSolaire(invSol - HERBES.prix.getPrix());
            return HERBES;
        }
        if (invSol == 2 && AILES.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ AILES.getNom());
            Carte.AILES.applyEffet(this);
            this.Sac.addCartes(Carte.AILES);
            this.Sac.setNbSolaire(invSol - AILES.prix.getPrix());
            return AILES;
        }
        if (invSol == 3 && MINOTAURE.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ MINOTAURE.getNom());
            Carte.MINOTAURE.applyEffet(this);
            this.Sac.addCartes(Carte.MINOTAURE);
            this.Sac.setNbSolaire(invSol - MINOTAURE.prix.getPrix());
            return MINOTAURE;
        }
        if (invLun == 4 && PASSEUR.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ PASSEUR.getNom());
            Carte.PASSEUR.applyEffet(this);
            this.Sac.setNbVictoire(invVic + 12);
            this.Sac.setNbLunaire(invLun - PASSEUR.prix.getPrix());
            return PASSEUR;
        }
        if (invLun == 5 && CASQUE.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ CASQUE.getNom());
            Carte.CASQUE.applyEffet(this);
            this.Sac.addCartes(Carte.CASQUE);
            this.Sac.setNbLunaire(invLun - CASQUE.prix.getPrix());
            return CASQUE;
        }

        if (invLun >= 6 && PINCE.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ PINCE.getNom());
            Carte.PINCE.applyEffet(this);
            this.Sac.addCartes(Carte.PINCE);
            this.Sac.setNbLunaire(invLun - PINCE.prix.getPrix());
            return PINCE;
        }

        if (invSol == 4 && MEDUSE.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ MEDUSE.getNom());
            Carte.MEDUSE.applyEffet(this);
            this.Sac.addCartes(Carte.MEDUSE);
            this.Sac.setNbSolaire(invSol - MEDUSE.prix.getPrix());
            return MEDUSE;

        }

        if (invSol == 5 && MIRROIR.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ MIRROIR.getNom());
            Carte.MIRROIR.applyEffet(this);
            this.Sac.addCartes(Carte.MIRROIR);
            this.Sac.setNbSolaire(invSol - MIRROIR.prix.getPrix());
            return MIRROIR;
        }

        if (invSol >= 6 && ENIGME.stock>0){
            System.out.println(CYAN+ joueurActif+ "veut acheter la Carte " + BLACK+ ENIGME.getNom());
            Carte.ENIGME.applyEffet(this);
            this.Sac.addCartes(Carte.ENIGME);
            this.Sac.setNbSolaire(invSol - ENIGME.prix.getPrix());
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




