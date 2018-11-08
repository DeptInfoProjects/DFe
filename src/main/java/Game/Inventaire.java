package Game;
import Bot.*;
import De.*;


public class Inventaire {
    private int nbOR;

    public Inventaire(){
        this.nbOR = 0;
    }

    public int getInventaire(){
        return this.nbOR;
    }

    public void setInventaire(int or){
        this.nbOR += or;
    }

}