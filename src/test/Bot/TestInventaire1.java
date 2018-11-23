package Bot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;

import De.Face;
import De.Ressource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestInventaire1 extends TestInventaire2 {

    @Test(timeout = 4000)
    public void test00() {
        Inventaire inventaire0 = new Inventaire();
        Ressource ressource0 = Ressource.OR;
        Integer integer0 = 0;
        Integer integer1 = 2;
        Ressource ressource1 = Ressource.LUNAIRE;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource1, ressource1, ressource0).when(face0).getRes();
        doReturn(integer0, integer1).when(face0).getValeur();
        inventaire0.adderFace(face0);
        assertEquals(2, inventaire0.getNbLunaire());
    }

    @Test(timeout = 4000)
    public void test01() {
        Inventaire inventaire0 = new Inventaire();
        Ressource ressource0 = Ressource.OR;
        Integer integer0 = 0;
        Ressource ressource1 = Ressource.SOLAIRE;
        Integer integer1 = 2;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, null, null, null).when(face0).getRes();
        doReturn(integer0).when(face0).getValeur();
        inventaire0.adderFace(face0);
        assertEquals(0, inventaire0.getNbSolaire());
    }

    @Test(timeout = 4000)
    public void test02() {
        Inventaire inventaire0 = new Inventaire();
        Ressource ressource0 = Ressource.OR;
        Integer integer0 = 4;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource0, ressource0, ressource0).when(face0).getRes();
        doReturn(integer0).when(face0).getValeur();
        inventaire0.adderFace(face0);
        assertEquals(4, inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test03() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1), 458, 458, 458);
        int int0 = inventaire0.getNbVictoire();
        assertEquals(458, inventaire0.getNbLunaire());
        assertEquals(458, int0);
    }

    @Test(timeout = 4000)
    public void test04() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1375), 1806, 0, (-1375));
        int int0 = inventaire0.getNbSolaire();
        assertEquals((-1375), inventaire0.getNbVictoire());
        assertEquals(1806, int0);
    }

    @Test(timeout = 4000)
    public void test05() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1), (-1019), 2787, 1);
        int int0 = inventaire0.getNbSolaire();
        assertEquals((-1), inventaire0.getNbOR());
        assertEquals((-1019), int0);
    }

    @Test(timeout = 4000)
    public void test06() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbOR(1787);
        int int0 = inventaire0.getNbOR();
        assertEquals(1787, int0);
    }

    @Test(timeout = 4000)
    public void test07() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1), (-1019), 2787, 1);
        int int0 = inventaire0.getNbOR();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test08() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire(1481, 1481, 3785, 3785);
        int int0 = inventaire0.getNbLunaire();
        assertEquals(1481, inventaire0.getNbOR());
        assertEquals(3785, int0);
    }

    @Test(timeout = 4000)
    public void test09() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire(2607, 2607, (-57), 1);
        int int0 = inventaire0.getNbLunaire();
        assertEquals(2607, inventaire0.getNbOR());
        assertEquals((-57), int0);
    }

    @Test(timeout = 4000)
    public void test10() {
        Inventaire inventaire0 = new Inventaire();
        Ressource ressource0 = Ressource.LUNAIRE;
        Ressource ressource1 = Ressource.VICTOIRE;
        Integer integer0 = (-4);
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource1, ressource1, ressource1).when(face0).getRes();
        doReturn(integer0).when(face0).getValeur();
        inventaire0.adderFace(face0);
        assertEquals((-4), inventaire0.getNbVictoire());
    }

    @Test(timeout = 4000)
    public void test11() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbSolaire();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test12() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbOR(0);
        inventaire0.setNbOR(0);
        Ressource ressource0 = Ressource.VICTOIRE;
        inventaire0.setNbOR(0);
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource0, null, null).when(face0).getRes();
        inventaire0.adderFace(face0);
        assertEquals(0, inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test13() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1124), 2, 1, (-461));
        int int0 = inventaire0.getNbVictoire();
        assertEquals((-1124), inventaire0.getNbOR());
        assertEquals((-461), int0);
    }

    @Test(timeout = 4000)
    public void test14() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbLunaire();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test15() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbVictoire();
        assertEquals(0, int0);
    }
}
