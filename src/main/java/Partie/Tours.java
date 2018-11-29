package Partie;

import Bot.Joueur;
import De.Face;

import java.util.Random;


public class Tours {
    private Joueur joueur1;

    static {
        new Joueur();
    }

    private Joueur joueur2;

   static {
        new Joueur();
    }

    private void InitInvent(){
        joueur1.getInventaireJoueur().setInventaire(3,0,0,0);
        joueur2.getInventaireJoueur().setInventaire(2,0,0,0);
    }

    Tours(Joueur joueur1,Joueur joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        InitInvent();

    }

    private void affichageJ1bis() {
        System.out.println("        Joueur 1  : " + '\t' + '\t' + '\t' + '\t');
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    %-15s  ", joueur1.getD1().FACE1.getRes(), joueur1.getD1().FACE1.getValeur(), joueur1.getD2().FACE1.getRes(), joueur1.getD2().FACE1.getValeur(), "Inventaire J1 :"));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur1.getD1().FACE2.getRes(), joueur1.getD1().FACE2.getValeur(), joueur1.getD2().FACE2.getRes(), joueur1.getD2().FACE2.getValeur(), "OR :", joueur1.getInventaireJoueur().getNbOR()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur1.getD1().FACE3.getRes(), joueur1.getD1().FACE3.getValeur(), joueur1.getD2().FACE3.getRes(), joueur1.getD2().FACE3.getValeur(), "SOLAIRE : ", joueur1.getInventaireJoueur().getNbSolaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur1.getD1().FACE4.getRes(), joueur1.getD1().FACE4.getValeur(), joueur1.getD2().FACE4.getRes(), joueur1.getD2().FACE4.getValeur(), "LUNAIRE : ", joueur1.getInventaireJoueur().getNbLunaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur1.getD1().FACE5.getRes(), joueur1.getD1().FACE5.getValeur(), joueur1.getD2().FACE5.getRes(), joueur1.getD2().FACE5.getValeur(), "VICTOIRE : ", joueur1.getInventaireJoueur().getNbVictoire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     ", joueur1.getD1().FACE6.getRes(), joueur1.getD1().FACE6.getValeur(), joueur1.getD2().FACE6.getRes(), joueur1.getD2().FACE6.getValeur()));


    }

    private void affichageJ2bis() {
        System.out.println("        Joueur 2  : " + '\t' + '\t' + '\t' + '\t');
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    %-15s  ", joueur2.getD1().FACE1.getRes(), joueur2.getD1().FACE1.getValeur(), joueur2.getD2().FACE1.getRes(), joueur2.getD2().FACE1.getValeur(), "Inventaire J1 :"));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur2.getD1().FACE2.getRes(), joueur2.getD1().FACE2.getValeur(), joueur2.getD2().FACE2.getRes(), joueur2.getD2().FACE2.getValeur(), "OR :", joueur2.getInventaireJoueur().getNbOR()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur2.getD1().FACE3.getRes(), joueur2.getD1().FACE3.getValeur(), joueur2.getD2().FACE3.getRes(), joueur2.getD2().FACE3.getValeur(), "SOLAIRE : ", joueur2.getInventaireJoueur().getNbSolaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur2.getD1().FACE4.getRes(), joueur2.getD1().FACE4.getValeur(), joueur2.getD2().FACE4.getRes(), joueur2.getD2().FACE4.getValeur(), "LUNAIRE : ", joueur2.getInventaireJoueur().getNbLunaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|    |%-15s %s|", joueur2.getD1().FACE5.getRes(), joueur2.getD1().FACE5.getValeur(), joueur2.getD2().FACE5.getRes(), joueur2.getD2().FACE5.getValeur(), "VICTOIRE : ", joueur2.getInventaireJoueur().getNbVictoire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     ", joueur2.getD1().FACE6.getRes(), joueur2.getD1().FACE6.getValeur(), joueur2.getD2().FACE6.getRes(), joueur2.getD2().FACE6.getValeur()));


    }
    private  void affichage(){
        System.out.println("        Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +"  Joueur 2  :");
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-15s  %s|  ", joueur1.getD1().FACE1.getRes(), joueur1.getD1().FACE1.getValeur(), joueur1.getD2().FACE1.getRes(), joueur1.getD2().FACE1.getValeur(), joueur2.getD1().FACE1.getRes(), joueur2.getD1().FACE1.getValeur(), joueur2.getD2().FACE1.getRes(), joueur2.getD2().FACE1.getValeur(), "Inventaire J1 :", "Inventaire J2 :"));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-15s %s|  |%-15s %s|", joueur1.getD1().FACE2.getRes(), joueur1.getD1().FACE2.getValeur(), joueur1.getD2().FACE2.getRes(), joueur1.getD2().FACE2.getValeur(), joueur2.getD1().FACE2.getRes(), joueur2.getD1().FACE2.getValeur(), joueur2.getD2().FACE2.getRes(), joueur2.getD2().FACE2.getValeur(), "OR :", joueur1.getInventaireJoueur().getNbOR(), "OR :", joueur2.getInventaireJoueur().getNbOR()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-15s %s|  |%-15s %s|", joueur1.getD1().FACE3.getRes(), joueur1.getD1().FACE3.getValeur(), joueur1.getD2().FACE3.getRes(), joueur1.getD2().FACE3.getValeur(), joueur2.getD1().FACE3.getRes(), joueur2.getD1().FACE3.getValeur(), joueur2.getD2().FACE3.getRes(), joueur2.getD2().FACE3.getValeur(), "SOLAIRE : ", joueur1.getInventaireJoueur().getNbSolaire(), "SOLAIRE : ", joueur2.getInventaireJoueur().getNbSolaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-15s %s|  |%-15s %s|", joueur1.getD1().FACE4.getRes(), joueur1.getD1().FACE4.getValeur(), joueur1.getD2().FACE4.getRes(), joueur1.getD2().FACE4.getValeur(), joueur2.getD1().FACE4.getRes(), joueur2.getD1().FACE4.getValeur(), joueur2.getD2().FACE4.getRes(), joueur2.getD2().FACE4.getValeur(), "LUNAIRE : ", joueur1.getInventaireJoueur().getNbLunaire(), "LUNAIRE : ", joueur2.getInventaireJoueur().getNbLunaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-15s %s|  |%-15s %s|", joueur1.getD1().FACE5.getRes(), joueur1.getD1().FACE5.getValeur(), joueur1.getD2().FACE5.getRes(), joueur1.getD2().FACE5.getValeur(), joueur2.getD1().FACE5.getRes(), joueur2.getD1().FACE5.getValeur(), joueur2.getD2().FACE5.getRes(), joueur2.getD2().FACE5.getValeur(), "VICTOIRE : ", joueur1.getInventaireJoueur().getNbVictoire(), "VICTOIRE : ", joueur2.getInventaireJoueur().getNbVictoire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|" , joueur1.getD1().FACE6.getRes(), joueur1.getD1().FACE6.getValeur(),joueur1.getD2().FACE6.getRes(), joueur1.getD2().FACE6.getValeur(),joueur2.getD1().FACE6.getRes(),joueur2.getD1().FACE6.getValeur(),joueur2.getD2().FACE6.getRes(),joueur2.getD2().FACE6.getValeur()));
    }

    private int Rand() {
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }
    public void Partie(){
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
            System.out.println(" Tour " + (acc + 1) + ":");
            System.out.println("______________________________________________________________________________________________________");

            System.out.println(" Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + " Joueur 2 a obtenu : ");
            System.out.println(String.format("     |%-8s %s|                        |%-8s %s|     ",memFd1J1.getRes(), memFd1J1.getValeur(),memFd1J2.getRes(),memFd1J2.getValeur()));
            System.out.println(String.format("     |%-8s %s|                        |%-8s %s|      \n",memFd2J1.getRes(), memFd2J1.getValeur(),memFd2J2.getRes(),memFd2J2.getValeur()));
            affichage();


            Face AchatJ1 = joueur1.AcheterFace(joueur1);
            Face AchatJ2 = joueur2.AcheterFace(joueur2);

            joueur1.changementFace(AchatJ1);
            joueur2.changementFace(AchatJ2);


            int rand1 = Rand();
            int rand2 = Rand();

            if (((rand1 == 1) & (rand2 == 2) & (joueur1.getInventaireJoueur().getNbSolaire() > 1))
                    | (((rand1 == 1) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire());
                Face memFd1J1bis = joueur1.getD1().getFace();
                Face memFd2J1bis = joueur1.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur1.getInventaireJoueur().adderFace(memFd1J1bis);
                joueur1.getInventaireJoueur().adderFace(memFd2J1bis);

                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Tour " + (acc + 1) + " bis :");
                System.out.println("______________________________________________________________________________________________________");

                System.out.println(" Joueur 1 a obtenu : " + '\t' + '\t');
                System.out.println(String.format("     |%-8s %s|             ", memFd1J1bis.getRes(), memFd1J1bis.getValeur()));
                System.out.println(String.format("     |%-8s %s|             \n", memFd2J1bis.getRes(), memFd2J1bis.getValeur()));
                affichageJ1bis();

                Face AchatJ1bis = joueur1.AcheterFace(joueur1);

                joueur1.changementFace(AchatJ1bis);
            }
            if (((rand1 == 2) & (rand2 == 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1))
                    |
                    (((rand1 == 1) & (rand2 == 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1) & (joueur1.getInventaireJoueur().getNbSolaire() < 2)))) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire());
                Face memFd1J2bis = joueur2.getD1().getFace();
                Face memFd2J2bis = joueur2.getD2().getFace();
                // On ajoute les ressources obtenues aux ressources de l'inventaire
                joueur2.getInventaireJoueur().adderFace(memFd1J2bis);
                joueur2.getInventaireJoueur().adderFace(memFd2J2bis);

                System.out.println("______________________________________________________________________________________________________");
                System.out.println(" Tour " + (acc + 1) + " bis :");
                System.out.println("______________________________________________________________________________________________________");

                System.out.println(" Joueur 2 a obtenu : " + '\t' + '\t');
                System.out.println(String.format("     |%-8s %s|             ", memFd1J2bis.getRes(), memFd1J2bis.getValeur()));
                System.out.println(String.format("     |%-8s %s|             \n", memFd2J2bis.getRes(), memFd2J2bis.getValeur()));
                affichageJ2bis();

                Face AchatJ2bis = joueur2.AcheterFace(joueur2);

                joueur2.changementFace(AchatJ2bis);
            }
            if ((rand1 == 1) & (rand2 == 1) & (joueur1.getInventaireJoueur().getNbSolaire() > 1) & (joueur2.getInventaireJoueur().getNbSolaire() > 1)) {
                joueur2.getInventaireJoueur().setInventaire(joueur2.getInventaireJoueur().getNbOR(), joueur2.getInventaireJoueur().getNbSolaire() - 2, joueur2.getInventaireJoueur().getNbLunaire(), joueur2.getInventaireJoueur().getNbVictoire());
                joueur1.getInventaireJoueur().setInventaire(joueur1.getInventaireJoueur().getNbOR(), joueur1.getInventaireJoueur().getNbSolaire() - 2, joueur1.getInventaireJoueur().getNbLunaire(), joueur1.getInventaireJoueur().getNbVictoire());
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
                System.out.println(String.format("     |%-8s %s|                        |%-8s %s|     ", MemFd1J1.getRes(), MemFd1J1.getValeur(), MemFd1J2.getRes(), MemFd1J2.getValeur()));
                System.out.println(String.format("     |%-8s %s|                        |%-8s %s|      \n", MemFd2J1.getRes(), MemFd2J1.getValeur(), MemFd2J2.getRes(), MemFd2J2.getValeur()));
                affichage();

                Face achatJ1 = joueur1.AcheterFace(joueur1);
                Face achatJ2 = joueur2.AcheterFace(joueur2);

                joueur1.changementFace(achatJ1);
                joueur2.changementFace(achatJ2);
            }


        }
        System.out.println("______________________________________________________________________________________________________");
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 2 gagnant avec " + joueur2.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        }
        else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 1 gagnant avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        } else{System.out.println("Les deux joueurs ont fait match nul avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires");}
    }

}

