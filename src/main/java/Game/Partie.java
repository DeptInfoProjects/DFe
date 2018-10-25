package Game;
import Bot.*;
import De.*;

public class Partie {
        public static void main(String[] args){
            System.out.println("------------BIENVENUE SUR DICE-FORGE------------\n");
            Jouer jouer1 = new Jouer();
            int accOR = 0;
            for(int acc = 0 ; acc < 9; acc++) {
                Face memFd1 = jouer1.lancerDe1();
                Ressource MemR1 = memFd1.getRes();
                int memP = memFd1.getValeur();
                accOR = accOR + memP;
                System.out.println("Tour : " + (acc + 1) + " Face obtenu : " + memP + " point d'" + MemR1 + " gagné");
            }
            System.out.println("Total de point d'" + Ressource.OR + " gagné : " + accOR);
            if (accOR <= 31)   /* En moyenne on s'attend à avoir 31.5 point */
                System.out.print("You Loose");
            else System.out.print("You Win");
        }


}
