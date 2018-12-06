package iles;

import de.*;

import static de.Ressource.*;
import static de.Type.*;


public class Sanctuaire {
    private Face lunaire1 = new Face(1, LUNAIRE,NORMAL);   /* x4  */
    private Face or3 = new Face(3, OR,NORMAL);     /* x4 */

    // pour les FACES qui cout 3 //
    private Face or4 = new Face(4, OR,NORMAL);      /* x4 */
    private Face solaire1 = new Face(1, SOLAIRE,NORMAL);     /* x4 */
    // pour les FACES qui cout 4 //
    private Face or6 = new Face(6, OR,NORMAL); /* x1  */

    // pour les FACES qui cout 6 //
    private Face lunaire2 = new Face(2, LUNAIRE,NORMAL);  /* x4 */

    // pour les FACES qui cout 8 //
    private Face solaire2 = new Face(2, SOLAIRE,NORMAL);     /* x4 */
    private Face victoire3 = new Face(3, VICTOIRE,NORMAL);     /* x4 */

    // pour les FACES qui cout 12 //

    private Face victoire4 = new Face(4, VICTOIRE,NORMAL);     /* x1*/

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
