package De;

public class Face {

    private Integer valeur;
    private Ressource res;

    public Face(Integer valeur, Ressource res){
        this.valeur = valeur;
        this.res = res;
    }
    public Integer getValeur() {
        return valeur;
    }


    public Ressource getRes() {
        return res;
    }
}
