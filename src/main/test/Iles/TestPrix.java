

package Iles;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestPrix extends TestPrix2 {

  @Test(timeout = 4000)
  public void test0() {
      Prix prix0 = new Prix(1169, 1169);
      int int0 = prix0.getPrix();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1() {
      Prix prix0 = new Prix(0, 984);
      int int0 = prix0.getPrix();
      assertEquals(984, int0);
  }

  @Test(timeout = 4000)
  public void test2() {
      Prix prix0 = new Prix((-431), 0);
      int int0 = prix0.getPrix();
      assertEquals((-431), int0);
  }

  @Test(timeout = 4000)
  public void test3() {
      Prix prix0 = new Prix((-1), (-1));
      int int0 = prix0.getPrix();
      assertEquals(0, int0);
  }
}
