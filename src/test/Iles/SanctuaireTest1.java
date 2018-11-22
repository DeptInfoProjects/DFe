package Iles;

import org.junit.Test;
import static org.junit.Assert.*;
import De.Face;
import Iles.Sanctuaire;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class SanctuaireTest1 extends SanctuaireTest2 {
    
    @Test(timeout = 4000)
    public void test0() {
        Sanctuaire sanctuaire0 = new Sanctuaire();
        Face face0 = sanctuaire0.getSanctuaire(518);
        assertEquals(4, (int)face0.getValeur());
    }
    
    @Test(timeout = 4000)
    public void test1()  {
        Sanctuaire sanctuaire0 = new Sanctuaire();
        Face face0 = sanctuaire0.getSanctuaire(2);
        assertEquals(3, (int)face0.getValeur());
    }
    
    @Test(timeout = 4000)
    public void test2()  {
        Sanctuaire sanctuaire0 = new Sanctuaire();
        Face face0 = sanctuaire0.getSanctuaire(1);
        assertEquals(1, (int)face0.getValeur());
    }
    
    @Test(timeout = 4000)
    public void test3() {
        Sanctuaire sanctuaire0 = new Sanctuaire();
        Face face0 = sanctuaire0.getSanctuaire((-5));
        assertEquals(4, (int)face0.getValeur());
    }
}
