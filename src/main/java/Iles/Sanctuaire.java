package Iles;

import de.*;

import java.util.Random;

import static de.Ressource.*;
import static de.Type.*;


public class Sanctuaire {
    private Face lunaire1 = new Face(1, LUNAIRE,NORMAL);   /* x4  */
    private Face or3 = new Face(3, OR,NORMAL);     /* x4 */

    // pour les FACES qui cout 3 //
    private Face or4 = new Face(4, OR,NORMAL);      /* x4 */
    private Face solaire1 = new Face(1, SOLAIRE,NORMAL);     /* x4 */
    // pour les FACES qui cout 4 //
    private Face multi1 = new Face(2,OR,1,SOLAIRE,PLUS);
    private Face choix1 = new Face(1,LUNAIRE,1,SOLAIRE,1 ,OR,CHOIX);
    private Face or6 = new Face(6, OR,NORMAL); /* x1  */
    private Face mutli2 = new Face(1,VICTOIRE,1,LUNAIRE,PLUS);


    // pour les FACES qui cout 5//

    private Face choix2 = new Face(3,OR,2,VICTOIRE,CHOIX); /* x4 */
    // pour les FACES qui cout 6 //
    private Face lunaire2 = new Face(2, LUNAIRE,NORMAL);  /* x4 */

    // pour les FACES qui cout 8 //
    private Face solaire2 = new Face(2, SOLAIRE,NORMAL);     /* x4 */
    private Face victoire3 = new Face(3, VICTOIRE,NORMAL);     /* x4 */

    // pour les FACES qui cout 12 //

    private Face victoire4 = new Face(4, VICTOIRE,NORMAL);     /* x1*/
    private Face choix3 = new Face(2,OR,2,LUNAIRE,2,SOLAIRE,CHOIX);
    private Face multi3 = new Face(1,OR,1,LUNAIRE,1,SOLAIRE,1,VICTOIRE,PLUS);
    private Face multi4 = new Face(2,VICTOIRE,2,LUNAIRE,PLUS);



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
        else if ((n == 1) & (rand == 1)){
            return or3;
        }

        if ((n == 2 ) & (rand == 0)){
            return or4;
        }
        else if ((n == 2) & (rand == 1)){
            return solaire1;
        }
        if ((n == 3)&(rand4 == 0)){
            return multi1;
        }
        else if ((n == 3) & (rand4 == 1)) {
            return choix1;
        }
        else if ((n == 3) & (rand4 == 2)) {
            return or6;
        }
        else if ((n == 3) & (rand4 == 3)) {
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
        else if ((n == 6 ) & (rand == 1)) {
            return victoire3;
        }
        if ((n == 7) & (rand4 == 0)) {
            return victoire4;
        }
        else if ((n == 7) & (rand4 == 1)){
            return choix3;
        }
        else if ((n == 7) & (rand4 == 2)){
            return multi3;
        }
        else if ((n == 7) & (rand4 == 3)){
            return multi4;
        }

        return null;
    }


}
