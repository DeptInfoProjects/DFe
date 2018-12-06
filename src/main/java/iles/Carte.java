package iles;

import de.Ressource;

public enum Carte {
    MARTEAU(1,"Le Marteau du forgeron",0,TypeEffet.IMMEDIAT,1,Ressource.LUNAIRE,4),
    COFFRE(2,"Le Coffre du forgeron",2,TypeEffet.IMMEDIAT,1,Ressource.LUNAIRE,4),
    SABOTS(3,"Les sabots d'argent",2,TypeEffet.RENFORT,2,Ressource.LUNAIRE,4),
    SATYRES(4,"Les Satyres",6,TypeEffet.IMMEDIAT,3,Ressource.LUNAIRE,4),
    ANCIEN(5,"L'Ancien",0,TypeEffet.RENFORT,1,Ressource.SOLAIRE,4),
    HERBES(6,"Les Herbes folles",2,TypeEffet.IMMEDIAT,1,Ressource.SOLAIRE,4),
    AILES(7," Les ailes de la Gardienne",4,TypeEffet.RENFORT,2,Ressource.SOLAIRE,4),
    MINOTAURE(8,"Le Minotaure",8,TypeEffet.IMMEDIAT,3,Ressource.SOLAIRE,4),
    PASSEUR(9,"Le Passeur",12,TypeEffet.IMMEDIAT,4,Ressource.LUNAIRE,4),
    CASQUE(10,"Le Casque d'invisibilité",4,TypeEffet.IMMEDIAT,5,Ressource.LUNAIRE,4),
    PINCE(11,"La Pince",8,TypeEffet.IMMEDIAT,6,Ressource.LUNAIRE,4),
    //HYDRE(12,"L'Hydre",26,TypeEffet.IMMEDIAT,5,Ressource.LUNAIRE && Ressource.SOLAIRE,4),//
    MEDUSE(13,"La Meduse",14,TypeEffet.IMMEDIAT,4,Ressource.SOLAIRE,4),//
    MIRROIR(14,"Le Mirroir abyssal",10,TypeEffet.IMMEDIAT,5,Ressource.SOLAIRE,4),
    ENIGME(15,"L'Enigme",10,TypeEffet.IMMEDIAT,6,Ressource.SOLAIRE,4),
    NULL(16,"Carte nulle invisible",0,TypeEffet.IMMEDIAT,0,Ressource.OR,999) ;


    private final Integer indice;
    private final String nom;
    private final Integer victoire;
    private final TypeEffet effet;
    private final Integer coutNb;
    private final Ressource coutRes;
    private int stock;

    Carte(int i, String s, int i1, TypeEffet effet, int i2, Ressource S, int i3) {
        this.indice = i;
        this.nom = s;
        this.victoire = i1;
        this.effet = effet;
        this.coutNb = i2;
        this.coutRes = S;
        this.stock = i3;
    }

    public int getIndice(){
        return this.indice;
    }
    public String getNom(){
        return this.nom;
    }
    public int getVictoire(){
        return this.victoire;
    }

    public TypeEffet getEffet(){
        return this.effet;
    }

    public int getCoutNb(){
        return this.coutNb;
    }

    public Ressource getCountRes(){
        return this.coutRes;
    }

    public int getStock(){
        return this.stock;
    }

    public void ModStock(){
        this.stock = stock - 1;
    }
}

