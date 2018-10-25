package Bot;
import De.*;

public class Game {
    public static void main(String[] args){
        Jouer jouer1 = new Jouer();
        int accOR = 0;
        int accSolaire = 0;
        for(int acc = 0 ; acc < 9; acc++) {
            Face memFd1 = jouer1.lancerDe1();
            Ressource memR1 = memFd1.getRes();
            int memP1 = memFd1.getValeur();
            if(memR1 == Ressource.OR)
                accOR = accOR + memP1;
            else accSolaire = accSolaire + memP1 ;
            System.out.println("Tour : " + (acc + 1) + " Face obtenu : " + memP1 + " point d'" + memR1 + " gagné");
        }
        System.out.println("Total de point d'" + Ressource.OR + " gagné : " + accOR);
        System.out.println("Total de point " + Ressource.Solaire + " gagné : " + accSolaire);
        if (accOR < accSolaire)   /* Si le nombre de point d'or est plus grand ou egale au point d'or on gagne */
            System.out.print("You Loose");
        else System.out.print("You Win");
    }
}
