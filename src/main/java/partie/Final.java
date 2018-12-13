package partie;

import bot.Joueur;
import de.Face;

import static de.Ressource.*;
import static de.Type.CHOIX;
import static de.Type.PLUS;

public class Final {
    public static void main(String[] args){
        System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
        Joueur Kyriakos = new Joueur();
        Joueur Sabri = new Joueur();
        new Tours(Kyriakos, Sabri).partie();


    }
}
