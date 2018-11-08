package Game;
import Bot.*;
import De.*;

public class Partie {
        public static void main(String[] args){
            System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
            Joueur joueur1 = new Joueur();
            Joueur joueur2 = new Joueur();
            for(int acc = 0 ; acc < 9; acc++) {
                Face memFd1J1 = joueur1.lancerDe1();
                Face memFd2J1 = joueur1.lancerDe2();
                Face memFd1J2 = joueur2.lancerDe1();
                Face memFd2J2 = joueur2.lancerDe2();
                joueur1.Sac.setInventaire(memFd1J1.getValeur() + memFd2J1.getValeur());
                joueur2.Sac.setInventaire( memFd1J2.getValeur()+ memFd2J2.getValeur());
                System.out.println("Tour : " + (acc + 1) + '\n' +  " Le joueur 1 a obtenu : " + memFd1J1.getValeur() + " et " + memFd2J1.getValeur() + " points d'" + memFd1J1.getRes() + '\n'
                        +  " Le joueur 2 a obtenu : " + memFd1J2.getValeur() + " et " + memFd2J2.getValeur() + " points d'" + memFd2J2.getRes());
                joueur1.d1.setFACE();
                joueur1.d2.setFACE();
                joueur2.d1.setFACE();
                joueur2.d2.setFACE();
            }
            System.out.println(" \n Total de point d'" + Ressource.OR + " gagné par le joueur 1: " + joueur1.Sac.getInventaire() + " \n Total de point d'" + Ressource.OR + " gagné par le joueur 2: " + joueur2.Sac.getInventaire());
            if (joueur1.Sac.getInventaire() < joueur2.Sac.getInventaire())   /* Celui qui a le plus de point Gagne ,si non match nul */
                System.out.print(" \n Joueur 2 gagnant");
            else if (joueur1.Sac.getInventaire() > joueur2.Sac.getInventaire())
                System.out.print(" \n Joueur 1 gagnant");
            else System.out.print("\n Match Nul");
        }


}
