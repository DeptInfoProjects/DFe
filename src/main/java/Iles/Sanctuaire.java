package Iles;

import De.Face;
import De.Ressource;


//

public class Sanctuaire {
    // pour les FACES  qui cout 2 //
    Face lunaire1 = new Face(1, Ressource.LUNAIRE);
    Face  or3 = new Face(3,Ressource.OR);



    // pour les FACES qui cout 3 //
    Face  or4 = new Face(4,Ressource.OR);
    Face solaire1 = new Face(1,Ressource.SOLAIRE);

    // pour les FACES qui cout 4 //
    public Face multiFace1(){
        int x = (int)(Math.random() * 2) ;
        switch(x){
            case 0 : return new  Face(1,Ressource.LUNAIRE);
            case 1 : return new  Face(1,Ressource.OR);
            default: return new Face(1,Ressource.SOLAIRE);
        }
    }
    // pour les FACES qui cout 5 //

    // pour les FACES qui cout 6 //
    Face lunaire2 = new Face(2 ,Ressource.LUNAIRE);

    // pour les FACES qui cout 8 //
    Face solaire2 = new Face(2, Ressource.SOLAIRE);
    Face victoire3 = new Face(3,Ressource.VICTOIRE);

    // pour les FACES qui cout  //





}
