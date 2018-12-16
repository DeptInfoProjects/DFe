

package bot;

import de.De;
import de.Face;
import de.Ressource;
import de.Type;
import iles.Carte;
import iles.Exploit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import partie.Tours;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestJoueur extends TestJoueur2 {

  @org.junit.Test(timeout = 4000)
  public void test00() {
      Joueur joueur0 = new Joueur();
      Carte.NULL = null;
      Exploit exploit0 = joueur0.acheterCarte();
      assertEquals("Joueur2 ", joueur0.getJoueur());
      assertNull(exploit0);
  }

  @org.junit.Test(timeout = 4000)
  public void test02() {
      Joueur joueur0 = new Joueur();
      joueur0.changementFace(null);
      // Undeclared exception!
      try { 
        joueur0.changementFace(null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @org.junit.Test(timeout = 4000)
  public void test03() {
      Joueur joueur0 = new Joueur();
      joueur0.changementFace(null);
      // Undeclared exception!
      try { 
        joueur0.acheterFace();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @org.junit.Test(timeout = 4000)
  public void test04() {
      Joueur joueur0 = new Joueur();
      String string0 = joueur0.getJoueur();
      assertEquals("Joueur2 ", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test05() {
      Joueur joueur0 = new Joueur();
      Face face0 = joueur0.acheterFace();
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
  }

  @org.junit.Test(timeout = 4000)
  public void test06() {
      Joueur joueur0 = new Joueur();
      Tours.joueur1 = joueur0;
      String string0 = joueur0.getJoueur();
      assertEquals("Joueur1 ", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test07() {
      Joueur joueur0 = new Joueur();
      Exploit exploit0 = joueur0.acheterCarte();
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
      assertEquals("Joueur2 ", joueur0.getJoueur());
  }

  @org.junit.Test(timeout = 4000)
  public void test08() {
      Joueur joueur0 = new Joueur();
      String string0 = joueur0.toString();
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test09() {
      Joueur joueur0 = new Joueur();
      Inventaire inventaire0 = joueur0.getInventaireJoueur();
      assertEquals(0, inventaire0.getNbSolaire());
  }

  @org.junit.Test(timeout = 4000)
  public void test10() {
      Joueur joueur0 = new Joueur();
      De de0 = joueur0.getD1();
      assertNotNull(de0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() {
      Joueur joueur0 = new Joueur();
      De de0 = joueur0.getD2();
      joueur0.changementFace(de0.FACE1);
      joueur0.changementFace(de0.FACE3);
      assertEquals("Joueur2 ", joueur0.getJoueur());
  }
}
