package partie;

import bot.*;

public class Final {
    public static void main(String[] args){
        System.out.println("-------Bienvenue sur Dice forge----------");
        Joueur Kyriakos = new Joueur() ;
        Joueur Petrou = new Joueur() ;
        new Tours(Kyriakos,Petrou).partie();

    }
}
