package Bot;


import De.*;

public class Jouer {
    private De d1 = new De();
    int AccOR = 0;
    public int NbTour = 0;
    public Jouer(){
        d1.InitDe();
    }
     public final void lancerDe1(){
        int rand = (int) (Math.random()*6+1);
        switch(rand){
            case 1:   AccOR =+ d1.getDeValeur(1);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(1) + " Point d'OR");
                break;
            case 2:   AccOR =+ d1.getDeValeur(2);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(2) + " Point d'OR");
                break;
            case 3:  AccOR =+ d1.getDeValeur(3);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(3) + " Point d'OR");
                break;
            case 4:  AccOR =+ d1.getDeValeur(4);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(4) + " Point d'OR");
                break;
            case 5:  AccOR =+ d1.getDeValeur(5);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(5) + " Point d'OR");
                break;
            case 6:  AccOR =+ d1.getDeValeur(6);
                System.out.println("Tour " + NbTour + " : " + d1.getDeValeur(6) + " Point d'OR");
                break;
        }


    }


     public static void main(String[] args){
         Jouer jouer1 = new Jouer();
         for(int acc = 0 ; acc < 9; acc++)
         {jouer1.NbTour =+ 1;
         jouer1.lancerDe1();
         System.out.println(jouer1.AccOR);
         }
    }

}
