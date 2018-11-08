package Bot;
import De.*;
import Game.*;

public class Joueur {

    public De d1 = new De();
    public De d2 = new De();
    public Inventaire Sac;//s


    public Joueur(){
        d1.InitDe1();
        d2.InitDe1();
        Sac = new Inventaire();

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

    public final Face lancerDe2(){
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

}

