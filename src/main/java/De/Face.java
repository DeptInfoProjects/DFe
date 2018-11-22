package De;

public class Face {

    private Integer valeur;
    private Ressource res;

  // CONSTRUCTEUR D'UNE FACE //

    public Face(Integer valeur, Ressource res){
        this.valeur = valeur;
        this.res = res;
    }

    //  GETTER & SETTER VALEUR  //
    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur)  {
        this.valeur = valeur;
    }

    //  GETTER & SETTER RESSOURCE //
    public void setRes(Ressource res){
        this.res = res;
    }

    public Ressource getRes() {
        return res;
    }
}
