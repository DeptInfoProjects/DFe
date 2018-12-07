package bot;

import de.*;
import Iles.Carte;

import java.util.ArrayList;
import java.util.List;


public class Inventaire {
    private int nbOR;
    private int nbSolaire;
    private int nbLunaire;
    private int nbVictoire;
    private List<Carte> cartes = new ArrayList<>();

    public Inventaire(){}

    public Inventaire(int OR, int SOLAIRE, int LUNAIRE, int VICTOIRE, List<Carte> cartes) {
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }
    public void setInventaire(int OR, int SOLAIRE, int LUNAIRE , int VICTOIRE, List<Carte> cartes){
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
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

    public void setNbSolaire(int nbSolaire) {
        this.nbSolaire = nbSolaire;
    }

    public int getNbLunaire() {
        return nbLunaire;
    }

    public void setNbLunaire(int nbLunaire) {
        this.nbLunaire = nbLunaire;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public List<Carte> getCartes() {return cartes;}

    public int getSizeCarte(){return cartes.size();}

    public void addCartes(Carte c){cartes.add(c);}

    public void adderFace(Face FaceDe) {
        if (FaceDe.getRes() == Ressource.OR) this.setNbOR(this.getNbOR() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.SOLAIRE) this.setNbSolaire(this.getNbSolaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.LUNAIRE) this.setNbLunaire(this.getNbLunaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.VICTOIRE) this.setNbVictoire(this.getNbVictoire() + FaceDe.getValeur());
    }
}


