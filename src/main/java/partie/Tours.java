package partie;


import iles.Carte;
import iles.Exploit;
import bot.Choix;
import bot.Joueur;
import de.Face;
import iles.TypeEffet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static iles.Carte.*;


public class Tours {
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

    public static Joueur joueur1;
    static {new Joueur(); }
    public static Joueur joueur2;
    static {new Joueur(); }

    public Tours(Joueur joueur1, Joueur joueur2){
        Tours.joueur1 = joueur1;
        Tours.joueur2 = joueur2;
        initInvent();
    }
    private void initInvent() {
        joueur1.getInventaireJoueur().setInventaire(3, 0, 0, 0, new ArrayList<>());
        joueur2.getInventaireJoueur().setInventaire(2, 0, 0, 0, new ArrayList<>());
    }
    /* Choisir soit acheter une carte soit acheter une face */

    private int carteOuFace() {
        return rand();
    }


    private void affichageJ1bis() {
        System.out.println(PURPLE+"        Joueur 1  : " + '\t' + '\t' + '\t' + '\t'+ RESET);
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s" , joueur1.getD1().FACE1.AfficheFace(), "|", joueur1.getD2().FACE1.AfficheFace(), "|", PURPLE + "Inventaire J1 :","|"+RESET));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s" , joueur1.getD1().FACE2.AfficheFace(), "|", joueur1.getD2().FACE2.AfficheFace(), "|", YELLOW + "OR       : " + joueur1.getInventaireJoueur().getNbOR()      + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s" , joueur1.getD1().FACE3.AfficheFace(), "|", joueur1.getD2().FACE3.AfficheFace(), "|", RED    + "SOLAIRE  : " + joueur1.getInventaireJoueur().getNbSolaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s" , joueur1.getD1().FACE4.AfficheFace(), "|", joueur1.getD2().FACE4.AfficheFace(), "|", BLUE   + "LUNAIRE  : " + joueur1.getInventaireJoueur().getNbLunaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s" , joueur1.getD1().FACE5.AfficheFace(), "|", joueur1.getD2().FACE5.AfficheFace(), "|", GREEN  + "VICTOIRE : " + joueur1.getInventaireJoueur().getNbVictoire()+ RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s"              , joueur1.getD1().FACE6.AfficheFace(), "|", joueur1.getD2().FACE6.AfficheFace(), "|"));


    }

    private void affichageJ2bis() {
        System.out.println(PURPLE + "        Joueur 2  : " + '\t' + '\t' + '\t' + '\t' + RESET);
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s", joueur2.getD1().FACE1.AfficheFace(), "|", joueur2.getD2().FACE1.AfficheFace(), "|", PURPLE + "Inventaire J2 :", "|" + RESET));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s", joueur2.getD1().FACE2.AfficheFace(), "|", joueur2.getD2().FACE2.AfficheFace(), "|", YELLOW + "OR       : " + joueur2.getInventaireJoueur().getNbOR() + RESET, "|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s", joueur2.getD1().FACE3.AfficheFace(), "|", joueur2.getD2().FACE3.AfficheFace(), "|", RED + "SOLAIRE  : " + joueur2.getInventaireJoueur().getNbSolaire() + RESET, "|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s", joueur2.getD1().FACE4.AfficheFace(), "|", joueur2.getD2().FACE4.AfficheFace(), "|", BLUE + "LUNAIRE  : " + joueur2.getInventaireJoueur().getNbLunaire() + RESET, "|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s    |%-25s %s", joueur2.getD1().FACE5.AfficheFace(), "|", joueur2.getD2().FACE5.AfficheFace(), "|", GREEN + "VICTOIRE : " + joueur2.getInventaireJoueur().getNbVictoire() + RESET, "|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s", joueur2.getD1().FACE6.AfficheFace(), "|", joueur2.getD2().FACE6.AfficheFace(), "|"));
    }

    private  void affichage(){

        System.out.println(PURPLE+"        Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +"  Joueur 2  :"+RESET);
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-15s %s|  "        , joueur1.getD1().FACE1.AfficheFace(), "|",joueur1.getD2().FACE1.AfficheFace(), "|", joueur2.getD1().FACE1.AfficheFace(), "|", joueur2.getD2().FACE1.AfficheFace(),"|", PURPLE + "Inventaire J1 :", "Inventaire J2 :"+RESET));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE2.AfficheFace(), "|",joueur1.getD2().FACE2.AfficheFace(), "|", joueur2.getD1().FACE2.AfficheFace(), "|", joueur2.getD2().FACE2.AfficheFace(),"|", YELLOW + "OR       : "+ joueur1.getInventaireJoueur().getNbOR()       ,"|"   ,  YELLOW + "OR       : " + joueur2.getInventaireJoueur().getNbOR()      + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE3.AfficheFace(), "|",joueur1.getD2().FACE3.AfficheFace(), "|", joueur2.getD1().FACE3.AfficheFace(), "|", joueur2.getD2().FACE3.AfficheFace(),"|", RED    + "SOLAIRE  : "+ joueur1.getInventaireJoueur().getNbSolaire()  ,"|"   ,  RED    + "SOLAIRE  : " + joueur2.getInventaireJoueur().getNbSolaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE4.AfficheFace(), "|",joueur1.getD2().FACE4.AfficheFace(), "|", joueur2.getD1().FACE4.AfficheFace(), "|", joueur2.getD2().FACE4.AfficheFace(),"|", BLUE   + "LUNAIRE  : "+ joueur1.getInventaireJoueur().getNbLunaire()  ,"|"   ,  BLUE   + "LUNAIRE  : " + joueur2.getInventaireJoueur().getNbLunaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE5.AfficheFace(), "|",joueur1.getD2().FACE5.AfficheFace(), "|", joueur2.getD1().FACE5.AfficheFace(), "|", joueur2.getD2().FACE5.AfficheFace(),"|", GREEN  + "VICTOIRE : "+ joueur1.getInventaireJoueur().getNbVictoire() ,"|"   ,  GREEN  + "VICTOIRE : " + joueur2.getInventaireJoueur().getNbVictoire()+ RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s"                        , joueur1.getD1().FACE6.AfficheFace(), "|",joueur1.getD2().FACE6.AfficheFace(), "|", joueur2.getD1().FACE6.AfficheFace(), "|", joueur2.getD2().FACE6.AfficheFace(),"|"));
    }

    private int rand() {
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }



    private void applyEffetPermanents() {
        List<Exploit> listCarteJ1 = joueur1.getInventaireJoueur().getCartes();
        for(Exploit carte : listCarteJ1){
            if (carte.getType() == TypeEffet.PERMANENT) {
                System.out.println(CYAN  +"Joueur1 active la carte " + carte.getNom() + RESET );
                if (carte == ANCIEN) {
                    Exploit.effetAncien(joueur1);
                } else if (carte == AILES) {
                    Exploit.effetAiles(joueur1);
                } else if (carte == SABOTS) {
                    Exploit.effetSabots(joueur1);
                }
            }
        }

        List<Exploit> listCarteJ2 = joueur2.getInventaireJoueur().getCartes();
        for(Exploit carte : listCarteJ2) {
            if (carte.getType() == TypeEffet.PERMANENT) {
                System.out.println(CYAN +"Joueur2 active la carte " + carte.getNom() + RESET );
                if (carte == ANCIEN) {
                    Exploit.effetAncien(joueur2);
                } else if (carte == AILES) {
                    Exploit.effetAiles(joueur2);
                } else if (carte == SABOTS) {
                    Exploit.effetSabots(joueur2);
                }
            }
        }

    }




    public int partieStatPoint() {
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1J1 = joueur1.getD1().getFace();
            Face memFd2J1 = joueur1.getD2().getFace();
            Face memFd1J2 = joueur2.getD1().getFace();
            Face memFd2J2 = joueur2.getD2().getFace();
            // On ajoute les ressources obtenues aux ressources de l'inventaire
            joueur1.getInventaireJoueur().adderFace(memFd1J1);
            joueur1.getInventaireJoueur().adderFace(memFd2J1);
            joueur2.getInventaireJoueur().adderFace(memFd1J2);
            joueur2.getInventaireJoueur().adderFace(memFd2J2);
            Choix Courant = new Choix();
            Courant.addChoixList();
            int rand1 = Courant.getChoixList(5);
            int rand2 = Courant.getChoixList(6);
            int choix1 = Courant.getChoixList(7); /* 0 il acheter une carte 1 il achete une face */
            int choix2 = Courant.getChoixList(8);/* 0 il acheter une carte 1 il achete une face */

            /* pour le Joueur1 */
            /* Si il veut une carte */
            if (choix1 == 0){
                Exploit Choix = joueur1.acheterCarte();
                if (Choix == NULL)
                    choix1=1;
            }

            /* Si il veut une face */
            if (choix1 == 1){
                Face AchatJ1 = joueur1.acheterFace();
                joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
            }
            /* pour le Jouer2 */
            if (choix2 == 0){
                Exploit Choix2 = joueur2.acheterCarte();
                if (Choix2 == NULL)
                    choix2=1;
            }

            if (choix2 == 1){
                Face AchatJ2 = joueur2.acheterFace();
                joueur2.changementFace(AchatJ2);               /* on l'implement sur son dÃ© */
            }
            if (((rand1 == 0) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1))
                    | (((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face memFd1J1bis = joueur1.getD1().getFace();
                Face memFd2J1bis = joueur1.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(memFd1J1bis);
                joueur1.getInventaireJoueur().adderFace(memFd2J1bis);

                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 1){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix == NULL)
                        choix1=0;
                }

                /* Si il veut une face */
                if (choix1 == 0){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
            }
            if (((rand1 == 1) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1))
                    |
                    (((rand1 == 0) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1) & (joueur1.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                Face memFd1J2bis = joueur2.getD1().getFace();
                Face memFd2J2bis = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur2.getInventaireJoueur().adderFace(memFd1J2bis);
                joueur2.getInventaireJoueur().adderFace(memFd2J2bis);
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=1;
                }
                if (choix2 == 0){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
            if ((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1)) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face MemFd1J1 = joueur1.getD1().getFace();
                Face MemFd2J1 = joueur1.getD2().getFace();
                Face MemFd1J2 = joueur2.getD1().getFace();
                Face MemFd2J2 = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(MemFd1J1);
                joueur1.getInventaireJoueur().adderFace(MemFd2J1);
                joueur2.getInventaireJoueur().adderFace(MemFd1J2);
                joueur2.getInventaireJoueur().adderFace(MemFd2J2);

                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 0){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix ==NULL)
                        choix1=1;
                }

                /* Si il veut une face */
                if (choix1 == 0){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=1;
                }
                if (choix2 == 0){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
        }
        return joueur1.getInventaireJoueur().getNbVictoire();

    }
    public int partieStat() {
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1J1 = joueur1.getD1().getFace();
            Face memFd2J1 = joueur1.getD2().getFace();
            Face memFd1J2 = joueur2.getD1().getFace();
            Face memFd2J2 = joueur2.getD2().getFace();
            // On ajoute les ressources obtenues aux ressources de l'inventaire
            joueur1.getInventaireJoueur().adderFace(memFd1J1);
            joueur1.getInventaireJoueur().adderFace(memFd2J1);
            joueur2.getInventaireJoueur().adderFace(memFd1J2);
            joueur2.getInventaireJoueur().adderFace(memFd2J2);
            Choix Courant = new Choix();
            Courant.addChoixList();
            int rand1 = Courant.getChoixList(5);
            int rand2 = Courant.getChoixList(6);
            int choix1 = Courant.getChoixList(7); /* 0 il acheter une carte 1 il achete une face */
            int choix2 = Courant.getChoixList(8);/* 0 il acheter une carte 1 il achete une face */

            /* pour le Joueur1 */
            /* Si il veut une carte */
            if (choix1 == 0){
                Exploit Choix = joueur1.acheterCarte();
                if (Choix == NULL)
                    choix1=1;
            }

            /* Si il veut une face */
            if (choix1 == 1){
                Face AchatJ1 = joueur1.acheterFace();
                joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
            }
            /* pour le Jouer2 */
            if (choix2 == 0){
                Exploit Choix2 = joueur2.acheterCarte();
                if (Choix2 == NULL)
                    choix2=1;
            }

            if (choix2 == 1){
                Face AchatJ2 = joueur2.acheterFace();
                joueur2.changementFace(AchatJ2);               /* on l'implement sur son dÃ© */
            }
            if (((rand1 == 0) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1))
                    | (((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face memFd1J1bis = joueur1.getD1().getFace();
                Face memFd2J1bis = joueur1.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(memFd1J1bis);
                joueur1.getInventaireJoueur().adderFace(memFd2J1bis);

                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 1){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix == NULL)
                        choix1=0;
                }

                /* Si il veut une face */
                if (choix1 == 0){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
            }
            if (((rand1 == 1) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1))
                    |
                    (((rand1 == 0) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1) & (joueur1.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                Face memFd1J2bis = joueur2.getD1().getFace();
                Face memFd2J2bis = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur2.getInventaireJoueur().adderFace(memFd1J2bis);
                joueur2.getInventaireJoueur().adderFace(memFd2J2bis);
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=1;
                }
                if (choix2 == 0){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
            if ((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1)) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face MemFd1J1 = joueur1.getD1().getFace();
                Face MemFd2J1 = joueur1.getD2().getFace();
                Face MemFd1J2 = joueur2.getD1().getFace();
                Face MemFd2J2 = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(MemFd1J1);
                joueur1.getInventaireJoueur().adderFace(MemFd2J1);
                joueur2.getInventaireJoueur().adderFace(MemFd1J2);
                joueur2.getInventaireJoueur().adderFace(MemFd2J2);

                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 0){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix ==NULL)
                        choix1=1;
                }

                /* Si il veut une face */
                if (choix1 == 0){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=1;
                }
                if (choix2 == 0){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }

        }
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()) {
            return 2;

        } else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()) {
            return 1;


        } else {
            return 0;
        }
    }

    void partieClassique() {
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1J1 = joueur1.getD1().getFace();
            Face memFd2J1 = joueur1.getD2().getFace();
            Face memFd1J2 = joueur2.getD1().getFace();
            Face memFd2J2 = joueur2.getD2().getFace();
            // On ajoute les ressources obtenues aux ressources de l'inventaire
            joueur1.getInventaireJoueur().adderFace(memFd1J1);
            joueur1.getInventaireJoueur().adderFace(memFd2J1);
            joueur2.getInventaireJoueur().adderFace(memFd1J2);
            joueur2.getInventaireJoueur().adderFace(memFd2J2);



            System.out.println("______________________________________________________________________________________________________");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("______________________________________________________________________________________________________");
            System.out.println(PURPLE + " Tour " + (acc + 1) + ":" + RESET);
            System.out.println("______________________________________________________________________________________________________");

            System.out.println(PURPLE+" Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + " Joueur 2 a obtenu : "+RESET);
            System.out.println(String.format("     |%-20s %s                        |%-20s %s     "   ,memFd1J1.AfficheFace(), "|",memFd1J2.AfficheFace(),"|"));
            System.out.println(String.format("     |%-20s %s                        |%-20s %s      \n",memFd2J1.AfficheFace(), "|",memFd2J2.AfficheFace(),"|"));
            System.out.println("______________________________________________________________________________________________________");
            System.out.println(PURPLE+"Activation des cartes a effet Renfort :" + RESET );
            applyEffetPermanents();
            System.out.println("______________________________________________________________________________________________________");
            affichage();
            System.out.println("______________________________________________________________________________________________________");
            System.out.println(PURPLE+"Actions : "+RESET);
            Choix Courant = new Choix();
            Courant.addChoixList();
            int rand1 = Courant.getChoixList(5);
            int rand2 = Courant.getChoixList(6);
            int choix1 = Courant.getChoixList(7); /* 0 il acheter une carte 1 il achete une face */
            int choix2 = Courant.getChoixList(8);/* 0 il acheter une carte 1 il achete une face */

            /* pour le Joueur1 */
            /* Si il veut une carte */
            if (choix1 == 0){
                Exploit Choix = joueur1.acheterCarte();
                if (Choix==NULL)
                    choix1=1;
            }

            /* Si il veut une face */
            if (choix1 == 1){
                Face AchatJ1 = joueur1.acheterFace();
                joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                System.out.println(CYAN+"Joueur1 veut acheter la Face " + AchatJ1.AfficheFace()+CYAN + " qui remplace la Face " + YELLOW + "1 OR" + RESET );
            }
            /* pour le Jouer2 */
            if (choix2 == 0){
                Exploit Choix2 = joueur2.acheterCarte();
                if (Choix2 == NULL)
                    choix2=1;
            }

            if (choix2 == 1){
                Face AchatJ2 = joueur2.acheterFace();
                joueur2.changementFace(AchatJ2);               /* on l'implement sur son dÃ© */
                System.out.println(CYAN+"Joueur2 veut acheter la Face " + AchatJ2.AfficheFace()+CYAN + " qui remplace la Face " + YELLOW + "1 OR" + RESET );
            }







            if (((rand1 == 0) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1))
                    | (((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face memFd1J1bis = joueur1.getD1().getFace();
                Face memFd2J1bis = joueur1.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(memFd1J1bis);
                joueur1.getInventaireJoueur().adderFace(memFd2J1bis);
                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Tour " + (acc + 1) + " bis :");
                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Joueur 1 a obtenu : " + '\t' + '\t');
                System.out.println(String.format("     |%-20s %s            "  , memFd1J1bis.AfficheFace(), "|"));
                System.out.println(String.format("     |%-20s %s            \n", memFd2J1bis.AfficheFace(), "|"));
                affichageJ1bis();
                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 1){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix == NULL)
                        choix1=0;
                }

                /* Si il veut une face */
                if (choix1 == 0){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
            }
            if (((rand1 == 1) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1))
                    |
                    (((rand1 == 0) & (rand2 == 0) & (joueur2.getInventaireJoueur().getNbSolaire() > 1) & (joueur1.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                Face memFd1J2bis = joueur2.getD1().getFace();
                Face memFd2J2bis = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur2.getInventaireJoueur().adderFace(memFd1J2bis);
                joueur2.getInventaireJoueur().adderFace(memFd2J2bis);
                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Tour " + (acc + 1) + " bis :");
                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Joueur 2 a obtenu : " + '\t' + '\t');
                System.out.println(String.format("     |%-20s %s             "  , memFd1J2bis.AfficheFace(), "|"));
                System.out.println(String.format("     |%-20s %s             \n", memFd2J2bis.AfficheFace(), "|"));
                affichageJ2bis();
                /* pour le Jouer2 */
                if (choix2 == 1){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=0;
                }
                if (choix2 == 0){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
            if ((rand1 == 0) & (rand2 == 0) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1)) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire(),joueur2.getInventaireJoueur().getCartes());
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire(),joueur1.getInventaireJoueur().getCartes());
                Face MemFd1J1 = joueur1.getD1().getFace();
                Face MemFd2J1 = joueur1.getD2().getFace();
                Face MemFd1J2 = joueur2.getD1().getFace();
                Face MemFd2J2 = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(MemFd1J1);
                joueur1.getInventaireJoueur().adderFace(MemFd2J1);
                joueur2.getInventaireJoueur().adderFace(MemFd1J2);
                joueur2.getInventaireJoueur().adderFace(MemFd2J2);

                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Tour " + (acc + 1) + " bis :");
                System.out.println("______________________________________________________________________________________________________");

                System.out.println(" Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + " Joueur 2 a obtenu : ");
                System.out.println(String.format("     |%-20s %s                        |%-20s %s     "   , MemFd1J1.AfficheFace(),"|", MemFd1J2.AfficheFace(), "|"));
                System.out.println(String.format("     |%-20s %s                        |%-20s %s      \n", MemFd2J1.AfficheFace(),"|", MemFd2J2.AfficheFace(), "|"));
                affichage();
                /* pour le Joueur1 */
                /* Si il veut une carte */
                if (choix1 == 0){
                    Exploit Choix = joueur1.acheterCarte();
                    if (Choix == NULL)
                        choix1=1;
                }

                /* Si il veut une face */
                if (choix1 == 1){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    if (Choix2 == NULL)
                        choix2=1;
                }
                if (choix2 == 1){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
        }
        System.out.println("______________________________________________________________________________________________________");
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 2 gagnant avec " + GREEN + joueur2.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        }
        else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 1 gagnant avec " + GREEN +joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        } else{System.out.println("Les deux joueurs ont fait match nul avec " + GREEN +joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires");}
    }

}
