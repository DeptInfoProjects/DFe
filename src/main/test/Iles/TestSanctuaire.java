

package Iles;

import org.junit.Test;
import static org.junit.Assert.*;

import de.Face;
import de.Ressource;
import de.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestSanctuaire extends TestSanctuaire2 {

  @Test(timeout = 4000)
  public void test00() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Random.setNextRandom(1933);
      Face face0 = sanctuaire0.getSanctuaire(7);
      assertEquals(Type.CHOIX, face0.getType());
  }

  @Test(timeout = 4000)
  public void test01() {
      Random.setNextRandom(6);
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(7);
      assertEquals(Type.PLUS, face0.getType());
      assertEquals(1, (int)face0.getNbSOL());
  }

  @Test(timeout = 4000)
  public void test02() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(7);
      assertEquals(Ressource.VICTOIRE, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
  }

  @Test(timeout = 4000)
  public void test03() {
      Random.setNextRandom((-1141));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(6);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.VICTOIRE, face0.getRes());
  }

  @Test(timeout = 4000)
  public void test04() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(5);
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(2, (int)face0.getValeur());
  }

  @Test(timeout = 4000)
  public void test05() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(4);
      assertEquals(Type.CHOIX, face0.getType());
  }

  @Test(timeout = 4000)
  public void test06() {
      Random.setNextRandom(6);
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(3);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(6, (int)face0.getValeur());
  }

  @Test(timeout = 4000)
  public void test07() {
      Random.setNextRandom(6);
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(6);
      assertEquals(Ressource.SOLAIRE, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(2, (int)face0.getValeur());
  }

  @Test(timeout = 4000)
  public void test08() {
      Random.setNextRandom((-337));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(3);
      assertEquals(Type.CHOIX, face0.getType());
      assertEquals(1, (int)face0.getNbSOL());
      assertEquals(1, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbVICT());
  }

  @Test(timeout = 4000)
  public void test09() {
      Random.setNextRandom((-337));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire((-337));
      assertEquals(Type.PLUS, face0.getType());
  }

  @Test(timeout = 4000)
  public void test10() {
      Random.setNextRandom((-175));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(3);
      assertEquals(Type.PLUS, face0.getType());
      assertEquals(0, (int)face0.getNbOR());
      assertEquals(1, (int)face0.getNbVICT());
      assertEquals(0, (int)face0.getNbLUN());
  }

  @Test(timeout = 4000)
  public void test11() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(3);
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals(1, (int)face0.getNbLUN());
      assertEquals(2, (int)face0.getNbOR());
      assertEquals(Type.PLUS, face0.getType());
      assertEquals(0, (int)face0.getNbSOL());
  }

  @Test(timeout = 4000)
  public void test12() {
      Random.setNextRandom((-1027));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(2);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.SOLAIRE, face0.getRes());
  }

  @Test(timeout = 4000)
  public void test13() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(2);
      assertEquals(4, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
  }

  @Test(timeout = 4000)
  public void test14() {
      Random.setNextRandom((-175));
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(1);
      assertEquals(3, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
  }

  @Test(timeout = 4000)
  public void test15() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(1);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
  }
}
