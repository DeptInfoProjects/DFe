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
        FACE1 = new Face(2, Ressource.SOLAIRE);

        FACE2 = new Face(4, Ressource.OR);

        FACE3 = new Face(6, Ressource.OR);

        FACE4 = new Face(8, Ressource.OR);

        FACE5 = new Face(10, Ressource.OR);

        FACE6 = new Face(12, Ressource.OR);
    }


    public Integer getDeValeur(Integer rand){
        int compte = 0;
        switch(rand){
            case 1:
                compte =  FACE1.getValeur();
                break;
            case 2:
                compte = FACE2.getValeur();
                break;
            case 3:
                compte = FACE3.getValeur();
                break;
            case 4:
                compte = FACE4.getValeur();
                break;
            case 5:
                compte = FACE5.getValeur();
                break;
            case 6:
                compte = FACE6.getValeur();
                break ;
            default: return 0;

        }
        return compte;
    }


    public Ressource getDeRessources(Integer rand){
        Ressource compte = 0;
        switch(rand){
            case 1:
                compte =  FACE1.getRes();
                break;
            case 2:
                compte = FACE2.getRes();
                break;
            case 3:
                compte = FACE3.getRes();
                break;
            case 4:
                compte = FACE4.getRes();
                break;
            case 5:
                compte = FACE5.getValeur();
                break;
            default: compte = FACE6.getValeur();
                break ;

        }
        return compte;
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


