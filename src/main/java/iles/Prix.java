package iles;

public class Prix {
    private int nbLunaire;
    private int nbSolaire;

    public Prix(int nbLunaire,int nbSolaire){
        this.nbLunaire = nbLunaire;
        this.nbSolaire = nbSolaire;
    }

    public int getPrix(){
        if (nbSolaire == 0){
            return nbLunaire;
        }
        else if(nbLunaire == 0){
            return nbSolaire;
        }
        return 0;
    }
}
