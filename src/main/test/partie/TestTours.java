

package partie;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bot.Joueur;
import de.Face;
import de.Ressource;
import de.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestTours extends TestTours2 {

  @Test(timeout = 4000)
  public void test0() {
      Random.setNextRandom(3);
      Joueur joueur0 = new Joueur();
      Joueur joueur1 = new Joueur();
      Face face0 = joueur1.acheterFace();
      joueur0.changementFace(face0);
      Tours tours0 = new Tours(joueur0, joueur0);
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieStat();
  }

  @Test(timeout = 4000)
  public void test1() {
      Joueur joueur0 = new Joueur();
      Tours tours0 = new Tours(joueur0, joueur0);
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieStat();
      joueur0.toString();
      tours0.partieStat();
      tours0.partieStat();
      joueur0.acheterCarte();
      tours0.partieClassique();
      tours0.partieClassique();
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      joueur0.changementFace(face0);
      tours0.partieStat();
      // Undeclared exception!
      try { 
        tours0.partieClassique();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.Face", e);
      }
  }

  @Test(timeout = 4000)
  public void test2() {
      Joueur joueur0 = new Joueur();
      joueur0.acheterCarte();
      Face face0 = joueur0.acheterFace();
      face0.AfficheFace();
      joueur0.toString();
      face0.AfficheFace();
      joueur0.acheterCarte();
      joueur0.changementFace(face0);
      Tours tours0 = new Tours(joueur0, joueur0);
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieClassique();
  }

  @Test(timeout = 4000)
  public void test3() {
      Joueur joueur0 = new Joueur();
      Tours tours0 = new Tours(joueur0, joueur0);
      tours0.partieStat();
      tours0.partieClassique();
  }

  @Test(timeout = 4000)
  public void test4() {
      Joueur joueur0 = new Joueur();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1334);
      Ressource ressource0 = Ressource.VICTOIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      joueur0.changementFace(face0);
      joueur0.acheterFace();
      Tours tours0 = new Tours(joueur0, joueur0);
      // Undeclared exception!
      try { 
        tours0.partieStat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }


  @Test(timeout = 4000)
  public void test6() {
      Random.setNextRandom(1143);
      Joueur joueur0 = new Joueur();
      Tours tours0 = new Tours(joueur0, joueur0);
      tours0.partieClassique();
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieStat();
      Random.setNextRandom(0);
      Random.setNextRandom(5);
      joueur0.acheterFace();
      tours0.partieStat();
      joueur0.acheterFace();
      tours0.partieStat();
      Random.setNextRandom(1143);
      tours0.partieStat();
      Random.setNextRandom(0);
      tours0.partieClassique();
      tours0.partieStat();
      tours0.partieStat();
      tours0.partieClassique();
      Random.setNextRandom((-883));
      Random.setNextRandom(7);
      Random.setNextRandom((-1841));
  }

}
