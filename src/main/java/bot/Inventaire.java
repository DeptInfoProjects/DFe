package bot;

import de.*;
import iles.Carte;
import iles.Exploit;

import java.util.ArrayList;
import java.util.List;

import static de.Type.CHOIX;
import static de.Type.NORMAL;
import static de.Type.PLUS;


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
    public void setInventaire(int OR, int SOLAIRE, int LUNAIRE , int VICTOIRE, List<Exploit> cartes){
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }



    public int getNbOR() {
        return nbOR;
    }

    public void setNbOR(int nbOR) {
        this.nbOR = nbOR;
    }

    public int getNbSolaire() {
        return nbSolaire;
    }

    void setNbSolaire(int nbSolaire) {
        this.nbSolaire = nbSolaire;
    }

    public int getNbLunaire() {
        return nbLunaire;
    }

    void setNbLunaire(int nbLunaire) {
        this.nbLunaire = nbLunaire;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public List<Exploit> getCartes() {return cartes;}

    void addCartes(Exploit c){cartes.add(c);}

    public void adderFace(Face FaceDe) {
        Choix Courant = new Choix();
        Courant.addChoixList();
        int rand  = Courant.getChoixList(0);
        int rand2 = Courant.getChoixList(1);

        if(FaceDe.getType() == NORMAL){
            if (FaceDe.getRes() == Ressource.OR) {
                this.setNbOR(this.getNbOR() + FaceDe.getValeur());
                if (this.getNbOR() < 0) this.setNbOR(0);

            }
            if (FaceDe.getRes() == Ressource.SOLAIRE){
                this.setNbSolaire(this.getNbSolaire() + FaceDe.getValeur());
                if (this.getNbLunaire() < 0) this.setNbLunaire(0);

            }
            if (FaceDe.getRes() == Ressource.LUNAIRE){
                this.setNbLunaire(this.getNbLunaire() + FaceDe.getValeur());
                if (this.getNbSolaire() < 0) this.setNbSolaire(0);

            }
            if (FaceDe.getRes() == Ressource.VICTOIRE){
                this.setNbVictoire(this.getNbVictoire() + FaceDe.getValeur());
                if (this.getNbVictoire() < 0) this.setNbVictoire(0);

            }

        }
        else if(FaceDe.getType() == PLUS){
            this.setNbSolaire(this.getNbSolaire() + FaceDe.getNbSOL());
            this.setNbLunaire(this.getNbLunaire() + FaceDe.getNbLUN());
            this.setNbVictoire(this.getNbVictoire() + FaceDe.getNbVICT());
            this.setNbOR(this.getNbOR() + FaceDe.getNbOR());
            if (this.getNbOR() < 0) this.setNbOR(0);
            if (this.getNbLunaire() < 0) this.setNbLunaire(0);
            if (this.getNbSolaire() < 0) this.setNbSolaire(0);
            if (this.getNbVictoire() < 0) this.setNbVictoire(0);

        }
        else if(FaceDe.getType() == CHOIX && FaceDe.getNbSOL()>0){
            if (rand == 0){
                this.setNbOR(this.getNbOR() + FaceDe.getNbOR());
                if (this.getNbOR() < 0) this.setNbOR(0);
            }
            if (rand == 1){
                this.setNbSolaire(this.getNbSolaire() + FaceDe.getNbSOL());
                if (this.getNbLunaire() < 0) this.setNbLunaire(0);
            }
            if (rand == 2){
                this.setNbLunaire(this.getNbLunaire() + FaceDe.getNbLUN());
                if (this.getNbSolaire() < 0) this.setNbSolaire(0);
            }
            else if(FaceDe.getType() == CHOIX && FaceDe.getNbSOL()>0){
                if (rand2 == 0){
                    this.setNbOR(this.getNbOR() + FaceDe.getNbOR());
                    if (this.getNbOR() < 0) this.setNbOR(0);
                }
            }
            else{
                this.setNbVictoire(this.getNbVictoire() + FaceDe.getNbVICT());
                if (this.getNbVictoire() < 0) this.setNbVictoire(0);
            }
        }

    }
}



