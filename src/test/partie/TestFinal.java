

package partie;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestFinal extends TestFinal2 {

  @Test(timeout = 4000)
  public void test0() {
      String[] stringArray0 = new String[5];
      Final.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }


}
