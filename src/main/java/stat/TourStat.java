package stat;

import bot.Joueur;
import de.Face;

class TourStat {
    static {
        new Joueur();
    }

    static {
        new Joueur();
    }

    private Joueur joueur1;
    private Joueur joueur2;

    TourStat(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        InitInvent();

    }

    private void InitInvent() {
        joueur1.getInventaireJoueur().setInventaire(3, 0, 0, 0,null);
        joueur2.getInventaireJoueur().setInventaire(2, 0, 0, 0,null);
    }

    int Partie() {
        for (int acc = 0; acc < 9; acc++) {
            Face memFd1J1 = joueur1.getD1().getFace();
            Face memFd2J1 = joueur1.getD2().getFace();
            Face memFd1J2 = joueur2.getD1().getFace();
            Face memFd2J2 = joueur2.getD2().getFace();

            joueur1.getInventaireJoueur().adderFace(memFd1J1);
            joueur1.getInventaireJoueur().adderFace(memFd2J1);
            joueur2.getInventaireJoueur().adderFace(memFd1J2);
            joueur2.getInventaireJoueur().adderFace(memFd2J2);


            Face AchatJ1 = joueur1.acheterFace();
            Face AchatJ2 = joueur2.acheterFace();

            joueur1.changementFace(AchatJ1);
            joueur2.changementFace(AchatJ2);


        }
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()) {
            return 2;

        } else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()) {
            return 1;


        } else {
            return 0;
        }
    }

}

