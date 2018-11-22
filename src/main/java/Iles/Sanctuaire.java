package Iles;

import Bot.Joueur;
import De.Face;
import De.Ressource;

import java.util.Random;




public class Sanctuaire {
    private Joueur joueur1 = new Joueur();

    private Face lunaire1 = new Face(1, Ressource.LUNAIRE);   /* x4  */
    private Face or3 = new Face(3, Ressource.OR);     /* x4 */


    // pour les FACES qui cout 3 //
    private Face or4 = new Face(4, Ressource.OR);      /* x4 */
    private Face solaire1 = new Face(1, Ressource.SOLAIRE);     /* x4 */

    // pour les FACES qui cout 4 //

    private Face or6 = new Face(6, Ressource.OR); /* x1  */

    // pour les FACES qui cout 5 //

    // pour les FACES qui cout 6 //
    private Face lunaire2 = new Face(2, Ressource.LUNAIRE);  /* x4 */

    // pour les FACES qui cout 8 //
    private Face solaire2 = new Face(2, Ressource.SOLAIRE);     /* x4 */
    private Face victoire3 = new Face(3, Ressource.VICTOIRE);     /* x4 */

    // pour les FACES qui cout 12 //

    private Face victoire4 = new Face(4, Ressource.VICTOIRE);     /* x1*/


    private int Rand(Integer f) {
        Random rand = new Random();
        return rand.nextInt(f);
    }

    public Face AcheterFace(Joueur J1) {
        int x = J1.getInventaireJoueur().getNbOR();
        int rand = Rand(2);
        if (x == 2) {
            J1.getInventaireJoueur().setNbOR(x - 2);
            if (rand == 0) return or3;
            else return lunaire1;
        }

        if (x == 3) {
            J1.getInventaireJoueur().setNbOR(x - 3);
            if (rand == 0) return or4;
            else return solaire1;

        }

        if (x == 4 | x == 5 ) {
            J1.getInventaireJoueur().setNbOR(x - 4);
            return or6;
        }

        if (x == 6 | x == 7) {
            J1.getInventaireJoueur().setNbOR(x - 6);
            return lunaire2;
        }

        if (x == 8 | x == 9 | x == 10 | x == 11){
            J1.getInventaireJoueur().setNbOR(x - 8);
            if (rand == 0) return solaire2;
            else return victoire3;
        }

        if (x >= 12){
            J1.getInventaireJoueur().setNbOR(x - 12);
            return  victoire4;
        }
        else return victoire4;
    }

    }
