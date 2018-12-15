

package bot;

import iles.Carte;
import de.Face;
import de.Ressource;
import de.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestInventaire extends TestInventaire2 {

    @Test(timeout = 4000)
    public void test00() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbSolaire((-240));
        assertEquals((-240), inventaire0.getNbSolaire());
    }

    @Test(timeout = 4000)
    public void test01() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbLunaire(2719);
        assertEquals(2719, inventaire0.getNbLunaire());
    }

    @Test(timeout = 4000)
    public void test02() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        inventaire0.setInventaire((-2035), 0, 10, 1371, list0);
        int int0 = inventaire0.getNbVictoire();
        assertEquals((-2035), inventaire0.getNbOR());
        assertEquals(1371, int0);
    }

    @Test(timeout = 4000)
    public void test03() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire(0, (-240), 0, (-1), list0);
        int int0 = inventaire1.getNbVictoire();
        assertEquals(0, inventaire1.getNbOR());
        assertEquals((-240), inventaire1.getNbSolaire());
        assertEquals((-1), int0);
        assertEquals(0, inventaire1.getNbLunaire());
    }

    @Test(timeout = 4000)
    public void test04() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire(21, 21, 0, 21, list0);
        int int0 = inventaire1.getNbSolaire();
        assertEquals(0, inventaire1.getNbLunaire());
        assertEquals(21, inventaire1.getNbOR());
        assertEquals(21, inventaire1.getNbVictoire());
        assertEquals(21, int0);
    }

    @Test(timeout = 4000)
    public void test05() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire(0, (-240), 0, (-1), list0);
        int int0 = inventaire1.getNbSolaire();
        assertEquals(0, inventaire1.getNbOR());
        assertEquals((-1), inventaire1.getNbVictoire());
        assertEquals(0, inventaire1.getNbLunaire());
        assertEquals((-240), int0);
    }

    @Test(timeout = 4000)
    public void test06() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire(595, 595, 595, 2159, list0);
        int int0 = inventaire1.getNbOR();
        assertEquals(595, int0);
        assertEquals(595, inventaire1.getNbSolaire());
        assertEquals(2159, inventaire1.getNbVictoire());
        assertEquals(595, inventaire1.getNbLunaire());
    }

    @Test(timeout = 4000)
    public void test07() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbOR((-3182));
        int int0 = inventaire0.getNbOR();
        assertEquals((-3182), int0);
    }

    @Test(timeout = 4000)
    public void test08() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire(0, (-483), 269, 0, list0);
        int int0 = inventaire1.getNbLunaire();
        assertEquals(0, inventaire1.getNbOR());
        assertEquals((-483), inventaire1.getNbSolaire());
        assertEquals(269, int0);
        assertEquals(0, inventaire1.getNbVictoire());
    }

    @Test(timeout = 4000)
    public void test09() {
        Inventaire inventaire0 = new Inventaire();
        List<Carte> list0 = inventaire0.getCartes();
        Inventaire inventaire1 = new Inventaire((-1975), (-1975), (-1975), (-2206), list0);
        int int0 = inventaire1.getNbLunaire();
        assertEquals((-1975), int0);
        assertEquals((-2206), inventaire1.getNbVictoire());
        assertEquals((-1975), inventaire1.getNbSolaire());
        assertEquals((-1975), inventaire1.getNbOR());
    }

    @Test(timeout = 4000)
    public void test10() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1), 6, 6, 0, null);
        inventaire0.getCartes();
        assertEquals((-1), inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test11() {
        Inventaire inventaire0 = new Inventaire();
        Carte carte0 = mock(Carte.class, new ViolatedAssumptionAnswer());
        doReturn("3%LN#$f%)~$SM ,~}w").when(carte0).toString();
        inventaire0.addCartes(carte0);
        List<Carte> list0 = inventaire0.getCartes();
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test12() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setInventaire((-1), 6, 6, 0, null);
        Carte carte0 = mock(Carte.class, new ViolatedAssumptionAnswer());
        // Undeclared exception!
        try {
            inventaire0.addCartes(carte0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("bot.Inventaire", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() {
        Inventaire inventaire0 = new Inventaire();
        inventaire0.setNbVictoire((-3182));
        assertEquals((-3182), inventaire0.getNbVictoire());
    }

    @Test(timeout = 4000)
    public void test14() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbOR();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test15() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbSolaire();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test16() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbLunaire();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test17() {
        Inventaire inventaire0 = new Inventaire();
        int int0 = inventaire0.getNbVictoire();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test18() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.CHOIX;
        Integer integer0 = (-4820);
        Integer integer1 = 1103;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(integer1).when(face0).getNbOR();
        doReturn(integer1, integer0).when(face0).getNbSOL();
        doReturn(integer0).when(face0).getNbVICT();
        doReturn(type0, type0, type0, type0).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals((-4820), inventaire0.getNbVictoire());
    }

    @Test(timeout = 4000)
    public void test19() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.NORMAL;
        Type type1 = Type.CHOIX;
        Integer integer0 = 1103;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(integer0).when(face0).getNbOR();
        doReturn(integer0).when(face0).getNbSOL();
        doReturn(integer0).when(face0).getNbVICT();
        doReturn(type1, type1, type1, type0).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals(1103, inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test20() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.CHOIX;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(type0, type0, null).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals(0, inventaire0.getNbSolaire());
    }

    @Test(timeout = 4000)
    public void test21() {
        Inventaire inventaire0 = new Inventaire();
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals(0, inventaire0.getNbSolaire());
    }

    @Test(timeout = 4000)
    public void test22() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.NORMAL;
        Ressource ressource0 = Ressource.LUNAIRE;
        Integer integer0 = (-4820);
        Ressource ressource1 = Ressource.VICTOIRE;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource0, ressource0, ressource1).when(face0).getRes();
        doReturn(type0).when(face0).getType();
        doReturn(integer0, (Integer) null).when(face0).getValeur();
        // Undeclared exception!
        try {
            inventaire0.adderFace(face0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("bot.Inventaire", e);
        }
    }

    @Test(timeout = 4000)
    public void test23() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.NORMAL;
        Ressource ressource0 = Ressource.LUNAIRE;
        Integer integer0 = (-4820);
        Ressource ressource1 = Ressource.SOLAIRE;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0, ressource1, ressource1, ressource1).when(face0).getRes();
        doReturn(type0).when(face0).getType();
        doReturn(integer0).when(face0).getValeur();
        inventaire0.adderFace(face0);
        assertEquals((-4820), inventaire0.getNbSolaire());
    }

    @Test(timeout = 4000)
    public void test24() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.NORMAL;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null).when(face0).getRes();
        doReturn(type0).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals(0, inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test25() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.PLUS;
        Integer integer0 = 2331;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(integer0).when(face0).getNbLUN();
        doReturn(integer0).when(face0).getNbOR();
        doReturn(integer0).when(face0).getNbSOL();
        doReturn(integer0).when(face0).getNbVICT();
        doReturn(type0, type0).when(face0).getType();
        inventaire0.adderFace(face0);
        assertEquals(2331, inventaire0.getNbVictoire());
    }

    @Test(timeout = 4000)
    public void test26() {
        Inventaire inventaire0 = new Inventaire();
        Type type0 = Type.CHOIX;
        Integer integer0 = 1490;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(type0, type0, null).when(face0).getType();
        inventaire0.adderFace(face0);
    }
}
