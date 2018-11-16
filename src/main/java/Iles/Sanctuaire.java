package Iles;

import Bot.Joueur;
import De.Face;
import De.Ressource;

import java.util.Random;




public class Sanctuaire {
    Joueur joueur1 = new Joueur();

    Face lunaire1 = new Face(1, Ressource.LUNAIRE);   /* x4  */
    Face or3 = new Face(3, Ressource.OR);     /* x4 */


    // pour les FACES qui cout 3 //
    Face or4 = new Face(4, Ressource.OR);      /* x4 */
    Face solaire1 = new Face(1, Ressource.SOLAIRE);     /* x4 */

    // pour les FACES qui cout 4 //

    Face or6 = new Face(6, Ressource.OR); /* x1  */

    // pour les FACES qui cout 5 //

    // pour les FACES qui cout 6 //
    Face lunaire2 = new Face(2, Ressource.LUNAIRE);  /* x4 */

    // pour les FACES qui cout 8 //
    Face solaire2 = new Face(2, Ressource.SOLAIRE);     /* x4 */
    Face victoire3 = new Face(3, Ressource.VICTOIRE);     /* x4 */

    // pour les FACES qui cout 12 //

    Face victoire4 = new Face(4, Ressource.VICTOIRE);     /* x1*/

    public void Sanctuaire() {
        this.joueur1 = joueur1;
        this.or3 = or3;
        this.lunaire1 = lunaire1;

        this.or4 = or4;
        this.solaire1 = solaire1;

        this.or6 = or6;

        this.lunaire2 = lunaire2;

        this.solaire2 = solaire2;
        this.victoire3 = victoire3;

        this.victoire4 = victoire4;
    }

    public int Rand(Integer f) {
        Random rand = new Random();
        return rand.nextInt(f);
    }

    public Face Choix(Joueur J1) {
        int x = J1.Sac.getNbOR();
        int rand = Rand(2);
        switch (x) {
            case 2:
                if (rand == 0) {
                    J1.Sac.setNbOR(x - 2);
                    return or3;
                } else {
                    J1.Sac.setNbOR(x - 2);
                    return lunaire1;
                }

            case 3:
                if (rand == 0) {
                    J1.Sac.setNbOR(x - 3);
                    return or4;
                } else {
                    J1.Sac.setNbOR(x - 3);
                    return solaire1;
                }

            case (4 | 5): {
                J1.Sac.setNbOR(x - 4);
                return or6;
            }

            case (6 | 7): {
                J1.Sac.setNbOR(x - 6);
                return lunaire2;
            }

            case (8 | 9 | 10 | 11):
                if (rand == 0) {
                    J1.Sac.setNbOR(x - 8);
                    return solaire2;
                } else {
                    J1.Sac.setNbOR(x - 8);
                    return victoire3;
                }
            case 12:
                J1.Sac.setNbOR(x - 12);
                return  victoire4;
            default:
                return J1.d1.getFace();
            }
        }

    }
