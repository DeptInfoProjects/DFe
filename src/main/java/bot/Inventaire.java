package bot;

import Iles.Exploit;
import de.*;
import Iles.Carte;

import java.util.ArrayList;
import java.util.List;

/* l'inventaire possède 5 attributs : les 3 ressources + nb victoire et la liste des cartes du joueur */
public class Inventaire {
    private int nbOR;
    private int nbSolaire;
    private int nbLunaire;
    private int nbVictoire;
    private List<Exploit> cartes = new ArrayList<>();

    public Inventaire(){}

    public Inventaire(int OR, int SOLAIRE, int LUNAIRE, int VICTOIRE, List<Exploit> cartes) {
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }
    /* maj de l'inventaire */
    public void setInventaire(int OR, int SOLAIRE, int LUNAIRE , int VICTOIRE, List<Exploit> cartes){
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }


    /* get et set des ressources/nb victoire/liste des cartes de l'inventaire */
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

    public List<Exploit> getCartes() {return cartes;}

    public int getSizeCarte(){return cartes.size();}

    /* ajout d'une carte donnée en parametre dans la liste des cartes de l'inventaire du joueur */
    public void addCartes(Exploit c){cartes.add(c);}

    /* Ajout de la gagne dans l'inventaire */
    public void adderFace(Face FaceDe) {
        if (FaceDe.getRes() == Ressource.OR) this.setNbOR(this.getNbOR() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.SOLAIRE) this.setNbSolaire(this.getNbSolaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.LUNAIRE) this.setNbLunaire(this.getNbLunaire() + FaceDe.getValeur());
        if (FaceDe.getRes() == Ressource.VICTOIRE) this.setNbVictoire(this.getNbVictoire() + FaceDe.getValeur());
    }
}



