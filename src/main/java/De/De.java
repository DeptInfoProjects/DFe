package De;


public class De {
    public static void main(String[] args){}
    private Face FACE1;
    private Face FACE2;
    private Face FACE3;
    private Face FACE4;
    private Face FACE5;
    private Face FACE6;
    public De() {}

    public void InitDe1(){
        FACE1 = new Face(1, Ressource.OR);

        FACE2 = new Face(2, Ressource.OR);

        FACE3 = new Face(3, Ressource.OR);

        FACE4 = new Face(4, Ressource.OR);

        FACE5 = new Face(5, Ressource.OR);

        FACE6 = new Face(6, Ressource.OR);
    }


    public Face getFace(Integer rand){
        Face compte ;
        switch(rand){
            case 1:
                compte =  FACE1;
                break;
            case 2:
                compte = FACE2;
                break;
            case 3:
                compte = FACE3;
                break;
            case 4:
                compte = FACE4;
                break;
            case 5:
                compte = FACE5;
                break;
            default:
                compte = FACE6;
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

