package Stat;

import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestStat1 extends TestStat2 {

    @Test(timeout = 4000)
    public void test0() {
        String[] stringArray0 = new String[2];
        // Undeclared exception!
        Stat.main(stringArray0);
    }
}
