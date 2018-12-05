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


    // pour les FACES qui cout 6 //
    private Face lunaire2 = new Face(2, Ressource.LUNAIRE);  /* x4 */

    // pour les FACES qui cout 8 //
    private Face solaire2 = new Face(2, Ressource.SOLAIRE);     /* x4 */
    private Face victoire3 = new Face(3, Ressource.VICTOIRE);     /* x4 */

    // pour les FACES qui cout 12 //

    private Face victoire4 = new Face(4, Ressource.VICTOIRE);     /* x1*/

    public  Sanctuaire() {

    }


    public Face getSanctuaire(int n){
        if (n == 1){
            return lunaire1;
        }
        if (n ==2) {
            return or3;
        }
        if (n == 3) {
            return or4;
        }
        if (n == 4) {
            return solaire1;
        }
        if (n == 5) {
            return or6;
        }
        if (n == 6) {
            return lunaire2;
        }
        if (n == 7) {
            return solaire2;
        }
        if (n == 8) {
            return victoire3;
        } else {
            return victoire4;
        }
    }


}
