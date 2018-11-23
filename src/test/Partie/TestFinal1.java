package Partie;

import org.junit.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestFinal1 extends TestFinal2 {
    
    @Test(timeout = 4000)
    public void test0()  {
        Final final0 = new Final();
    }
    
    @Test(timeout = 4000)
    public void test1() {
        String[] stringArray0 = new String[1];
        Final.main(stringArray0);
        assertEquals(1, stringArray0.length);
    }
}
