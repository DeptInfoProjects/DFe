

package De;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestFace1 extends TestFace2 {

  @Test(timeout = 4000)
  public void test0()  {
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(null, ressource0);
      Integer integer0 = face0.getValeur();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  {
      Integer integer0 = 1;
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  {
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  {
      Integer integer0 = (-2729);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals((-2729), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test4()  {
      Integer integer0 = 2;
      Ressource ressource0 = Ressource.VICTOIRE;
      Face face0 = new Face(integer0, ressource0);
      Ressource ressource1 = face0.getRes();
      assertSame(ressource1, ressource0);
  }

  @Test(timeout = 4000)
  public void test5()  {
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(integer0, ressource0);
      face0.setValeur(integer0);
      assertEquals(Ressource.LUNAIRE, face0.getRes());
  }

  @Test(timeout = 4000)
  public void test6()  {
      Integer integer0 = 1582;
      Face face0 = new Face(integer0, null);
      face0.getRes();
  }

  @Test(timeout = 4000)
  public void test7()  {
      Integer integer0 = (-310);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals((-310), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test8()  {
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(null, ressource0);
      face0.setRes(ressource0);
      assertNull(face0.getValeur());
  }
}
