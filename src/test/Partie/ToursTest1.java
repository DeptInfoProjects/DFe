package Partie;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Bot.Inventaire;
import Bot.Joueur;
import De.De;
import De.Face;
import De.Ressource;
import Partie.Tours;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ToursTest1 extends ToursTest2 {
    
    @Test(timeout = 4000)
    public void test0() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Ressource ressource0 = Ressource.OR;
        Integer integer0 = -1;
        Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(ressource0).when(face0);
        doReturn(integer0).when(face0);
        De de0 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face0).when(de0).getFace();
        Inventaire inventaire1 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(face1);
        doReturn(null).when(face1);
        De de1 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face1).when(de1).getFace();
        Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(face2);
        doReturn(null).when(face2);
        Face face3 = mock(Face.class, new ViolatedAssumptionAnswer());
        doReturn(null).when(face3);
        doReturn(null).when(face3);
        De de2 = mock(De.class, new ViolatedAssumptionAnswer());
        doReturn(face2, face3).when(de2).getFace();
        Inventaire inventaire2 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(null, (Face) null).when(joueur0).AcheterFace(any(Bot.Joueur.class));
        doReturn(de0, de2, null).when(joueur0);
        doReturn(de1, de2).when(joueur0);
        doReturn(inventaire0, inventaire1, inventaire2, inventaire2, inventaire2).when(joueur0);
        Tours tours0 = new Tours(joueur0, joueur0);
        // Undeclared exception!
        try {
            tours0.Partie();
            fail("Expecting exception: NullPointerException");
            
        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("Partie.Tours", e);
        }
    }
    
    @Test(timeout = 4000)
    public void test1() {
        Inventaire inventaire0 = mock(Inventaire.class, new ViolatedAssumptionAnswer());
        Joueur joueur0 = mock(Joueur.class, new ViolatedAssumptionAnswer());
        doReturn(inventaire0, (Inventaire) null).when(joueur0);
        try {
            new Tours(joueur0, joueur0);
            fail("Expecting exception: NullPointerException");
            
        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("Partie.Tours", e);
        }
    }
}
