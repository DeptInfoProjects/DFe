package Partie;

import Bot.Joueur;
import De.Face;


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
    private  void affichage(){
        System.out.println("        Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +"  Joueur 2  :");
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-12s  %s|  " , joueur1.getD1().FACE1.getRes(), joueur1.getD1().FACE1.getValeur(),joueur1.getD2().FACE1.getRes(), joueur1.getD2().FACE1.getValeur(),joueur2.getD1().FACE1.getRes(),joueur2.getD1().FACE1.getValeur(),joueur2.getD2().FACE1.getRes(),joueur2.getD2().FACE1.getValeur() , "Inventaire J1 :" , "Inventaire J2 :"));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-12s %s|  |%-12s %s|" , joueur1.getD1().FACE2.getRes(), joueur1.getD1().FACE2.getValeur(),joueur1.getD2().FACE2.getRes(), joueur1.getD2().FACE2.getValeur(),joueur2.getD1().FACE2.getRes(),joueur2.getD1().FACE2.getValeur(),joueur2.getD2().FACE2.getRes(),joueur2.getD2().FACE2.getValeur() , "OR :" ,joueur1.getInventaireJoueur().getNbOR(), "OR :" ,joueur2.getInventaireJoueur().getNbOR()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-12s %s|  |%-12s %s|" , joueur1.getD1().FACE3.getRes(), joueur1.getD1().FACE3.getValeur(),joueur1.getD2().FACE3.getRes(), joueur1.getD2().FACE3.getValeur(),joueur2.getD1().FACE3.getRes(),joueur2.getD1().FACE3.getValeur(),joueur2.getD2().FACE3.getRes(),joueur2.getD2().FACE3.getValeur() , "SOLAIRE : ", joueur1.getInventaireJoueur().getNbSolaire(), "SOLAIRE : ", joueur2.getInventaireJoueur().getNbSolaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-12s %s|  |%-12s %s|" , joueur1.getD1().FACE4.getRes(), joueur1.getD1().FACE4.getValeur(),joueur1.getD2().FACE4.getRes(), joueur1.getD2().FACE4.getValeur(),joueur2.getD1().FACE4.getRes(),joueur2.getD1().FACE4.getValeur(),joueur2.getD2().FACE4.getRes(),joueur2.getD2().FACE4.getValeur() , "LUNAIRE : ", joueur1.getInventaireJoueur().getNbLunaire(), "LUNAIRE : ", joueur2.getInventaireJoueur().getNbLunaire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|    |%-12s %s|  |%-12s %s|" , joueur1.getD1().FACE5.getRes(), joueur1.getD1().FACE5.getValeur(),joueur1.getD2().FACE5.getRes(), joueur1.getD2().FACE5.getValeur(),joueur2.getD1().FACE5.getRes(),joueur2.getD1().FACE5.getValeur(),joueur2.getD2().FACE5.getRes(),joueur2.getD2().FACE5.getValeur() , "VICTOIRE : ",joueur1.getInventaireJoueur().getNbVictoire(),"VICTOIRE : " ,joueur2.getInventaireJoueur().getNbVictoire()));
        System.out.println(String.format("|%-8s %s|  |%-8s %s|     |%-8s %s|  |%-8s %s|" , joueur1.getD1().FACE6.getRes(), joueur1.getD1().FACE6.getValeur(),joueur1.getD2().FACE6.getRes(), joueur1.getD2().FACE6.getValeur(),joueur2.getD1().FACE6.getRes(),joueur2.getD1().FACE6.getValeur(),joueur2.getD2().FACE6.getRes(),joueur2.getD2().FACE6.getValeur()));
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
            System.out.println("__________________________________________________________________________________________");
            System.out.println(" Tour " + acc + ":");
            System.out.println("__________________________________________________________________________________________");

            System.out.println(" Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + " Joueur 2 a obtenu : ");
            System.out.println(String.format("     |%-8s %s|                        |%-8s %s|     ",memFd1J1.getRes(), memFd1J1.getValeur(),memFd1J2.getRes(),memFd1J2.getValeur()));
            System.out.println(String.format("     |%-8s %s|                        |%-8s %s|      \n",memFd2J1.getRes(), memFd2J1.getValeur(),memFd2J2.getRes(),memFd2J2.getValeur()));
            affichage();

            Face AchatJ1 = joueur1.AcheterFace(joueur1);
            Face AchatJ2 = joueur2.AcheterFace(joueur2);

            joueur1.changementFace(AchatJ1);
            joueur2.changementFace(AchatJ2);

        }
        System.out.println("__________________________________________________________________________________________");
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 2 gagnant avec " + joueur2.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        }
        else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 1 gagnant avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        } else{System.out.println("Les deux joueurs ont fait match nul avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires");}
    }

}

