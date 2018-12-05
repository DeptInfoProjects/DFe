package stat;

import bot.Joueur;
import partie.Tours;

import java.text.DecimalFormat;

public class Stat {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);
        DecimalFormat f1 = new DecimalFormat();
        f1.setMaximumFractionDigits(2);
        DecimalFormat f2 = new DecimalFormat();
        f2.setMaximumFractionDigits(2);
        double memJ2 = 0;
        double memJ1 = 0;
        double memNull = 0;
        for (int acc = 0; acc < 499; acc++) {
            Joueur J1 = new Joueur();
            Joueur J2 = new Joueur();
            int mem = new Tours(J1, J2).partieStat();
            if (mem == 0) {
                memNull = memNull + 1;
            }
            if (mem == 1) {
                memJ1 = memJ1 + 1;
            } else memJ2 = memJ2 + 1;

        }
        System.out.println("------------BIENVENUE SUR DICE-FORGE-STAT------------\n" + " Sur " + (memJ1 + memJ2 + memNull) + " partie : \n Le joueur 2 à gagné  " + ((int) memJ2) + " fois \n" +
                " Le joueur 1 à gagné " + ((int) memJ1) + " fois " + "\n Il y a eu " + ((int) memNull) + " match nul\n\n"

                + " En moyenne sur 100 partie le joueur 1 à gagné :" + f.format(((memJ1 / (memJ1 + memJ2 + memNull)) * 100)) + " partie" + "\n " + "En moyenne sur 100 partie le joueur 2 à gagné :" + f1.format(((memJ2 / (memJ1 + memJ2 + memNull)) * 100)) + " partie" + "\n" + " En moyenne sur 100 partie il y a " + f2.format(((memNull / (memJ1 + memJ2 + memNull)) * 100)) + " partie");


    }
}

