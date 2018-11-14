package Partie;

import Bot.Joueur;
import De.Face;

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
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1J1 = joueur1.d1.getFace();
            Face memFd2J1 = joueur1.d2.getFace();
            Face memFd1J2 = joueur2.d1.getFace();
            Face memFd2J2 = joueur2.d2.getFace();
            joueur1.Sac.setNbOR(memFd1J1.getValeur() + memFd2J1.getValeur());
            joueur2.Sac.setNbOR(memFd1J2.getValeur() + memFd2J2.getValeur());
            System.out.println("              Tour : " + (acc + 1) + '\n' +
                    " Joueur 1 a obtenu : " +'\t' + " Joueur 2 a obtenu : " + '\n' +
                    '\t' + memFd1J1.getValeur() + " " +  memFd1J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + memFd1J2.getValeur() + " " + memFd1J2.getRes() + '\n' +
                    '\t' + memFd2J1.getValeur() + " " +  memFd2J1.getRes()  + '\t' + '\t' + '\t' + '\t' + '\t' + memFd2J2.getValeur() + " " + memFd2J2.getRes() + '\n');
            joueur1.d1.setFACE();
            joueur1.d2.setFACE();
            joueur2.d1.setFACE();
            joueur2.d2.setFACE();
            System.out.println("   Joueur 1  : " + '\t' + '\t'+ '\t' + '\t' +  '\t' + '\t' + " Joueur 2  :");
            System.out.println( "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\t' + '\t' + "Dé 1 :" + '\t' + "Dé 2 : " + '\t' +  "Inventaire : " + '\n' +
                    joueur1.d1.FACE1.getRes() + " " + joueur1.d1.FACE1.getValeur() + '\t'+ joueur1.d2.FACE1.getRes() + " " + joueur1.d2.FACE1.getValeur() + '\t' + "Or       :  "     + joueur1.Sac.getNbOR()      + '\t' + '\t' + joueur2.d1.FACE1.getRes() + " " + joueur2.d1.FACE1.getValeur() + '\t'+ joueur2.d2.FACE1.getRes() + " " + joueur2.d2.FACE1.getValeur() + '\t' + "Or       :  "     + joueur2.Sac.getNbOR()      + '\n' +
                    joueur1.d1.FACE2.getRes() + " " + joueur1.d1.FACE2.getValeur() + '\t'+ joueur1.d2.FACE2.getRes() + " " + joueur1.d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur1.Sac.getNbSolaire() + '\t' + '\t' + joueur2.d1.FACE2.getRes() + " " + joueur2.d1.FACE2.getValeur() + '\t'+ joueur2.d2.FACE2.getRes() + " " + joueur2.d2.FACE2.getValeur() + '\t' + "Solaire  :  "     + joueur2.Sac.getNbSolaire() + '\n' +
                    joueur1.d1.FACE3.getRes() + " " + joueur1.d1.FACE3.getValeur() + '\t'+ joueur1.d2.FACE3.getRes() + " " + joueur1.d2.FACE3.getValeur() + '\t' + "Lunaiare :  "     + joueur1.Sac.getNbLunaire() + '\t' + '\t' + joueur2.d1.FACE3.getRes() + " " + joueur2.d1.FACE3.getValeur() + '\t'+ joueur2.d2.FACE3.getRes() + " " + joueur2.d2.FACE3.getValeur() + '\t' + "Lunaire  :  "     + joueur2.Sac.getNbLunaire() + '\n' +
                    joueur1.d1.FACE4.getRes() + " " + joueur1.d1.FACE4.getValeur() + '\t'+ joueur1.d2.FACE4.getRes() + " " + joueur1.d2.FACE4.getValeur() + '\t' + "Victoire :  "     + joueur1.Sac.getNbVictoire()+ '\t' + '\t' + joueur2.d1.FACE4.getRes() + " " + joueur2.d1.FACE4.getValeur() + '\t'+ joueur2.d2.FACE4.getRes() + " " + joueur2.d2.FACE4.getValeur() + '\t' + "Victoire :  "     + joueur2.Sac.getNbVictoire()+ '\n' +
                    joueur1.d1.FACE5.getRes() + " " + joueur1.d1.FACE5.getValeur() + '\t'+ joueur1.d2.FACE5.getRes() + " " + joueur1.d2.FACE5.getValeur() + '\t' + '\t' + '\t' + '\t' +  '\t' +  '\t' +                            joueur2.d1.FACE5.getRes() + " " + joueur2.d1.FACE5.getValeur() + '\t'+ joueur2.d2.FACE5.getRes() + " " + joueur2.d2.FACE5.getValeur() + '\n' +
                    joueur1.d1.FACE6.getRes() + " " + joueur1.d1.FACE6.getValeur() + '\t'+ joueur1.d2.FACE6.getRes() + " " + joueur1.d2.FACE6.getValeur() + '\t' + '\t' + '\t' + '\t' +  '\t' +  '\t' +                            joueur2.d1.FACE6.getRes() + " " + joueur2.d1.FACE6.getValeur() + '\t'+ joueur2.d2.FACE6.getRes() + " " + joueur2.d2.FACE6.getValeur() + '\n');

        }
    }

}

