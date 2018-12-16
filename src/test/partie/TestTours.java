
package partie;

import bot.Joueur;
import de.Face;
import de.Ressource;
import de.Type;
import iles.Carte;
import iles.Exploit;
import iles.TypeEffet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestTours extends TestTours2 {

  @Test(timeout = 4000)
  public void test00() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Carte.SABOTS;
      assertNotNull(exploit0);
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      
      Carte.MEDUSE = exploit0;
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals("Les sabots d'argent", Carte.MEDUSE.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.MEDUSE.getType());
      
      Carte.COFFRE = exploit0;
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.COFFRE.getType());
      assertEquals("Les sabots d'argent", Carte.COFFRE.getNom());
      
      Carte.afficheCartesJoueurs(Tours.joueur2);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.PASSEUR = Carte.COFFRE;
      assertEquals(TypeEffet.PERMANENT, Carte.PASSEUR.getType());
      assertEquals("Les sabots d'argent", Carte.PASSEUR.getNom());
      
      Exploit.effetSabots(joueur0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Tours.joueur2 = Tours.joueur1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur2.getJoueur());
      
      Carte.ANCIEN = exploit0;
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals("Les sabots d'argent", Carte.ANCIEN.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.ANCIEN.getType());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(72, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int1 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int1);
      assertNotEquals(int1, int0);
      
      int int2 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(396, int2);
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertNotEquals(int3, int0);
      assertNotEquals(int3, int2);
      assertEquals(int3, int1);
  }

  @Test(timeout = 4000)
  public void test01() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Carte.SABOTS;
      assertNotNull(exploit0);
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      
      Carte.AILES = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", Carte.AILES.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.AILES.getType());
      
      Carte.ENIGME = Carte.AILES;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", Carte.AILES.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.AILES.getType());
      assertEquals("Les sabots d'argent", Carte.ENIGME.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.ENIGME.getType());
      
      Carte.SABOTS = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals(TypeEffet.PERMANENT, Carte.SABOTS.getType());
      assertEquals("Les sabots d'argent", Carte.SABOTS.getNom());
      
      Carte.COFFRE = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals(TypeEffet.PERMANENT, Carte.COFFRE.getType());
      assertEquals("Les sabots d'argent", Carte.COFFRE.getNom());
      
      Carte.afficheCartesJoueurs(Tours.joueur2);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.PASSEUR = Carte.COFFRE;
      assertEquals("Les sabots d'argent", Carte.PASSEUR.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.PASSEUR.getType());
      
      Exploit.effetSabots(joueur0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Tours.joueur2 = Tours.joueur1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur2.getJoueur());
      
      Carte.ANCIEN = Carte.PASSEUR;
      assertEquals("Les sabots d'argent", Carte.PASSEUR.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.PASSEUR.getType());
      assertEquals(TypeEffet.PERMANENT, Carte.ANCIEN.getType());
      assertEquals("Les sabots d'argent", Carte.ANCIEN.getNom());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(88, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int1 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int1);
      assertNotEquals(int1, int0);
  }

  @Test(timeout = 4000)
  public void test02() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Carte.SABOTS;
      assertNotNull(exploit0);
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      
      Carte.AILES = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals(TypeEffet.PERMANENT, Carte.AILES.getType());
      assertEquals("Les sabots d'argent", Carte.AILES.getNom());
      
      Carte.SABOTS = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", Carte.SABOTS.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.SABOTS.getType());
      
      Carte.afficheCartesJoueurs(Tours.joueur2);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.PASSEUR = Carte.COFFRE;
      assertEquals("Le Coffre du forgeron", Carte.PASSEUR.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.PASSEUR.getType());
      
      Exploit.effetSabots(joueur0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.ANCIEN = exploit0;
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", Carte.ANCIEN.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.ANCIEN.getType());
      
      Face face0 = joueur0.acheterFace();
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertNull(face0.getNbVICT());
      assertEquals(4, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      
      joueur0.changementFace(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertNull(face0.getNbVICT());
      assertEquals(4, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(118, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
  }

  @Test(timeout = 4000)
  public void test03() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Type type0 = Type.CHOIX;
      Exploit exploit0 = Tours.joueur1.acheterCarte();
      assertNotNull(exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      
      Integer integer0 = exploit0.stock;
      assertNotNull(integer0);
      assertEquals(4, (int)integer0);
      
      Integer integer1 = exploit0.stock;
      assertNotNull(integer1);
      assertEquals(4, (int)integer1);
      assertEquals(integer1, integer0);
      
      Face face0 = new Face(type0, integer0, exploit0.stock, integer1, integer0);
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(4, (int)face0.getNbLUN());
      assertEquals(4, (int)face0.getNbSOL());
      assertEquals(4, (int)face0.getNbOR());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getRes());
      assertEquals(4, (int)face0.getNbVICT());
      assertNull(face0.getValeur());
      assertEquals(integer0, integer1);
      assertEquals(integer1, integer0);
      
      joueur0.changementFace(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(4, (int)face0.getNbLUN());
      assertEquals(4, (int)face0.getNbSOL());
      assertEquals(4, (int)face0.getNbOR());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getRes());
      assertEquals(4, (int)face0.getNbVICT());
      assertNull(face0.getValeur());
      assertEquals(integer0, integer1);
      assertEquals(integer1, integer0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit1 = Tours.joueur2.acheterCarte();
      assertNotNull(exploit1);
      assertSame(exploit1, exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      
      Carte.PINCE = exploit1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.PINCE.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.PINCE.getType());
      
      Carte.SATYRES = exploit1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.SATYRES.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.SATYRES.getNom());
      
      Exploit exploit2 = joueur0.acheterCarte();
      assertNotNull(exploit2);
      assertSame(exploit2, exploit1);
      assertSame(exploit2, exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit2.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit2.getNom());
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nVICTOIRE 4\t\t\t\tLUNAIRE 1\tOr       :  0\nSOLAIRE 2\t\t\t\tOR 1\tSolaire  :  0\nLUNAIRE 1\t\t\t\tOR 1\tLunaire :  0\nLUNAIRE 1\t\t\t\tOR 1\tVictoire :  102\nLUNAIRE 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      Carte.SABOTS = exploit1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.SABOTS.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.SABOTS.getType());
      
      Carte.NULL = Carte.SABOTS;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.SABOTS.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.SABOTS.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.NULL.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.NULL.getNom());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int0 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int0);
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(538, int1);
      assertNotEquals(int1, int0);
      
      int int2 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int2);
      assertEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertEquals(int3, int2);
      assertEquals(int3, int0);
      assertNotEquals(int3, int1);
      
      Random.setNextRandom(12);
  }

  @Test(timeout = 4000)
  public void test04() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Tours.joueur2.acheterCarte();
      assertNotNull(exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      
      Carte.AILES = exploit0;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.AILES.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.AILES.getNom());
      
      Carte.SABOTS = exploit0;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.SABOTS.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.SABOTS.getType());
      
      Carte.COFFRE = exploit0;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.COFFRE.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.COFFRE.getNom());
      
      Carte.afficheCartesJoueurs(Tours.joueur2);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.PASSEUR = Carte.COFFRE;
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.PASSEUR.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.PASSEUR.getType());
      
      Exploit.effetSabots(joueur0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.ANCIEN = exploit0;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.ANCIEN.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.ANCIEN.getType());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(148, int0);
      
      Exploit exploit1 = Carte.COFFRE;
      assertNotNull(exploit1);
      assertSame(exploit1, exploit0);
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      
      Carte.SABOTS = exploit1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.SABOTS.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.SABOTS.getType());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Random.setNextRandom(3439);
      int int1 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int1);
      assertNotEquals(int1, int0);
  }

  @Test(timeout = 4000)
  public void test05() {
      Random.setNextRandom(9);
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  2\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);

      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur1.getJoueur());

      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur1.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int0);
      
      Face face0 = joueur0.acheterFace();
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals(Type.PLUS, face0.getType());
      assertEquals(0, (int)face0.getNbSOL());
      assertEquals(2, (int)face0.getNbOR());
      assertNull(face0.getValeur());
      assertEquals(1, (int)face0.getNbLUN());
      assertNull(face0.getRes());
      
      Exploit exploit0 = Carte.SABOTS;
      assertNotNull(exploit0);
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      
      Carte.NULL = exploit0;
      assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      assertEquals("Les sabots d'argent", exploit0.getNom());
      assertEquals(TypeEffet.PERMANENT, Carte.NULL.getType());
      assertEquals("Les sabots d'argent", Carte.NULL.getNom());
      
      Random.setNextRandom(1326);
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(124, int1);
      assertNotEquals(int1, int0);
      
      int int2 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int2);
      assertEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      Face face1 = joueur0.acheterFace();
      assertNotNull(face1);
      assertNotSame(face1, face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertEquals(2, (int)face1.getValeur());
      assertEquals(Type.NORMAL, face1.getType());
      assertNotEquals(face1, face0);
      
      int int3 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(460, int3);
      assertNotEquals(int3, int0);
      assertNotEquals(int3, int1);
      assertNotEquals(int3, int2);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int4 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(1038, int4);
      assertNotEquals(int4, int1);
      assertNotEquals(int4, int0);
      assertNotEquals(int4, int2);
      assertNotEquals(int4, int3);
      
      int int5 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(1170, int5);
      assertNotEquals(int5, int3);
      assertNotEquals(int5, int0);
      assertNotEquals(int5, int4);
      assertNotEquals(int5, int1);
      assertNotEquals(int5, int2);
      
      Random.setNextRandom((-580));
      Random.setNextRandom(12);
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int6 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int6);
      assertNotEquals(int6, int4);
      assertNotEquals(int6, int1);
      assertNotEquals(int6, int3);
      assertNotEquals(int6, int5);
      assertEquals(int6, int2);
      assertEquals(int6, int0);
      
      int int7 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(1746, int7);
      assertNotEquals(int7, int1);
      assertNotEquals(int7, int6);
      assertNotEquals(int7, int2);
      assertNotEquals(int7, int4);
      assertNotEquals(int7, int0);
      assertNotEquals(int7, int3);
      assertNotEquals(int7, int5);
  }

  @Test(timeout = 4000)
  public void test06() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());

      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur1.getJoueur());
      
      Type type0 = Type.CHOIX;
      Exploit exploit0 = Carte.PASSEUR;
      assertNotNull(exploit0);
      assertEquals("Le Passeur", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      
      Integer integer0 = exploit0.stock;
      assertNotNull(integer0);
      assertEquals(4, (int)integer0);
      
      Ressource ressource0 = Ressource.OR;
      int int0 = Integer.compareUnsigned(exploit0.stock, 1101);
      assertEquals("Le Passeur", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals((-1), int0);
      
      Exploit.effetAncien(Tours.joueur1);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Face face0 = new Face(type0, integer0, ressource0);
      assertNotNull(face0);
      assertEquals("Le Passeur", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(4, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNotEquals(integer0, (Object) int0);
      
      joueur0.changementFace(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Le Passeur", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(4, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNotEquals(integer0, (Object) int0);
      
      Exploit exploit1 = joueur0.acheterCarte();
      assertNotNull(exploit1);
      assertNotSame(exploit1, exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertNotEquals(exploit1, exploit0);
      
      // Undeclared exception!
      try { 
        tours0.partieClassique();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int0 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int0);
      
      Type type0 = Type.NORMAL;
      Integer integer0 = 14;
      assertNotNull(integer0);
      assertEquals(14, (int)integer0);
      assertNotEquals(integer0, (Object) int0);
      
      Exploit exploit0 = Tours.joueur2.acheterCarte();
      assertNotNull(exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      
      Integer integer1 = exploit0.stock;
      assertNotNull(integer1);
      assertEquals(4, (int)integer1);
      assertNotEquals(integer1, (Object) int0);
      assertNotEquals(integer1, integer0);
      
      Integer integer2 = exploit0.stock;
      assertNotNull(integer2);
      assertEquals(4, (int)integer2);
      assertNotEquals(integer2, (Object) int0);
      assertNotEquals(integer2, integer0);
      
      Face face0 = new Face(type0, integer0, integer1, integer2, integer0);
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(4, (int)face0.getNbLUN());
      assertNull(face0.getRes());
      assertNull(face0.getValeur());
      assertEquals(14, (int)face0.getNbVICT());
      assertEquals(4, (int)face0.getNbSOL());
      assertEquals(14, (int)face0.getNbOR());
      assertNotEquals(integer0, integer2);
      assertNotEquals(integer0, (Object) int0);
      assertNotEquals(integer0, integer1);
      assertNotEquals(integer1, (Object) int0);
      assertNotEquals(integer1, integer0);
      assertNotEquals(integer2, (Object) int0);
      assertNotEquals(integer2, integer0);
      
      joueur0.changementFace(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(4, (int)face0.getNbLUN());
      assertNull(face0.getRes());
      assertNull(face0.getValeur());
      assertEquals(14, (int)face0.getNbVICT());
      assertEquals(4, (int)face0.getNbSOL());
      assertEquals(14, (int)face0.getNbOR());
      assertNotEquals(integer0, integer2);
      assertNotEquals(integer0, (Object) int0);
      assertNotEquals(integer0, integer1);
      assertNotEquals(integer1, (Object) int0);
      assertNotEquals(integer1, integer0);
      assertNotEquals(integer2, (Object) int0);
      assertNotEquals(integer2, integer0);
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nLUNAIRE 2\t\t\t\tLUNAIRE 1\tOr       :  0\nLUNAIRE 1\t\t\t\tnull null\tSolaire  :  0\nLUNAIRE 1\t\t\t\tOR 1\tLunaire :  0\nLUNAIRE 1\t\t\t\tOR 1\tVictoire :  84\nLUNAIRE 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      Exploit exploit1 = Carte.CASQUE;
      assertNotNull(exploit1);
      assertNotSame(exploit1, exploit0);
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("Le Casque d'invisibilit\u00E9", exploit1.getNom());
      assertNotEquals(exploit1, exploit0);
      
      Carte.COFFRE = exploit1;
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("Le Casque d'invisibilit\u00E9", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.COFFRE.getType());
      assertEquals("Le Casque d'invisibilit\u00E9", Carte.COFFRE.getNom());
      
      Carte.ANCIEN = exploit1;
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("Le Casque d'invisibilit\u00E9", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.ANCIEN.getType());
      assertEquals("Le Casque d'invisibilit\u00E9", Carte.ANCIEN.getNom());
      
      Face face1 = joueur0.acheterFace();
      assertNotNull(face1);
      assertNotSame(face1, face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.LUNAIRE, face1.getRes());
      assertEquals(2, (int)face1.getValeur());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNotEquals(face1, face0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(228, int1);
      assertNotEquals(int1, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int2 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int2);
      assertEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      Random.setNextRandom(10);
      Random.setNextRandom((-832));
  }

  @Test(timeout = 4000)
  public void test08() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int0 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int0);
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(156, int1);
      assertNotEquals(int1, int0);
      
      Exploit exploit0 = Carte.MEDUSE;
      assertNotNull(exploit0);
      assertEquals("La Meduse", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      
      Carte.NULL = exploit0;
      assertEquals("La Meduse", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.NULL.getType());
      assertEquals("La Meduse", Carte.NULL.getNom());
      
      Carte.MIRROIR = exploit0;
      assertEquals("La Meduse", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.MIRROIR.getType());
      assertEquals("La Meduse", Carte.MIRROIR.getNom());
      
      joueur0.changementFace(null);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit1 = Carte.NULL;
      assertNotNull(exploit1);
      assertSame(exploit1, exploit0);
      assertEquals("La Meduse", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      
      exploit1.applyEffet(joueur0);
      assertSame(exploit1, exploit0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("La Meduse", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      
      Carte.NULL = exploit1;
      assertEquals("La Meduse", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.NULL.getType());
      assertEquals("La Meduse", Carte.NULL.getNom());
      
      Carte.AILES = exploit1;
      assertEquals("La Meduse", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.AILES.getType());
      assertEquals("La Meduse", Carte.AILES.getNom());
      
      joueur0.changementFace(null);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      // Undeclared exception!
      try { 
        tours0.partieStat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Face face0 = joueur0.acheterFace();
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(78, int0);
      
      int int1 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int1);
      assertNotEquals(int1, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int2 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(392, int2);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      
      Face face1 = joueur0.acheterFace();
      assertNotNull(face1);
      assertNotSame(face1, face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNotEquals(face1, face0);
      
      int int3 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(464, int3);
      assertNotEquals(int3, int2);
      assertNotEquals(int3, int1);
      assertNotEquals(int3, int0);
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nLUNAIRE 2\t\t\t\tLUNAIRE 1\tOr       :  0\nLUNAIRE 1\t\t\t\tOR 1\tSolaire  :  0\nLUNAIRE 1\t\t\t\tOR 1\tLunaire :  0\nLUNAIRE 1\t\t\t\tOR 1\tVictoire :  464\nLUNAIRE 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Carte.NULL;
      assertNotNull(exploit0);
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      
      Carte.AILES = exploit0;
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.AILES.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.AILES.getType());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int4 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int4);
      assertEquals(int4, int1);
      assertNotEquals(int4, int2);
      assertNotEquals(int4, int0);
      assertNotEquals(int4, int3);
  }

  @Test(timeout = 4000)
  public void test10() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Exploit exploit0 = joueur0.acheterCarte();
      assertNotNull(exploit0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int0 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int0);
      
      Exploit exploit1 = Carte.NULL;
      assertNotNull(exploit1);
      assertSame(exploit1, exploit0);
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      
      Carte.NULL = exploit1;
      assertEquals("mais il a chang\u00E9 d'avis ", exploit1.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit1.getType());
      assertEquals("mais il a chang\u00E9 d'avis ", Carte.NULL.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.NULL.getType());
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(228, int1);
      assertNotEquals(int1, int0);
      
      int int2 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(300, int2);
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertNotEquals(int3, int2);
      assertNotEquals(int3, int1);
      assertEquals(int3, int0);
  }

  @Test(timeout = 4000)
  public void test11() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Face face0 = joueur0.acheterFace();
      assertNotNull(face0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Tours.joueur1 = joueur0;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur1.getJoueur());
      
      Carte.NULL = null;
      assertNull(null);
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(84, int0);
      
      Carte.SABOTS = null;
      Exploit.effetSabots(Tours.joueur1);
      assertSame(Tours.joueur1, joueur0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur1.getJoueur());
      
      Carte.HERBES = null;
      Carte.SABOTS = null;
      Carte.AILES = null;
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(156, int1);
      assertNotEquals(int1, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int2 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int2);
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertNotEquals(int3, int1);
      assertEquals(int3, int2);
      assertNotEquals(int3, int0);
      
      int int4 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(588, int4);
      assertNotEquals(int4, int0);
      assertNotEquals(int4, int3);
      assertNotEquals(int4, int1);
      assertNotEquals(int4, int2);
      
      int int5 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int5);
      assertNotEquals(int5, int1);
      assertNotEquals(int5, int4);
      assertNotEquals(int5, int0);
      assertEquals(int5, int2);
      assertEquals(int5, int3);
  }

  @Test(timeout = 4000)
  public void test12() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Tours.joueur2 = Tours.joueur1;
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("Joueur1 ", Tours.joueur2.getJoueur());
      
      Exploit exploit0 = Carte.PINCE;
      assertNotNull(exploit0);
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("La Pince", exploit0.getNom());
      
      exploit0.modStock();
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("La Pince", exploit0.getNom());
      
      Carte.HYDRE = exploit0;
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("La Pince", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.HYDRE.getType());
      assertEquals("La Pince", Carte.HYDRE.getNom());
      
      Carte.HYDRE.applyEffet(Tours.joueur1);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Carte.HYDRE = exploit0;
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("La Pince", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.HYDRE.getType());
      assertEquals("La Pince", Carte.HYDRE.getNom());
      
      Carte.AILES = exploit0;
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("La Pince", exploit0.getNom());
      assertEquals("La Pince", Carte.AILES.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.AILES.getType());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(146, int0);
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(320, int1);
      assertNotEquals(int1, int0);
      
      String string0 = joueur0.toString();
      assertNotNull(string0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nSOLAIRE 2\t\t\t\tLUNAIRE 1\tOr       :  0\nLUNAIRE 1\t\t\t\tOR 1\tSolaire  :  0\nLUNAIRE 1\t\t\t\tOR 1\tLunaire :  2\nLUNAIRE 1\t\t\t\tOR 1\tVictoire :  320\nLUNAIRE 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
      
      int int2 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(506, int2);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertNotEquals(int3, int0);
      assertNotEquals(int3, int1);
      assertNotEquals(int3, int2);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
  }

  @Test(timeout = 4000)
  public void test13() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Joueur joueur1 = Tours.joueur1;
      assertNull(joueur1);
      
      Type type0 = Type.CHOIX;
      Exploit exploit0 = Carte.ENIGME;
      assertNotNull(exploit0);
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("L'Enigme", exploit0.getNom());
      
      Integer integer0 = exploit0.stock;
      assertNotNull(integer0);
      assertEquals(4, (int)integer0);
      
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      assertNotNull(face0);
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("L'Enigme", exploit0.getNom());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(4, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getNbVICT());
      
      joueur0.changementFace(face0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("L'Enigme", exploit0.getNom());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(4, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertEquals(Type.CHOIX, face0.getType());
      assertNull(face0.getNbVICT());

      try {
          new Tours(joueur0, null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("partie.Tours", e);
      }
  }

  @Test(timeout = 4000)
  public void test14() {
      Joueur joueur0 = Tours.joueur2;
      assertNull(joueur0);
      
      Joueur joueur1 = new Joueur();
      assertNotNull(joueur1);
      assertEquals("Joueur2 ", joueur1.getJoueur());

      try {
          new Tours(null, joueur1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("partie.Tours", e);
      }
  }

  @Test(timeout = 4000)
  public void test15() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      joueur0.changementFace(null);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      // Undeclared exception!
      try { 
        tours0.partieStatPoint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Exploit exploit0 = Carte.HERBES;
      assertNotNull(exploit0);
      assertEquals("Les Herbes folles", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      
      Carte.MARTEAU = exploit0;
      assertEquals("Les Herbes folles", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals(TypeEffet.IMMEDIAT, Carte.MARTEAU.getType());
      assertEquals("Les Herbes folles", Carte.MARTEAU.getNom());
      
      exploit0.modStock();
      assertEquals("Les Herbes folles", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      
      Carte.ANCIEN = exploit0;
      assertEquals("Les Herbes folles", exploit0.getNom());
      assertEquals(TypeEffet.IMMEDIAT, exploit0.getType());
      assertEquals("Les Herbes folles", Carte.ANCIEN.getNom());
      assertEquals(TypeEffet.IMMEDIAT, Carte.ANCIEN.getType());
      
      Face face0 = joueur0.acheterFace();
      assertNotNull(face0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbLUN());
      
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(78, int0);
      
      int int1 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(150, int1);
      assertNotEquals(int1, int0);
      
      int int2 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(222, int2);
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      
      int int3 = tours0.partieStat();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(0, int3);
      assertNotEquals(int3, int2);
      assertNotEquals(int3, int0);
      assertNotEquals(int3, int1);
      
      int int4 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(366, int4);
      assertNotEquals(int4, int2);
      assertNotEquals(int4, int0);
      assertNotEquals(int4, int1);
      assertNotEquals(int4, int3);
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      int int5 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(788, int5);
      assertNotEquals(int5, int2);
      assertNotEquals(int5, int0);
      assertNotEquals(int5, int3);
      assertNotEquals(int5, int4);
      assertNotEquals(int5, int1);
  }

  @Test(timeout = 4000)
  public void test17() {
      Joueur joueur0 = Tours.joueur2;
      assertNull(joueur0);

      try {
          new Tours(null, null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("partie.Tours", e);
      }
  }

  @Test(timeout = 4000)
  public void test18() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      Random.setNextRandom((-991));
      int int0 = tours0.partieStatPoint();
      assertEquals("Joueur1 ", joueur0.getJoueur());
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test19() {
      Joueur joueur0 = new Joueur();
      assertNotNull(joueur0);
      assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      assertNotNull(tours0);
      assertEquals("Joueur1 ", joueur0.getJoueur());
      
      tours0.partieClassique();
      assertEquals("Joueur1 ", joueur0.getJoueur());
  }

  @Test(timeout = 4000)
  public void test20() {
      Random.setNextRandom(9);
      Joueur joueur0 = new Joueur();
      //  // Unstable assertion: assertNotNull(joueur0);
      //  // Unstable assertion: assertEquals("Joueur2 ", joueur0.getJoueur());
      
      Tours tours0 = new Tours(joueur0, joueur0);
      //  // Unstable assertion: assertNotNull(tours0);
      //  // Unstable assertion: assertEquals("Joueur1 ", joueur0.getJoueur());

      Tours.joueur1 = joueur0;
      //  // Unstable assertion: assertEquals("Joueur1 ", joueur0.getJoueur());
      //  // Unstable assertion: assertEquals("Joueur1 ", Tours.joueur1.getJoueur());

      //  // Unstable assertion: assertEquals("Joueur1 ", joueur0.getJoueur());
      //  // Unstable assertion: assertEquals("Joueur1 ", Tours.joueur1.getJoueur());
      
      tours0.partieClassique();
      //  // Unstable assertion: assertEquals("Joueur1 ", joueur0.getJoueur());

      Exploit exploit0 = Carte.SABOTS;
      //  // Unstable assertion: assertNotNull(exploit0);
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", exploit0.getNom());
      
      Carte.MEDUSE = exploit0;
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", exploit0.getNom());
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, Carte.MEDUSE.getType());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", Carte.MEDUSE.getNom());

      exploit0.modStock();
      //  // Unstable assertion: assertNotSame(exploit0, exploit1);
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", exploit0.getNom());
      //  // Unstable assertion: assertFalse(exploit0.equals((Object)exploit1));
      
      Carte.NULL = exploit0;
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, exploit0.getType());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", exploit0.getNom());
      //  // Unstable assertion: assertEquals("Les sabots d'argent", Carte.NULL.getNom());
      //  // Unstable assertion: assertEquals(TypeEffet.PERMANENT, Carte.NULL.getType());
      
      Random.setNextRandom(1326);

      tours0.partieClassique();

      
      Random.setNextRandom((-580));
      Random.setNextRandom(12);

  }

  @Test(timeout = 4000)
  public void test21() {
      Joueur joueur0 = new Joueur();
      Tours tours0 = new Tours(joueur0, joueur0);
      Exploit exploit0 = Carte.SABOTS;
      Carte.AILES = exploit0;
      Carte.SABOTS = exploit0;
      Carte.COFFRE = exploit0;
      Carte.afficheCartesJoueurs(Tours.joueur2);
      Carte.PASSEUR = Carte.COFFRE;
      Exploit.effetSabots(joueur0);
      Tours.joueur2 = Tours.joueur1;
      Carte.ANCIEN = Carte.SABOTS;
      tours0.partieStatPoint();
      tours0.partieClassique();
      int int0 = tours0.partieStat();
      int int1 = tours0.partieStat();
      assertEquals(int1, int0);
  }
}
