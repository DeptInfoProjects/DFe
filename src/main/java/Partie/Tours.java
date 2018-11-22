package Partie;

import Bot.Joueur;
import De.Face;
import Iles.Sanctuaire;

public class Tours {
    private Joueur joueur1 = new Joueur();
    private Joueur joueur2 = new Joueur();

    private void InitInvent(){
        joueur1.getInventaireJoueur().setInventaire(3,0,0,0);
        joueur2.getInventaireJoueur().setInventaire(2,0,0,0);
    }

    Tours(Joueur joueur1,Joueur joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        InitInvent();

    }


    public void Partie(){
        Sanctuaire Jardin = new Sanctuaire();
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


            String s = String.format("| \t");

            System.out.println("              Tour : " + (acc + 1) + '\n' +
                    " Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + s + " Joueur 2 a obtenu : " + '\n' +
                    '\t' + memFd1J1.getValeur() + " " +  memFd1J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + s +'\t' + memFd1J2.getValeur() + " " + memFd1J2.getRes() + '\n' +
                    '\t' + memFd2J1.getValeur() + " " +  memFd2J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + s +'\t' + memFd2J2.getValeur() + " " + memFd2J2.getRes() + '\n');


            Face AchatJ1 = joueur1.AcheterFace(joueur1);
            Face AchatJ2 = joueur2.AcheterFace(joueur2);

            joueur1.changementFace(AchatJ1);
            joueur2.changementFace(AchatJ2);


            System.out.println("  Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +  '\t' + '\t' + s + "  Joueur 2  :");
            System.out.println( "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\t' + '\t' + s + "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\n' +
                    joueur1.getD1().FACE1.getRes() + " " + joueur1.getD1().FACE1.getValeur() + '\t'+ joueur1.getD2().FACE1.getRes() + " " + joueur1.getD2().FACE1.getValeur() + '\t' + "Or       :  "     + joueur1.getInventaireJoueur().getNbOR()      + '\t' + '\t' + s + joueur2.getD1().FACE1.getRes() + " " + joueur2.getD1().FACE1.getValeur() + '\t'+ joueur2.getD2().FACE1.getRes() + " " + joueur2.getD2().FACE1.getValeur() + '\t' + "Or       :  "     + joueur2.getInventaireJoueur().getNbOR()      + '\n' +
                    joueur1.getD1().FACE2.getRes() + " " + joueur1.getD1().FACE2.getValeur() + '\t'+ joueur1.getD2().FACE2.getRes() + " " + joueur1.getD2().FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur1.getInventaireJoueur().getNbSolaire() + '\t' + '\t' + s + joueur2.getD1().FACE2.getRes() + " " + joueur2.getD1().FACE2.getValeur() + '\t'+ joueur2.getD2().FACE2.getRes() + " " + joueur2.getD2().FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur2.getInventaireJoueur().getNbSolaire() + '\n' +
                    joueur1.getD1().FACE3.getRes() + " " + joueur1.getD1().FACE3.getValeur() + '\t'+ joueur1.getD2().FACE3.getRes() + " " + joueur1.getD2().FACE3.getValeur() + '\t' + "Lunaire :  "     + joueur1.getInventaireJoueur().getNbLunaire() + '\t' + '\t' + s + joueur2.getD1().FACE3.getRes() + " " + joueur2.getD1().FACE3.getValeur() + '\t'+ joueur2.getD2().FACE3.getRes() + " " + joueur2.getD2().FACE3.getValeur() + '\t' + "Lunaire  :  "     + joueur2.getInventaireJoueur().getNbLunaire() + '\n' +
                    joueur1.getD1().FACE4.getRes() + " " + joueur1.getD1().FACE4.getValeur() + '\t'+ joueur1.getD2().FACE4.getRes() + " " + joueur1.getD2().FACE4.getValeur() + '\t' + "Victoire :  "     + joueur1.getInventaireJoueur().getNbVictoire()+ '\t' + '\t' + s + joueur2.getD1().FACE4.getRes() + " " + joueur2.getD1().FACE4.getValeur() + '\t'+ joueur2.getD2().FACE4.getRes() + " " + joueur2.getD2().FACE4.getValeur() + '\t' + "Victoire :  "     + joueur2.getInventaireJoueur().getNbVictoire()+ '\n' +
                    joueur1.getD1().FACE5.getRes() + " " + joueur1.getD1().FACE5.getValeur() + '\t'+ joueur1.getD2().FACE5.getRes() + " " + joueur1.getD2().FACE5.getValeur() + '\t' + '\t' + '\t' + '\t' + '\t' + s +                 joueur2.getD1().FACE5.getRes() + " " + joueur2.getD1().FACE5.getValeur() + '\t'+ joueur2.getD2().FACE5.getRes() + " " + joueur2.getD2().FACE5.getValeur() + '\n' +
                    joueur1.getD1().FACE6.getRes() + " " + joueur1.getD1().FACE6.getValeur() + '\t'+ joueur1.getD2().FACE6.getRes() + " " + joueur1.getD2().FACE6.getValeur() + '\t' + '\t' + '\t' + '\t' + s +                        joueur2.getD1().FACE6.getRes() + " " + joueur2.getD1().FACE6.getValeur() + '\t'+ joueur2.getD2().FACE6.getRes() + " " + joueur2.getD2().FACE6.getValeur() + '\n');
            System.out.println("__________________________________________________________________ \n");
        }
        if (joueur1.getInventaireJoueur().getNbVictoire() < joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 2 gagnant avec " + joueur2.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        }
        else if (joueur1.getInventaireJoueur().getNbVictoire() > joueur2.getInventaireJoueur().getNbVictoire()){
            System.out.println("Joueur 1 gagnant avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires" );

        } else{System.out.println("Les deux joueurs ont fait match nul avec " + joueur1.getInventaireJoueur().getNbVictoire() + " points de victoires");}
    }

}

