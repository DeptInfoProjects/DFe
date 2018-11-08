package Game;
import Bot.*;
import De.*;

public class Partie {
        public static void main(String[] args){
            System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
            Jouer jouer1 = new Jouer();
            Jouer jouer2 = new Jouer();
            for(int acc = 0 ; acc < 9; acc++) {
                Face memFd1J1 = jouer1.lancerDe1();
                Face memFd2J1 = jouer1.lancerDe2();
                Face memFd1J2 = jouer2.lancerDe1();
                Face memFd2J2 = jouer2.lancerDe2();
                jouer1.Sac.setInventaire(memFd1J1.getValeur() + memFd2J1.getValeur());
                jouer2.Sac.setInventaire( memFd1J2.getValeur()+ memFd2J2.getValeur());
                System.out.println("Tour : " + (acc + 1) + '\n' +  " Le joueur 1 a obtenu : " + memFd1J1.getValeur() + " et " + memFd2J1.getValeur() + " points d'" + memFd1J1.getRes() + '\n'
                        +  " Le joueur 2 a obtenu : " + memFd1J2.getValeur() + " et " + memFd2J2.getValeur() + " points d'" + memFd2J2.getRes());
            }
            System.out.println(" \n Total de point d'" + Ressource.OR + " gagné par le joueur 1: " + jouer1.Sac.getInventaire() + " \n Total de point d'" + Ressource.OR + " gagné par le joueur 2: " + jouer2.Sac.getInventaire());
            if (jouer1.Sac.getInventaire() < jouer2.Sac.getInventaire())   /* Celui qui a le plus de point Gagne ,si non match nul */
                System.out.print(" \n Joueur 2 gagnant");
            else if (jouer1.Sac.getInventaire() > jouer2.Sac.getInventaire())
                System.out.print(" \n Joueur 1 gagnant");
            else System.out.print("\n Match Nul");
        }


}
