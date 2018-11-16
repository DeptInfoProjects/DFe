package Partie;

import Bot.Joueur;
import De.Face;
import Iles.Sanctuaire;

public class Tours {
    Joueur joueur1 = new Joueur();
    Joueur joueur2 = new Joueur();

    public void InitInvent(){
        joueur1.Sac.setInventaire(3,0,0,0);
        joueur2.Sac.setInventaire(2,0,0,0);
    }

    Tours(Joueur joueur1,Joueur joueur2){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        InitInvent();

    }


    public void Partie(){
        Sanctuaire Jardin = new Sanctuaire();
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1J1 = joueur1.d1.getFace();
            Face memFd2J1 = joueur1.d2.getFace();
            Face memFd1J2 = joueur2.d1.getFace();
            Face memFd2J2 = joueur2.d2.getFace();

            // On ajoute les ressources obtenues aux ressources de l'inventaire
            joueur1.Sac.adderFace(memFd1J1);
            joueur1.Sac.adderFace(memFd2J1);
            joueur2.Sac.adderFace(memFd1J2);
            joueur2.Sac.adderFace(memFd2J2);


            String s = String.format("| \t");

            System.out.println("              Tour : " + (acc + 1) + '\n' +
                    " Joueur 1 a obtenu : " + '\t' + '\t' + '\t' + '\t' + s + " Joueur 2 a obtenu : " + '\n' +
                    '\t' + memFd1J1.getValeur() + " " +  memFd1J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + s +'\t' + memFd1J2.getValeur() + " " + memFd1J2.getRes() + '\n' +
                    '\t' + memFd2J1.getValeur() + " " +  memFd2J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + '\t' + s +'\t' + memFd2J2.getValeur() + " " + memFd2J2.getRes() + '\n');

            Face Change1 = Jardin.Choix(joueur1);
            Face Change2 = Jardin.Choix(joueur1);
            Face Change3 = Jardin.Choix(joueur2);
            Face Change4 = Jardin.Choix(joueur2);

            joueur1.d1.setFACE(Change1);
            joueur1.d2.setFACE(Change2);
            joueur2.d1.setFACE(Change3);
            joueur2.d2.setFACE(Change4);


            System.out.println("  Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +  '\t' + '\t' + s + "  Joueur 2  :");
            System.out.println( "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\t' + '\t' + s + "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\n' +
                    joueur1.d1.FACE1.getRes() + " " + joueur1.d1.FACE1.getValeur() + '\t'+ joueur1.d2.FACE1.getRes() + " " + joueur1.d2.FACE1.getValeur() + '\t' + "Or       :  "     + joueur1.Sac.getNbOR()      + '\t' + '\t' + s + joueur2.d1.FACE1.getRes() + " " + joueur2.d1.FACE1.getValeur() + '\t'+ joueur2.d2.FACE1.getRes() + " " + joueur2.d2.FACE1.getValeur() + '\t' + "Or       :  "     + joueur2.Sac.getNbOR()      + '\n' +
                    joueur1.d1.FACE2.getRes() + " " + joueur1.d1.FACE2.getValeur() + '\t'+ joueur1.d2.FACE2.getRes() + " " + joueur1.d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur1.Sac.getNbSolaire() + '\t' + '\t' + s + joueur2.d1.FACE2.getRes() + " " + joueur2.d1.FACE2.getValeur() + '\t'+ joueur2.d2.FACE2.getRes() + " " + joueur2.d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur2.Sac.getNbSolaire() + '\n' +
                    joueur1.d1.FACE3.getRes() + " " + joueur1.d1.FACE3.getValeur() + '\t'+ joueur1.d2.FACE3.getRes() + " " + joueur1.d2.FACE3.getValeur() + '\t' + "Lunaire :  "     + joueur1.Sac.getNbLunaire() + '\t' + '\t' + s + joueur2.d1.FACE3.getRes() + " " + joueur2.d1.FACE3.getValeur() + '\t'+ joueur2.d2.FACE3.getRes() + " " + joueur2.d2.FACE3.getValeur() + '\t' + "Lunaire  :  "     + joueur2.Sac.getNbLunaire() + '\n' +
                    joueur1.d1.FACE4.getRes() + " " + joueur1.d1.FACE4.getValeur() + '\t'+ joueur1.d2.FACE4.getRes() + " " + joueur1.d2.FACE4.getValeur() + '\t' + "Victoire :  "     + joueur1.Sac.getNbVictoire()+ '\t' + '\t' + s + joueur2.d1.FACE4.getRes() + " " + joueur2.d1.FACE4.getValeur() + '\t'+ joueur2.d2.FACE4.getRes() + " " + joueur2.d2.FACE4.getValeur() + '\t' + "Victoire :  "     + joueur2.Sac.getNbVictoire()+ '\n' +
                    joueur1.d1.FACE5.getRes() + " " + joueur1.d1.FACE5.getValeur() + '\t'+ joueur1.d2.FACE5.getRes() + " " + joueur1.d2.FACE5.getValeur() + '\t' + '\t' + '\t' + '\t' + '\t' + s +                 joueur2.d1.FACE5.getRes() + " " + joueur2.d1.FACE5.getValeur() + '\t'+ joueur2.d2.FACE5.getRes() + " " + joueur2.d2.FACE5.getValeur() + '\n' +
                    joueur1.d1.FACE6.getRes() + " " + joueur1.d1.FACE6.getValeur() + '\t'+ joueur1.d2.FACE6.getRes() + " " + joueur1.d2.FACE6.getValeur() + '\t' + '\t' + '\t' + '\t' + s +                        joueur2.d1.FACE6.getRes() + " " + joueur2.d1.FACE6.getValeur() + '\t'+ joueur2.d2.FACE6.getRes() + " " + joueur2.d2.FACE6.getValeur() + '\n');
            System.out.println("__________________________________________________________________ \n");
        }
        if (joueur1.Sac.getNbVictoire() < joueur2.Sac.getNbVictoire()){
            System.out.println("Joueur 2 gagnant avec " + joueur1.Sac.getNbVictoire() + " points de victoires" );

        }
        else{System.out.println("Joueur 1 gagnant avec " + joueur2.Sac.getNbVictoire() + " points de victoires");}
    }

}

