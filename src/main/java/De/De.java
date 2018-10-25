package De;


public class De {

    private Face FACE1;
    private Face FACE2;
    private Face FACE3;
    private Face FACE4;
    private Face FACE5;
    private Face FACE6;

    public De() {}

    public void InitDe(){
        FACE1 = new Face(1, Ressource.SOLAIRE);

        FACE2 = new Face(1, Ressource.OR);

        FACE3 = new Face(1, Ressource.OR);

        FACE4 = new Face(1, Ressource.OR);

        FACE5 = new Face(1, Ressource.OR);

        FACE6 = new Face(1, Ressource.OR);
    }

    public void InitDe2(){
        FACE1 = new Face(1, Ressource.LUNE);

        FACE2 = new Face(2, Ressource.VICTOIRE);

        FACE3 = new Face(1, Ressource.OR);

        FACE4 = new Face(1, Ressource.OR);

        FACE5 = new Face(1, Ressource.OR);

        FACE6 = new Face(1, Ressource.OR);
    }

    public Integer  getDeValeur(Integer rand){
        switch(rand){
            case 1:
                 FACE1.getValeur();
                 break;
            case 2:
                 FACE2.getValeur();
                 break;
            case 3:
                 FACE3.getValeur();
                 break;
            case 4:
                 FACE4.getValeur();
                 break;
            case 5:
                 FACE5.getValeur();
                 break;
            case 6:
                 FACE6.getValeur();
                 break;
        }
        return rand;
    }

    public String toString(){
        String vide;
        vide = "" + FACE1.getRes() + " " + FACE1.getValeur() + '\n' +
                '\n' + FACE2.getRes() + " " + FACE2.getValeur() + '\n' +
                '\n' + FACE3.getRes() + " " + FACE3.getValeur() + '\n' +
                '\n' + FACE4.getRes() + " " + FACE4.getValeur() + '\n' +
                '\n' + FACE5.getRes() + " " + FACE5.getValeur() + '\n' +
                '\n' + FACE6.getRes() + " " + FACE6.getValeur();
        return vide;
    }

}


