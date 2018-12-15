package stat;

import bot.Joueur;
import partie.Tours;

import java.text.DecimalFormat;

public class Stat {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(3);
        DecimalFormat f1 = new DecimalFormat();
        f1.setMaximumFractionDigits(3);
        DecimalFormat f2 = new DecimalFormat();
        f2.setMaximumFractionDigits(3);
        double memJ2 = 0;
        double memJ1 = 0;
        double memNull = 0;
        double max =0;
        double cpt = 0;
        for (int acc = 0; acc < 500; acc++) {
            Joueur J1 = new Joueur();
            Joueur J2 = new Joueur();
            int mem = new Tours(J1, J2).partieStat();
            int mem2 = new Tours(J1, J2).partieStatPoint();
            max = Math.max(mem2,max);
            cpt = cpt + mem2;
            if (mem == 0) {
                memNull = memNull + 1;
            }
            if (mem == 1) {
                memJ1 = memJ1 + 1;
            }
            if (mem==2) {memJ2 = memJ2 + 1;}
            /*System.out.println(mem2);*/

        }
        System.out.println("------------BIENVENUE SUR DICE-FORGE-STAT------------\n" + " Sur " + ((int)memJ1 + memJ2 + memNull) + " parties : \n Le joueur 2 en a gagné " + ((int) memJ2) + "\n" +
                " Le joueur 1 en a gagné " + ((int) memJ1) + "\n Il y a eu " + ((int) memNull) + " match nul\n\n"

                + " En moyenne sur 100 parties le joueur 1 a gagné " + f.format(((memJ1 / (memJ1 + memJ2 + memNull)) * 100)) + " parties" + "\n " + "En moyenne sur 100 parties le joueur 2 a gagné " + f1.format(((memJ2 / (memJ1 + memJ2 + memNull)) * 100)) + " parties" + "\n" + " En moyenne sur 100 parties il y a " + f2.format(((memNull / (memJ1 + memJ2 + memNull)) * 100)) + " parties"
        + "\n" + " En moyenne sur 500 le joueur 1 a obtenu " + (cpt/500) + " point de Victoire" + " \n Il a aussi obtenu au maximum " + max +" points");


    }
}

