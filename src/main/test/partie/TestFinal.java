
package partie;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestFinal extends TestFinal2 {

  @Test(timeout = 4000)
  public void test0() {
      String[] stringArray0 = new String[0];
      Final.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

}
