

package De;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestRessource1 extends TestRessource2 {

  @Test(timeout = 4000)
  public void test0() {
      Ressource[] ressourceArray0 = Ressource.values();
      assertEquals(4, ressourceArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()    {
      Ressource ressource0 = Ressource.valueOf("SOLAIRE");
      assertEquals(Ressource.SOLAIRE, ressource0);
  }
}
