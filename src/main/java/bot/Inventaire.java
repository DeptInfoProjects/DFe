package bot;

import Iles.Exploit;
import Iles.Sanctuaire;
import de.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static de.Ressource.*;
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

    public Inventaire(int OR, int SOLAIRE, int LUNAIRE, int VICTOIRE, ArrayList<Exploit> cartes) {
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }
    public void setInventaire(int OR, int SOLAIRE, int LUNAIRE , int VICTOIRE, ArrayList<Exploit> cartes){
        this.nbOR = OR;
        this.nbSolaire = SOLAIRE;
        this.nbLunaire = LUNAIRE;
        this.nbVictoire = VICTOIRE;
        this.cartes = cartes;
    }



    public int  getNbOR() {
        return nbOR;
    }

    void setNbOR(int nbOR) {
        this.nbOR = nbOR;
    }

    public int  getNbSolaire() {
        return nbSolaire;
    }

    public void setNbSolaire(int nbSolaire) {
        this.nbSolaire = nbSolaire;
    }

    public int  getNbLunaire() {
        return nbLunaire;
    }

    public void setNbLunaire(int nbLunaire) {
        this.nbLunaire = nbLunaire;
    }

    public int  getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public ArrayList<Exploit> getCartes() {return (ArrayList<Exploit>) cartes;}

    public int getSizeCarte(){return cartes.size();}

    public void addCartes(Exploit c){cartes.add(c);}

    public void adderFace(Face FaceDe) {
        if (FaceDe.getType() == NORMAL) {
            if (FaceDe.getRes() == OR) this.setNbOR(this.getNbOR() + FaceDe.getValeur());
            if (FaceDe.getRes() == SOLAIRE) this.setNbSolaire(this.getNbSolaire() + FaceDe.getValeur());
            if (FaceDe.getRes() == LUNAIRE) this.setNbLunaire(this.getNbLunaire() + FaceDe.getValeur());
            if (FaceDe.getRes() == VICTOIRE) this.setNbVictoire(this.getNbVictoire() + FaceDe.getValeur());
        }
       /* // multi1
        if (FaceDe.getRes() == VICTOIRE && FaceDe.getRes2() == SOLAIRE){
            this.setNbVictoire(getNbVictoire() + 1);
            this.setNbSolaire(getNbSolaire() +1);
        }
        //multi3
        if (FaceDe.getRes() == OR && FaceDe.getRes2() == LUNAIRE      &&   FaceDe.getRes3() == SOLAIRE  &&   FaceDe.getRes3() == VICTOIRE){
            this.setNbVictoire(this.getNbVictoire() + 1 );
            this.setNbSolaire(this.getNbSolaire() + 1);
            this.setNbLunaire(this.getNbLunaire() + 1);
            this.setNbOR(this.getNbOR() + 1);
        }//multi4
        if (FaceDe.getValeur() != 2 || FaceDe.getValeur2() != 2 || FaceDe.getRes() != VICTOIRE || FaceDe.getRes2() != LUNAIRE) {
        } else {
            this.setNbVictoire(this.getNbVictoire() + 2);
            this.setNbLunaire(this.getNbLunaire() + 2);
        }
        // multi1
        if (FaceDe.getValeur()== 2 && FaceDe.getRes() == OR && FaceDe.getValeur2() == 1 && FaceDe.getRes() == LUNAIRE ){
            this.setNbOR(this.getNbOR() + 2);
            this.setNbLunaire(this.getNbLunaire() + 1);
        }*/

    }

}



