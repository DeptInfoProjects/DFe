

package Iles;

import de.*;

import java.util.Random;

import static de.Ressource.*;
import static de.Type.*;


public class Sanctuaire {

    // pour les FACES qui cout 2 //
    private Face lunaire1 = new Face(NORMAL,1, LUNAIRE);   /* x4  */
    private Face or3 = new Face(NORMAL,3, OR);     /* x4 */

    // pour les FACES qui cout 3 //
    private Face or4 = new Face(NORMAL,4, OR);      /* x4 */
    private Face solaire1 = new Face(NORMAL, 1, SOLAIRE);     /* x4 */

    // pour les FACES qui cout 4 //
    private Face or6 = new Face(NORMAL, 6, OR); /* x1  */
    private Face multi1 = new Face(PLUS,2,1, 0 ,0);
    private Face choix1 = new Face(CHOIX, 1, 1, 1 , 0);
    private Face mutli2 = new Face(PLUS, 0, 0,1, 1);
    private Face null1 = new Face(NORMAL,0,0,0,0);

    // pour les FACES qui cout 5//
    private Face choix2 = new Face(CHOIX,3, 0, 0, 2); /* x4 */


    // pour les FACES qui cout 6 //
    private Face lunaire2 = new Face(NORMAL,2, LUNAIRE);  /* x4 */


    // pour les FACES qui cout 8 //
    private Face solaire2 = new Face(NORMAL, 2, SOLAIRE);     /* x4 */
    private Face victoire3 = new Face(NORMAL,3, VICTOIRE);     /* x4 */

    // pour les FACES qui cout 12 //
    private Face victoire4 = new Face(NORMAL,4, VICTOIRE);     /* x1*/
    private Face choix3 = new Face(CHOIX, 2, 2, 2, 0);
    private Face multi3 = new Face(PLUS, 1, 1, 1, 1);
    private Face multi4 = new Face(PLUS, 0, 2, 0, 2);



    public  Sanctuaire() {

    }


    private int rand2(){
        Random rand2 = new Random();
        return rand2.nextInt(2);
    }

    private int rand4(){
        Random rand4 = new Random();
        return rand4.nextInt(4);
    }
    public Face getSanctuaire(int n){
        int rand = rand2();
        int rand4 = rand4();
        if ((n == 1)&(rand ==0 )){
            return lunaire1;
        }
        if ((n == 1) & (rand == 1)){
            return or3;
        }

        if ((n == 2 ) & (rand == 0)){
            return or4;
        }
        if ((n == 2) & (rand == 1)){
            return solaire1;
        }
        if ((n == 3)&(rand4 == 0)){
            return multi1;
        }
        if ((n == 3) & (rand4 == 1)) {
            return choix1;
        }
        if ((n == 3) & (rand4 == 2)) {
            return or6;
        }
        if ((n == 3) & (rand4 == 3)) {
            return mutli2;
        }
        if ((n == 4)) {
            return choix2;
        }

        if (n == 5){
            return lunaire2;
        }
        if ((n == 6)&(rand == 0)) {
            return solaire2;
        }
        if ((n == 6 ) & (rand == 1)) {
            return victoire3;
        }
        if ((n == 7) & (rand4 == 0)) {
            return victoire4;
        }
        if ((n == 7) & (rand4 == 1)){
            return choix3;
        }
        if ((n == 7) & (rand4 == 2)){
            return multi3;
        }
            return multi4;

    }


}