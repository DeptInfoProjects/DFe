package Partie;

import Bot.*;

public class Final {
    public static void main(String[] args){
        System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
        Joueur Kyriakos = new Joueur();
        Joueur Sabri = new Joueur();
        new Tours(Kyriakos,Sabri).Partie();


    }
}