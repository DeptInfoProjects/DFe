package Bot;


import De.*;

public class Jouer {
    private De d1 = new De();
    private De d2 = new De();


    Integer AccOR = 0;
    Integer AccSOLAIRE = 0 ;
    Integer AccLUNAIRE = 0;
    Integer AccVICTOIRE = 0;

     public final void lancerDe1(){
        int rand = (int) (Math.random()*6)+1;
        switch(rand){
            case 1:  AccSOLAIRE =+ 1;
                System.out.println("Valeur = > " + d1.getDeValeur(1) + " Ressource = > "+ "/////");
            case 2:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 3:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 4:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 5:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 6:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
        }


    }
    void lancerDe2(){
        int rand = (int) (Math.random()*6)+1;
        switch(rand){
            case 1:  AccLUNAIRE =+ 1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 2:  AccVICTOIRE =+2;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 3:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 4:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 5:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
            case 6:  AccOR =+1;
                System.out.println("Valeur = > " + "////" + " Ressource = > "+ "/////");
        }
     }

     public final void main(String[] args){
         Jouer jouer1 = new Jouer();
         Jouer.lancerDe1();}

}
