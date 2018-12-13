package partie;


import Iles.Exploit;
import bot.Joueur;
import de.Face;

import java.util.ArrayList;
import java.util.Random;


public class Tours {
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";

    private Joueur joueur1;
    static {new Joueur(); }
    private Joueur joueur2;
    static {new Joueur(); }

    Tours(Joueur joueur1, Joueur joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        initInvent();
    }
    private void initInvent() {
        joueur1.getInventaireJoueur().setInventaire(3, 0, 0, 0, new ArrayList<Exploit>());
        joueur2.getInventaireJoueur().setInventaire(2, 0, 0, 0, new ArrayList<Exploit>());
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
        try {
        System.out.println(PURPLE+"        Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +"  Joueur 2  :"+RESET);
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-15s %s|  "        , joueur1.getD1().FACE1.AfficheFace(), "|",joueur1.getD2().FACE1.AfficheFace(), "|", joueur2.getD1().FACE1.AfficheFace(), "|", joueur2.getD2().FACE1.AfficheFace(),"|", PURPLE + "Inventaire J1 :", "Inventaire J2 :"+RESET));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE2.AfficheFace(), "|",joueur1.getD2().FACE2.AfficheFace(), "|", joueur2.getD1().FACE2.AfficheFace(), "|", joueur2.getD2().FACE2.AfficheFace(),"|", YELLOW + "OR       : "+ joueur1.getInventaireJoueur().getNbOR()       ,"|"   ,  YELLOW + "OR       : " + joueur2.getInventaireJoueur().getNbOR()      + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE3.AfficheFace(), "|",joueur1.getD2().FACE3.AfficheFace(), "|", joueur2.getD1().FACE3.AfficheFace(), "|", joueur2.getD2().FACE3.AfficheFace(),"|", RED    + "SOLAIRE  : "+ joueur1.getInventaireJoueur().getNbSolaire()  ,"|"   ,  RED    + "SOLAIRE  : " + joueur2.getInventaireJoueur().getNbSolaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE4.AfficheFace(), "|",joueur1.getD2().FACE4.AfficheFace(), "|", joueur2.getD1().FACE4.AfficheFace(), "|", joueur2.getD2().FACE4.AfficheFace(),"|", BLUE   + "LUNAIRE  : "+ joueur1.getInventaireJoueur().getNbLunaire()  ,"|"   ,  BLUE   + "LUNAIRE  : " + joueur2.getInventaireJoueur().getNbLunaire() + RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s    |%-20s %s  |%-20s %s", joueur1.getD1().FACE5.AfficheFace(), "|",joueur1.getD2().FACE5.AfficheFace(), "|", joueur2.getD1().FACE5.AfficheFace(), "|", joueur2.getD2().FACE5.AfficheFace(),"|", GREEN  + "VICTOIRE : "+ joueur1.getInventaireJoueur().getNbVictoire() ,"|"   ,  GREEN  + "VICTOIRE : " + joueur2.getInventaireJoueur().getNbVictoire()+ RESET,"|"));
        System.out.println(String.format("|%-20s %s  |%-20s %s     |%-20s %s  |%-20s %s"                        , joueur1.getD1().FACE6.AfficheFace(), "|",joueur1.getD2().FACE6.AfficheFace(), "|", joueur2.getD1().FACE6.AfficheFace(), "|", joueur2.getD2().FACE6.AfficheFace(),"|"));
        } catch (NullPointerException e){}}


    private int rand() {
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }

    public void partie() {
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
            System.out.println(PURPLE + " Tour " + (acc + 1) + ":" + RESET);
            System.out.println("______________________________________________________________________________________________________");

            System.out.println(PURPLE+" Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + " Joueur 2 a obtenu : "+RESET);
            System.out.println(String.format("     |%-20s %s                        |%-20s %s     "   ,memFd1J1.AfficheFace(), "|",memFd1J2.AfficheFace(),"|"));
            System.out.println(String.format("     |%-20s %s                        |%-20s %s      \n",memFd2J1.AfficheFace(), "|",memFd2J2.AfficheFace(),"|"));
            affichage();
            System.out.println("______________________________________________________________________________________________________");
            System.out.println(PURPLE+"Actions : "+RESET);
            int rand1 = rand();
            int rand2 = rand();
            int choix1 = carteOuFace(); /* 0 il acheter une carte 1 il achete une face */
            int choix2 = carteOuFace(); /* 0 il acheter une carte 1 il achete une face */

            /* pour le Joueur1 */
            /* Si il veut une carte */
            if (choix1 == 1){
                Exploit Choix = joueur1.acheterCarte();
                joueur1.getInventaireJoueur().addCartes(Choix); /* on l'a rajoute dans son inventaire */
                System.out.println(CYAN+"Joueur1 veut acheter la Carte " + BLACK +Choix.getNom() +RESET);
            }

            /* Si il veut une face */
            if (choix1 == 2){
                Face AchatJ1 = joueur1.acheterFace();
                joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                System.out.println(CYAN+"Joueur1 veut acheter la Face " + AchatJ1.AfficheFace()+RESET);
            }
            /* pour le Jouer2 */
            if (choix2 == 1){
                Exploit Choix2 = joueur2.acheterCarte();
                joueur2.getInventaireJoueur().addCartes(Choix2);
                System.out.println(CYAN+"Joueur2 veut acheter la Carte " + BLACK+ Choix2.getNom()+RESET);
            }

            if (choix2 == 2){
                Face AchatJ2 = joueur1.acheterFace();
                joueur1.changementFace(AchatJ2);               /* on l'implement sur son dÃ© */
                System.out.println(CYAN+"Joueur2 veut acheter la Face " + AchatJ2.AfficheFace()+RESET);
            }
            if (((rand1 == 1) & (rand2 == 2) & (joueur1.getInventaireJoueur().getNbSolaire() > 1))
                    | (((rand1 == 1) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() < 2)))) {
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
                if (choix1 == 2){
                    Exploit Choix = joueur1.acheterCarte();
                    joueur1.getInventaireJoueur().addCartes(Choix); /* on l'a rajoute dans son inventaire */
                }

                /* Si il veut une face */
                if (choix1 == 1){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
            }
            if (((rand1 == 2) & (rand2 == 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1))
                    |
                    (((rand1 == 1) & (rand2 == 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1) & (joueur1.getInventaireJoueur().getNbSolaire() < 2)))) {
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
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    joueur2.getInventaireJoueur().addCartes(Choix2);
                }
                if (choix2 == 1){
                    Face AchatJ2 = joueur2.acheterFace();
                    joueur2.changementFace(AchatJ2);

                }
            }
            if ((rand1 == 1) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1)) {
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
                    joueur1.getInventaireJoueur().addCartes(Choix); /* on l'a rajoute dans son inventaire */
                }

                /* Si il veut une face */
                if (choix1 == 1){
                    Face AchatJ1 = joueur1.acheterFace();
                    joueur1.changementFace(AchatJ1);               /* on l'implement sur son dÃ© */
                }
                /* pour le Jouer2 */
                if (choix2 == 0){
                    Exploit Choix2 = joueur2.acheterCarte();
                    joueur2.getInventaireJoueur().addCartes(Choix2);
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

