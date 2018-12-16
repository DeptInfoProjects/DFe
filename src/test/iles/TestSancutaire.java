

package iles;

import de.Face;
import de.Ressource;
import de.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestSancutaire extends TestSanctuaire2 {

  @Test(timeout = 4000)
  public void test0() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(7);
      assertEquals(Ressource.VICTOIRE, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
  }

  @Test(timeout = 4000)
  public void test1() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(6);
      assertEquals(Ressource.SOLAIRE, face0.getRes());
  }

  @Test(timeout = 4000)
  public void test2() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(5);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertEquals(2, (int)face0.getValeur());
  }

  @Test(timeout = 4000)
  public void test3() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(4);
      assertEquals(Type.CHOIX, face0.getType());
  }

  @Test(timeout = 4000)
  public void test4() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(3);
      assertEquals(Type.PLUS, face0.getType());
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals(1, (int)face0.getNbLUN());
      assertEquals(2, (int)face0.getNbOR());
  }

  @Test(timeout = 4000)
  public void test5() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(2);
      assertEquals(4, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
  }

  @Test(timeout = 4000)
  public void test6() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire(1);
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
  }

  @Test(timeout = 4000)
  public void test7() {
      Sanctuaire sanctuaire0 = new Sanctuaire();
      Face face0 = sanctuaire0.getSanctuaire((-3207));
      assertEquals(Type.PLUS, face0.getType());
  }
}
