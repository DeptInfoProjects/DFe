
package de;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestFace extends TestFace2 {

  @org.junit.Test(timeout = 4000)
  public void test00() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 3966;
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(3966, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test01() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 0;
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals(0, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test02() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals((-2011), (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test03() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-109);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getValeur();
      assertEquals((-109), (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test04() {
      Integer integer0 = 0;
      Face face0 = new Face(null, integer0, integer0, integer0, integer0);
      face0.getType();
  }

  @org.junit.Test(timeout = 4000)
  public void test05() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 1909;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      face0.getRes();
  }

  @org.junit.Test(timeout = 4000)
  public void test06() {
      Type type0 = Type.CHOIX;
      Face face0 = new Face(type0, null, null, null, null);
      Integer integer0 = face0.getNbVICT();
      assertNull(integer0);
  }

  @org.junit.Test(timeout = 4000)
  public void test07() {
      Type type0 = Type.PLUS;
      Integer integer0 = (-982);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals((-982), (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test08() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2297;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals(2297, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test09() {
      Type type0 = Type.PLUS;
      Integer integer0 = (-1003);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbSOL();
      assertEquals((-1003), (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() {
      Type type0 = Type.PLUS;
      Integer integer0 = 306;
      Integer integer1 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer1, integer1);
      Integer integer2 = face0.getNbSOL();
      assertEquals(0, (int)integer2);
      assertEquals(306, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals(306, (int)face0.getNbLUN());
  }

  @org.junit.Test(timeout = 4000)
  public void test11() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbSOL();
      assertEquals(2, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() {
      Type type0 = Type.PLUS;
      Integer integer0 = 479;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbSOL();
      assertEquals(479, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() {
      Type type0 = Type.PLUS;
      Integer integer0 = (-1003);
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals((-1003), (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals(0, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 3;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals(3, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() {
      Type type0 = Type.PLUS;
      Integer integer0 = 479;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbOR();
      assertEquals(479, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() {
      Integer integer0 = 0;
      Face face0 = new Face(null, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbLUN();
      assertEquals(0, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbLUN();
      assertEquals(2, (int)integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-5786);
      Integer integer1 = (-1);
      Face face0 = new Face(type0, integer0, integer1, integer1, integer0);
      Integer integer2 = face0.getNbLUN();
      assertEquals((-5786), (int)face0.getNbVICT());
      assertEquals((-1), (int)face0.getNbSOL());
      assertEquals((-1), (int)integer2);
      assertEquals((-5786), (int)face0.getNbOR());
  }

  @org.junit.Test(timeout = 4000)
  public void test20() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 1;
      Face face0 = new Face(type0, integer0, null, integer0, integer0);
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

  @org.junit.Test(timeout = 4000)
  public void test21() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Ressource ressource1 = face0.getRes();
      assertSame(ressource1, ressource0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() {
      Type type0 = Type.PLUS;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getValeur();
      assertNull(integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() {
      Integer integer0 = 1;
      Type type0 = Type.NORMAL;
      Integer integer1 = 3;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer1);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
      assertEquals(1, (int)face0.getNbSOL());
      assertEquals(1, (int)face0.getNbOR());
      assertEquals(1, (int)face0.getNbLUN());
  }

  @org.junit.Test(timeout = 4000)
  public void test24() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Integer integer1 = (-1);
      Face face0 = new Face(type0, integer0, integer0, integer1, integer1);
      face0.AfficheFace();
      assertEquals((-1), (int)face0.getNbVICT());
      assertEquals(2, (int)face0.getNbOR());
      assertEquals((-1), (int)face0.getNbSOL());
      assertEquals(2, (int)face0.getNbLUN());
  }

  @org.junit.Test(timeout = 4000)
  public void test25() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Integer integer1 = 3;
      Face face0 = new Face(type0, integer0, integer1, integer1, integer0);
      face0.AfficheFace();
      assertEquals(3, (int)face0.getNbSOL());
      assertEquals(2, (int)face0.getNbOR());
      assertEquals(3, (int)face0.getNbLUN());
      assertEquals(2, (int)face0.getNbVICT());
  }

  @org.junit.Test(timeout = 4000)
  public void test26() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 3;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Integer integer1 = (-1715);
      Face face0 = new Face(type0, integer0, integer1, integer0, integer0);
      face0.AfficheFace();
      assertEquals(0, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbSOL());
      assertEquals(0, (int)face0.getNbVICT());
      assertEquals((-1715), (int)face0.getNbLUN());
  }

  @org.junit.Test(timeout = 4000)
  public void test28() {
      Integer integer0 = 1;
      Type type0 = Type.PLUS;
      Integer integer1 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer1, integer0);
      String string0 = face0.AfficheFace();
      assertEquals(1, (int)face0.getNbLUN());
      assertEquals(1, (int)face0.getNbOR());
      assertEquals(1, (int)face0.getNbVICT());
      assertEquals("echec", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() {
      Integer integer0 = 1;
      Type type0 = Type.NORMAL;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[33m1\u001B[30m+\u001B[34m1\u001B[30m+\u001B[31m1\u001B[30m+\u001B[32m1    \u001B[0m", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() {
      Integer integer0 = 3;
      Integer integer1 = 1;
      Type type0 = Type.NORMAL;
      Face face0 = new Face(type0, integer1, integer0, integer0, integer0);
      face0.AfficheFace();
      assertEquals(3, (int)face0.getNbSOL());
      assertEquals(3, (int)face0.getNbVICT());
      assertEquals(3, (int)face0.getNbLUN());
      assertEquals(1, (int)face0.getNbOR());
  }

  @org.junit.Test(timeout = 4000)
  public void test31() {
      Ressource ressource0 = Ressource.VICTOIRE;
      Type type0 = Type.NORMAL;
      Integer integer0 = 1321;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[32m1321 VICTOIRE\u001B[0m", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2079);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[34m-2079 LUNAIRE\u001B[0m", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() {
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-1654);
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[33m-1654 OR\u001B[0m", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() {
      Type type0 = Type.PLUS;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      String string0 = face0.AfficheFace();
      assertEquals("echec", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbLUN();
      assertNull(integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      String string0 = face0.AfficheFace();
      assertEquals("\u001B[31m-2011 SOLAIRE\u001B[0m", string0);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbOR();
      assertNull(integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Integer integer1 = face0.getNbSOL();
      assertNull(integer1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() {
      Type type0 = Type.NORMAL;
      Integer integer0 = (-2011);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      Type type1 = face0.getType();
      assertSame(type0, type1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() {
      Type type0 = Type.CHOIX;
      Integer integer0 = 0;
      Face face0 = new Face(type0, integer0, integer0, integer0, integer0);
      Integer integer1 = face0.getNbVICT();
      assertEquals(0, (int)integer1);
  }
}
