package stat;

import bot.*;

public class Stat {
    public static void main(String[] args) {
        float memJ2 = 0;
        float memJ1 = 0;
        float memNull = 0;
        for (int acc = 0; acc < 499; acc++) {
            Joueur J1 = new Joueur();
            Joueur J2 = new Joueur();
            int mem = new TourStat(J1, J2).Partie();
            if (mem == 0) {
                memNull = memNull + 1;
            }
            if (mem == 1) {
                memJ1 = memJ1 + 1;
            } else memJ2 = memJ2 + 1;

        }
        System.out.println("------------BIENVENUE SUR DICE-FORGE-STAT------------\n"
                + " Sur 500 partie : \n Le joueur 2 à gagné  " + ((int) memJ2) + " fois \n" +
                " Le joueur 1 à gagné " + ((int) memJ1) + " fois " + "\n Il y a eu " + ((int) memNull) + " match nul\n\n"

                + " En moyenne sur 100 partie le joueur 1 à gagné :" + (memJ1 / 500) * 100 + " partie" + "\n "
                + "En moyenne sur 100 partie le joueur 2 à gagné :" + (memJ2 / 500) * 100 + " partie" + "\n"
                + " En moyenne sur 100 partie il y a " + ((memNull / 500) * 100) + " partie");


    }
}

