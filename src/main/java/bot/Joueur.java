package bot;
import de.*;
import iles.*;


import java.util.Random;

/* Un joueur possède (est caractérisé par) 2 Dés (d1 et d2) et d'un sac (son inventaire) */
public class Joueur {

    private De d1 = new De();
    private De d2 = new De();
    private Inventaire Sac;


    public Joueur(){  /* Constructeur du joueur */
        d1.initDe1();
        d2.initDe2();
        Sac = new Inventaire();



    }
    public Inventaire getInventaireJoueur(){ /* retourne l'inventaire du joueur */
        return this.Sac;}

    public De getD1() {  /* retourne le dé d1 */
        return this.d1;
    }

    public De getD2() {/* retourne le dé d2 */
        return this.d2;
    }




    public void changementFace(Face Achat){  /* prend en parametre la nouvelle face , cette méthode remplace la plus petite Face parmi toutes les faces (du d1 et du d2) par la Face donnée en parametre */
        Face FaceMinD1 = this.d1.faceMin();
        Face FaceMinD2 = this.d2.faceMin();
        if (FaceMinD1 == FaceMinD2 ) this.d1.setFACE(Achat);
        if (De.compare2Face(FaceMinD1,FaceMinD2) == FaceMinD1) this.d1.setFACE(Achat);
        else this.d2.setFACE(Achat);
    }

    private int Rand() {  /* retourne un chiffre aléatoire entre 0 et 1 */
        Random rand = new Random();
        return rand.nextInt(2);
    }

    public Face acheterFace() {     /*  Achat d'une Face dans la limite des moyens du joueur  */
        Sanctuaire Jardin = new Sanctuaire();
        int x = this.getInventaireJoueur().getNbOR(); // x : le nombre d'Or possedant le joueur
        int rand = Rand();
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


    public Carte acheterCarte() {  /* Achat d'une carte dans limite des moyens du joueur */
        int x1 = this.getInventaireJoueur().getNbLunaire(); /* ressources en lunaire */
        int x2 = this.getInventaireJoueur().getNbSolaire();/* ressources en solaire  */
        int x3 = this.getInventaireJoueur().getNbVictoire();/* ressources en victoire  */


        if (x1 == 1) {
            int rand = Rand();
            if ((rand == 0) && (Carte.MARTEAU.getStock() > 0)) {
                this.getInventaireJoueur().setNbLunaire(x1 - 1); /* enlever 1 lunaire de l'inventaire  */
                Carte.MARTEAU.ModStock();   /* maj du stock */
                /* 0 pts de Victoire pour cette carte */
                return Carte.MARTEAU ;

            }
            if (Carte.COFFRE.getStock() > 0) {
                this.getInventaireJoueur().setNbLunaire(x1 - 1); /* enlever 1 lunaire de l'inventaire  */
                Carte.COFFRE.ModStock();   /* maj du stock */
                this.getInventaireJoueur().setNbVictoire(x3 + 2);/* maj des nb de Victoire */
                return Carte.COFFRE ;

            }

        }

        if ((x1 == 2) && (Carte.SABOTS.getStock() > 0)) {
            this.getInventaireJoueur().setNbLunaire(x1 - 2); /* enlever 2 lunaires de l'inventaire  */
            Carte.SABOTS.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 2); /* maj des nb de Victoire */
            return Carte.SABOTS ;

        }
        if ((x1 == 3) && (Carte.SATYRES.getStock() > 0)) {
            this.getInventaireJoueur().setNbLunaire(x1 - 3); /* enlever 3 lunaires de l'inventaire  */
            Carte.SATYRES.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 6); /* maj des nb de Victoire */
            return Carte.SATYRES ;

        }

        if ((x1 == 4) && (Carte.PASSEUR.getStock() > 0)) {
            this.getInventaireJoueur().setNbLunaire(x1 - 4); /* enlever 4 lunaires de l'inventaire  */
            Carte.PASSEUR.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 12); /* maj des nb de Victoire */
            return Carte.PASSEUR ;

        }

        if ((x1 == 5) && (Carte.CASQUE.getStock() > 0)) {
            this.getInventaireJoueur().setNbLunaire(x1 - 5); /* enlever 5 lunaires de l'inventaire  */
            Carte.CASQUE.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 4); /* maj des nb de Victoire */
            return Carte.CASQUE ;

        }
        if ((x1 >= 6) && (Carte.PINCE.getStock() > 0)) {
            this.getInventaireJoueur().setNbLunaire(x1 - 6); /* enlever 6 lunaires de l'inventaire  */
            Carte.PINCE.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 8); /* maj des nb de Victoire */
            return Carte.PINCE ;

        }




        if (x2 == 1) {
            int rand = Rand();
            if ((rand == 0) && (Carte.ANCIEN.getStock() > 0)) {
                this.getInventaireJoueur().setNbSolaire(x2 - 1); /* enlever 1 solaire de l'inventaire  */
                Carte.ANCIEN.ModStock();   /* maj du stock */
                /* 0 pts de Victoire pour cette carte */
                return Carte.ANCIEN ;

            }

            if (Carte.HERBES.getStock() > 0) {
                this.getInventaireJoueur().setNbSolaire(x2 - 1); /* enlever 1 solaire de l'inventaire  */
                Carte.HERBES.ModStock();   /* maj du stock */
                this.getInventaireJoueur().setNbVictoire(x3 + 2);/* maj des nb de Victoire */
                return Carte.HERBES ;

            }
        }

        if ((x2 == 2) && (Carte.AILES.getStock() > 0)) {
            this.getInventaireJoueur().setNbSolaire(x2 - 2); /* enlever 2 solaires de l'inventaire  */
            Carte.AILES.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 4); /* maj des nb de Victoire */
            return Carte.AILES ;

        }

        if ((x2 == 3) && (Carte.MINOTAURE.getStock() > 0)) {
            this.getInventaireJoueur().setNbSolaire(x2 - 3); /* enlever 3 solaires de l'inventaire  */
            Carte.MINOTAURE.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 8); /* maj des nb de Victoire */
            return Carte.MINOTAURE ;

        }

        if ((x2 == 4) && (Carte.MEDUSE.getStock() > 0)) {
            this.getInventaireJoueur().setNbSolaire(x2 - 4); /* enlever 4 solaires de l'inventaire  */
            Carte.MEDUSE.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 14); /* maj des nb de Victoire */
            return Carte.MEDUSE ;

        }

        if ((x2 == 5) && (Carte.MIRROIR.getStock() > 0)) {
            this.getInventaireJoueur().setNbSolaire(x2 - 5); /* enlever 5 solaires de l'inventaire  */
            Carte.MIRROIR.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 10); /* maj des nb de Victoire */
            return Carte.MIRROIR ;

        }

        if ((x2 >= 6) && (Carte.ENIGME.getStock() > 0)) {
            this.getInventaireJoueur().setNbSolaire(x2 - 6); /* enlever 6 solaires de l'inventaire  */
            Carte.ENIGME.ModStock();   /* maj du stock */
            this.getInventaireJoueur().setNbVictoire(x3 + 10); /* maj des nb de Victoire */
            return Carte.ENIGME ;

        }

        return Carte.NULL ;    /* Si le joueur a 0 solaire et 0 lunaire  */

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




