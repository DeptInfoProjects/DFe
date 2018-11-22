package Iles;

import De.*;



public class Sanctuaire {



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

    public  Sanctuaire() {
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


    public Face getSanctuaire(int n){
            if (n == 1){
                return lunaire1;
                }
            if (n ==2) {
                return or3;
                }
             else {
                 return victoire4;
            }
            }


    }
