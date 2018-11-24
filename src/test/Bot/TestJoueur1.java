package Bot;
import De.De;
import De.Face;
import De.Ressource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestJoueur1 extends TestJoueur2 {

    @Test(timeout = 4000)
    public void test0()  {
        Joueur joueur0 = new Joueur();
        Random.setNextRandom(1667);
        Face face0 = joueur0.AcheterFace(joueur0);
        assertEquals(Ressource.OR, face0.getRes());
    }

    @Test(timeout = 4000)
    public void test1() {
        Joueur joueur0 = new Joueur();
        // Undeclared exception!
        try {
            joueur0.changementFace(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() {
        Joueur joueur0 = new Joueur();
        // Undeclared exception!
        try {
            joueur0.AcheterFace(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("Bot.Joueur", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() {
        Joueur joueur0 = new Joueur();
        Inventaire inventaire0 = joueur0.getInventaireJoueur();
        assertEquals(0, inventaire0.getNbOR());
    }

    @Test(timeout = 4000)
    public void test4() {
        Joueur joueur0 = new Joueur();
        De de0 = joueur0.getD2();
        joueur0.changementFace(de0.FACE5);
    }

    @Test(timeout = 4000)
    public void test5() {
        Joueur joueur0 = new Joueur();
        De de0 = joueur0.getD1();
        joueur0.changementFace(de0.FACE6);
        De de1 = joueur0.getD2();
        joueur0.changementFace(de1.FACE6);
        joueur0.changementFace(de1.FACE6);
        joueur0.changementFace(de0.FACE6);
        assertNotSame(de0, de1);
    }

    @Test(timeout = 4000)
    public void test6() {
        Joueur joueur0 = new Joueur();
        String string0 = joueur0.toString();
        assertEquals("D\u00E9 1 :\t\t\tD\u00E9 2 : \t\tInventaire : \nOR 1\t\t\t\tOR 1\tOr       :  0\nOR 1\t\t\t\tOR 1\tSolaire  :  0\nOR 1\t\t\t\tOR 1\tLunaire :  0\nOR 1\t\t\t\tOR 1\tVictoire :  0\nOR 1\t\t\t\tLUNAIRE 1\nSOLAIRE 1\t\t\t\tVICTOIRE 2\n", string0);
    }
}
