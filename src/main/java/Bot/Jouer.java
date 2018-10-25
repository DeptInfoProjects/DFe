package Bot;
import De.*;

public class Jouer {
    private De d1 = new De();
    public Jouer(){
        d1.InitDe();
    }
     public final Face lancerDe1(){
        Face cpt;
        int rand = (int) (Math.random()*6+1);
        switch(rand){
            case 1: cpt = d1.getFace(rand);
                break;
            case 2:  cpt = d1.getFace(rand);
                break;
            case 3:  cpt = d1.getFace(rand);
                break;
            case 4:  cpt = d1.getFace(rand);
                break;
            case 5:  cpt = d1.getFace(rand);
                break;
            default:  cpt = d1.getFace(rand);
                break;
        }
        return cpt;
    }


     public static void main(String[] args){
         Jouer jouer1 = new Jouer();
         int AccOR = 0;
         Ressource MemRo = Ressource.OR;
         for(int acc = 0 ; acc < 9; acc++) {
             Face memF = jouer1.lancerDe1();
             Ressource MemR = memF.getRes();
             int memP = memF.getValeur();
             AccOR = AccOR + memP;
             System.out.println("Tour : " + (acc + 1) + " Face obtenu : " + memP + "point d'" + MemR + " gagné");
         }
             System.out.println("Total de point d'" + MemRo + " gagné : " + AccOR);
         if (AccOR <= 31)   /* En moyenne on s'attend à avoir 31.5 point */
             System.out.print("You Loose");
         else System.out.print("You Win");
    }

}
