
package iles;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestPrix extends TestPrix2 {

  @Test(timeout = 4000)
  public void test0() {
      Prix prix0 = new Prix(261, 261);
      int int0 = prix0.getPrix();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1() {
      Prix prix0 = new Prix(1740, 0);
      int int0 = prix0.getPrix();
      assertEquals(1740, int0);
  }

  @Test(timeout = 4000)
  public void test2() {
      Prix prix0 = new Prix(0, (-3896));
      int int0 = prix0.getPrix();
      assertEquals((-3896), int0);
  }

  @Test(timeout = 4000)
  public void test3() {
      Prix prix0 = new Prix((-1509), (-1509));
      int int0 = prix0.getPrix();
      assertEquals(0, int0);
  }
}
