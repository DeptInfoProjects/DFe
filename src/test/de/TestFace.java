

package de;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@SuppressWarnings("ALL")
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestFace extends TestFace2 {

  @Test(timeout = 4000)
  public void test00() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 1;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-1);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03() {
      Integer integer0 = 1;
      Face face0 = new Face(null, integer0, integer0, integer0, integer0);
      face0.getType();
  }

  @Test(timeout = 4000)
  public void test04() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 1;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Ressource ressource1 = face0.getRes();
      assertSame(ressource0, ressource1);
  }

  @Test(timeout = 4000)
  public void test05() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 4636;
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbVICT();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test06() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07() {
      Type type0 = Type.CHOIX;
      Integer integer0 = (-352);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals((-352), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbSOL();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09() {
      Type type0 = Type.PLUS;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbSOL();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 0;
      Integer integer1 = (-2876);
      Face face0 = new Face(type0, integer0, integer1, integer1, integer0);
      Integer integer2 = face0.getNbSOL();
      assertEquals(0, (int)face0.getNbOR());
      assertEquals((-2876), (int)face0.getNbLUN());
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals((-2876), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test11() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbOR();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test12() {
      Type type0 = Type.CHOIX;
      Integer integer0 = (-1958);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals((-1958), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test14() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2729;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals(2729, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test15() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbLUN();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test16() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbLUN();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17() {
      Type type0 = Type.CHOIX;
      Integer integer0 = (-2684);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbLUN();
      assertEquals((-2684), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test18() {
      Type type0 = Type.CHOIX;
      Integer integer0 = (-670);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      // Undeclared exception!
      try { 
        face0.AfficheFace();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.Face", e);
      }
  }

  @Test(timeout = 4000)
  public void test19() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 1;
      Integer integer1 = 709;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer1);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @Test(timeout = 4000)
  public void test20() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Integer integer1 = (-3618);
      Face face0 = new Face(type0, integer0, integer0, integer1, integer1);
      face0.AfficheFace();
      assertEquals(2, (int)face0.getNbOR());
      assertEquals((-3618), (int)face0.getNbSOL());
      assertEquals(2, (int)face0.getNbLUN());
      assertEquals((-3618), (int)face0.getNbVICT());
  }

  @Test(timeout = 4000)
  public void test21() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 3;
      Integer integer1 = 0;
      Face face0 = new Face(type0, integer0, integer1, integer0, null);
      assertEquals(3, (int)face0.getNbSOL());
      
      face0.AfficheFace();
      assertEquals(3, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbLUN());
  }

  @Test(timeout = 4000)
  public void test22() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 3;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @Test(timeout = 4000)
  public void test23() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 0;
      Integer integer1 = (-2876);
      Face face0 = new Face(type0, integer0, integer1, integer1, integer0);
      face0.AfficheFace();
      assertEquals(0, (int)face0.getNbOR());
      assertEquals((-2876), (int)face0.getNbLUN());
      assertEquals((-2876), (int)face0.getNbSOL());
      assertEquals(0, (int)face0.getNbVICT());
  }

  @Test(timeout = 4000)
  public void test24() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @Test(timeout = 4000)
  public void test25() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Integer integer1 = (-1178);
      Face face0 = new Face(type0, integer0, integer0, integer1, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
      assertEquals(1, (int)face0.getNbLUN());
      assertEquals(1, (int)face0.getNbOR());
      assertEquals(1, (int)face0.getNbVICT());
  }

  @Test(timeout = 4000)
  public void test26() {
      Type type0 = Type.PLUS;
      Integer integer0 = 1;
      Integer integer1 = (-1205);
      Face face0 = new Face(type0, integer0, integer1, integer1, integer0);
      face0.AfficheFace();
      assertEquals((-1205), (int)face0.getNbLUN());
      assertEquals(1, (int)face0.getNbVICT());
      assertEquals((-1205), (int)face0.getNbSOL());
      assertEquals(1, (int)face0.getNbOR());
  }

  @Test(timeout = 4000)
  public void test27() {
      Type type0 = Type.PLUS;
      Integer integer0 = 2;
      Integer integer1 = 1;
      Face face0 = new Face(type0, integer0, integer1, integer0, integer1);
      face0.AfficheFace();
      assertEquals(2, (int)face0.getNbSOL());
      assertEquals(2, (int)face0.getNbOR());
      assertEquals(1, (int)face0.getNbLUN());
      assertEquals(1, (int)face0.getNbVICT());
  }

  @Test(timeout = 4000)
  public void test28() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-3046);
      Ressource ressource0 = Ressource.VICTOIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[32m-3046 VICTOIRE\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test29() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @Test(timeout = 4000)
  public void test30() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2277;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[31m2277 SOLAIRE\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test31() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-3270);
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[33m-3270 OR\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test32() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[33m1\u001B[30m+\u001B[34m1\u001B[30m+\u001B[31m1\u001B[30m+\u001B[32m1    \u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test33() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      face0.getRes();
  }

  @Test(timeout = 4000)
  public void test34() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbLUN();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test35() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getValeur();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test36() {
      Type type0 = Type.NORMAL;
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, null, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[34mnull LUNAIRE\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test37() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbSOL();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test38() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Type type1 = face0.getType();
      assertSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test39() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals(1, (int)integer1);
  }
}
