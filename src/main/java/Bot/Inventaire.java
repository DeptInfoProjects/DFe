package Bot;

import De.*;


public class Inventaire {
    private int nbOR;
    private int nbSolaire;
    private int nbLunaire;
    private int nbVictoire;

    public Inventaire(){}

    public Inventaire(int OR, int SOLAIRE, int LUNAIRE, int VICTOIRE) {
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
    }
    public void setInventaire(int OR, int SOLAIRE, int LUNAIRE , int VICTOIRE){
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
    }



    public int getNbOR() {
        return nbOR;
    }

    void setNbOR(int nbOR) {
        this.nbOR = nbOR;
    }

    public int getNbSolaire() {
        return nbSolaire;
    }

    private void setNbSolaire(int nbSolaire) {
        this.nbSolaire = nbSolaire;
    }

    public int getNbLunaire() {
        return nbLunaire;
    }

    private void setNbLunaire(int nbLunaire) {
        this.nbLunaire = nbLunaire;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    private void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public void adderFace(Face FaceDe) {
        if (FaceDe.getRes() == Ressource.OR) this.setNbOR(this.getNbOR() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.SOLAIRE) this.setNbSolaire(this.getNbSolaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.LUNAIRE) this.setNbLunaire(this.getNbLunaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.VICTOIRE) this.setNbVictoire(this.getNbVictoire() + FaceDe.getValeur());
    }
}



