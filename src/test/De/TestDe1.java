
package De;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestDe1 extends TestDe2 {

    @Test(timeout = 4000)
    public void test00() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE6);
        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = de0.getFace();
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertNotEquals(string3, string1);
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string2);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string0);
        assertEquals(string5, string4);
        assertNotEquals(string5, string2);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face3);
        assertNotSame(face4, face2);
        assertSame(face4, face1);
        assertNotSame(face4, face3);
        assertSame(face4, face0);
        assertNotSame(face0, face3);
        assertSame(face0, face1);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertSame(face1, face4);
        assertSame(face1, face0);
        assertNotSame(face1, face2);
        assertNotSame(face1, face3);
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face0);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face5);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face5);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string1);
        assertEquals("OR 2\nVICTOIRE 1\nOR 2\nOR 1\nOR 1\nSOLAIRE 1", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face5);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face5);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        Face face6 = de0.FACE3;
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertSame(face6, face3);
        assertEquals(2, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face3);
        assertNotSame(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face1);
        assertNotSame(face7, face4);
        assertSame(face7, face5);
        assertNotSame(face7, face3);
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face0);
        assertSame(face8, face2);
        assertNotSame(face8, face4);
        assertNotSame(face8, face3);
        assertNotSame(face8, face6);
        assertNotSame(face8, face5);
        assertNotSame(face8, face7);
        assertNotSame(face8, face1);
        assertNotSame(face8, face0);
        assertEquals(2, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face8);
        assertNotSame(face0, face3);
        assertNotSame(face0, face7);
        assertSame(face0, face1);
        assertNotSame(face0, face6);
        assertNotSame(face0, face5);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertNotSame(face0, face8);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(2, (int) face0.getValeur());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotSame(face9, face0);
        assertNotSame(face9, face1);
        assertNotSame(face9, face4);
        assertNotSame(face9, face7);
        assertNotSame(face9, face5);
        assertNotSame(face9, face8);
        assertNotSame(face9, face3);
        assertNotSame(face9, face6);
        assertNotSame(face9, face2);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        String string7 = de0.toString();
        assertNotEquals(string7, string6);
        assertEquals(string7, string5);
        assertNotEquals(string7, string2);
        assertEquals(string7, string4);
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string0);
        assertNotEquals(string7, string3);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        Face face10 = de0.FACEMIN();
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face2);
        assertNotSame(face10, face0);
        assertNotSame(face10, face4);
        assertNotSame(face10, face1);
        assertSame(face10, face9);
        assertNotSame(face10, face7);
        assertNotSame(face10, face8);
        assertNotSame(face10, face3);
        assertNotSame(face10, face6);
        assertNotSame(face10, face5);
        assertNotSame(face10, face2);
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Random.setNextRandom(2537);
        Face face11 = De.compare2Face(face6, de0.FACE6);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face4);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face10);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face7);
        assertNotSame(face11, face0);
        assertSame(face11, face3);
        assertNotSame(face11, face1);
        assertNotSame(face11, face2);
        assertNotSame(face11, face10);
        assertNotSame(face11, face7);
        assertNotSame(face11, face8);
        assertNotSame(face11, face5);
        assertNotSame(face11, face9);
        assertNotSame(face11, face4);
        assertSame(face11, face6);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face8);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face10);
        assertSame(face6, face11);
        assertNotSame(face6, face5);
        assertNotSame(face6, face9);
        assertSame(face6, face3);
        assertNotSame(face6, face7);
        assertEquals(Ressource.OR, face11.getRes());
        assertEquals(2, (int) face11.getValeur());
        assertEquals(2, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face11);

        Face face12 = de0.FACEMIN();
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face8);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face7);
        assertNotSame(face12, face3);
        assertNotSame(face12, face4);
        assertNotSame(face12, face1);
        assertNotSame(face12, face2);
        assertNotSame(face12, face11);
        assertSame(face12, face9);
        assertNotSame(face12, face8);
        assertNotSame(face12, face0);
        assertNotSame(face12, face6);
        assertNotSame(face12, face5);
        assertNotSame(face12, face7);
        assertSame(face12, face10);
        assertEquals(Ressource.OR, face12.getRes());
        assertEquals(1, (int) face12.getValeur());
        assertNotNull(face12);

        Face face13 = de0.getFace();
        assertNotEquals(face13, face12);
        assertNotEquals(face13, face1);
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face10);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face6);
        assertNotEquals(face13, face0);
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face8);
        assertNotSame(face13, face12);
        assertNotSame(face13, face1);
        assertNotSame(face13, face5);
        assertNotSame(face13, face4);
        assertNotSame(face13, face11);
        assertNotSame(face13, face10);
        assertNotSame(face13, face2);
        assertNotSame(face13, face3);
        assertNotSame(face13, face6);
        assertNotSame(face13, face0);
        assertNotSame(face13, face9);
        assertNotSame(face13, face7);
        assertNotSame(face13, face8);
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.SOLAIRE, face13.getRes());
        assertNotNull(face13);
    }

    @Test(timeout = 4000)
    public void test01() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE6);
        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = de0.getFace();
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertNotEquals(string3, string1);
        assertNotEquals(string3, string0);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string1);
        assertEquals(string5, string4);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string3);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertNotSame(face3, face1);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face3);
        assertSame(face4, face1);
        assertNotSame(face4, face2);
        assertSame(face4, face0);
        assertNotSame(face4, face3);
        assertNotSame(face0, face3);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertSame(face0, face1);
        assertNotSame(face1, face2);
        assertNotSame(face1, face3);
        assertSame(face1, face0);
        assertSame(face1, face4);
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face1);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertNotSame(face5, face0);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face3);
        assertNotSame(face2, face1);
        assertNotSame(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face5);
        assertNotSame(face2, face3);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string4);
        assertEquals("OR 2\nVICTOIRE 1\nOR 2\nOR 1\nOR 1\nSOLAIRE 1", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face3);
        assertNotSame(face2, face1);
        assertNotSame(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face5);
        assertNotSame(face2, face3);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face2);
        assertNotSame(face7, face6);
        assertNotSame(face7, face3);
        assertNotSame(face7, face1);
        assertNotSame(face7, face4);
        assertNotSame(face7, face0);
        assertNotSame(face7, face5);
        assertNotSame(face7, face2);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face3);
        assertNotSame(face8, face2);
        assertNotSame(face8, face0);
        assertNotSame(face8, face5);
        assertNotSame(face8, face4);
        assertNotSame(face8, face6);
        assertNotSame(face8, face1);
        assertNotSame(face8, face3);
        assertSame(face8, face7);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face7);
        assertNotSame(face0, face3);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertNotSame(face0, face8);
        assertSame(face0, face1);
        assertNotSame(face0, face5);
        assertNotSame(face0, face6);
        assertNotSame(face0, face7);
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face8);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face3);
        assertNotSame(face9, face0);
        assertNotSame(face9, face6);
        assertNotSame(face9, face7);
        assertNotSame(face9, face5);
        assertNotSame(face9, face2);
        assertNotSame(face9, face8);
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);

        String string7 = de0.toString();
        assertNotEquals(string7, string0);
        assertEquals(string7, string5);
        assertNotEquals(string7, string1);
        assertEquals(string7, string4);
        assertNotEquals(string7, string6);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string3);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        Face face10 = de0.FACEMIN();
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face1);
        assertSame(face10, face9);
        assertNotSame(face10, face0);
        assertNotSame(face10, face4);
        assertNotSame(face10, face6);
        assertNotSame(face10, face2);
        assertNotSame(face10, face3);
        assertNotSame(face10, face7);
        assertNotSame(face10, face8);
        assertNotSame(face10, face5);
        assertNotSame(face10, face1);
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertNotNull(face10);

        Random.setNextRandom(2537);
        Face face11 = De.compare2Face(face6, de0.FACE6);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face10);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face10);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertSame(face11, face6);
        assertNotSame(face11, face7);
        assertNotSame(face11, face2);
        assertNotSame(face11, face9);
        assertNotSame(face11, face8);
        assertNotSame(face11, face3);
        assertNotSame(face11, face0);
        assertNotSame(face11, face1);
        assertNotSame(face11, face5);
        assertNotSame(face11, face4);
        assertNotSame(face11, face10);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertNotSame(face6, face9);
        assertNotSame(face6, face8);
        assertNotSame(face6, face10);
        assertSame(face6, face11);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face7);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.OR, face11.getRes());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertNotNull(face11);

        Face face12 = de0.FACE6;
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face8);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face10);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face9);
        assertNotSame(face12, face6);
        assertNotSame(face12, face4);
        assertNotSame(face12, face11);
        assertNotSame(face12, face3);
        assertNotSame(face12, face2);
        assertNotSame(face12, face8);
        assertNotSame(face12, face5);
        assertNotSame(face12, face10);
        assertNotSame(face12, face7);
        assertNotSame(face12, face0);
        assertNotSame(face12, face1);
        assertNotSame(face12, face9);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.SOLAIRE, face12.getRes());
        assertNotNull(face12);

        Face face13 = de0.getFace();
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face10);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face8);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face6);
        assertNotEquals(face13, face0);
        assertNotEquals(face13, face1);
        assertNotSame(face13, face7);
        assertNotSame(face13, face10);
        assertNotSame(face13, face2);
        assertNotSame(face13, face4);
        assertNotSame(face13, face6);
        assertNotSame(face13, face0);
        assertNotSame(face13, face1);
        assertNotSame(face13, face5);
        assertNotSame(face13, face9);
        assertNotSame(face13, face8);
        assertNotSame(face13, face3);
        assertSame(face13, face12);
        assertNotSame(face13, face11);
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.SOLAIRE, face13.getRes());
        assertNotNull(face13);

        Face face14 = De.compare2Face(face13, face1);
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face10);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face8);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face6);
        assertNotEquals(face13, face0);
        assertNotEquals(face13, face1);
        assertNotEquals(face14, face3);
        assertNotEquals(face14, face1);
        assertNotEquals(face14, face6);
        assertNotEquals(face14, face4);
        assertNotEquals(face14, face7);
        assertNotEquals(face14, face5);
        assertNotEquals(face14, face9);
        assertNotEquals(face14, face8);
        assertNotEquals(face14, face0);
        assertNotEquals(face14, face10);
        assertNotEquals(face14, face2);
        assertNotEquals(face14, face11);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face12);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face9);
        assertNotEquals(face1, face11);
        assertNotEquals(face1, face5);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face10);
        assertNotEquals(face1, face13);
        assertNotEquals(face1, face8);
        assertNotSame(face13, face7);
        assertNotSame(face13, face10);
        assertNotSame(face13, face2);
        assertNotSame(face13, face4);
        assertNotSame(face13, face6);
        assertNotSame(face13, face0);
        assertNotSame(face13, face1);
        assertNotSame(face13, face5);
        assertNotSame(face13, face9);
        assertSame(face13, face14);
        assertNotSame(face13, face8);
        assertNotSame(face13, face3);
        assertSame(face13, face12);
        assertNotSame(face13, face11);
        assertNotSame(face14, face3);
        assertNotSame(face14, face1);
        assertNotSame(face14, face5);
        assertNotSame(face14, face9);
        assertSame(face14, face12);
        assertNotSame(face14, face0);
        assertNotSame(face14, face10);
        assertNotSame(face14, face2);
        assertNotSame(face14, face6);
        assertNotSame(face14, face4);
        assertNotSame(face14, face7);
        assertNotSame(face14, face8);
        assertSame(face14, face13);
        assertNotSame(face14, face11);
        assertNotSame(face1, face7);
        assertNotSame(face1, face2);
        assertNotSame(face1, face6);
        assertNotSame(face1, face14);
        assertNotSame(face1, face10);
        assertNotSame(face1, face12);
        assertNotSame(face1, face11);
        assertNotSame(face1, face9);
        assertNotSame(face1, face5);
        assertNotSame(face1, face3);
        assertSame(face1, face0);
        assertNotSame(face1, face13);
        assertSame(face1, face4);
        assertNotSame(face1, face8);
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.SOLAIRE, face13.getRes());
        assertEquals(1, (int) face14.getValeur());
        assertEquals(Ressource.SOLAIRE, face14.getRes());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face14);
    }

    @Test(timeout = 4000)
    public void test02() {
        De de0 = new De();
        assertNotNull(de0);

        De de1 = new De();
        assertNotEquals(de1, de0);
        assertNotNull(de1);

        de1.InitDe1();
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        Face face0 = de1.FACE6;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertNotNull(face0);

        de0.FACE2 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(Ressource.SOLAIRE, de0.FACE2.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());

        de0.FACE3 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(Ressource.SOLAIRE, de0.FACE3.getRes());
        assertEquals(1, (int) de0.FACE3.getValeur());

        de1.FACE5 = de0.FACE3;
        assertEquals(1, (int) de1.FACE5.getValeur());
        assertEquals(Ressource.SOLAIRE, de1.FACE5.getRes());

        de0.InitDe1();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);

        String string0 = de0.toString();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        de0.InitDe2();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);

        Face face1 = de0.FACEMIN();
        assertNotEquals(de0, de1);
        assertNotEquals(face1, face0);
        assertNotSame(de0, de1);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = de1.getFace();
        assertNotEquals(de1, de0);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(de1, de0);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string1 = de0.toString();
        assertNotEquals(de0, de1);
        assertNotEquals(string1, string0);
        assertNotSame(de0, de1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        Face face3 = De.compare2Face(de0.FACE5, de0.FACE5);
        assertNotEquals(de0, de1);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(de0, de1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(Ressource.LUNAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        String string2 = de1.toString();
        assertNotEquals(de1, de0);
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertNotSame(de1, de0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        de1.InitDe2();
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        de1.InitDe2();
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        de1.setFACE(de0.FACE6);
        assertNotEquals(de0, de1);
        assertNotEquals(de1, de0);
        assertNotSame(de0, de1);
        assertNotSame(de1, de0);

        Face face4 = de1.getFace();
        assertNotEquals(de1, de0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotSame(de1, de0);
        assertNotSame(face4, face2);
        assertNotSame(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertNotNull(face4);

        Face face5 = de0.getFace();
        assertNotEquals(de0, de1);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face4);
        assertNotSame(de0, de1);
        assertNotSame(face5, face2);
        assertNotSame(face5, face0);
        assertSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face4);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        de1.setFACE(face0);
        assertNotEquals(de1, de0);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face2);
        assertNotSame(de1, de0);
        assertNotSame(face0, face1);
        assertNotSame(face0, face3);
        assertNotSame(face0, face5);
        assertNotSame(face0, face4);
        assertNotSame(face0, face2);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());

        Face face6 = de1.getFace();
        assertNotEquals(de1, de0);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotSame(de1, de0);
        assertNotSame(face6, face0);
        assertNotSame(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertSame(face6, face4);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(2, (int) face6.getValeur());
        assertNotNull(face6);

        de1.FACE6 = de0.FACE1;
        assertEquals(1, (int) de1.FACE6.getValeur());
        assertEquals(Ressource.OR, de1.FACE6.getRes());

        de0.InitDe1();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);

        de0.FACE2 = de1.FACE4;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(Ressource.OR, de0.FACE2.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());

        de1.InitDe1();
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        Face face7 = De.compare2Face(de1.FACE2, de1.FACE4);
        assertNotEquals(de1, de0);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face5);
        assertNotSame(de1, de0);
        assertNotSame(face7, face4);
        assertNotSame(face7, face0);
        assertNotSame(face7, face3);
        assertNotSame(face7, face6);
        assertNotSame(face7, face1);
        assertNotSame(face7, face2);
        assertNotSame(face7, face5);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        de0.setFACE(de1.FACE3);
        assertNotEquals(de0, de1);
        assertNotEquals(de1, de0);
        assertNotSame(de0, de1);
        assertNotSame(de1, de0);

        Face face8 = De.compare2Face(de1.FACE6, de0.FACE1);
        assertNotEquals(de0, de1);
        assertNotEquals(de1, de0);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face0);
        assertNotSame(de0, de1);
        assertNotSame(de1, de0);
        assertNotSame(face8, face4);
        assertNotSame(face8, face7);
        assertNotSame(face8, face1);
        assertNotSame(face8, face2);
        assertNotSame(face8, face6);
        assertNotSame(face8, face5);
        assertNotSame(face8, face3);
        assertNotSame(face8, face0);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de1.InitDe1();
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        de0.InitDe1();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);

        de1.setFACE(de1.FACE2);
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);

        Face face9 = De.compare2Face(face0, de1.FACE6);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face6);
        assertNotEquals(de1, de0);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face2);
        assertSame(face9, face0);
        assertNotSame(face9, face3);
        assertNotSame(face9, face5);
        assertNotSame(face9, face8);
        assertNotSame(face9, face1);
        assertNotSame(face9, face2);
        assertNotSame(face9, face7);
        assertNotSame(face9, face4);
        assertNotSame(face9, face6);
        assertNotSame(de1, de0);
        assertSame(face0, face9);
        assertNotSame(face0, face6);
        assertNotSame(face0, face1);
        assertNotSame(face0, face3);
        assertNotSame(face0, face5);
        assertNotSame(face0, face7);
        assertNotSame(face0, face4);
        assertNotSame(face0, face8);
        assertNotSame(face0, face2);
        assertEquals(Ressource.SOLAIRE, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertNotNull(face9);

        String string3 = de1.toString();
        assertEquals(string3, string0);
        assertNotEquals(string3, string2);
        assertNotEquals(string3, string1);
        assertNotEquals(de1, de0);
        assertNotSame(de1, de0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        de0.InitDe2();
        assertNotEquals(de0, de1);
        assertNotSame(de0, de1);

        Face face10 = De.compare2Face(de0.FACE1, face4);
        assertNotEquals(de0, de1);
        assertNotEquals(de1, de0);
        assertNotEquals(face4, face8);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face5);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face7);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face9);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face5);
        assertNotSame(de0, de1);
        assertNotSame(de1, de0);
        assertNotSame(face4, face8);
        assertNotSame(face4, face2);
        assertNotSame(face4, face5);
        assertNotSame(face4, face1);
        assertNotSame(face4, face10);
        assertNotSame(face4, face7);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertNotSame(face4, face9);
        assertSame(face4, face6);
        assertNotSame(face10, face6);
        assertNotSame(face10, face8);
        assertNotSame(face10, face3);
        assertNotSame(face10, face9);
        assertNotSame(face10, face4);
        assertNotSame(face10, face7);
        assertNotSame(face10, face0);
        assertNotSame(face10, face1);
        assertNotSame(face10, face2);
        assertNotSame(face10, face5);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Face face11 = De.compare2Face(face3, de1.FACE6);
        assertNotEquals(de0, de1);
        assertNotEquals(de1, de0);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face6);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face4);
        assertNotEquals(de1.FACE6, face6);
        assertNotEquals(de1.FACE6, face3);
        assertNotEquals(de1.FACE6, face8);
        assertNotEquals(de1.FACE6, face1);
        assertNotEquals(de1.FACE6, face9);
        assertNotEquals(de1.FACE6, face4);
        assertNotEquals(de1.FACE6, face0);
        assertNotEquals(de1.FACE6, face7);
        assertNotEquals(de1.FACE6, face2);
        assertNotEquals(de1.FACE6, face5);
        assertNotEquals(de1.FACE6, face10);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face10);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face9);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face8);
        assertNotSame(de0, de1);
        assertNotSame(de1, de0);
        assertSame(face11, face3);
        assertNotSame(face11, face2);
        assertNotSame(face11, face8);
        assertNotSame(face11, face6);
        assertNotSame(face11, face10);
        assertNotSame(face11, face5);
        assertNotSame(face11, face1);
        assertNotSame(face11, face9);
        assertNotSame(face11, face0);
        assertNotSame(face11, face7);
        assertNotSame(face11, face4);
        assertNotSame(de1.FACE6, face6);
        assertNotSame(de1.FACE6, face8);
        assertNotSame(de1.FACE6, face3);
        assertNotSame(de1.FACE6, face1);
        assertNotSame(de1.FACE6, face11);
        assertNotSame(de1.FACE6, face9);
        assertNotSame(de1.FACE6, face4);
        assertNotSame(de1.FACE6, face0);
        assertNotSame(de1.FACE6, face7);
        assertNotSame(de1.FACE6, face2);
        assertNotSame(de1.FACE6, face5);
        assertNotSame(de1.FACE6, face10);
        assertNotSame(face3, face4);
        assertNotSame(face3, face10);
        assertNotSame(face3, face5);
        assertSame(face3, face11);
        assertNotSame(face3, face0);
        assertNotSame(face3, face6);
        assertNotSame(face3, face7);
        assertNotSame(face3, face9);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face8);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.LUNAIRE, face11.getRes());
        assertEquals(Ressource.SOLAIRE, de1.FACE6.getRes());
        assertEquals(1, (int) de1.FACE6.getValeur());
        assertEquals(Ressource.LUNAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face11);
    }

    @Test(timeout = 4000)
    public void test03() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        de0.InitDe2();
        Face face0 = De.compare2Face(de0.FACE4, de0.FACE4);
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.FACE2 = face0;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        de0.setFACE(de0.FACE6);
        de0.InitDe2();
        de0.InitDe1();
        Face face1 = de0.FACE6;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.SOLAIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        Face face2 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        de0.setFACE(face1);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face2);
        assertNotSame(face1, face0);
        assertEquals(Ressource.SOLAIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertEquals(string2, string1);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        Face face3 = de0.getFace();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face0);
        assertEquals(Ressource.SOLAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertEquals(string3, string1);
        assertNotEquals(string3, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face3);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        Face face4 = de0.FACEMIN();
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face1);
        assertNotSame(face4, face0);
        assertSame(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face1);
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        de0.InitDe2();
        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face0);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        Face face6 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Face face7 = de0.getFace();
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertNotSame(face7, face3);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face6);
        assertSame(face7, face5);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        String string4 = de0.toString();
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        Face face8 = De.compare2Face(de0.FACE1, de0.FACE5);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face2);
        assertSame(face8, face5);
        assertNotSame(face8, face1);
        assertNotSame(face8, face0);
        assertNotSame(face8, face4);
        assertNotSame(face8, face3);
        assertSame(face8, face7);
        assertNotSame(face8, face6);
        assertNotSame(face8, face2);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.setFACE(face3);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face8);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face7);
        assertNotSame(face3, face6);
        assertNotSame(face3, face2);
        assertNotSame(face3, face8);
        assertNotSame(face3, face4);
        assertNotSame(face3, face5);
        assertNotSame(face3, face0);
        assertEquals(Ressource.SOLAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());

        Face face9 = De.compare2Face(de0.FACE6, face7);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face0);
        assertNotSame(face7, face3);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertSame(face7, face8);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face6);
        assertSame(face7, face9);
        assertSame(face7, face5);
        assertNotSame(face9, face1);
        assertSame(face9, face5);
        assertSame(face9, face8);
        assertNotSame(face9, face6);
        assertNotSame(face9, face2);
        assertNotSame(face9, face3);
        assertNotSame(face9, face4);
        assertNotSame(face9, face0);
        assertSame(face9, face7);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.SOLAIRE, face7.getRes());
        assertEquals(Ressource.SOLAIRE, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);

        Face face10 = De.compare2Face(face7, de0.FACE2);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face0);
        assertNotSame(face7, face3);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertSame(face7, face8);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face6);
        assertNotSame(face7, face10);
        assertSame(face7, face9);
        assertSame(face7, face5);
        assertNotSame(face10, face2);
        assertNotSame(face10, face7);
        assertNotSame(face10, face1);
        assertNotSame(face10, face3);
        assertNotSame(face10, face4);
        assertNotSame(face10, face9);
        assertNotSame(face10, face5);
        assertSame(face10, face6);
        assertNotSame(face10, face8);
        assertNotSame(face10, face0);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.SOLAIRE, face7.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Face face11 = De.compare2Face(de0.FACE4, face6);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face0);
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face6);
        assertNotEquals(face11, face0);
        assertNotSame(face6, face7);
        assertNotSame(face6, face11);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face9);
        assertSame(face6, face10);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face8);
        assertNotSame(face6, face0);
        assertNotSame(face11, face4);
        assertNotSame(face11, face8);
        assertNotSame(face11, face2);
        assertNotSame(face11, face3);
        assertNotSame(face11, face5);
        assertNotSame(face11, face10);
        assertNotSame(face11, face9);
        assertNotSame(face11, face1);
        assertNotSame(face11, face7);
        assertNotSame(face11, face6);
        assertNotSame(face11, face0);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.OR, face11.getRes());
        assertNotNull(face11);

        String string5 = de0.toString();
        assertNotEquals(string5, string4);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face12 = De.compare2Face(face3, de0.FACE5);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face8);
        assertNotEquals(face12, face9);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face10);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face6);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face11);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face9);
        assertNotEquals(face3, face10);
        assertNotEquals(face3, face8);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face0);
        assertNotSame(face12, face7);
        assertNotSame(face12, face11);
        assertNotSame(face12, face1);
        assertNotSame(face12, face0);
        assertNotSame(face12, face5);
        assertNotSame(face12, face4);
        assertNotSame(face12, face8);
        assertNotSame(face12, face9);
        assertNotSame(face12, face3);
        assertNotSame(face12, face10);
        assertNotSame(face12, face2);
        assertNotSame(face12, face6);
        assertNotSame(face3, face1);
        assertNotSame(face3, face7);
        assertNotSame(face3, face12);
        assertNotSame(face3, face11);
        assertNotSame(face3, face6);
        assertNotSame(face3, face2);
        assertNotSame(face3, face9);
        assertNotSame(face3, face10);
        assertNotSame(face3, face8);
        assertNotSame(face3, face4);
        assertNotSame(face3, face5);
        assertNotSame(face3, face0);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.LUNAIRE, face12.getRes());
        assertEquals(Ressource.SOLAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face12);

        Face face13 = de0.FACEMIN();
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face8);
        assertNotEquals(face13, face12);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face1);
        assertNotEquals(face13, face0);
        assertSame(face13, face10);
        assertNotSame(face13, face5);
        assertNotSame(face13, face11);
        assertNotSame(face13, face2);
        assertNotSame(face13, face1);
        assertNotSame(face13, face0);
        assertSame(face13, face6);
        assertNotSame(face13, face9);
        assertNotSame(face13, face3);
        assertNotSame(face13, face4);
        assertNotSame(face13, face8);
        assertNotSame(face13, face12);
        assertNotSame(face13, face7);
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.OR, face13.getRes());
        assertNotNull(face13);

        Face face14 = De.compare2Face(de0.FACE5, face7);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face12);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face13);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face10);
        assertNotEquals(face7, face11);
        assertNotEquals(face14, face3);
        assertNotEquals(face14, face11);
        assertNotEquals(face14, face4);
        assertNotEquals(face14, face1);
        assertNotEquals(face14, face9);
        assertNotEquals(face14, face2);
        assertNotEquals(face14, face8);
        assertNotEquals(face14, face0);
        assertNotEquals(face14, face5);
        assertNotEquals(face14, face7);
        assertNotEquals(face14, face10);
        assertNotEquals(face14, face13);
        assertNotEquals(face14, face6);
        assertNotSame(face7, face13);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face10);
        assertNotSame(face7, face14);
        assertSame(face7, face5);
        assertNotSame(face7, face11);
        assertNotSame(face7, face3);
        assertNotSame(face7, face12);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertSame(face7, face8);
        assertNotSame(face7, face6);
        assertSame(face7, face9);
        assertNotSame(face14, face3);
        assertNotSame(face14, face11);
        assertNotSame(face14, face4);
        assertNotSame(face14, face1);
        assertNotSame(face14, face9);
        assertSame(face14, face12);
        assertNotSame(face14, face2);
        assertNotSame(face14, face8);
        assertNotSame(face14, face0);
        assertNotSame(face14, face5);
        assertNotSame(face14, face7);
        assertNotSame(face14, face10);
        assertNotSame(face14, face13);
        assertNotSame(face14, face6);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.SOLAIRE, face7.getRes());
        assertEquals(Ressource.LUNAIRE, face14.getRes());
        assertEquals(1, (int) face14.getValeur());
        assertNotNull(face14);

        String string6 = de0.toString();
        assertNotEquals(string6, string0);
        assertEquals(string6, string5);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string4);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        Face face15 = De.compare2Face(face5, de0.FACE6);
        assertNotEquals(face15, face0);
        assertNotEquals(face15, face2);
        assertNotEquals(face15, face6);
        assertNotEquals(face15, face14);
        assertNotEquals(face15, face13);
        assertNotEquals(face15, face3);
        assertNotEquals(face15, face4);
        assertNotEquals(face15, face1);
        assertNotEquals(face15, face12);
        assertNotEquals(face15, face10);
        assertNotEquals(face15, face11);
        assertNotEquals(face5, face11);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face6);
        assertNotEquals(face5, face12);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face10);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face14);
        assertNotEquals(face5, face13);
        assertNotEquals(face5, face0);
        assertSame(face15, face9);
        assertNotSame(face15, face14);
        assertNotSame(face15, face13);
        assertSame(face15, face8);
        assertNotSame(face15, face1);
        assertNotSame(face15, face0);
        assertNotSame(face15, face2);
        assertNotSame(face15, face6);
        assertSame(face15, face7);
        assertNotSame(face15, face3);
        assertNotSame(face15, face4);
        assertNotSame(face15, face12);
        assertNotSame(face15, face10);
        assertSame(face15, face5);
        assertNotSame(face15, face11);
        assertNotSame(face5, face2);
        assertNotSame(face5, face6);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertSame(face5, face7);
        assertNotSame(face5, face13);
        assertNotSame(face5, face11);
        assertSame(face5, face9);
        assertNotSame(face5, face12);
        assertNotSame(face5, face1);
        assertSame(face5, face15);
        assertNotSame(face5, face10);
        assertSame(face5, face8);
        assertNotSame(face5, face14);
        assertNotSame(face5, face0);
        assertEquals(1, (int) face15.getValeur());
        assertEquals(Ressource.SOLAIRE, face15.getRes());
        assertEquals(Ressource.SOLAIRE, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face15);
    }

    @Test(timeout = 4000)
    public void test04() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        de0.InitDe2();
        Face face0 = De.compare2Face(de0.FACE4, de0.FACE4);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.FACE2 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        de0.setFACE(de0.FACE6);
        de0.InitDe1();
        Face face1 = de0.FACEMIN();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face0);
        assertNotSame(face2, face0);
        assertSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertSame(face1, face2);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        String string2 = de0.toString();
        assertEquals(string2, string0);
        assertEquals(string2, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        Face face3 = de0.getFace();
        assertNotEquals(face3, face0);
        assertSame(face3, face1);
        assertSame(face3, face2);
        assertNotSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertEquals(string3, string0);
        assertEquals(string3, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face0);
        assertSame(face2, face3);
        assertSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        Face face4 = de0.FACEMIN();
        assertNotEquals(face4, face0);
        assertNotSame(face4, face0);
        assertSame(face4, face1);
        assertSame(face4, face2);
        assertSame(face4, face3);
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        de0.InitDe2();
        Face face5 = de0.FACE1;
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face1);
        assertNotSame(face5, face0);
        assertNotSame(face5, face2);
        assertNotSame(face5, face3);
        assertNotSame(face5, face4);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        Face face6 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Face face7 = de0.getFace();
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face3);
        assertSame(face7, face5);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face4);
        assertNotSame(face7, face2);
        assertNotSame(face7, face3);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string2);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        Face face8 = De.compare2Face(de0.FACE1, de0.FACE5);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face2);
        assertNotSame(face8, face3);
        assertNotSame(face8, face4);
        assertSame(face8, face5);
        assertNotSame(face8, face6);
        assertNotSame(face8, face1);
        assertNotSame(face8, face0);
        assertSame(face8, face7);
        assertNotSame(face8, face2);
        assertEquals(Ressource.OR, face8.getRes());
        assertEquals(1, (int) face8.getValeur());
        assertNotNull(face8);

        de0.setFACE(face3);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face8);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face0);
        assertNotSame(face3, face5);
        assertSame(face3, face4);
        assertNotSame(face3, face6);
        assertSame(face3, face1);
        assertNotSame(face3, face8);
        assertNotSame(face3, face7);
        assertSame(face3, face2);
        assertNotSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());

        Face face9 = De.compare2Face(de0.FACE6, face7);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face3);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face4);
        assertSame(face7, face8);
        assertSame(face7, face5);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face4);
        assertNotSame(face7, face2);
        assertSame(face7, face9);
        assertNotSame(face7, face3);
        assertNotSame(face9, face0);
        assertNotSame(face9, face1);
        assertNotSame(face9, face6);
        assertSame(face9, face8);
        assertNotSame(face9, face2);
        assertSame(face9, face7);
        assertNotSame(face9, face3);
        assertNotSame(face9, face4);
        assertSame(face9, face5);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Face face10 = De.compare2Face(de0.FACE4, face6);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face7);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face9);
        assertNotSame(face6, face8);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertNotSame(face6, face9);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertNotSame(face6, face10);
        assertNotSame(face6, face7);
        assertNotSame(face10, face2);
        assertNotSame(face10, face4);
        assertNotSame(face10, face5);
        assertNotSame(face10, face1);
        assertNotSame(face10, face8);
        assertNotSame(face10, face0);
        assertNotSame(face10, face6);
        assertNotSame(face10, face3);
        assertNotSame(face10, face7);
        assertNotSame(face10, face9);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Random.setNextRandom(171);
        Face face11 = de0.getFace();
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face6);
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face8);
        assertNotSame(face11, face7);
        assertNotSame(face11, face9);
        assertSame(face11, face10);
        assertNotSame(face11, face0);
        assertNotSame(face11, face1);
        assertNotSame(face11, face5);
        assertNotSame(face11, face2);
        assertNotSame(face11, face6);
        assertNotSame(face11, face4);
        assertNotSame(face11, face3);
        assertNotSame(face11, face8);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.OR, face11.getRes());
        assertNotNull(face11);

        Face face12 = de0.FACEMIN();
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face10);
        assertNotSame(face12, face1);
        assertNotSame(face12, face0);
        assertNotSame(face12, face6);
        assertSame(face12, face9);
        assertNotSame(face12, face2);
        assertSame(face12, face7);
        assertNotSame(face12, face4);
        assertNotSame(face12, face11);
        assertNotSame(face12, face3);
        assertSame(face12, face5);
        assertNotSame(face12, face10);
        assertSame(face12, face8);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertNotNull(face12);
    }

    @Test(timeout = 4000)
    public void test05() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(2, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE5);
        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = De.compare2Face(de0.FACE3, de0.FACE6);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string4 = de0.toString();
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string2);
        assertEquals(string5, string4);
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string0);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        de0.FACE2 = face3;
        assertEquals(Ressource.OR, de0.FACE2.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face3);
        assertSame(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face0, face1);
        assertNotSame(face0, face2);
        assertNotSame(face0, face3);
        assertNotSame(face0, face4);
        assertNotSame(face1, face0);
        assertSame(face1, face4);
        assertNotSame(face1, face2);
        assertNotSame(face1, face3);
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face1);
        assertSame(face5, face2);
        assertNotSame(face5, face3);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertNotSame(face5, face1);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertSame(face2, face5);
        assertNotSame(face2, face4);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face3);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        String string6 = de0.toString();
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string4);
        assertEquals("OR 2\nOR 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertSame(face2, face5);
        assertNotSame(face2, face4);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face3);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face1);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face1);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face1);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face1);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face5);
        assertNotSame(face7, face4);
        assertNotSame(face7, face2);
        assertNotSame(face7, face3);
        assertNotSame(face7, face6);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face4);
        assertNotSame(face8, face0);
        assertSame(face8, face7);
        assertNotSame(face8, face2);
        assertNotSame(face8, face3);
        assertNotSame(face8, face6);
        assertNotSame(face8, face1);
        assertNotSame(face8, face5);
        assertNotSame(face8, face4);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face8);
        assertNotSame(face0, face1);
        assertNotSame(face0, face2);
        assertNotSame(face0, face3);
        assertNotSame(face0, face6);
        assertNotSame(face0, face5);
        assertNotSame(face0, face4);
        assertNotSame(face0, face7);
        assertNotSame(face0, face8);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face8);
        assertNotSame(face9, face7);
        assertNotSame(face9, face5);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face6);
        assertNotSame(face9, face2);
        assertNotSame(face9, face3);
        assertNotSame(face9, face0);
        assertNotSame(face9, face8);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Face face10 = De.compare2Face(face6, face4);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face3);
        assertNotEquals(face4, face5);
        assertNotEquals(face4, face8);
        assertNotEquals(face4, face7);
        assertNotEquals(face4, face9);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face6);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face9);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face8);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face8);
        assertNotEquals(face1, face5);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face9);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face1);
        assertNotSame(face10, face9);
        assertNotSame(face10, face7);
        assertNotSame(face10, face8);
        assertSame(face10, face6);
        assertNotSame(face10, face1);
        assertNotSame(face10, face5);
        assertNotSame(face10, face4);
        assertNotSame(face10, face0);
        assertNotSame(face10, face2);
        assertNotSame(face10, face3);
        assertNotSame(face4, face5);
        assertNotSame(face4, face10);
        assertSame(face4, face1);
        assertNotSame(face4, face8);
        assertNotSame(face4, face7);
        assertNotSame(face4, face9);
        assertNotSame(face4, face0);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face6);
        assertNotSame(face0, face1);
        assertNotSame(face0, face9);
        assertNotSame(face0, face2);
        assertNotSame(face0, face3);
        assertNotSame(face0, face6);
        assertNotSame(face0, face5);
        assertNotSame(face0, face4);
        assertNotSame(face0, face7);
        assertNotSame(face0, face8);
        assertNotSame(face0, face10);
        assertNotSame(face1, face0);
        assertNotSame(face1, face8);
        assertNotSame(face1, face5);
        assertNotSame(face1, face10);
        assertSame(face1, face4);
        assertNotSame(face1, face2);
        assertNotSame(face1, face3);
        assertNotSame(face1, face6);
        assertNotSame(face1, face7);
        assertNotSame(face1, face9);
        assertNotSame(face6, face7);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertSame(face6, face10);
        assertNotSame(face6, face9);
        assertNotSame(face6, face0);
        assertNotSame(face6, face8);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face1);
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face10);

        String string7 = de0.toString();
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string3);
        assertNotEquals(string7, string6);
        assertNotEquals(string7, string0);
        assertNotEquals(string7, string5);
        assertNotEquals(string7, string4);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        Random.setNextRandom(2987);
        Face face11 = de0.getFace();
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face6);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face5);
        assertNotSame(face11, face4);
        assertNotSame(face11, face10);
        assertNotSame(face11, face0);
        assertNotSame(face11, face2);
        assertNotSame(face11, face3);
        assertNotSame(face11, face6);
        assertNotSame(face11, face9);
        assertNotSame(face11, face7);
        assertNotSame(face11, face8);
        assertNotSame(face11, face1);
        assertNotSame(face11, face5);
        assertEquals(Ressource.SOLAIRE, face11.getRes());
        assertEquals(1, (int) face11.getValeur());
        assertNotNull(face11);
    }

    @Test(timeout = 4000)
    public void test06() {
        Random.setNextRandom(956);
        De de0 = new De();
        assertNotNull(de0);

        de0.FACE5 = null;
        de0.FACE1 = null;
        de0.FACE2 = null;
        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face0 = de0.getFace();
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        Face face1 = de0.getFace();
        assertSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.FACE5 = face0;
        assertEquals(Ressource.OR, de0.FACE5.getRes());
        assertEquals(1, (int) de0.FACE5.getValeur());

        Face face3 = de0.getFace();
        assertNotEquals(face3, face2);
        assertSame(face3, face1);
        assertNotSame(face3, face2);
        assertSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        Face face4 = De.compare2Face(de0.FACE1, face0);
        assertNotEquals(face0, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face0);
        assertSame(face0, face1);
        assertNotSame(face0, face4);
        assertNotSame(face0, face2);
        assertSame(face0, face3);
        assertSame(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face1);
        assertNotSame(face4, face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        Random.setNextRandom(956);
        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotSame(face5, face0);
        assertSame(face5, face4);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertSame(face5, face2);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Random.setNextRandom(956);
        Face face6 = de0.FACEMIN();
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face0);
        assertSame(face6, face5);
        assertSame(face6, face2);
        assertSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Random.setNextRandom(956);
        de0.FACE6 = face0;
        assertEquals(Ressource.OR, de0.FACE6.getRes());
        assertEquals(1, (int) de0.FACE6.getValeur());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());

        Random.setNextRandom(956);
        Face face7 = de0.getFace();
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face6);
        assertNotSame(face7, face4);
        assertSame(face7, face3);
        assertSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face5);
        assertNotSame(face7, face6);
        assertSame(face7, face1);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face5);
        assertSame(face8, face0);
        assertNotSame(face8, face2);
        assertNotSame(face8, face4);
        assertSame(face8, face3);
        assertNotSame(face8, face6);
        assertSame(face8, face1);
        assertSame(face8, face7);
        assertNotSame(face8, face5);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        String string3 = de0.toString();
        assertNotEquals(string3, string1);
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string2);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nOR 1", string3);
        assertNotNull(string3);

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string2);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nOR 1", string4);
        assertNotNull(string4);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face7);
        assertSame(face9, face5);
        assertNotSame(face9, face8);
        assertNotSame(face9, face3);
        assertNotSame(face9, face0);
        assertSame(face9, face6);
        assertSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face7);
        assertSame(face9, face2);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Random.setNextRandom(2651);
        Face face10 = de0.getFace();
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face4);
        assertNotSame(face10, face9);
        assertSame(face10, face1);
        assertSame(face10, face7);
        assertSame(face10, face8);
        assertNotSame(face10, face6);
        assertNotSame(face10, face2);
        assertNotSame(face10, face5);
        assertSame(face10, face3);
        assertNotSame(face10, face4);
        assertSame(face10, face0);
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        String string5 = de0.toString();
        assertEquals(string5, string4);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string1);
        assertEquals(string5, string3);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nOR 1", string5);
        assertNotNull(string5);

        Random.setNextRandom(2651);
        Face face11 = de0.FACEMIN();
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face3);
        assertNotSame(face11, face8);
        assertSame(face11, face5);
        assertNotSame(face11, face7);
        assertNotSame(face11, face0);
        assertSame(face11, face6);
        assertSame(face11, face9);
        assertSame(face11, face2);
        assertNotSame(face11, face10);
        assertSame(face11, face4);
        assertNotSame(face11, face1);
        assertNotSame(face11, face3);
        assertEquals(Ressource.OR, face11.getRes());
        assertEquals(1, (int) face11.getValeur());
        assertNotNull(face11);

        Face face12 = de0.getFace();
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face9);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face6);
        assertNotSame(face12, face2);
        assertNotSame(face12, face5);
        assertSame(face12, face10);
        assertNotSame(face12, face4);
        assertSame(face12, face0);
        assertNotSame(face12, face9);
        assertSame(face12, face7);
        assertSame(face12, face1);
        assertSame(face12, face8);
        assertNotSame(face12, face11);
        assertNotSame(face12, face6);
        assertSame(face12, face3);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertNotNull(face12);
    }

    @Test(timeout = 4000)
    public void test07() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        de0.InitDe2();
        Face face0 = de0.FACE3;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.FACE5 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.OR, de0.FACE5.getRes());

        de0.FACE1 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE1.getValeur());
        assertEquals(Ressource.OR, de0.FACE1.getRes());

        Face face1 = de0.getFace();
        assertSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face2 = de0.getFace();
        assertSame(face2, face1);
        assertSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.FACE5 = face2;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.OR, de0.FACE5.getRes());

        Face face3 = de0.FACE1;
        assertSame(face3, face0);
        assertSame(face3, face2);
        assertSame(face3, face1);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        Face face4 = De.compare2Face(de0.FACE1, face3);
        assertSame(face3, face0);
        assertSame(face3, face2);
        assertSame(face3, face1);
        assertSame(face3, face4);
        assertSame(face4, face0);
        assertSame(face4, face3);
        assertSame(face4, face2);
        assertSame(face4, face1);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        de0.setFACE(face2);
        assertSame(face2, face1);
        assertSame(face2, face4);
        assertSame(face2, face3);
        assertSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());

        de0.setFACE(face4);
        assertSame(face3, face0);
        assertSame(face3, face2);
        assertSame(face3, face1);
        assertSame(face3, face4);
        assertSame(face4, face0);
        assertSame(face4, face3);
        assertSame(face4, face2);
        assertSame(face4, face1);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());

        Face face5 = de0.FACE6;
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertNotSame(face5, face0);
        assertEquals(Ressource.VICTOIRE, face5.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertNotNull(face5);

        de0.setFACE(face5);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertNotSame(face5, face0);
        assertEquals(Ressource.VICTOIRE, face5.getRes());
        assertEquals(2, (int) face5.getValeur());

        Face face6 = De.compare2Face(de0.FACE5, face1);
        assertNotEquals(face6, face5);
        assertNotEquals(face1, face5);
        assertSame(face6, face3);
        assertSame(face6, face0);
        assertSame(face6, face4);
        assertNotSame(face6, face5);
        assertSame(face6, face1);
        assertSame(face6, face2);
        assertSame(face1, face6);
        assertSame(face1, face4);
        assertSame(face1, face0);
        assertSame(face1, face2);
        assertSame(face1, face3);
        assertNotSame(face1, face5);
        assertEquals(2, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face6);

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face4);
        assertNotSame(face7, face0);
        assertNotSame(face7, face5);
        assertNotSame(face7, face2);
        assertNotSame(face7, face1);
        assertNotSame(face7, face3);
        assertNotSame(face7, face6);
        assertNotSame(face7, face4);
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        de0.InitDe2();
        de0.setFACE(face3);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face5);
        assertSame(face3, face0);
        assertSame(face3, face2);
        assertNotSame(face3, face7);
        assertSame(face3, face1);
        assertNotSame(face3, face5);
        assertSame(face3, face6);
        assertSame(face3, face4);
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());

        de0.InitDe2();
        de0.setFACE(face1);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face5);
        assertSame(face1, face6);
        assertNotSame(face1, face7);
        assertSame(face1, face4);
        assertSame(face1, face0);
        assertSame(face1, face2);
        assertSame(face1, face3);
        assertNotSame(face1, face5);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        de0.InitDe2();
        de0.InitDe2();
        de0.InitDe1();
        Face face8 = De.compare2Face(face4, face5);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face5);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face5);
        assertNotEquals(face4, face5);
        assertNotEquals(face4, face7);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face6);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face7);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face0);
        assertSame(face8, face2);
        assertSame(face8, face3);
        assertSame(face8, face6);
        assertSame(face8, face4);
        assertNotSame(face8, face5);
        assertNotSame(face8, face7);
        assertSame(face8, face1);
        assertSame(face8, face0);
        assertSame(face3, face0);
        assertSame(face3, face2);
        assertNotSame(face3, face7);
        assertSame(face3, face1);
        assertNotSame(face3, face5);
        assertSame(face3, face8);
        assertSame(face3, face6);
        assertSame(face3, face4);
        assertSame(face4, face0);
        assertNotSame(face4, face5);
        assertSame(face4, face3);
        assertSame(face4, face6);
        assertSame(face4, face8);
        assertSame(face4, face2);
        assertSame(face4, face1);
        assertNotSame(face4, face7);
        assertNotSame(face5, face2);
        assertNotSame(face5, face8);
        assertNotSame(face5, face6);
        assertNotSame(face5, face4);
        assertNotSame(face5, face7);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertNotSame(face5, face0);
        assertEquals(Ressource.OR, face8.getRes());
        assertEquals(2, (int) face8.getValeur());
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face5.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertNotNull(face8);

        String string3 = de0.toString();
        assertNotEquals(string3, string1);
        assertNotEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face2);
        assertNotSame(face9, face6);
        assertNotSame(face9, face8);
        assertNotSame(face9, face0);
        assertNotSame(face9, face3);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face7);
        assertNotSame(face9, face5);
        assertNotSame(face9, face2);
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);
    }

    @Test(timeout = 4000)
    public void test08() {
        Random.setNextRandom((-1562));
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE4;
        assertNull(face0);

        Face face1 = de0.getFace();
        assertNull(face1);

        de0.FACE1 = null;
        // Undeclared exception!
        try {
            de0.setFACE(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() {
        Random.setNextRandom(976);
        De de0 = new De();
        assertNotNull(de0);

        de0.FACE5 = null;
        de0.FACE6 = null;
        de0.FACE2 = null;
        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face0 = de0.getFace();
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.LUNAIRE, face0.getRes());
        assertNotNull(face0);

        Face face1 = de0.getFace();
        assertSame(face1, face0);
        assertEquals(Ressource.LUNAIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.FACE5 = face0;
        assertEquals(1, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.LUNAIRE, de0.FACE5.getRes());

        Face face3 = de0.getFace();
        assertNotEquals(face3, face2);
        assertSame(face3, face0);
        assertNotSame(face3, face2);
        assertSame(face3, face1);
        assertEquals(Ressource.LUNAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        Face face4 = De.compare2Face(de0.FACE1, face0);
        assertNotEquals(face0, face2);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotSame(face0, face2);
        assertSame(face0, face1);
        assertNotSame(face0, face4);
        assertSame(face0, face3);
        assertSame(face4, face2);
        assertNotSame(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.LUNAIRE, face0.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        Random.setNextRandom(976);
        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face0);
        assertSame(face5, face4);
        assertSame(face5, face2);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        String string2 = de0.toString();
        assertEquals(string2, string0);
        assertEquals(string2, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Random.setNextRandom(976);
        Face face6 = de0.FACEMIN();
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertSame(face6, face5);
        assertNotSame(face6, face0);
        assertSame(face6, face4);
        assertNotSame(face6, face1);
        assertSame(face6, face2);
        assertNotSame(face6, face3);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertNotNull(face6);

        Random.setNextRandom(976);
        de0.FACE6 = face0;
        assertEquals(1, (int) de0.FACE6.getValeur());
        assertEquals(Ressource.LUNAIRE, de0.FACE6.getRes());

        Random.setNextRandom(976);
        Face face7 = de0.getFace();
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertSame(face7, face1);
        assertNotSame(face7, face5);
        assertNotSame(face7, face4);
        assertSame(face7, face0);
        assertSame(face7, face3);
        assertNotSame(face7, face2);
        assertNotSame(face7, face6);
        assertEquals(Ressource.LUNAIRE, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face5);
        assertNotSame(face8, face4);
        assertSame(face8, face3);
        assertSame(face8, face0);
        assertNotSame(face8, face6);
        assertNotSame(face8, face2);
        assertNotSame(face8, face5);
        assertSame(face8, face7);
        assertSame(face8, face1);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.LUNAIRE, face8.getRes());
        assertNotNull(face8);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string2);
        assertNotEquals(string3, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nLUNAIRE 1", string3);
        assertNotNull(string3);

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertEquals(string4, string3);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nLUNAIRE 1", string4);
        assertNotNull(string4);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face3);
        assertNotSame(face9, face7);
        assertSame(face9, face6);
        assertNotSame(face9, face8);
        assertSame(face9, face2);
        assertNotSame(face9, face1);
        assertSame(face9, face4);
        assertSame(face9, face5);
        assertNotSame(face9, face0);
        assertNotSame(face9, face3);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Random.setNextRandom(2651);
        Face face10 = de0.getFace();
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face9);
        assertSame(face10, face0);
        assertNotSame(face10, face6);
        assertNotSame(face10, face2);
        assertNotSame(face10, face5);
        assertSame(face10, face8);
        assertSame(face10, face1);
        assertSame(face10, face3);
        assertSame(face10, face7);
        assertNotSame(face10, face4);
        assertNotSame(face10, face9);
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.LUNAIRE, face10.getRes());
        assertNotNull(face10);

        String string5 = de0.toString();
        assertEquals(string5, string4);
        assertEquals(string5, string3);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nLUNAIRE 1", string5);
        assertNotNull(string5);

        Random.setNextRandom(2651);
        Face face11 = de0.FACEMIN();
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face0);
        assertNotSame(face11, face1);
        assertNotSame(face11, face3);
        assertNotSame(face11, face8);
        assertNotSame(face11, face7);
        assertNotSame(face11, face10);
        assertSame(face11, face9);
        assertSame(face11, face2);
        assertSame(face11, face6);
        assertSame(face11, face5);
        assertNotSame(face11, face0);
        assertSame(face11, face4);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.OR, face11.getRes());
        assertNotNull(face11);

        Face face12 = de0.getFace();
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face9);
        assertNotEquals(face12, face4);
        assertSame(face12, face8);
        assertSame(face12, face1);
        assertNotSame(face12, face2);
        assertSame(face12, face3);
        assertSame(face12, face7);
        assertNotSame(face12, face11);
        assertNotSame(face12, face5);
        assertNotSame(face12, face6);
        assertNotSame(face12, face9);
        assertSame(face12, face0);
        assertSame(face12, face10);
        assertNotSame(face12, face4);
        assertEquals(Ressource.LUNAIRE, face12.getRes());
        assertEquals(1, (int) face12.getValeur());
        assertNotNull(face12);
    }

    @Test(timeout = 4000)
    public void test10() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        de0.InitDe2();
        Face face0 = de0.FACE2;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.FACE5 = face0;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(1, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.OR, de0.FACE5.getRes());

        de0.FACE1 = face0;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(1, (int) de0.FACE1.getValeur());
        assertEquals(Ressource.OR, de0.FACE1.getRes());

        Face face1 = de0.FACE3;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face2 = de0.FACE6;
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.VICTOIRE, face2.getRes());
        assertNotNull(face2);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.FACE5 = face2;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(2, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE5.getRes());

        Face face3 = de0.FACE1;
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        Face face4 = De.compare2Face(de0.FACE1, face3);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertSame(face3, face0);
        assertSame(face3, face4);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertSame(face4, face3);
        assertSame(face4, face0);
        assertNotSame(face4, face2);
        assertNotSame(face4, face1);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        de0.setFACE(face2);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.VICTOIRE, face2.getRes());

        de0.setFACE(face4);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertSame(face3, face0);
        assertSame(face3, face4);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertSame(face4, face3);
        assertSame(face4, face0);
        assertNotSame(face4, face2);
        assertNotSame(face4, face1);
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());

        Face face5 = de0.FACE6;
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face1);
        assertEquals(2, (int) face5.getValeur());
        assertEquals(Ressource.VICTOIRE, face5.getRes());
        assertNotNull(face5);

        de0.setFACE(face5);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face1);
        assertEquals(2, (int) face5.getValeur());
        assertEquals(Ressource.VICTOIRE, face5.getRes());

        Face face6 = De.compare2Face(de0.FACE5, face1);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face4);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face5);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertSame(face6, face2);
        assertSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face1, face3);
        assertNotSame(face1, face6);
        assertNotSame(face1, face2);
        assertNotSame(face1, face4);
        assertNotSame(face1, face0);
        assertNotSame(face1, face5);
        assertEquals(Ressource.VICTOIRE, face6.getRes());
        assertEquals(2, (int) face6.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face6);

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face6);
        assertSame(face7, face3);
        assertNotSame(face7, face5);
        assertSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face2);
        assertSame(face7, face4);
        assertNotSame(face7, face6);
        assertEquals(2, (int) face7.getValeur());
        assertEquals(Ressource.VICTOIRE, face7.getRes());
        assertNotNull(face7);

        de0.InitDe2();
        de0.setFACE(face3);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face6);
        assertSame(face3, face7);
        assertSame(face3, face0);
        assertSame(face3, face4);
        assertNotSame(face3, face5);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.VICTOIRE, face3.getRes());

        de0.InitDe2();
        de0.setFACE(face1);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face4);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face5);
        assertNotEquals(face1, face7);
        assertNotSame(face1, face3);
        assertNotSame(face1, face6);
        assertNotSame(face1, face2);
        assertNotSame(face1, face4);
        assertNotSame(face1, face0);
        assertNotSame(face1, face5);
        assertNotSame(face1, face7);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());

        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        de0.InitDe2();
        de0.InitDe2();
        de0.InitDe1();
        Face face8 = De.compare2Face(face4, face5);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face6);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face4, face5);
        assertNotEquals(face4, face6);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face7);
        assertNotSame(face8, face1);
        assertNotSame(face8, face5);
        assertSame(face8, face7);
        assertNotSame(face8, face2);
        assertSame(face8, face4);
        assertNotSame(face8, face6);
        assertSame(face8, face3);
        assertSame(face8, face0);
        assertNotSame(face3, face6);
        assertSame(face3, face7);
        assertSame(face3, face0);
        assertSame(face3, face4);
        assertNotSame(face3, face5);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertSame(face3, face8);
        assertSame(face4, face3);
        assertNotSame(face4, face5);
        assertSame(face4, face0);
        assertNotSame(face4, face6);
        assertNotSame(face4, face2);
        assertSame(face4, face7);
        assertNotSame(face4, face1);
        assertSame(face4, face8);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face8);
        assertNotSame(face5, face1);
        assertNotSame(face5, face7);
        assertSame(face5, face6);
        assertEquals(2, (int) face8.getValeur());
        assertEquals(Ressource.VICTOIRE, face8.getRes());
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.VICTOIRE, face3.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertEquals(Ressource.VICTOIRE, face5.getRes());
        assertNotNull(face8);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertNotEquals(string3, string2);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face8);
        assertNotSame(face9, face3);
        assertNotSame(face9, face5);
        assertNotSame(face9, face2);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face7);
        assertNotSame(face9, face0);
        assertNotSame(face9, face6);
        assertNotSame(face9, face8);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);
    }

    @Test(timeout = 4000)
    public void test11() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE1;
        assertNull(face0);

        de0.FACE6 = null;
        de0.InitDe1();
        Face face1 = de0.getFace();
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        Face face2 = de0.FACE6;
        assertNotEquals(face2, face1);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.SOLAIRE, face2.getRes());
        assertNotNull(face2);

        de0.FACE5 = null;
        Random.setNextRandom(4459);
        Face face3 = de0.getFace();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        // Undeclared exception!
        try {
            de0.FACEMIN();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE5);
        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = De.compare2Face(de0.FACE3, de0.FACE6);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertEquals(string3, string2);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACE3;
        assertSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());

        String string4 = de0.toString();
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string3);
        assertEquals(string5, string4);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.VICTOIRE, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertNotSame(face3, face1);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.FACE2 = face3;
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face3);
        assertNotSame(face4, face3);
        assertNotSame(face4, face2);
        assertSame(face4, face1);
        assertSame(face4, face0);
        assertNotSame(face0, face3);
        assertSame(face0, face1);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertSame(face1, face4);
        assertSame(face1, face0);
        assertNotSame(face1, face2);
        assertNotSame(face1, face3);
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face2);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face4);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.LUNAIRE, face5.getRes());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face5);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.VICTOIRE, face2.getRes());
        assertEquals(1, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string1);
        assertEquals("VICTOIRE 1\nVICTOIRE 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face5);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.VICTOIRE, face2.getRes());
        assertEquals(1, (int) face2.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotSame(face7, face3);
        assertNotSame(face7, face6);
        assertNotSame(face7, face1);
        assertNotSame(face7, face5);
        assertNotSame(face7, face0);
        assertNotSame(face7, face4);
        assertNotSame(face7, face2);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face3);
        assertNotSame(face8, face6);
        assertNotSame(face8, face4);
        assertNotSame(face8, face5);
        assertNotSame(face8, face0);
        assertNotSame(face8, face1);
        assertNotSame(face8, face2);
        assertSame(face8, face7);
        assertNotSame(face8, face3);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face5);
        assertNotSame(face0, face6);
        assertNotSame(face0, face3);
        assertSame(face0, face1);
        assertNotSame(face0, face8);
        assertNotSame(face0, face7);
        assertSame(face0, face4);
        assertNotSame(face0, face2);
        assertNotSame(face0, face5);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face1);
        assertNotSame(face9, face6);
        assertNotSame(face9, face8);
        assertNotSame(face9, face4);
        assertNotSame(face9, face7);
        assertNotSame(face9, face2);
        assertNotSame(face9, face5);
        assertNotSame(face9, face3);
        assertNotSame(face9, face0);
        assertNotSame(face9, face1);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Face face10 = De.compare2Face(face6, face4);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face9);
        assertNotEquals(face4, face9);
        assertNotEquals(face4, face8);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face6);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face7);
        assertNotEquals(face4, face5);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face9);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face5);
        assertNotEquals(face1, face8);
        assertNotEquals(face1, face9);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face5);
        assertNotEquals(face1, face3);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face2);
        assertNotSame(face10, face2);
        assertNotSame(face10, face7);
        assertNotSame(face10, face3);
        assertNotSame(face10, face0);
        assertNotSame(face10, face1);
        assertSame(face10, face6);
        assertNotSame(face10, face8);
        assertNotSame(face10, face4);
        assertNotSame(face10, face5);
        assertNotSame(face10, face9);
        assertNotSame(face4, face9);
        assertNotSame(face4, face8);
        assertNotSame(face4, face3);
        assertNotSame(face4, face6);
        assertNotSame(face4, face10);
        assertNotSame(face4, face2);
        assertNotSame(face4, face7);
        assertNotSame(face4, face5);
        assertSame(face4, face1);
        assertSame(face4, face0);
        assertNotSame(face0, face6);
        assertNotSame(face0, face3);
        assertSame(face0, face1);
        assertNotSame(face0, face8);
        assertNotSame(face0, face7);
        assertNotSame(face0, face10);
        assertSame(face0, face4);
        assertNotSame(face0, face9);
        assertNotSame(face0, face2);
        assertNotSame(face0, face5);
        assertNotSame(face1, face8);
        assertNotSame(face1, face9);
        assertSame(face1, face4);
        assertNotSame(face1, face6);
        assertSame(face1, face0);
        assertNotSame(face1, face7);
        assertNotSame(face1, face10);
        assertNotSame(face1, face2);
        assertNotSame(face1, face5);
        assertNotSame(face1, face3);
        assertNotSame(face6, face3);
        assertSame(face6, face10);
        assertNotSame(face6, face4);
        assertNotSame(face6, face8);
        assertNotSame(face6, face7);
        assertNotSame(face6, face1);
        assertNotSame(face6, face5);
        assertNotSame(face6, face0);
        assertNotSame(face6, face9);
        assertNotSame(face6, face2);
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face10);

        String string7 = de0.toString();
        assertNotEquals(string7, string5);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string3);
        assertNotEquals(string7, string0);
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string6);
        assertNotEquals(string7, string4);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);
    }

    @Test(timeout = 4000)
    public void test13() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE5);
        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = de0.getFace();
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertEquals(string3, string2);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string4 = de0.toString();
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string0);
        assertEquals(string5, string4);
        assertNotEquals(string5, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.FACE2 = de0.FACE4;
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face2);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertSame(face4, face1);
        assertSame(face4, face0);
        assertNotSame(face0, face2);
        assertSame(face0, face1);
        assertNotSame(face0, face3);
        assertSame(face0, face4);
        assertSame(face1, face4);
        assertNotSame(face1, face3);
        assertNotSame(face1, face2);
        assertSame(face1, face0);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face1);
        assertNotSame(face5, face4);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face4);
        assertNotSame(face2, face3);
        assertSame(face2, face5);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string3);
        assertEquals("OR 2\nOR 2\nOR 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face4);
        assertNotSame(face2, face3);
        assertSame(face2, face5);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face5);
        assertNotSame(face7, face3);
        assertNotSame(face7, face2);
        assertNotSame(face7, face0);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face5);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face1);
        assertNotSame(face8, face6);
        assertNotSame(face8, face5);
        assertNotSame(face8, face4);
        assertSame(face8, face7);
        assertNotSame(face8, face3);
        assertNotSame(face8, face2);
        assertNotSame(face8, face0);
        assertNotSame(face8, face1);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face3);
        assertNotSame(face0, face6);
        assertSame(face0, face1);
        assertNotSame(face0, face2);
        assertNotSame(face0, face5);
        assertNotSame(face0, face7);
        assertNotSame(face0, face8);
        assertNotSame(face0, face3);
        assertSame(face0, face4);
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(2, (int) face0.getValeur());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face1);
        assertNotSame(face9, face0);
        assertNotSame(face9, face5);
        assertNotSame(face9, face7);
        assertNotSame(face9, face2);
        assertNotSame(face9, face8);
        assertNotSame(face9, face3);
        assertNotSame(face9, face4);
        assertNotSame(face9, face6);
        assertNotSame(face9, face1);
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);

        Face face10 = De.compare2Face(face6, face4);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face1);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face8);
        assertNotEquals(face4, face5);
        assertNotEquals(face4, face9);
        assertNotEquals(face4, face7);
        assertNotEquals(face4, face6);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face9);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face3);
        assertNotEquals(face1, face5);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face9);
        assertNotEquals(face1, face8);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face7);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face8);
        assertNotSame(face10, face0);
        assertNotSame(face10, face7);
        assertSame(face10, face6);
        assertNotSame(face10, face2);
        assertNotSame(face10, face9);
        assertNotSame(face10, face8);
        assertNotSame(face10, face5);
        assertNotSame(face10, face4);
        assertNotSame(face10, face3);
        assertNotSame(face10, face1);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face8);
        assertNotSame(face4, face5);
        assertSame(face4, face1);
        assertNotSame(face4, face9);
        assertNotSame(face4, face7);
        assertNotSame(face4, face6);
        assertNotSame(face4, face10);
        assertSame(face4, face0);
        assertNotSame(face0, face6);
        assertNotSame(face0, face10);
        assertSame(face0, face1);
        assertNotSame(face0, face2);
        assertNotSame(face0, face9);
        assertNotSame(face0, face5);
        assertNotSame(face0, face7);
        assertNotSame(face0, face8);
        assertNotSame(face0, face3);
        assertSame(face0, face4);
        assertNotSame(face1, face5);
        assertNotSame(face1, face6);
        assertNotSame(face1, face10);
        assertSame(face1, face4);
        assertNotSame(face1, face9);
        assertNotSame(face1, face8);
        assertNotSame(face1, face3);
        assertNotSame(face1, face2);
        assertNotSame(face1, face7);
        assertSame(face1, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face9);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face7);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face8);
        assertSame(face6, face10);
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face10);

        String string7 = de0.toString();
        assertNotEquals(string7, string0);
        assertNotEquals(string7, string6);
        assertNotEquals(string7, string4);
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string5);
        assertNotEquals(string7, string3);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        String string8 = de0.toString();
        assertNotEquals(string8, string1);
        assertEquals(string8, string7);
        assertNotEquals(string8, string4);
        assertNotEquals(string8, string2);
        assertNotEquals(string8, string0);
        assertNotEquals(string8, string3);
        assertNotEquals(string8, string6);
        assertNotEquals(string8, string5);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string8);
        assertNotNull(string8);

        String string9 = de0.toString();
        assertNotEquals(string9, string2);
        assertNotEquals(string9, string0);
        assertNotEquals(string9, string4);
        assertEquals(string9, string7);
        assertNotEquals(string9, string5);
        assertEquals(string9, string8);
        assertNotEquals(string9, string3);
        assertNotEquals(string9, string6);
        assertNotEquals(string9, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string9);
        assertNotNull(string9);

        Random.setNextRandom(1738);
    }

    @Test(timeout = 4000)
    public void test14() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        Face face0 = de0.FACE4;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.FACE6 = face0;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(1, (int) de0.FACE6.getValeur());
        assertEquals(Ressource.OR, de0.FACE6.getRes());

        de0.setFACE(de0.FACE5);
        String string2 = de0.toString();
        assertNotEquals(string2, string0);
        assertNotEquals(string2, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nLUNAIRE 1", string2);
        assertNotNull(string2);

        Face face1 = de0.getFace();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nLUNAIRE 1", string3);
        assertNotNull(string3);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face0);
        assertNotSame(face2, face0);
        assertSame(face2, face1);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face0);
        assertSame(face2, face1);
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        String string4 = de0.toString();
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string0);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string1);
        assertEquals(string5, string4);
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string0);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face3 = de0.getFace();
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(2, (int) face3.getValeur());
        assertNotNull(face3);

        Face face4 = de0.FACEMIN();
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face0);
        assertNotSame(face4, face1);
        assertNotSame(face4, face3);
        assertNotSame(face4, face2);
        assertNotSame(face4, face0);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertNotNull(face4);

        de0.FACE2 = face4;
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face5 = De.compare2Face(face2, face1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face3);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face4);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertSame(face5, face1);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face1, face3);
        assertNotSame(face1, face0);
        assertSame(face1, face5);
        assertNotSame(face1, face4);
        assertSame(face1, face2);
        assertNotSame(face2, face3);
        assertNotSame(face2, face0);
        assertNotSame(face2, face4);
        assertSame(face2, face1);
        assertSame(face2, face5);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(2, (int) face5.getValeur());
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face5);

        de0.setFACE(face3);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face4);
        assertNotSame(face3, face0);
        assertNotSame(face3, face5);
        assertNotSame(face3, face1);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(2, (int) face3.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string3);
        assertEquals("OR 2\nOR 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        de0.setFACE(face3);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face4);
        assertNotSame(face3, face0);
        assertNotSame(face3, face5);
        assertNotSame(face3, face1);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(2, (int) face3.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face3);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face3);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face3);
        assertNotSame(face7, face2);
        assertNotSame(face7, face5);
        assertNotSame(face7, face4);
        assertNotSame(face7, face0);
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face0);
        assertNotSame(face8, face6);
        assertNotSame(face8, face3);
        assertNotSame(face8, face1);
        assertNotSame(face8, face2);
        assertNotSame(face8, face5);
        assertNotSame(face8, face4);
        assertNotSame(face8, face0);
        assertSame(face8, face7);
        assertEquals(Ressource.OR, face8.getRes());
        assertEquals(1, (int) face8.getValeur());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face1);
        assertNotEquals(face1, face8);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face4);
        assertNotEquals(face1, face6);
        assertNotSame(face1, face8);
        assertNotSame(face1, face3);
        assertNotSame(face1, face7);
        assertNotSame(face1, face0);
        assertSame(face1, face5);
        assertNotSame(face1, face4);
        assertNotSame(face1, face6);
        assertSame(face1, face2);
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face8);
        assertNotSame(face9, face6);
        assertNotSame(face9, face3);
        assertNotSame(face9, face1);
        assertNotSame(face9, face2);
        assertNotSame(face9, face5);
        assertNotSame(face9, face4);
        assertNotSame(face9, face7);
        assertNotSame(face9, face0);
        assertNotSame(face9, face8);
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);

        String string7 = de0.toString();
        assertNotEquals(string7, string6);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string3);
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string4);
        assertNotEquals(string7, string0);
        assertNotEquals(string7, string5);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        Face face10 = de0.FACEMIN();
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face8);
        assertNotSame(face10, face5);
        assertNotSame(face10, face3);
        assertNotSame(face10, face7);
        assertNotSame(face10, face0);
        assertNotSame(face10, face6);
        assertNotSame(face10, face4);
        assertNotSame(face10, face2);
        assertSame(face10, face9);
        assertNotSame(face10, face1);
        assertNotSame(face10, face8);
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertNotNull(face10);
    }

    @Test(timeout = 4000)
    public void test15() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE1;
        assertNull(face0);

        de0.FACE6 = null;
        de0.InitDe1();
        Face face1 = de0.getFace();
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = De.compare2Face(de0.FACE4, de0.FACE3);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        de0.FACE5 = null;
        Random.setNextRandom(4438);
        Face face3 = de0.getFace();
        assertNull(face3);

        // Undeclared exception!
        try {
            de0.FACEMIN();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() {
        Random.setNextRandom(4);
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE5;
        assertNull(face0);

        de0.FACE4 = null;
        Face face1 = de0.getFace();
        assertNull(face1);

        de0.FACE2 = null;
        // Undeclared exception!
        try {
            de0.setFACE(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(2, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE5);
        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = de0.getFace();
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertEquals(string3, string2);
        assertNotEquals(string3, string1);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertSame(face1, face0);
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());

        String string4 = de0.toString();
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string0);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string2);
        assertEquals(string5, string4);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string1);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.FACE2 = face3;
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face2);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face2);
        assertSame(face4, face0);
        assertSame(face4, face1);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertSame(face0, face4);
        assertSame(face0, face1);
        assertNotSame(face0, face3);
        assertNotSame(face0, face2);
        assertNotSame(face1, face3);
        assertSame(face1, face0);
        assertNotSame(face1, face2);
        assertSame(face1, face4);
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face0);
        assertSame(face5, face2);
        assertNotSame(face5, face3);
        assertNotSame(face5, face1);
        assertNotSame(face5, face4);
        assertEquals(2, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertNotSame(face2, face1);
        assertSame(face2, face5);
        assertNotSame(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face3);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string2);
        assertEquals("OR 2\nOR 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertNotSame(face2, face1);
        assertSame(face2, face5);
        assertNotSame(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face3);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face2);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face2);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face3);
        assertNotSame(face7, face6);
        assertNotSame(face7, face5);
        assertNotSame(face7, face2);
        assertNotSame(face7, face0);
        assertNotSame(face7, face4);
        assertNotSame(face7, face1);
        assertNotSame(face7, face3);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotSame(face8, face1);
        assertNotSame(face8, face3);
        assertNotSame(face8, face2);
        assertNotSame(face8, face5);
        assertSame(face8, face7);
        assertNotSame(face8, face0);
        assertNotSame(face8, face4);
        assertNotSame(face8, face6);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face2);
        assertNotSame(face0, face8);
        assertNotSame(face0, face6);
        assertSame(face0, face4);
        assertSame(face0, face1);
        assertNotSame(face0, face7);
        assertNotSame(face0, face3);
        assertNotSame(face0, face5);
        assertNotSame(face0, face2);
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face6);
        assertNotSame(face9, face5);
        assertNotSame(face9, face4);
        assertNotSame(face9, face8);
        assertNotSame(face9, face0);
        assertNotSame(face9, face1);
        assertNotSame(face9, face3);
        assertNotSame(face9, face2);
        assertNotSame(face9, face7);
        assertNotSame(face9, face6);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);
    }

    @Test(timeout = 4000)
    public void test18() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        Face face0 = de0.FACE5;
        assertEquals(Ressource.LUNAIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.FACE6 = face0;
        assertEquals(Ressource.LUNAIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.LUNAIRE, de0.FACE6.getRes());
        assertEquals(1, (int) de0.FACE6.getValeur());

        Face face1 = de0.FACEMIN();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = De.compare2Face(face1, de0.FACE5);
        assertNotEquals(face1, face0);
        assertNotEquals(face2, face0);
        assertSame(face1, face2);
        assertNotSame(face1, face0);
        assertSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        Face face3 = de0.FACE5;
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(Ressource.LUNAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        de0.setFACE(face3);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(Ressource.LUNAIRE, face3.getRes());
        assertEquals(1, (int) face3.getValeur());

        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face3);
        assertSame(face1, face2);
        assertNotSame(face1, face0);
        assertNotSame(face1, face3);
        assertEquals(Ressource.LUNAIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face4 = de0.getFace();
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face2);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertNotSame(face4, face1);
        assertNotSame(face4, face2);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertNotNull(face4);

        de0.InitDe1();
        Face face5 = de0.getFace();
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face2);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face2);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        Face face6 = de0.getFace();
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face4);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertSame(face6, face5);
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(1, (int) face6.getValeur());
        assertNotNull(face6);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        de0.InitDe2();
        Face face7 = de0.getFace();
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face4);
        assertNotSame(face7, face2);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face5);
        assertNotSame(face7, face3);
        assertNotSame(face7, face4);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = De.compare2Face(de0.FACE6, face2);
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face0);
        assertNotEquals(face1, face6);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face7);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face4);
        assertNotEquals(face1, face5);
        assertNotEquals(face2, face7);
        assertNotEquals(face2, face6);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face5);
        assertNotSame(face8, face5);
        assertNotSame(face8, face6);
        assertNotSame(face8, face7);
        assertNotSame(face8, face3);
        assertNotSame(face8, face4);
        assertNotSame(face8, face0);
        assertSame(face8, face2);
        assertSame(face8, face1);
        assertNotSame(face1, face6);
        assertSame(face1, face2);
        assertNotSame(face1, face0);
        assertNotSame(face1, face7);
        assertNotSame(face1, face3);
        assertNotSame(face1, face4);
        assertSame(face1, face8);
        assertNotSame(face1, face5);
        assertSame(face2, face1);
        assertNotSame(face2, face7);
        assertNotSame(face2, face6);
        assertNotSame(face2, face0);
        assertSame(face2, face8);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertNotSame(face2, face5);
        assertEquals(Ressource.LUNAIRE, face8.getRes());
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.LUNAIRE, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.LUNAIRE, face2.getRes());
        assertNotNull(face8);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face8);
        assertSame(face9, face7);
        assertNotSame(face9, face0);
        assertNotSame(face9, face5);
        assertNotSame(face9, face3);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face6);
        assertNotSame(face9, face2);
        assertNotSame(face9, face8);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);
    }

    @Test(timeout = 4000)
    public void test19() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        Face face0 = de0.FACE3;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.setFACE(face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());

        de0.FACE2 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face1 = de0.FACE6;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        de0.setFACE(face0);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face2);
        assertNotSame(face0, face1);
        assertNotSame(face0, face2);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
    }

    @Test(timeout = 4000)
    public void test20() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        Face face0 = de0.FACE1;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        Face face1 = De.compare2Face(de0.FACE5, face0);
        assertSame(face0, face1);
        assertSame(face1, face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        de0.FACE4 = face1;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(Ressource.OR, de0.FACE4.getRes());
        assertEquals(1, (int) de0.FACE4.getValeur());

        Face face2 = de0.getFace();
        assertSame(face2, face1);
        assertSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        Face face3 = De.compare2Face(de0.FACE1, de0.FACE6);
        assertSame(face3, face1);
        assertSame(face3, face2);
        assertSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.setFACE(face3);
        assertSame(face3, face1);
        assertSame(face3, face2);
        assertSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());

        de0.InitDe2();
        de0.setFACE(face2);
        assertSame(face2, face3);
        assertSame(face2, face1);
        assertSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face4 = de0.FACEMIN();
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face2);
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        Face face5 = de0.getFace();
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertSame(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face1);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        Face face6 = De.compare2Face(de0.FACE2, de0.FACE6);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotSame(face6, face4);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face3);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face4);
        assertNotEquals(face3, face6);
        assertSame(face3, face1);
        assertNotSame(face3, face5);
        assertSame(face3, face2);
        assertSame(face3, face0);
        assertNotSame(face3, face4);
        assertNotSame(face3, face6);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
    }

    @Test(timeout = 4000)
    public void test21() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE4;
        assertNull(face0);

        de0.FACE5 = null;
        de0.FACE6 = null;
        de0.FACE1 = null;
        de0.InitDe1();
        de0.InitDe1();
        Face face1 = de0.FACE6;
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.SOLAIRE, face1.getRes());
        assertNotNull(face1);

        Face face2 = De.compare2Face(face1, de0.FACE3);
        assertNotEquals(face2, face1);
        assertNotSame(face1, face2);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.SOLAIRE, face1.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        Face face3 = De.compare2Face(de0.FACE4, de0.FACE4);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face1);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        // Undeclared exception!
        try {
            de0.setFACE(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        de0.InitDe1();
        Face face0 = De.compare2Face(de0.FACE2, de0.FACE6);
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.FACE4 = face0;
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, de0.FACE4.getRes());
        assertEquals(1, (int) de0.FACE4.getValeur());

        de0.InitDe2();
        de0.InitDe1();
    }

    @Test(timeout = 4000)
    public void test23() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        de0.InitDe2();
        Face face0 = de0.FACEMIN();
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.FACE4 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE4.getValeur());
        assertEquals(Ressource.OR, de0.FACE4.getRes());

        de0.setFACE(face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());

        de0.FACE2 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        String string2 = de0.toString();
        assertEquals(string2, string0);
        assertEquals(string2, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face1 = de0.getFace();
        assertSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertEquals(string3, string1);
        assertEquals(string3, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face2 = De.compare2Face(de0.FACE4, de0.FACE4);
        assertSame(face0, face1);
        assertSame(face0, face2);
        assertSame(de0.FACE4, face2);
        assertSame(de0.FACE4, face0);
        assertSame(de0.FACE4, face1);
        assertSame(face2, face1);
        assertSame(face2, face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE4.getValeur());
        assertEquals(Ressource.OR, de0.FACE4.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        Face face3 = de0.getFace();
        assertSame(face3, face2);
        assertSame(face3, face1);
        assertSame(face3, face0);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        Face face4 = de0.FACE6;
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face0);
        assertNotSame(face4, face1);
        assertNotSame(face4, face2);
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(2, (int) face4.getValeur());
        assertNotNull(face4);

        de0.setFACE(face4);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face2);
        assertNotSame(face4, face3);
        assertNotSame(face4, face0);
        assertNotSame(face4, face1);
        assertNotSame(face4, face2);
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(2, (int) face4.getValeur());

        Face face5 = de0.getFace();
        assertNotEquals(face5, face4);
        assertSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face4);
        assertSame(face5, face0);
        assertSame(face5, face1);
        assertEquals(2, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);
    }



    @Test(timeout = 4000)
    public void test25() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        Face face0 = de0.FACE6;
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertNotNull(face0);

        de0.FACE5 = face0;
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(2, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE5.getRes());

        Face face1 = de0.FACE2;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);

        de0.FACE3 = face1;
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(1, (int) de0.FACE3.getValeur());
        assertEquals(Ressource.OR, de0.FACE3.getRes());

        Face face2 = De.compare2Face(de0.FACE6, face1);
        assertNotEquals(face1, face0);
        assertNotEquals(face2, face0);
        assertSame(face1, face2);
        assertNotSame(face1, face0);
        assertSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nVICTOIRE 2\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.InitDe2();
        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);
    }

    @Test(timeout = 4000)
    public void test26() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        Face face0 = de0.FACE6;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertNotNull(face0);

        de0.FACE6 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(Ressource.SOLAIRE, de0.FACE6.getRes());
        assertEquals(1, (int) de0.FACE6.getValeur());

        Face face1 = de0.FACE5;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        de0.FACE1 = face1;
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) de0.FACE1.getValeur());
        assertEquals(Ressource.OR, de0.FACE1.getRes());

        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        de0.InitDe1();
        Face face2 = De.compare2Face(de0.FACE5, de0.FACE5);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face1);
        assertNotSame(face0, face2);
        assertNotSame(face0, face1);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.SOLAIRE, face0.getRes());

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.InitDe2();
        Face face4 = de0.getFace();
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotSame(face4, face2);
        assertNotSame(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertNotNull(face4);

        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face2);
        assertNotSame(face5, face0);
        assertNotSame(face5, face3);
        assertSame(face5, face4);
        assertNotSame(face5, face1);
        assertNotSame(face5, face2);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        de0.InitDe1();
        Face face6 = de0.getFace();
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face5);
        assertNotSame(face6, face4);
        assertNotSame(face6, face0);
        assertNotSame(face6, face2);
        assertNotSame(face6, face1);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);
    }

    @Test(timeout = 4000)
    public void test27() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        Face face0 = De.compare2Face(de0.FACE1, de0.FACE4);
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        de0.InitDe2();
        Face face1 = de0.FACEMIN();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);
    }

    @Test(timeout = 4000)
    public void test28() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.getFace();
        assertNull(face0);

        de0.InitDe2();
        Face face1 = de0.FACE6;
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertNotNull(face1);

        de0.setFACE(face1);
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());

        de0.FACE1 = face1;
        assertEquals(2, (int) face1.getValeur());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(Ressource.VICTOIRE, de0.FACE1.getRes());
        assertEquals(2, (int) de0.FACE1.getValeur());

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face1);
        assertNotSame(face2, face1);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        de0.InitDe2();
        Face face3 = De.compare2Face(de0.FACE5, de0.FACE2);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);
    }

    @Test(timeout = 4000)
    public void test29() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        Face face0 = de0.FACE5;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.setFACE(face0);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
    }

    @Test(timeout = 4000)
    public void test30() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        Face face0 = de0.getFace();
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);
    }

    @Test(timeout = 4000)
    public void test31() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE1;
        assertNull(face0);

        Face face1 = de0.getFace();
        assertNull(face1);

        de0.FACE5 = null;
        de0.FACE3 = null;
        de0.FACE1 = null;
        // Undeclared exception!
        try {
            de0.toString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test32() {
        De de0 = new De();
        assertNotNull(de0);

        // Undeclared exception!
        try {
            de0.FACEMIN();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.FACE6;
        assertNull(face0);

        de0.FACE5 = null;
        // Undeclared exception!
        try {
            de0.setFACE(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test34() {
        De de0 = new De();
        assertNotNull(de0);

        // Undeclared exception!
        try {
            de0.toString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }

    @Test(timeout = 4000)
    public void test35() {
        De de0 = new De();
        assertNotNull(de0);

        Face face0 = de0.getFace();
        assertNull(face0);

        // Undeclared exception!
        try {
            de0.setFACE(null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("De.De", e);
        }
    }


    @Test(timeout = 4000)
    public void test37() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        de0.InitDe2();
        Face face0 = De.compare2Face(de0.FACE4, de0.FACE4);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.FACE2 = face0;
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        de0.setFACE(de0.FACE6);
        de0.InitDe2();
        de0.InitDe1();
        Face face1 = de0.FACE6;
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.SOLAIRE, face1.getRes());
        assertNotNull(face1);

        Face face2 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotEquals(face1, face2);
        assertNotSame(face1, face0);
        assertNotSame(face1, face2);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.SOLAIRE, face1.getRes());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        String string2 = de0.toString();
        assertEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        Face face3 = de0.getFace();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.SOLAIRE, face3.getRes());
        assertNotNull(face3);

        String string3 = de0.toString();
        assertEquals(string3, string1);
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face3);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face3);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());

        Face face4 = de0.getFace();
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face0);
        assertNotSame(face4, face1);
        assertNotSame(face4, face2);
        assertSame(face4, face3);
        assertNotSame(face4, face0);
        assertEquals(1, (int) face4.getValeur());
        assertEquals(Ressource.SOLAIRE, face4.getRes());
        assertNotNull(face4);

        de0.InitDe2();
        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face1);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);

        Face face6 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Face face7 = de0.getFace();
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face3);
        assertNotSame(face7, face4);
        assertSame(face7, face5);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face3);
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        String string4 = de0.toString();
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        Face face8 = De.compare2Face(de0.FACE1, de0.FACE5);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face4);
        assertNotSame(face8, face6);
        assertNotSame(face8, face0);
        assertNotSame(face8, face1);
        assertSame(face8, face5);
        assertNotSame(face8, face3);
        assertNotSame(face8, face2);
        assertSame(face8, face7);
        assertNotSame(face8, face4);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.setFACE(face3);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face8);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face6);
        assertSame(face3, face4);
        assertNotSame(face3, face8);
        assertNotSame(face3, face5);
        assertNotSame(face3, face7);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.SOLAIRE, face3.getRes());

        Face face9 = De.compare2Face(de0.FACE6, face7);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face3);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face0);
        assertNotSame(face7, face4);
        assertSame(face7, face5);
        assertNotSame(face7, face0);
        assertNotSame(face7, face2);
        assertNotSame(face7, face1);
        assertNotSame(face7, face6);
        assertSame(face7, face8);
        assertNotSame(face7, face3);
        assertSame(face7, face9);
        assertSame(face9, face8);
        assertNotSame(face9, face3);
        assertSame(face9, face5);
        assertSame(face9, face7);
        assertNotSame(face9, face2);
        assertNotSame(face9, face6);
        assertNotSame(face9, face4);
        assertNotSame(face9, face1);
        assertNotSame(face9, face0);
        assertEquals(Ressource.SOLAIRE, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.SOLAIRE, face9.getRes());
        assertNotNull(face9);

        Face face10 = De.compare2Face(de0.FACE4, face6);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face8);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face2);
        assertNotSame(face6, face7);
        assertNotSame(face6, face9);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face0);
        assertNotSame(face6, face10);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face8);
        assertNotSame(face10, face7);
        assertNotSame(face10, face5);
        assertNotSame(face10, face8);
        assertNotSame(face10, face1);
        assertNotSame(face10, face9);
        assertNotSame(face10, face0);
        assertNotSame(face10, face4);
        assertNotSame(face10, face6);
        assertNotSame(face10, face3);
        assertNotSame(face10, face2);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertNotNull(face10);

        String string5 = de0.toString();
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string4);
        assertNotEquals(string5, string1);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face11 = De.compare2Face(face3, de0.FACE5);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face6);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face10);
        assertNotEquals(face3, face6);
        assertNotEquals(face3, face8);
        assertNotEquals(face3, face5);
        assertNotEquals(face3, face7);
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face9);
        assertNotEquals(face3, face10);
        assertNotEquals(face3, face2);
        assertNotSame(face11, face0);
        assertNotSame(face11, face4);
        assertNotSame(face11, face1);
        assertNotSame(face11, face9);
        assertNotSame(face11, face7);
        assertNotSame(face11, face5);
        assertNotSame(face11, face8);
        assertNotSame(face11, face3);
        assertNotSame(face11, face6);
        assertNotSame(face11, face2);
        assertNotSame(face11, face10);
        assertNotSame(face3, face6);
        assertSame(face3, face4);
        assertNotSame(face3, face8);
        assertNotSame(face3, face5);
        assertNotSame(face3, face7);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face9);
        assertNotSame(face3, face10);
        assertNotSame(face3, face11);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.LUNAIRE, face11.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.SOLAIRE, face3.getRes());
        assertNotNull(face11);

        Face face12 = de0.FACE2;
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face10);
        assertNotEquals(face12, face9);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face8);
        assertNotSame(face12, face4);
        assertNotSame(face12, face3);
        assertNotSame(face12, face11);
        assertNotSame(face12, face2);
        assertNotSame(face12, face10);
        assertNotSame(face12, face9);
        assertNotSame(face12, face7);
        assertNotSame(face12, face1);
        assertNotSame(face12, face0);
        assertSame(face12, face6);
        assertNotSame(face12, face5);
        assertNotSame(face12, face8);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertNotNull(face12);

        Face face13 = De.compare2Face(face10, face12);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face11);
        assertNotEquals(face6, face10);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face8);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face12);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face9);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face11);
        assertNotEquals(face10, face2);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face10);
        assertNotEquals(face12, face9);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face8);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face6);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face8);
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face0);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face1);
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face12);
        assertNotSame(face6, face1);
        assertNotSame(face6, face2);
        assertNotSame(face6, face3);
        assertNotSame(face6, face10);
        assertNotSame(face6, face4);
        assertNotSame(face6, face5);
        assertNotSame(face6, face8);
        assertNotSame(face6, face7);
        assertNotSame(face6, face9);
        assertSame(face6, face12);
        assertNotSame(face6, face0);
        assertNotSame(face6, face13);
        assertNotSame(face6, face11);
        assertNotSame(face10, face7);
        assertNotSame(face10, face5);
        assertNotSame(face10, face12);
        assertNotSame(face10, face8);
        assertNotSame(face10, face9);
        assertNotSame(face10, face0);
        assertNotSame(face10, face11);
        assertNotSame(face10, face2);
        assertNotSame(face10, face1);
        assertNotSame(face10, face4);
        assertNotSame(face10, face6);
        assertNotSame(face10, face3);
        assertSame(face10, face13);
        assertNotSame(face12, face4);
        assertNotSame(face12, face3);
        assertNotSame(face12, face13);
        assertNotSame(face12, face2);
        assertNotSame(face12, face9);
        assertNotSame(face12, face1);
        assertNotSame(face12, face0);
        assertNotSame(face12, face11);
        assertNotSame(face12, face10);
        assertNotSame(face12, face7);
        assertSame(face12, face6);
        assertNotSame(face12, face5);
        assertNotSame(face12, face8);
        assertNotSame(face13, face11);
        assertNotSame(face13, face6);
        assertNotSame(face13, face8);
        assertNotSame(face13, face5);
        assertNotSame(face13, face7);
        assertSame(face13, face10);
        assertNotSame(face13, face4);
        assertNotSame(face13, face2);
        assertNotSame(face13, face3);
        assertNotSame(face13, face0);
        assertNotSame(face13, face1);
        assertNotSame(face13, face9);
        assertNotSame(face13, face12);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.OR, face13.getRes());
        assertNotNull(face13);

        Face face14 = de0.FACEMIN();
        assertNotEquals(face14, face3);
        assertNotEquals(face14, face5);
        assertNotEquals(face14, face4);
        assertNotEquals(face14, face2);
        assertNotEquals(face14, face10);
        assertNotEquals(face14, face11);
        assertNotEquals(face14, face8);
        assertNotEquals(face14, face0);
        assertNotEquals(face14, face9);
        assertNotEquals(face14, face1);
        assertNotEquals(face14, face13);
        assertNotEquals(face14, face7);
        assertSame(face14, face12);
        assertNotSame(face14, face5);
        assertNotSame(face14, face11);
        assertNotSame(face14, face0);
        assertNotSame(face14, face9);
        assertNotSame(face14, face1);
        assertNotSame(face14, face13);
        assertNotSame(face14, face3);
        assertSame(face14, face6);
        assertNotSame(face14, face4);
        assertNotSame(face14, face2);
        assertNotSame(face14, face10);
        assertNotSame(face14, face8);
        assertNotSame(face14, face7);
        assertEquals(1, (int) face14.getValeur());
        assertEquals(Ressource.OR, face14.getRes());
        assertNotNull(face14);

        Face face15 = De.compare2Face(de0.FACE5, face0);
        assertNotEquals(face15, face4);
        assertNotEquals(face15, face2);
        assertNotEquals(face15, face3);
        assertNotEquals(face15, face8);
        assertNotEquals(face15, face10);
        assertNotEquals(face15, face5);
        assertNotEquals(face15, face7);
        assertNotEquals(face15, face6);
        assertNotEquals(face15, face14);
        assertNotEquals(face15, face13);
        assertNotEquals(face15, face0);
        assertNotEquals(face15, face1);
        assertNotEquals(face15, face9);
        assertNotEquals(face15, face12);
        assertNotEquals(face0, face9);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face12);
        assertNotEquals(face0, face13);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face10);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face14);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face11);
        assertNotSame(face15, face4);
        assertNotSame(face15, face2);
        assertNotSame(face15, face3);
        assertNotSame(face15, face8);
        assertNotSame(face15, face10);
        assertNotSame(face15, face5);
        assertNotSame(face15, face7);
        assertNotSame(face15, face6);
        assertNotSame(face15, face14);
        assertNotSame(face15, face13);
        assertNotSame(face15, face0);
        assertSame(face15, face11);
        assertNotSame(face15, face1);
        assertNotSame(face15, face9);
        assertNotSame(face15, face12);
        assertNotSame(face0, face9);
        assertNotSame(face0, face5);
        assertNotSame(face0, face8);
        assertNotSame(face0, face12);
        assertNotSame(face0, face15);
        assertNotSame(face0, face13);
        assertNotSame(face0, face7);
        assertNotSame(face0, face4);
        assertNotSame(face0, face6);
        assertNotSame(face0, face3);
        assertNotSame(face0, face10);
        assertNotSame(face0, face1);
        assertNotSame(face0, face14);
        assertNotSame(face0, face2);
        assertNotSame(face0, face11);
        assertEquals(Ressource.LUNAIRE, face15.getRes());
        assertEquals(1, (int) face15.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face15);
    }

    @Test(timeout = 4000)
    public void test38() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        de0.InitDe2();
        de0.FACE2 = de0.FACE6;
        assertEquals(2, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());

        de0.setFACE(de0.FACE6);
        de0.InitDe2();
        de0.InitDe1();
        Face face0 = de0.FACE6;
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        de0.setFACE(face0);
        assertNotEquals(face0, face1);
        assertNotSame(face0, face1);
        assertEquals(Ressource.SOLAIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        String string2 = de0.toString();
        assertEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.SOLAIRE, face2.getRes());
        assertNotNull(face2);

        String string3 = de0.toString();
        assertEquals(string3, string1);
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        de0.setFACE(face1);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face2);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face2);
        assertSame(face3, face1);
        assertNotSame(face3, face0);
        assertNotSame(face3, face2);
        assertEquals(1, (int) face3.getValeur());
        assertEquals(Ressource.OR, face3.getRes());
        assertNotNull(face3);

        de0.InitDe2();
        Face face4 = de0.FACEMIN();
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face2);
        assertNotSame(face4, face1);
        assertNotSame(face4, face3);
        assertNotSame(face4, face0);
        assertNotSame(face4, face2);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertNotNull(face4);

        Face face5 = de0.FACE4;
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face4);
        assertNotSame(face5, face0);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        Face face6 = de0.FACE5;
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotSame(face6, face3);
        assertNotSame(face6, face2);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.LUNAIRE, face6.getRes());
        assertNotNull(face6);

        String string4 = de0.toString();
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string2);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string3);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string4);
        assertNotNull(string4);

        Face face7 = De.compare2Face(de0.FACE1, de0.FACE5);
        assertNotEquals(face7, face6);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face1);
        assertNotSame(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face5);
        assertNotSame(face7, face2);
        assertNotSame(face7, face3);
        assertNotSame(face7, face1);
        assertSame(face7, face4);
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(1, (int) face7.getValeur());
        assertNotNull(face7);

        de0.setFACE(face2);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face6);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face7);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face5);
        assertNotSame(face2, face1);
        assertNotSame(face2, face6);
        assertNotSame(face2, face4);
        assertNotSame(face2, face3);
        assertNotSame(face2, face7);
        assertNotSame(face2, face0);
        assertNotSame(face2, face5);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.SOLAIRE, face2.getRes());

        Face face8 = De.compare2Face(de0.FACE6, face6);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face5);
        assertNotSame(face6, face3);
        assertNotSame(face6, face7);
        assertNotSame(face6, face2);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertSame(face6, face8);
        assertNotSame(face8, face4);
        assertNotSame(face8, face7);
        assertNotSame(face8, face2);
        assertNotSame(face8, face3);
        assertNotSame(face8, face1);
        assertNotSame(face8, face0);
        assertNotSame(face8, face5);
        assertSame(face8, face6);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.LUNAIRE, face6.getRes());
        assertEquals(Ressource.LUNAIRE, face8.getRes());
        assertEquals(1, (int) face8.getValeur());
        assertNotNull(face8);

        Face face9 = De.compare2Face(face6, de0.FACE2);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face5);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face4);
        assertNotSame(face6, face9);
        assertNotSame(face6, face3);
        assertNotSame(face6, face7);
        assertNotSame(face6, face2);
        assertNotSame(face6, face4);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face5);
        assertSame(face6, face8);
        assertNotSame(face9, face7);
        assertNotSame(face9, face8);
        assertNotSame(face9, face3);
        assertNotSame(face9, face1);
        assertNotSame(face9, face0);
        assertNotSame(face9, face5);
        assertNotSame(face9, face6);
        assertNotSame(face9, face2);
        assertNotSame(face9, face4);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.LUNAIRE, face6.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        Face face10 = De.compare2Face(de0.FACE4, face5);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face8);
        assertNotEquals(face5, face7);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face9);
        assertNotEquals(face5, face6);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face7);
        assertNotEquals(face10, face9);
        assertNotSame(face5, face1);
        assertSame(face5, face10);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face8);
        assertNotSame(face5, face7);
        assertNotSame(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face9);
        assertNotSame(face5, face6);
        assertNotSame(face10, face0);
        assertNotSame(face10, face6);
        assertSame(face10, face5);
        assertNotSame(face10, face3);
        assertNotSame(face10, face2);
        assertNotSame(face10, face8);
        assertNotSame(face10, face4);
        assertNotSame(face10, face1);
        assertNotSame(face10, face7);
        assertNotSame(face10, face9);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertEquals(1, (int) face10.getValeur());
        assertNotNull(face10);

        String string5 = de0.toString();
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string2);
        assertNotEquals(string5, string3);
        assertNotEquals(string5, string4);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string5);
        assertNotNull(string5);

        Face face11 = De.compare2Face(face2, de0.FACE5);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face4);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face5);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face9);
        assertNotEquals(face2, face6);
        assertNotEquals(face2, face10);
        assertNotEquals(face2, face8);
        assertNotEquals(face2, face4);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face7);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face5);
        assertNotSame(face11, face3);
        assertNotSame(face11, face10);
        assertNotSame(face11, face7);
        assertNotSame(face11, face2);
        assertNotSame(face11, face4);
        assertNotSame(face11, face9);
        assertNotSame(face11, face1);
        assertNotSame(face11, face0);
        assertNotSame(face11, face5);
        assertSame(face11, face8);
        assertSame(face11, face6);
        assertNotSame(face2, face1);
        assertNotSame(face2, face9);
        assertNotSame(face2, face6);
        assertNotSame(face2, face10);
        assertNotSame(face2, face8);
        assertNotSame(face2, face4);
        assertNotSame(face2, face3);
        assertNotSame(face2, face7);
        assertNotSame(face2, face0);
        assertNotSame(face2, face5);
        assertNotSame(face2, face11);
        assertEquals(1, (int) face11.getValeur());
        assertEquals(Ressource.LUNAIRE, face11.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.SOLAIRE, face2.getRes());
        assertNotNull(face11);

        String string6 = de0.toString();
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string1);
        assertEquals(string6, string5);
        assertNotEquals(string6, string0);
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string2);
        assertEquals("SOLAIRE 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string6);
        assertNotNull(string6);

        Face face12 = De.compare2Face(de0.FACE2, de0.FACE2);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face10);
        assertNotEquals(face12, face8);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face0);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face4);
        assertNotSame(face12, face2);
        assertNotSame(face12, face10);
        assertNotSame(face12, face8);
        assertNotSame(face12, face11);
        assertSame(face12, face9);
        assertNotSame(face12, face3);
        assertNotSame(face12, face0);
        assertNotSame(face12, face5);
        assertNotSame(face12, face1);
        assertNotSame(face12, face6);
        assertNotSame(face12, face7);
        assertNotSame(face12, face4);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertNotNull(face12);
    }

    @Test(timeout = 4000)
    public void test39() {
        De de0 = new De();
        assertNotNull(de0);

        de0.FACE6 = null;
        de0.InitDe1();
        Face face0 = De.compare2Face(de0.FACE4, de0.FACE3);
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face0.getRes());
        assertNotNull(face0);

        de0.FACE5 = de0.FACE3;
        assertEquals(1, (int) de0.FACE5.getValeur());
        assertEquals(Ressource.OR, de0.FACE5.getRes());

        Face face1 = de0.getFace();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(1, (int) face1.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertNotNull(face1);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face0);
        assertSame(face2, face1);
        assertNotSame(face2, face0);
        assertEquals(1, (int) face2.getValeur());
        assertEquals(Ressource.OR, face2.getRes());
        assertNotNull(face2);

        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string0);
        assertNotNull(string0);

        Random.setNextRandom(4438);
        String string1 = de0.toString();
        assertEquals(string1, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string1);
        assertNotNull(string1);

        Face face3 = de0.getFace();
        assertNotEquals(face3, face0);
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotSame(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        Face face4 = de0.getFace();
        assertNotEquals(face4, face1);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face0);
        assertNotSame(face4, face1);
        assertSame(face4, face3);
        assertNotSame(face4, face2);
        assertNotSame(face4, face0);
        assertEquals(Ressource.OR, face4.getRes());
        assertEquals(1, (int) face4.getValeur());
        assertNotNull(face4);

        String string2 = de0.toString();
        assertEquals(string2, string0);
        assertEquals(string2, string1);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string2);
        assertNotNull(string2);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertEquals(string3, string1);
        assertEquals(string3, string0);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        Random.setNextRandom((-1564));
        Random.setNextRandom((-1791));
        String string4 = de0.toString();
        assertEquals(string4, string0);
        assertEquals(string4, string2);
        assertEquals(string4, string1);
        assertEquals(string4, string3);
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string4);
        assertNotNull(string4);

        Face face5 = de0.FACEMIN();
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face0);
        assertNotSame(face5, face3);
        assertSame(face5, face2);
        assertNotSame(face5, face4);
        assertSame(face5, face1);
        assertNotSame(face5, face0);
        assertEquals(1, (int) face5.getValeur());
        assertEquals(Ressource.OR, face5.getRes());
        assertNotNull(face5);
    }

    @Test(timeout = 4000)
    public void test40() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());
        assertEquals(2, (int) de0.FACE2.getValeur());

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE5);
        Face face0 = De.compare2Face(de0.FACE3, de0.FACE6);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 2\nVICTOIRE 2\nVICTOIRE 1\nLUNAIRE 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        Face face1 = de0.FACEMIN();
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.InitDe2();
        de0.setFACE(face1);
        assertNotEquals(face1, face0);
        assertNotSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("OR 2\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face2 = de0.FACEMIN();
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(1, (int) face2.getValeur());
        assertNotNull(face2);

        de0.FACE2 = face2;
        assertEquals(1, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.OR, de0.FACE2.getRes());

        Face face3 = De.compare2Face(face1, face0);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face0);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face1);
        assertNotEquals(face1, face2);
        assertNotEquals(face1, face0);
        assertSame(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face0);
        assertNotSame(face0, face2);
        assertNotSame(face0, face3);
        assertNotSame(face0, face1);
        assertNotSame(face1, face2);
        assertNotSame(face1, face0);
        assertSame(face1, face3);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(2, (int) face3.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face3);

        Face face4 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face4, face0);
        assertNotEquals(face4, face3);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face1);
        assertNotSame(face4, face0);
        assertNotSame(face4, face3);
        assertNotSame(face4, face2);
        assertNotSame(face4, face1);
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.OR, face4.getRes());
        assertNotNull(face4);

        de0.setFACE(de0.FACE5);
        de0.setFACE(de0.FACE4);
        de0.InitDe2();
        de0.InitDe2();
        Face face5 = de0.FACE3;
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face1);
        assertNotSame(face5, face4);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        de0.setFACE(face5);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face3);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face4);
        assertNotSame(face5, face0);
        assertNotSame(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face1);
        assertNotSame(face5, face4);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());

        Face face6 = de0.FACEMIN();
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face3);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face3);
        assertNotSame(face6, face5);
        assertNotSame(face6, face2);
        assertNotSame(face6, face1);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        Face face7 = de0.getFace();
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face3);
        assertNotSame(face7, face2);
        assertNotSame(face7, face5);
        assertSame(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face4);
        assertNotSame(face7, face3);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face2);
        assertNotEquals(face0, face4);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face1);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face7);
        assertNotSame(face0, face6);
        assertNotSame(face0, face2);
        assertNotSame(face0, face4);
        assertNotSame(face0, face3);
        assertNotSame(face0, face1);
        assertNotSame(face0, face5);
        assertNotSame(face0, face7);
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(1, (int) face0.getValeur());

        Face face8 = de0.FACEMIN();
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face7);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face6);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face5);
        assertNotSame(face8, face2);
        assertNotSame(face8, face3);
        assertNotSame(face8, face1);
        assertNotSame(face8, face7);
        assertNotSame(face8, face4);
        assertNotSame(face8, face6);
        assertNotSame(face8, face0);
        assertNotSame(face8, face5);
        assertEquals(Ressource.OR, face8.getRes());
        assertEquals(1, (int) face8.getValeur());
        assertNotNull(face8);

        String string3 = de0.toString();
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertNotEquals(string3, string2);
        assertEquals("VICTOIRE 1\nOR 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string3);
        assertNotNull(string3);

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face4);
        assertNotSame(face9, face3);
        assertNotSame(face9, face5);
        assertNotSame(face9, face0);
        assertNotSame(face9, face2);
        assertSame(face9, face8);
        assertNotSame(face9, face1);
        assertNotSame(face9, face6);
        assertNotSame(face9, face7);
        assertNotSame(face9, face4);
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertNotNull(face9);

        Face face10 = De.compare2Face(face9, face7);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face8);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face9);
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face3);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face6);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face4);
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face7);
        assertNotSame(face7, face2);
        assertNotSame(face7, face5);
        assertNotSame(face7, face8);
        assertSame(face7, face6);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face10);
        assertNotSame(face7, face9);
        assertNotSame(face7, face4);
        assertNotSame(face7, face3);
        assertNotSame(face9, face3);
        assertNotSame(face9, face5);
        assertNotSame(face9, face0);
        assertNotSame(face9, face2);
        assertSame(face9, face8);
        assertNotSame(face9, face1);
        assertNotSame(face9, face6);
        assertNotSame(face9, face7);
        assertNotSame(face9, face4);
        assertSame(face9, face10);
        assertSame(face10, face9);
        assertNotSame(face10, face2);
        assertNotSame(face10, face3);
        assertNotSame(face10, face6);
        assertNotSame(face10, face4);
        assertSame(face10, face8);
        assertNotSame(face10, face1);
        assertNotSame(face10, face0);
        assertNotSame(face10, face5);
        assertNotSame(face10, face7);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertEquals(Ressource.OR, face9.getRes());
        assertEquals(1, (int) face9.getValeur());
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Random.setNextRandom(0);
        Random.setNextRandom(0);
    }

    @Test(timeout = 4000)
    public void test41() {
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe2();
        String string0 = de0.toString();
        assertEquals("OR 1\nOR 1\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string0);
        assertNotNull(string0);

        de0.FACE2 = de0.FACE6;
        assertEquals(2, (int) de0.FACE2.getValeur());
        assertEquals(Ressource.VICTOIRE, de0.FACE2.getRes());

        String string1 = de0.toString();
        assertNotEquals(string1, string0);
        assertEquals("OR 1\nVICTOIRE 2\nOR 1\nOR 1\nLUNAIRE 1\nVICTOIRE 2", string1);
        assertNotNull(string1);

        de0.setFACE(de0.FACE6);
        de0.setFACE(de0.FACE6);
        String string2 = de0.toString();
        assertNotEquals(string2, string1);
        assertNotEquals(string2, string0);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string2);
        assertNotNull(string2);

        Face face0 = de0.getFace();
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertNotNull(face0);

        String string3 = de0.toString();
        assertEquals(string3, string2);
        assertNotEquals(string3, string0);
        assertNotEquals(string3, string1);
        assertEquals("VICTOIRE 2\nVICTOIRE 2\nVICTOIRE 1\nOR 2\nLUNAIRE 1\nVICTOIRE 2", string3);
        assertNotNull(string3);

        Face face1 = de0.FACEMIN();
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face1);

        de0.InitDe1();
        de0.InitDe1();
        de0.setFACE(face1);
        assertSame(face1, face0);
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());

        String string4 = de0.toString();
        assertNotEquals(string4, string3);
        assertNotEquals(string4, string0);
        assertNotEquals(string4, string1);
        assertNotEquals(string4, string2);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string4);
        assertNotNull(string4);

        String string5 = de0.toString();
        assertNotEquals(string5, string3);
        assertEquals(string5, string4);
        assertNotEquals(string5, string0);
        assertNotEquals(string5, string1);
        assertNotEquals(string5, string2);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string5);
        assertNotNull(string5);

        Face face2 = de0.getFace();
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());
        assertNotNull(face2);

        Face face3 = de0.FACEMIN();
        assertNotEquals(face3, face1);
        assertNotEquals(face3, face2);
        assertNotEquals(face3, face0);
        assertNotSame(face3, face1);
        assertNotSame(face3, face2);
        assertNotSame(face3, face0);
        assertEquals(Ressource.OR, face3.getRes());
        assertEquals(1, (int) face3.getValeur());
        assertNotNull(face3);

        Face face4 = De.compare2Face(face1, face0);
        assertNotEquals(face4, face2);
        assertNotEquals(face4, face3);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face2);
        assertNotEquals(face1, face3);
        assertNotEquals(face1, face2);
        assertSame(face4, face0);
        assertSame(face4, face1);
        assertNotSame(face4, face2);
        assertNotSame(face4, face3);
        assertSame(face0, face4);
        assertNotSame(face0, face3);
        assertSame(face0, face1);
        assertNotSame(face0, face2);
        assertSame(face1, face4);
        assertNotSame(face1, face3);
        assertNotSame(face1, face2);
        assertSame(face1, face0);
        assertEquals(2, (int) face4.getValeur());
        assertEquals(Ressource.VICTOIRE, face4.getRes());
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());
        assertEquals(Ressource.VICTOIRE, face1.getRes());
        assertEquals(2, (int) face1.getValeur());
        assertNotNull(face4);

        Face face5 = De.compare2Face(de0.FACE5, de0.FACE1);
        assertNotEquals(face5, face2);
        assertNotEquals(face5, face0);
        assertNotEquals(face5, face4);
        assertNotEquals(face5, face1);
        assertNotEquals(face5, face3);
        assertNotSame(face5, face2);
        assertNotSame(face5, face0);
        assertNotSame(face5, face4);
        assertNotSame(face5, face1);
        assertNotSame(face5, face3);
        assertEquals(Ressource.OR, face5.getRes());
        assertEquals(1, (int) face5.getValeur());
        assertNotNull(face5);

        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face5);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        String string6 = de0.toString();
        assertNotEquals(string6, string3);
        assertNotEquals(string6, string5);
        assertNotEquals(string6, string1);
        assertNotEquals(string6, string2);
        assertNotEquals(string6, string4);
        assertNotEquals(string6, string0);
        assertEquals("OR 2\nVICTOIRE 1\nOR 2\nOR 1\nOR 1\nSOLAIRE 1", string6);
        assertNotNull(string6);

        de0.setFACE(face2);
        assertNotEquals(face2, face0);
        assertNotEquals(face2, face1);
        assertNotEquals(face2, face5);
        assertNotEquals(face2, face3);
        assertNotEquals(face2, face4);
        assertNotSame(face2, face0);
        assertNotSame(face2, face1);
        assertNotSame(face2, face5);
        assertNotSame(face2, face3);
        assertNotSame(face2, face4);
        assertEquals(Ressource.OR, face2.getRes());
        assertEquals(2, (int) face2.getValeur());

        de0.InitDe2();
        de0.InitDe2();
        Face face6 = de0.FACE3;
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face6);

        de0.setFACE(face6);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face3);
        assertNotSame(face6, face1);
        assertNotSame(face6, face0);
        assertNotSame(face6, face4);
        assertNotSame(face6, face2);
        assertNotSame(face6, face5);
        assertNotSame(face6, face3);
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());

        Face face7 = de0.FACEMIN();
        assertNotEquals(face7, face4);
        assertNotEquals(face7, face2);
        assertNotEquals(face7, face0);
        assertNotEquals(face7, face1);
        assertNotEquals(face7, face3);
        assertNotEquals(face7, face5);
        assertNotEquals(face7, face6);
        assertNotSame(face7, face4);
        assertNotSame(face7, face2);
        assertNotSame(face7, face0);
        assertNotSame(face7, face1);
        assertNotSame(face7, face3);
        assertNotSame(face7, face5);
        assertNotSame(face7, face6);
        assertEquals(1, (int) face7.getValeur());
        assertEquals(Ressource.OR, face7.getRes());
        assertNotNull(face7);

        Face face8 = de0.getFace();
        assertNotEquals(face8, face5);
        assertNotEquals(face8, face4);
        assertNotEquals(face8, face2);
        assertNotEquals(face8, face0);
        assertNotEquals(face8, face3);
        assertNotEquals(face8, face1);
        assertNotEquals(face8, face6);
        assertNotSame(face8, face5);
        assertNotSame(face8, face4);
        assertNotSame(face8, face2);
        assertNotSame(face8, face0);
        assertSame(face8, face7);
        assertNotSame(face8, face3);
        assertNotSame(face8, face1);
        assertNotSame(face8, face6);
        assertEquals(1, (int) face8.getValeur());
        assertEquals(Ressource.OR, face8.getRes());
        assertNotNull(face8);

        de0.InitDe1();
        de0.setFACE(face0);
        assertNotEquals(face0, face6);
        assertNotEquals(face0, face5);
        assertNotEquals(face0, face8);
        assertNotEquals(face0, face3);
        assertNotEquals(face0, face7);
        assertNotEquals(face0, face2);
        assertSame(face0, face4);
        assertNotSame(face0, face6);
        assertNotSame(face0, face5);
        assertNotSame(face0, face8);
        assertNotSame(face0, face3);
        assertNotSame(face0, face7);
        assertSame(face0, face1);
        assertNotSame(face0, face2);
        assertEquals(2, (int) face0.getValeur());
        assertEquals(Ressource.VICTOIRE, face0.getRes());

        Face face9 = de0.FACEMIN();
        assertNotEquals(face9, face2);
        assertNotEquals(face9, face3);
        assertNotEquals(face9, face7);
        assertNotEquals(face9, face5);
        assertNotEquals(face9, face8);
        assertNotEquals(face9, face1);
        assertNotEquals(face9, face4);
        assertNotEquals(face9, face0);
        assertNotEquals(face9, face6);
        assertNotSame(face9, face2);
        assertNotSame(face9, face3);
        assertNotSame(face9, face7);
        assertNotSame(face9, face5);
        assertNotSame(face9, face8);
        assertNotSame(face9, face1);
        assertNotSame(face9, face4);
        assertNotSame(face9, face0);
        assertNotSame(face9, face6);
        assertEquals(1, (int) face9.getValeur());
        assertEquals(Ressource.OR, face9.getRes());
        assertNotNull(face9);

        String string7 = de0.toString();
        assertEquals(string7, string5);
        assertNotEquals(string7, string0);
        assertEquals(string7, string4);
        assertNotEquals(string7, string1);
        assertNotEquals(string7, string3);
        assertNotEquals(string7, string2);
        assertNotEquals(string7, string6);
        assertEquals("OR 2\nVICTOIRE 1\nOR 1\nOR 1\nOR 1\nSOLAIRE 1", string7);
        assertNotNull(string7);

        Face face10 = de0.FACEMIN();
        assertNotEquals(face10, face2);
        assertNotEquals(face10, face6);
        assertNotEquals(face10, face4);
        assertNotEquals(face10, face0);
        assertNotEquals(face10, face1);
        assertNotEquals(face10, face8);
        assertNotEquals(face10, face5);
        assertNotEquals(face10, face3);
        assertNotEquals(face10, face7);
        assertNotSame(face10, face2);
        assertNotSame(face10, face6);
        assertSame(face10, face9);
        assertNotSame(face10, face4);
        assertNotSame(face10, face0);
        assertNotSame(face10, face1);
        assertNotSame(face10, face8);
        assertNotSame(face10, face5);
        assertNotSame(face10, face3);
        assertNotSame(face10, face7);
        assertEquals(1, (int) face10.getValeur());
        assertEquals(Ressource.OR, face10.getRes());
        assertNotNull(face10);

        Random.setNextRandom(2537);
        Face face11 = De.compare2Face(face6, de0.FACE6);
        assertNotEquals(face11, face1);
        assertNotEquals(face11, face0);
        assertNotEquals(face11, face7);
        assertNotEquals(face11, face8);
        assertNotEquals(face11, face10);
        assertNotEquals(face11, face5);
        assertNotEquals(face11, face3);
        assertNotEquals(face11, face9);
        assertNotEquals(face11, face2);
        assertNotEquals(face11, face4);
        assertNotEquals(face6, face1);
        assertNotEquals(face6, face0);
        assertNotEquals(face6, face7);
        assertNotEquals(face6, face4);
        assertNotEquals(face6, face9);
        assertNotEquals(face6, face2);
        assertNotEquals(face6, face10);
        assertNotEquals(face6, face5);
        assertNotEquals(face6, face8);
        assertNotEquals(face6, face3);
        assertNotSame(face11, face1);
        assertNotSame(face11, face0);
        assertNotSame(face11, face7);
        assertNotSame(face11, face8);
        assertNotSame(face11, face10);
        assertNotSame(face11, face5);
        assertNotSame(face11, face3);
        assertNotSame(face11, face9);
        assertNotSame(face11, face2);
        assertSame(face11, face6);
        assertNotSame(face11, face4);
        assertNotSame(face6, face1);
        assertSame(face6, face11);
        assertNotSame(face6, face0);
        assertNotSame(face6, face7);
        assertNotSame(face6, face4);
        assertNotSame(face6, face9);
        assertNotSame(face6, face2);
        assertNotSame(face6, face10);
        assertNotSame(face6, face5);
        assertNotSame(face6, face8);
        assertNotSame(face6, face3);
        assertEquals(Ressource.OR, face11.getRes());
        assertEquals(1, (int) face11.getValeur());
        assertEquals(1, (int) face6.getValeur());
        assertEquals(Ressource.OR, face6.getRes());
        assertNotNull(face11);

        Face face12 = de0.FACEMIN();
        assertNotEquals(face12, face3);
        assertNotEquals(face12, face1);
        assertNotEquals(face12, face8);
        assertNotEquals(face12, face7);
        assertNotEquals(face12, face6);
        assertNotEquals(face12, face4);
        assertNotEquals(face12, face2);
        assertNotEquals(face12, face5);
        assertNotEquals(face12, face11);
        assertNotEquals(face12, face0);
        assertSame(face12, face9);
        assertNotSame(face12, face3);
        assertNotSame(face12, face1);
        assertNotSame(face12, face8);
        assertNotSame(face12, face7);
        assertNotSame(face12, face4);
        assertNotSame(face12, face6);
        assertNotSame(face12, face2);
        assertNotSame(face12, face5);
        assertSame(face12, face10);
        assertNotSame(face12, face11);
        assertNotSame(face12, face0);
        assertEquals(1, (int) face12.getValeur());
        assertEquals(Ressource.OR, face12.getRes());
        assertNotNull(face12);

        Face face13 = de0.getFace();
        assertNotEquals(face13, face10);
        assertNotEquals(face13, face4);
        assertNotEquals(face13, face3);
        assertNotEquals(face13, face9);
        assertNotEquals(face13, face8);
        assertNotEquals(face13, face6);
        assertNotEquals(face13, face2);
        assertNotEquals(face13, face11);
        assertNotEquals(face13, face12);
        assertNotEquals(face13, face0);
        assertNotEquals(face13, face7);
        assertNotEquals(face13, face5);
        assertNotEquals(face13, face1);
        assertNotSame(face13, face10);
        assertNotSame(face13, face4);
        assertNotSame(face13, face3);
        assertNotSame(face13, face9);
        assertNotSame(face13, face8);
        assertNotSame(face13, face6);
        assertNotSame(face13, face2);
        assertNotSame(face13, face11);
        assertNotSame(face13, face12);
        assertNotSame(face13, face0);
        assertNotSame(face13, face7);
        assertNotSame(face13, face5);
        assertNotSame(face13, face1);
        assertEquals(1, (int) face13.getValeur());
        assertEquals(Ressource.SOLAIRE, face13.getRes());
        assertNotNull(face13);

        Random.setNextRandom(2537);
    }

    @Test(timeout = 4000)
    public void test42() {
        Random.setNextRandom((-1));
        De de0 = new De();
        assertNotNull(de0);

        de0.InitDe1();
        Face face0 = de0.getFace();
        assertEquals(Ressource.OR, face0.getRes());
        assertEquals(1, (int) face0.getValeur());
        assertNotNull(face0);

        Face face1 = de0.getFace();
        assertSame(face1, face0);
        assertEquals(Ressource.OR, face1.getRes());
        assertEquals(1, (int) face1.getValeur());
        assertNotNull(face1);
    }


    @Test(timeout = 4000)
    public void test44() {
        De de0 = new De();
        de0.InitDe1();
        de0.InitDe2();
        Face face0 = De.compare2Face(de0.FACE4, de0.FACE4);
        de0.FACE2 = face0;
        de0.setFACE(de0.FACE6);
        de0.InitDe2();
        de0.InitDe1();
        Face face1 = de0.FACE4;
        Face face2 = De.compare2Face(de0.FACE6, de0.FACE2);
        de0.toString();
        de0.setFACE(face1);
        de0.toString();
        Face face3 = de0.getFace();
        de0.toString();
        de0.setFACE(face2);
        de0.FACEMIN();
        de0.InitDe2();
        Face face4 = De.compare2Face(de0.FACE6, de0.FACE2);
        Face face5 = de0.getFace();
        de0.toString();
        De.compare2Face(de0.FACE1, de0.FACE5);
        de0.setFACE(face3);
        De.compare2Face(de0.FACE6, face5);
        De.compare2Face(de0.FACE4, face4);
        de0.toString();
        Face face6 = de0.FACE5;
        De.compare2Face(face6, face0);
        de0.FACEMIN();
        De.compare2Face(de0.FACE6, face6);
        de0.FACEMIN();
        Random.setNextRandom((-3003));
        Random.setNextRandom(10);
    }

    @Test(timeout = 4000)
    public void test45() {
        De de0 = new De();
        de0.InitDe2();
        de0.InitDe2();
        Face face0 = de0.FACE2;
        de0.FACE5 = face0;
        de0.FACE1 = face0;
        Face face1 = de0.getFace();
        de0.toString();
        Face face2 = de0.getFace();
        de0.toString();
        de0.FACE5 = face2;
        Face face3 = de0.FACE1;
        de0.setFACE(face2);
        de0.setFACE(de0.FACE6);
        Face face4 = de0.FACE6;
        de0.setFACE(face4);
        De.compare2Face(de0.FACE5, face1);
        de0.FACEMIN();
        de0.InitDe2();
        de0.setFACE(face3);
        assertEquals(Ressource.VICTOIRE, face3.getRes());

        de0.InitDe2();
        de0.setFACE(face1);
        de0.toString();
        de0.InitDe2();
        de0.InitDe2();
        de0.InitDe1();
        Face face5 = De.compare2Face(de0.FACE1, face4);
        de0.toString();
        Face face6 = de0.FACEMIN();
        assertSame(face6, face5);
    }
}
