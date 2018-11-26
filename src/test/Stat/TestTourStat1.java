

package Stat;

import Bot.Inventaire;
import Bot.Joueur;
import De.De;
import De.Face;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestTourStat1 extends TestTourStat2 {

    @Test(timeout = 4000)
    public void test0() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(inventaire0, (Inventaire) null).when(joueur0).getInventaireJoueur();
        try {
            new TourStat(joueur0, joueur0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("Stat.TourStat", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de0 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face0).when(de0).getFace();
        Inventaire inventaire1 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        De de1 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(de1).getFace();
        Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de2 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, null).when(de2).getFace();
        De de3 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, null).when(de3).getFace();
        Inventaire inventaire2 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        doReturn(2, 2, 3, 2).when(inventaire2).getNbVictoire();
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(null, face1, null, null, null).when(joueur0).AcheterFace(any(Bot.Joueur.class));
        doReturn(de0, de2, de2, de2, de3).when(joueur0).getD1();
        doReturn(de1, de2, de2, de3, de3).when(joueur0).getD2();
        doReturn(inventaire0, inventaire1, inventaire2, inventaire2, inventaire2).when(joueur0).getInventaireJoueur();
        TourStat tourStat0 = new TourStat(joueur0, joueur0);
        assertNotNull(tourStat0);

        int int0 = tourStat0.Partie();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test2() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de0 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face0).when(de0).getFace();
        Inventaire inventaire1 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        De de1 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(de1).getFace();
        Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de2 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, null).when(de2).getFace();
        De de3 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face1, null, null, null, null).when(de3).getFace();
        Inventaire inventaire2 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        doReturn(2, 2418).when(inventaire2).getNbVictoire();
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, face2).when(joueur0).AcheterFace(any(Bot.Joueur.class));
        doReturn(de0, de2, de2, de2, de3).when(joueur0).getD1();
        doReturn(de1, de2, de3, de3, de2).when(joueur0).getD2();
        doReturn(inventaire0, inventaire1, inventaire2, inventaire2, inventaire2).when(joueur0).getInventaireJoueur();
        TourStat tourStat0 = new TourStat(joueur0, joueur0);
        assertNotNull(tourStat0);

        int int0 = tourStat0.Partie();
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test3() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de0 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face0).when(de0).getFace();
        Inventaire inventaire1 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        De de1 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(de1).getFace();
        Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
        De de2 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, null).when(de2).getFace();
        De de3 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, face1, null).when(de3).getFace();
        Inventaire inventaire2 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        doReturn(2418, 0, 0, 0).when(inventaire2).getNbVictoire();
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(null, null, null, null, face2).when(joueur0).AcheterFace(any(Bot.Joueur.class));
        doReturn(de0, de2, de2, de2, de3).when(joueur0).getD1();
        doReturn(de1, de2, de3, de3, de2).when(joueur0).getD2();
        doReturn(inventaire0, inventaire1, inventaire2, inventaire2, inventaire2).when(joueur0).getInventaireJoueur();
        TourStat tourStat0 = new TourStat(joueur0, joueur0);
        int int0 = tourStat0.Partie();
        assertEquals(0, int0);
    }
}

