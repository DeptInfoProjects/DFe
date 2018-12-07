package Iles;





import static Iles.TypeEffet.*;

public class Carte{
    public static Exploit MARTEAU = new Exploit("Le Marteau du forgeron"    ,IMMEDIAT  ,new Prix(1,0));
    public static Exploit COFFRE  = new Exploit("Le Coffre du forgeron"     ,IMMEDIAT  ,new Prix(1,0));
    public static Exploit SABOTS  = new Exploit("Les sabots d'argent"       ,PERMANENT ,new Prix(2,0));
    public static Exploit SATYRES = new Exploit("Les Satyres"               ,IMMEDIAT  ,new Prix(3,0));
    public static Exploit ANCIEN  = new Exploit("L'Ancien"                  ,PERMANENT ,new Prix(0,1));
    public static Exploit HERBES  = new Exploit("Les Herbes folles"         ,IMMEDIAT  ,new Prix(0,1));
    public static Exploit AILES   = new Exploit("Les ailes de la Gardienne" ,PERMANENT ,new Prix(0,2));
    public static Exploit MINOTAURE= new Exploit("Le Minotaure"             ,IMMEDIAT , new Prix(0,3));
    public static Exploit PASSEUR = new Exploit("Le Passeur"                ,IMMEDIAT , new Prix(4,0));
    public static Exploit CASQUE  = new Exploit("Le Casque d'invisibilité"  ,IMMEDIAT , new Prix(5,0));
    public static Exploit PINCE   = new Exploit("La Pince"                  ,IMMEDIAT , new Prix(6,0));
    public static Exploit HYDRE   = new Exploit("L'Hydre"                   ,IMMEDIAT , new Prix(5,5));
    public static Exploit MEDUSE  = new Exploit("La Meduse"                 ,IMMEDIAT , new Prix(0,4));
    public static Exploit MIRROIR = new Exploit("Le Mirroir abyssal"        ,IMMEDIAT , new Prix(0,5));
    public static Exploit ENIGME  = new Exploit("L'Enigme"                  ,IMMEDIAT , new Prix(0,6));
    public static Exploit NULL    = new Exploit("NULL"                      ,IMMEDIAT , new Prix(0,0));




}

