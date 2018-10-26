package Bot;
import De.*;

public class Jouer {
    public static void main(String[] args){}
    private De d1 = new De();
    private De d2 = new De();
    public Jouer(){
        d1.InitDe1();
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



}
