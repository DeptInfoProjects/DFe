
package bot;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iles.Carte;
import iles.Exploit;
import de.De;
import de.Face;
import de.Ressource;
import de.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestJoueur extends TestJoueurbis {

  @org.junit.Test(timeout = 4000)
  public void test0() {
      Joueur joueur0 = new Joueur();
      De de0 = joueur0.getD1();
      joueur0.changementFace(de0.FACE2);
      joueur0.changementFace(de0.FACE5);
      joueur0.changementFace(de0.FACE6);
      De de1 = joueur0.getD2();
      joueur0.changementFace(de0.FACE1);
      joueur0.changementFace(de0.FACE3);
      joueur0.changementFace(de1.FACE2);
      assertNotEquals(de1, de0);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() {
      Joueur joueur0 = new Joueur();
      Carte.NULL = null;
      Exploit exploit0 = joueur0.acheterCarte();
      assertNull(exploit0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() {
      Joueur joueur0 = new Joueur();
      joueur0.changementFace(null);
      // Undeclared exception!
      try { 
        joueur0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Joueur", e);
      }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() {
      Joueur joueur0 = new Joueur();
      De de0 = joueur0.getD2();
      joueur0.changementFace(null);
      // Undeclared exception!
      try { 
        joueur0.changementFace(de0.FACE4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() {
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
  public void test5() {
      Joueur joueur0 = new Joueur();
      Inventaire inventaire0 = joueur0.getInventaireJoueur();
      assertEquals(0, inventaire0.getNbSolaire());
  }

  @org.junit.Test(timeout = 4000)
  public void test6() {
      Joueur joueur0 = new Joueur();
      Random.setNextRandom(2331);
      Exploit exploit0 = joueur0.acheterCarte();
      assertEquals("mais il a chang\u00E9 d'avis ", exploit0.getNom());
  }

  @org.junit.Test(timeout = 4000)
  public void test7() {
      Joueur joueur0 = new Joueur();
      Face face0 = joueur0.acheterFace();
      joueur0.changementFace(face0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
  }

  @org.junit.Test(timeout = 4000)
  public void test8() {
      Joueur joueur0 = new Joueur();
      String string0 = joueur0.toString();
      assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() {
      Joueur joueur0 = new Joueur();
      De de0 = joueur0.getD2();
      joueur0.changementFace(de0.FACE1);
      joueur0.changementFace(de0.FACE1);
  }
}
