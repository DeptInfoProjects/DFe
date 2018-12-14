
package de;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestDe extends TestDe2 {

  @Test(timeout = 4000)
  public void test00() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      de0.FACE6 = de0.FACE5;
      de0.FACE5 = de0.faceMin();
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face1);
      de0.getFace();
      Face face2 = de0.getFace();
      de0.initDe1();
      Face face3 = De.compare2Face(de0.FACE1, de0.FACE5);
      de0.toString();
      de0.toString();
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(face3);
      de0.toString();
      de0.FACE6 = face3;
      de0.setFACE(face3);
      Type type0 = Type.PLUS;
      Integer integer0 = (-1926);
      Integer integer1 = (-1926);
      Face face4 = new Face(type0, integer0, integer1, integer1, integer0);
      De.compare2Face(face4, de0.FACE1);
      de0.setFACE(face2);
      De.compare2Face(de0.FACE3, face4);
      de0.toString();
  }

  @Test(timeout = 4000)
  public void test01() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1825);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      de0.FACE6 = face0;
      Face face1 = de0.FACE3;
      de0.FACE4 = face1;
      Integer.compareUnsigned((-2217), (-1825));
      face1.AfficheFace();
      de0.setFACE(null);
      Face face2 = new Face(type0, integer0, integer0, integer0, integer0);
      De.compare2Face(face2, de0.FACE2);
      Random.setNextRandom((-1825));
      Integer integer1 = (-2217);
      Integer integer2 = 4;
      Face face3 = new Face(type0, integer1, integer1, integer0, integer2);
      De.compare2Face(face0, face3);
      De.compare2Face(face3, de0.FACE6);
      // Undeclared exception!
      try { 
        de0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @Test(timeout = 4000)
  public void test02() {
      De de0 = new De();
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1825);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      de0.FACE6 = face0;
      Face face1 = de0.FACE3;
      de0.FACE4 = face1;
      Integer.compareUnsigned((-2217), 4);
      face1.AfficheFace();
      de0.setFACE(null);
      Face face2 = new Face(type0, integer0, integer0, integer0, integer0);
      De.compare2Face(face2, de0.FACE2);
      Random.setNextRandom((-1825));
      Integer integer1 = 4;
      Integer integer2 = 4;
      Face face3 = new Face(type0, integer1, integer1, integer0, integer2);
      De.compare2Face(face0, face3);
  }

  @Test(timeout = 4000)
  public void test03() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE4.AfficheFace();
      Face face0 = de0.faceMin();
      de0.toString();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.FACE6.AfficheFace();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.toString();
      de0.FACE1.AfficheFace();
      face0.AfficheFace();
      de0.initDe2();
      De.compare2Face(de0.FACE1, de0.FACE5);
      de0.FACE3 = de0.FACE5;
      de0.FACE5.AfficheFace();
      de0.setFACE(face0);
      de0.setFACE(de0.FACE6);
      de0.toString();
      Random.setNextRandom((-1575));
      de0.setFACE(de0.FACE5);
      Face face1 = De.compare2Face(de0.FACE1, de0.FACE6);
      de0.getFace();
      Face face2 = de0.FACE5;
      face2.AfficheFace();
      de0.toString();
      Random.setNextRandom((-2646));
      de0.setFACE(de0.FACE6);
      de0.faceMin();
      de0.toString();
      Random.setNextRandom(6);
      De.compare2Face(de0.FACE5, face1);
      Type type0 = Type.NORMAL;
      Integer.getInteger("\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", null);
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face3 = new Face(type0, null, ressource0);
      De.compare2Face(face3, de0.FACE6);
  }

  @Test(timeout = 4000)
  public void test04() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE6 = de0.FACE4;
      de0.initDe2();
      de0.initDe1();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE2);
      face0.AfficheFace();
      face0.AfficheFace();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face0);
      de0.getFace();
      de0.getFace();
      de0.initDe1();
      de0.FACE5.AfficheFace();
      de0.toString();
      de0.toString();
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(de0.FACE6);
      de0.toString();
      de0.setFACE(de0.FACE1);
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      Integer integer1 = 10;
      Face face1 = new Face(type0, integer0, integer1, integer1, integer0);
      face1.AfficheFace();
      Face face2 = De.compare2Face(face1, de0.FACE1);
      De.compare2Face(de0.FACE3, face1);
      de0.setFACE(face2);
  }

  @Test(timeout = 4000)
  public void test05() {
      De de0 = new De();
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1);
      Ressource ressource0 = Ressource.LUNAIRE;
      de0.FACE1 = new Face(type0, integer0, ressource0);
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE4);
      de0.FACE4 = face1;
      Integer.compareUnsigned((-2217), 4);
      face1.AfficheFace();
      de0.setFACE(de0.FACE1);
      Face face2 = de0.FACE4;
      De.compare2Face(face2, de0.FACE2);
      Random.setNextRandom((-1));
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test06() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.toString();
      de0.faceMin();
      Face face4 = de0.getFace();
      Face face5 = de0.FACE5;
      face5.AfficheFace();
      De.compare2Face(face2, face5);
      Random.setNextRandom((-1025));
      de0.setFACE(face4);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test07() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = de0.getFace();
      de0.initDe2();
      de0.FACE1 = face0;
      de0.getFace();
      de0.getFace();
      face0.AfficheFace();
      Random.setNextRandom(2);
      de0.getFace();
      De.compare2Face(face0, de0.FACE3);
      Face face1 = de0.FACE3;
      face1.AfficheFace();
      Face face2 = de0.FACE6;
      De.compare2Face(face1, face2);
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face3 = new Face(type0, integer0, ressource0);
      De.compare2Face(de0.FACE6, face3);
  }

  @Test(timeout = 4000)
  public void test08() {
      De de0 = new De();
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1);
      Ressource ressource0 = Ressource.LUNAIRE;
      de0.FACE1 = new Face(type0, integer0, ressource0);
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE4);
      de0.FACE4 = face1;
      Integer.compareUnsigned((-2217), 4);
      face1.AfficheFace();
      de0.setFACE(null);
      Face face2 = de0.FACE4;
      De.compare2Face(face2, de0.FACE2);
      Random.setNextRandom((-1));
  }

  @Test(timeout = 4000)
  public void test09() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      de0.initDe2();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test10() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      de0.getFace();
      Face face3 = de0.FACE5;
      De.compare2Face(face2, face3);
      Random.setNextRandom((-1025));
      de0.faceMin();
      Random.setNextRandom(1384);
  }

  @Test(timeout = 4000)
  public void test11() {
      De de0 = new De();
      de0.initDe2();
      de0.initDe2();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE5);
      face0.AfficheFace();
      de0.FACE4 = face0;
      de0.initDe1();
      de0.getFace();
      de0.initDe2();
      de0.FACE4.AfficheFace();
      de0.FACE4.AfficheFace();
      face0.AfficheFace();
      de0.initDe1();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.initDe2();
      de0.FACE4.AfficheFace();
      face0.AfficheFace();
      de0.initDe2();
      de0.toString();
      de0.FACE4.AfficheFace();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      de0.getFace();
      face1.AfficheFace();
      De.compare2Face(de0.FACE6, face1);
      de0.FACE6 = face1;
      de0.getFace();
      De.compare2Face(de0.FACE3, de0.FACE4);
      de0.initDe1();
      de0.getFace();
      de0.getFace();
      de0.toString();
      de0.toString();
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test12() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE6 = de0.FACE5;
      de0.initDe2();
      Face face0 = de0.faceMin();
      de0.FACE5 = face0;
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face1);
      de0.getFace();
      de0.getFace();
      de0.initDe1();
      de0.toString();
      de0.initDe2();
      face0.AfficheFace();
      de0.toString();
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(de0.FACE4);
      de0.toString();
      de0.setFACE(de0.FACE3);
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      Integer integer1 = 593;
      Integer integer2 = 2;
      Face face2 = new Face(type0, integer0, integer1, integer1, integer2);
      De.compare2Face(face2, de0.FACE1);
  }

  @Test(timeout = 4000)
  public void test13() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE6 = de0.FACE5;
      de0.initDe2();
      de0.initDe2();
      Face face0 = de0.faceMin();
      de0.FACE5 = face0;
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face1);
      de0.getFace();
      Face face2 = de0.getFace();
      de0.initDe1();
      de0.toString();
      Face face3 = De.compare2Face(de0.FACE1, de0.FACE5);
      face0.AfficheFace();
      de0.toString();
      de0.toString();
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(face3);
      de0.toString();
      de0.setFACE(face3);
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      Integer integer1 = 10;
      Face face4 = new Face(type0, integer0, integer1, integer1, integer0);
      De.compare2Face(face4, de0.FACE1);
      de0.setFACE(face2);
      De.compare2Face(de0.FACE3, face4);
  }

  @Test(timeout = 4000)
  public void test14() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(de0.FACE3);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test15() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      de0.toString();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      de0.toString();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test16() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = de0.getFace();
      de0.initDe2();
      de0.FACE1 = face0;
      de0.getFace();
      de0.getFace();
      Random.setNextRandom(2);
      de0.getFace();
      De.compare2Face(face0, de0.FACE3);
      Face face1 = de0.FACE3;
      face1.AfficheFace();
      Face face2 = de0.FACE6;
      De.compare2Face(face1, face2);
  }

  @Test(timeout = 4000)
  public void test17() {
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.getFace();
      assertNull(face0);
      
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE5, de0.FACE1);
      de0.FACE5 = face1;
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      de0.toString();
      de0.getFace();
      face1.AfficheFace();
      de0.toString();
      de0.toString();
      Random.setNextRandom(1);
      de0.getFace();
      de0.getFace();
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test18() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      Face face6 = de0.FACE2;
      Type type0 = Type.CHOIX;
      Integer integer0 = (-1025);
      Integer integer1 = Integer.getInteger("\u001B[31m1 SOLAIRE\u001B[0m", integer0);
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face7 = new Face(type0, integer1, ressource0);
      De.compare2Face(face6, face7);
  }

  @Test(timeout = 4000)
  public void test19() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      de0.initDe2();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.toString();
      de0.faceMin();
      Face face4 = de0.getFace();
      Face face5 = de0.FACE5;
      face5.AfficheFace();
      De.compare2Face(face2, face5);
      Random.setNextRandom((-1025));
      de0.setFACE(face4);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test20() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = de0.FACE2;
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      face4.AfficheFace();
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test21() {
      Random.setNextRandom((-1024));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1024));
      de0.toString();
      de0.setFACE(face0);
      de0.toString();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1024));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1024));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1024));
      de0.setFACE(face3);
  }

  @Test(timeout = 4000)
  public void test22() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE4);
      de0.FACE6 = face0;
      de0.FACE5 = face0;
      de0.setFACE(de0.FACE4);
      Face face1 = de0.FACE4;
      De.compare2Face(face1, de0.FACE2);
      de0.setFACE(face0);
      de0.setFACE(face0);
  }

  @Test(timeout = 4000)
  public void test23() {
      De de0 = new De();
      de0.initDe1();
      Face face0 = de0.faceMin();
      face0.AfficheFace();
      Face face1 = de0.faceMin();
      de0.toString();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      de0.toString();
      face1.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.initDe2();
      de0.getFace();
      de0.FACE3 = face0;
      face0.AfficheFace();
      de0.setFACE(face1);
      de0.setFACE(face0);
      de0.toString();
      Random.setNextRandom((-1575));
      de0.setFACE(face0);
      De.compare2Face(de0.FACE1, face0);
      de0.getFace();
      Face face2 = de0.getFace();
      face2.AfficheFace();
      de0.setFACE(face2);
      de0.toString();
      Random.setNextRandom((-2646));
      de0.setFACE(face0);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test24() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      de0.getFace();
      de0.initDe1();
      Face face0 = de0.getFace();
      face0.AfficheFace();
      de0.FACE4 = face0;
      face0.AfficheFace();
      face0.AfficheFace();
      Face face1 = De.compare2Face(face0, face0);
      face0.AfficheFace();
      face0.AfficheFace();
      de0.toString();
      face0.AfficheFace();
      de0.setFACE(face0);
      face1.AfficheFace();
      de0.getFace();
      Random.setNextRandom((-1025));
      de0.toString();
      de0.setFACE(face0);
      face0.AfficheFace();
      face0.AfficheFace();
      face1.AfficheFace();
      Random.setNextRandom((-1025));
      de0.setFACE(face0);
      Face face2 = De.compare2Face(face1, face0);
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      de0.faceMin();
      de0.faceMin();
      face0.AfficheFace();
      de0.faceMin();
      Face face3 = de0.getFace();
      Face face4 = de0.FACE5;
      De.compare2Face(face2, face4);
      Random.setNextRandom((-1025));
      de0.setFACE(face3);
      de0.faceMin();
  }

  @Test(timeout = 4000)
  public void test25() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = de0.FACE6;
      de0.initDe2();
      Face face1 = de0.getFace();
      face0.AfficheFace();
      face0.AfficheFace();
      de0.FACE3 = face0;
      face1.AfficheFace();
      de0.FACE4 = face0;
      de0.faceMin();
      de0.faceMin();
      de0.faceMin();
      De.compare2Face(face0, face1);
      Random.setNextRandom(0);
      Random.setNextRandom(1888);
  }

  @Test(timeout = 4000)
  public void test26() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE6 = de0.FACE5;
      de0.initDe2();
      de0.initDe2();
      Face face0 = de0.faceMin();
      de0.FACE5 = face0;
      de0.getFace();
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      face1.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face1);
      de0.getFace();
      de0.getFace();
      de0.initDe1();
      de0.toString();
      Face face2 = De.compare2Face(de0.FACE1, de0.FACE5);
      de0.initDe2();
      face0.AfficheFace();
      de0.toString();
      de0.toString();
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(face2);
      de0.toString();
      de0.setFACE(face2);
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      Integer integer1 = 619;
      Integer integer2 = 0;
      Integer integer3 = 2;
      Face face3 = new Face(type0, integer0, integer1, integer2, integer3);
      De.compare2Face(face3, de0.FACE1);
  }

  @Test(timeout = 4000)
  public void test27() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      Face face0 = de0.FACE4;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNotNull(face0);
      
      de0.FACE6 = face0;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE6.getType());
      assertNull(de0.FACE6.getNbVICT());
      assertNull(de0.FACE6.getNbLUN());
      assertEquals(1, (int)de0.FACE6.getValeur());
      assertEquals(Ressource.OR, de0.FACE6.getRes());
      assertNull(de0.FACE6.getNbSOL());
      assertNull(de0.FACE6.getNbOR());
      
      de0.initDe2();
      de0.initDe2();
      Face face1 = de0.faceMin();
      assertNotEquals(face1, face0);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      de0.FACE5 = face1;
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(de0.FACE5.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE5.getType());
      assertNull(de0.FACE5.getNbSOL());
      assertNull(de0.FACE5.getNbLUN());
      assertEquals(1, (int)de0.FACE5.getValeur());
      assertNull(de0.FACE5.getNbOR());
      assertEquals(Ressource.OR, de0.FACE5.getRes());
      
      Face face2 = de0.getFace();
      assertNotEquals(face2, face0);
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertNull(face2.getNbOR());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbSOL());
      assertEquals(Type.NORMAL, face2.getType());
      assertNotSame(face2, face0);
      assertSame(face2, face1);
      assertNotNull(face2);
      
      de0.initDe1();
      Face face3 = De.compare2Face(de0.FACE6, de0.FACE2);
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertNotNull(face3);
      
      String string0 = face3.AfficheFace();
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      String string1 = face3.AfficheFace();
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertEquals(string1, string0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);
      
      String string2 = face3.AfficheFace();
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      String string3 = face3.AfficheFace();
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertEquals(string3, string2);
      assertEquals(string3, string1);
      assertEquals(string3, string0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = face3.AfficheFace();
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertEquals(string4, string3);
      assertEquals(string4, string1);
      assertEquals(string4, string0);
      assertEquals(string4, string2);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string4);
      assertNotNull(string4);
      
      String string5 = face0.AfficheFace();
      assertEquals(string5, string1);
      assertEquals(string5, string4);
      assertEquals(string5, string3);
      assertEquals(string5, string0);
      assertEquals(string5, string2);
      assertNotEquals(face0, face1);
      assertNotEquals(face0, face2);
      assertNotEquals(face0, face3);
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNotSame(face0, face1);
      assertNotSame(face0, face2);
      assertNotSame(face0, face3);
      assertEquals("\u001B[33m1 OR\u001B[0m", string5);
      assertNotNull(string5);
      
      de0.setFACE(face3);
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      
      Face face4 = de0.getFace();
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face2);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbVICT());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Ressource.OR, face4.getRes());
      assertNull(face4.getNbSOL());
      assertEquals(Type.NORMAL, face4.getType());
      assertNotSame(face4, face1);
      assertNotSame(face4, face0);
      assertSame(face4, face3);
      assertNotSame(face4, face2);
      assertNotNull(face4);
      
      Face face5 = de0.getFace();
      assertNotEquals(face5, face2);
      assertNotEquals(face5, face0);
      assertNotEquals(face5, face1);
      assertEquals(1, (int)face5.getValeur());
      assertEquals(Type.NORMAL, face5.getType());
      assertNull(face5.getNbVICT());
      assertNull(face5.getNbLUN());
      assertNull(face5.getNbSOL());
      assertEquals(Ressource.OR, face5.getRes());
      assertNull(face5.getNbOR());
      assertNotSame(face5, face2);
      assertSame(face5, face4);
      assertNotSame(face5, face0);
      assertNotSame(face5, face1);
      assertSame(face5, face3);
      assertNotNull(face5);
      
      de0.initDe1();
      String string6 = de0.toString();
      assertNotEquals(string6, string5);
      assertNotEquals(string6, string1);
      assertNotEquals(string6, string0);
      assertNotEquals(string6, string4);
      assertNotEquals(string6, string3);
      assertNotEquals(string6, string2);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string6);
      assertNotNull(string6);
      
      Face face6 = De.compare2Face(de0.FACE1, de0.FACE5);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face2);
      assertEquals(Ressource.OR, face6.getRes());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbSOL());
      assertNull(face6.getNbOR());
      assertNull(face6.getNbLUN());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbVICT());
      assertNotSame(face6, face4);
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face1);
      assertNotSame(face6, face0);
      assertNotSame(face6, face2);
      assertNotNull(face6);
      
      de0.initDe2();
      String string7 = face1.AfficheFace();
      assertNotEquals(face1, face3);
      assertNotEquals(face1, face6);
      assertNotEquals(face1, face5);
      assertNotEquals(face1, face4);
      assertNotEquals(face1, face0);
      assertEquals(string7, string5);
      assertEquals(string7, string0);
      assertEquals(string7, string1);
      assertEquals(string7, string4);
      assertEquals(string7, string3);
      assertEquals(string7, string2);
      assertNotEquals(string7, string6);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNotSame(face1, face3);
      assertNotSame(face1, face6);
      assertNotSame(face1, face5);
      assertNotSame(face1, face4);
      assertNotSame(face1, face0);
      assertSame(face1, face2);
      assertEquals("\u001B[33m1 OR\u001B[0m", string7);
      assertNotNull(string7);
      
      String string8 = de0.toString();
      assertNotEquals(string8, string6);
      assertNotEquals(string8, string0);
      assertNotEquals(string8, string1);
      assertNotEquals(string8, string2);
      assertNotEquals(string8, string4);
      assertNotEquals(string8, string5);
      assertNotEquals(string8, string3);
      assertNotEquals(string8, string7);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string8);
      assertNotNull(string8);
      
      String string9 = de0.toString();
      assertNotEquals(string9, string4);
      assertNotEquals(string9, string3);
      assertEquals(string9, string8);
      assertNotEquals(string9, string0);
      assertNotEquals(string9, string6);
      assertNotEquals(string9, string1);
      assertNotEquals(string9, string7);
      assertNotEquals(string9, string5);
      assertNotEquals(string9, string2);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string9);
      assertNotNull(string9);
      
      de0.initDe1();
      de0.setFACE(face0);
      assertNotEquals(face0, face1);
      assertNotEquals(face0, face2);
      assertNotEquals(face0, face4);
      assertNotEquals(face0, face3);
      assertNotEquals(face0, face6);
      assertNotEquals(face0, face5);
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNotSame(face0, face1);
      assertNotSame(face0, face2);
      assertNotSame(face0, face4);
      assertNotSame(face0, face3);
      assertNotSame(face0, face6);
      assertNotSame(face0, face5);
      
      de0.setFACE(face6);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face2);
      assertEquals(Ressource.OR, face6.getRes());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbSOL());
      assertNull(face6.getNbOR());
      assertNull(face6.getNbLUN());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbVICT());
      assertNotSame(face6, face4);
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face1);
      assertNotSame(face6, face0);
      assertNotSame(face6, face2);
      
      String string10 = de0.toString();
      assertNotEquals(string10, string2);
      assertNotEquals(string10, string8);
      assertNotEquals(string10, string9);
      assertNotEquals(string10, string3);
      assertEquals(string10, string6);
      assertNotEquals(string10, string1);
      assertNotEquals(string10, string0);
      assertNotEquals(string10, string4);
      assertNotEquals(string10, string5);
      assertNotEquals(string10, string7);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string10);
      assertNotNull(string10);
      
      de0.setFACE(face6);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face2);
      assertEquals(Ressource.OR, face6.getRes());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbSOL());
      assertNull(face6.getNbOR());
      assertNull(face6.getNbLUN());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbVICT());
      assertNotSame(face6, face4);
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face1);
      assertNotSame(face6, face0);
      assertNotSame(face6, face2);
      
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      Integer integer1 = 619;
      Integer integer2 = 0;
      Integer integer3 = 2;
      Face face7 = new Face(type0, integer0, integer1, integer2, integer3);
      De.compare2Face(face7, de0.FACE1);
  }

  @Test(timeout = 4000)
  public void test28() {
      De de0 = new De();
      de0.initDe1();
      de0.toString();
      de0.initDe1();
      Face face0 = de0.getFace();
      de0.FACE3 = face0;
      de0.FACE6 = face0;
      de0.getFace();
      Face face1 = de0.getFace();
      face1.AfficheFace();
      face1.AfficheFace();
      de0.FACE2 = face1;
      face1.AfficheFace();
      de0.getFace();
      face1.AfficheFace();
      De.compare2Face(face1, de0.FACE6);
      de0.toString();
      Random.setNextRandom(2);
      de0.getFace();
      Random.setNextRandom(2);
      de0.faceMin();
      Random.setNextRandom(0);
      de0.getFace();
      de0.getFace();
  }

  @Test(timeout = 4000)
  public void test29() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = de0.FACE4;
      de0.setFACE(face0);
      face0.AfficheFace();
      de0.setFACE(face0);
      Random.setNextRandom(2);
      De.compare2Face(de0.FACE5, face0);
      de0.toString();
      Random.setNextRandom((-518));
  }

  @Test(timeout = 4000)
  public void test30() {
      De de0 = new De();
      de0.initDe2();
      Face face0 = de0.getFace();
      Face face1 = de0.faceMin();
      de0.FACE3 = face1;
      Face face2 = de0.getFace();
      face1.AfficheFace();
      face2.AfficheFace();
      de0.initDe2();
      Face face3 = De.compare2Face(de0.FACE3, face1);
      Face face4 = de0.FACE5;
      face4.AfficheFace();
      face2.AfficheFace();
      face4.AfficheFace();
      de0.FACE4 = face4;
      face0.AfficheFace();
      face4.AfficheFace();
      de0.toString();
      de0.FACE6 = face3;
      de0.toString();
      de0.toString();
      de0.getFace();
      face4.AfficheFace();
      de0.toString();
      de0.initDe2();
      de0.initDe2();
      de0.setFACE(face2);
      De.compare2Face(face0, de0.FACE2);
      de0.initDe2();
      de0.faceMin();
      de0.faceMin();
      de0.getFace();
      De.compare2Face(face4, de0.FACE6);
  }

  @Test(timeout = 4000)
  public void test31() {
      De de0 = new De();
      Type type0 = Type.NORMAL;
      Integer integer0 = 2;
      Integer integer1 = 0;
      de0.FACE3 = new Face(type0, integer0, integer0, integer0, integer1);
      de0.setFACE(null);
      // Undeclared exception!
      try { 
        de0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @Test(timeout = 4000)
  public void test32() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Face face0 = de0.FACE1;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertNotNull(face0);
      
      de0.FACE2 = face0;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(de0.FACE2.getNbSOL());
      assertNull(de0.FACE2.getNbOR());
      assertEquals(Ressource.OR, de0.FACE2.getRes());
      assertEquals(1, (int)de0.FACE2.getValeur());
      assertNull(de0.FACE2.getNbLUN());
      assertNull(de0.FACE2.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE2.getType());
      
      de0.setFACE(face0);
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      
      de0.setFACE(null);
      Face face1 = de0.faceMin();
      assertNull(face1);
      
      String string0 = face0.AfficheFace();
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      Face face2 = de0.getFace();
      assertNull(face2);
      
      Type type0 = Type.NORMAL;
      de0.FACE5 = face0;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(de0.FACE5.getNbLUN());
      assertNull(de0.FACE5.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE5.getType());
      assertEquals(1, (int)de0.FACE5.getValeur());
      assertEquals(Ressource.OR, de0.FACE5.getRes());
      assertNull(de0.FACE5.getNbOR());
      assertNull(de0.FACE5.getNbSOL());
      
      Integer integer0 = 474;
      assertEquals(474, (int)integer0);
      assertNotNull(integer0);
      
      int int0 = Integer.min(474, 474);
      assertEquals(474, int0);
      
      int int1 = Integer.remainderUnsigned(474, 3179);
      assertEquals(int1, int0);
      assertEquals(474, int1);
      
      Face face3 = new Face(type0, integer0, integer0, integer0, integer0);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotNull(face3);
      
      de0.FACE5 = face3;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(474, (int)de0.FACE5.getNbLUN());
      assertEquals(474, (int)de0.FACE5.getNbSOL());
      assertEquals(474, (int)de0.FACE5.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE5.getType());
      assertNull(de0.FACE5.getValeur());
      assertNull(de0.FACE5.getRes());
      assertEquals(474, (int)de0.FACE5.getNbVICT());
      
      String string1 = de0.FACE5.AfficheFace();
      assertNotEquals(string1, string0);
      assertNotEquals(de0.FACE5, face0);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(de0.FACE5.getRes());
      assertEquals(474, (int)de0.FACE5.getNbLUN());
      assertEquals(474, (int)de0.FACE5.getNbVICT());
      assertNull(de0.FACE5.getValeur());
      assertEquals(Type.NORMAL, de0.FACE5.getType());
      assertEquals(474, (int)de0.FACE5.getNbSOL());
      assertEquals(474, (int)de0.FACE5.getNbOR());
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotSame(de0.FACE5, face0);
      assertSame(de0.FACE5, face3);
      assertNotSame(face3, face0);
      assertEquals("echec", string1);
      assertNotNull(string1);
      
      String string2 = face3.AfficheFace();
      assertNotEquals(string2, string0);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotSame(face3, face0);
      assertEquals("echec", string2);
      assertNotNull(string2);
      
      String string3 = face3.AfficheFace();
      assertNotEquals(string3, string0);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotSame(face3, face0);
      assertEquals("echec", string3);
      assertNotNull(string3);
      
      String string4 = face3.AfficheFace();
      assertNotEquals(string4, string0);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotSame(face3, face0);
      assertEquals("echec", string4);
      assertNotNull(string4);
      
      de0.setFACE(face3);
      assertEquals(integer0, (Object) int1);
      assertEquals(integer0, (Object) int0);
      assertNotEquals(face3, face0);
      assertNull(face3.getRes());
      assertEquals(474, (int)face3.getNbSOL());
      assertEquals(474, (int)face3.getNbLUN());
      assertEquals(474, (int)face3.getNbVICT());
      assertNull(face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(474, (int)face3.getNbOR());
      assertNotSame(face3, face0);
      
      de0.initDe2();
      de0.initDe1();
      Face face4 = de0.faceMin();
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face3);
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Ressource.OR, face4.getRes());
      assertNull(face4.getNbSOL());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbVICT());
      assertEquals(Type.NORMAL, face4.getType());
      assertNotSame(face4, face0);
      assertNotSame(face4, face3);
      assertNotNull(face4);
      
      de0.initDe1();
      String string5 = de0.toString();
      assertNotEquals(string5, string4);
      assertNotEquals(string5, string1);
      assertNotEquals(string5, string2);
      assertNotEquals(string5, string3);
      assertNotEquals(string5, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string5);
      assertNotNull(string5);
      
      de0.initDe1();
  }

  @Test(timeout = 4000)
  public void test33() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      String string0 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string0);
      assertNotNull(string0);
      
      de0.FACE6 = null;
      de0.initDe2();
      Face face0 = de0.FACE5;
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      assertNotNull(face0);
      
      de0.FACE6 = face0;
      assertNull(de0.FACE6.getNbLUN());
      assertEquals(Type.NORMAL, de0.FACE6.getType());
      assertEquals(Ressource.LUNAIRE, de0.FACE6.getRes());
      assertNull(de0.FACE6.getNbVICT());
      assertEquals(1, (int)de0.FACE6.getValeur());
      assertNull(de0.FACE6.getNbOR());
      assertNull(de0.FACE6.getNbSOL());
      
      de0.setFACE(face0);
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      
      Face face1 = de0.faceMin();
      assertNotEquals(face1, face0);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(1, (int)face1.getValeur());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      String string1 = face1.AfficheFace();
      assertNotEquals(face1, face0);
      assertNotEquals(string1, string0);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(1, (int)face1.getValeur());
      assertNotSame(face1, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);

  }

  @Test(timeout = 4000)
  public void test34() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      Face face0 = de0.FACE4;
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNotNull(face0);
      
      String string0 = face0.AfficheFace();
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      String string1 = face0.AfficheFace();
      assertEquals(string1, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);
      
      String string2 = face0.AfficheFace();
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      Face face1 = De.compare2Face(de0.FACE1, face0);
      assertNotEquals(face1, face0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNotSame(face0, face1);
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      de0.FACE3 = face1;
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNull(de0.FACE3.getNbVICT());
      assertNull(de0.FACE3.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE3.getType());
      assertEquals(1, (int)de0.FACE3.getValeur());
      assertEquals(Ressource.OR, de0.FACE3.getRes());
      assertNull(de0.FACE3.getNbSOL());
      assertNull(de0.FACE3.getNbLUN());
      
      String string3 = face1.AfficheFace();
      assertNotEquals(face0, face1);
      assertNotEquals(face1, face0);
      assertEquals(string3, string1);
      assertEquals(string3, string2);
      assertEquals(string3, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNotSame(face0, face1);
      assertNotSame(face1, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = face0.AfficheFace();
      assertNotEquals(face0, face1);
      assertEquals(string4, string2);
      assertEquals(string4, string0);
      assertEquals(string4, string1);
      assertEquals(string4, string3);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNotSame(face0, face1);
      assertEquals("\u001B[33m1 OR\u001B[0m", string4);
      assertNotNull(string4);
      
      String string5 = face1.AfficheFace();
      assertNotEquals(face0, face1);
      assertNotEquals(face1, face0);
      assertEquals(string5, string1);
      assertEquals(string5, string4);
      assertEquals(string5, string0);
      assertEquals(string5, string3);
      assertEquals(string5, string2);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNotSame(face0, face1);
      assertNotSame(face1, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string5);
      assertNotNull(string5);
      
      de0.setFACE(face1);
      assertNotEquals(face0, face1);
      assertNotEquals(face1, face0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNotSame(face0, face1);
      assertNotSame(face1, face0);
      
      String string6 = de0.toString();
      assertNotEquals(string6, string3);
      assertNotEquals(string6, string0);
      assertNotEquals(string6, string1);
      assertNotEquals(string6, string2);
      assertNotEquals(string6, string5);
      assertNotEquals(string6, string4);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string6);
      assertNotNull(string6);
      
      Face face2 = De.compare2Face(de0.FACE2, de0.FACE3);
      assertNotEquals(face2, face1);
      assertNotEquals(face2, face0);
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbSOL());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbLUN());
      assertNotSame(face2, face1);
      assertNotSame(face2, face0);
      assertNotNull(face2);
      
      de0.initDe2();
      String string7 = de0.toString();
      assertNotEquals(string7, string1);
      assertNotEquals(string7, string2);
      assertNotEquals(string7, string6);
      assertNotEquals(string7, string5);
      assertNotEquals(string7, string4);
      assertNotEquals(string7, string0);
      assertNotEquals(string7, string3);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string7);
      assertNotNull(string7);
      
      String string8 = de0.toString();
      assertNotEquals(string8, string2);
      assertNotEquals(string8, string6);
      assertNotEquals(string8, string4);
      assertNotEquals(string8, string3);
      assertEquals(string8, string7);
      assertNotEquals(string8, string0);
      assertNotEquals(string8, string5);
      assertNotEquals(string8, string1);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string8);
      assertNotNull(string8);
  }

  @Test(timeout = 4000)
  public void test35() {
      De de0 = new De();
      assertNotNull(de0);
      
      Type type0 = Type.NORMAL;
      Integer integer0 = 0;
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
      
      Integer integer1 = 3;
      assertNotEquals(integer1, integer0);
      assertEquals(3, (int)integer1);
      assertNotNull(integer1);
      
      Face face0 = new Face(type0, integer0, integer1, integer0, integer0);
      assertNotEquals(integer0, integer1);
      assertNotEquals(integer1, integer0);
      assertNull(face0.getValeur());
      assertEquals(0, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbSOL());
      assertEquals(3, (int)face0.getNbLUN());
      assertNull(face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(0, (int)face0.getNbVICT());
      assertNotNull(face0);
      
      de0.FACE4 = face0;
      assertNull(face0.getValeur());
      assertEquals(0, (int)face0.getNbOR());
      assertEquals(0, (int)face0.getNbSOL());
      assertEquals(3, (int)face0.getNbLUN());
      assertNull(face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(0, (int)face0.getNbVICT());
      assertNull(de0.FACE4.getValeur());
      assertEquals(3, (int)de0.FACE4.getNbLUN());
      assertEquals(0, (int)de0.FACE4.getNbSOL());
      assertEquals(0, (int)de0.FACE4.getNbOR());
      assertNull(de0.FACE4.getRes());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertEquals(0, (int)de0.FACE4.getNbVICT());
      
      De de1 = new De();
      assertNotEquals(de1, de0);
      assertNotNull(de1);
      
      Face face1 = de1.getFace();
      assertNotEquals(de1, de0);
      assertNotSame(de1, de0);
      assertNull(face1);
      
      de1.FACE6 = null;
      de0.setFACE(null);
      assertNotEquals(de0, de1);
      assertNotSame(de0, de1);
      
      de0.initDe1();
      assertNotEquals(de0, de1);
      assertNotSame(de0, de1);
      
      de0.initDe2();
      assertNotEquals(de0, de1);
      assertNotSame(de0, de1);
      
      String string0 = Integer.toUnsignedString(0);
      assertEquals("0", string0);
      assertNotNull(string0);
      
      String string1 = de0.toString();
      assertNotEquals(de0, de1);
      assertNotEquals(string1, string0);
      assertNotSame(de0, de1);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string1);
      assertNotNull(string1);
      
      Face face2 = de1.faceMin();
      assertNotEquals(de1, de0);
      assertNotSame(de1, de0);
      assertNull(face2);
      
      de0.setFACE(null);
      assertNotEquals(de0, de1);
      assertNotSame(de0, de1);
      
      de0.initDe2();
      assertNotEquals(de0, de1);
      assertNotSame(de0, de1);
  }

  @Test(timeout = 4000)
  public void test36() {
      De de0 = new De();
      assertNotNull(de0);
      
      Type type0 = Type.NORMAL;
      Ressource ressource0 = Ressource.OR;
      Face face0 = new Face(type0, null, ressource0);
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertNull(face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertNotNull(face0);
      
      de0.setFACE(face0);
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbSOL());
      assertNull(face0.getValeur());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
  }

  @Test(timeout = 4000)
  public void test37() {
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.getFace();
      assertNull(face0);
      
      de0.FACE6 = null;
      // Undeclared exception!
      try { 
        de0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @Test(timeout = 4000)
  public void test38() {
      De de0 = new De();
      assertNotNull(de0);
      
      De de1 = new De();
      assertNotEquals(de1, de0);
      assertNotNull(de1);
      
      de1.setFACE(null);
      assertNotEquals(de1, de0);
      assertNotSame(de1, de0);
      
      // Undeclared exception!
      try { 
        de1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }


  @Test(timeout = 4000)
  public void test40() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      Face face0 = de0.faceMin();
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNotNull(face0);
      
      String string0 = face0.AfficheFace();
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      String string1 = face0.AfficheFace();
      assertEquals(string1, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);
      
      String string2 = face0.AfficheFace();
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      de0.FACE2 = face0;
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals(Ressource.OR, de0.FACE2.getRes());
      assertEquals(Type.NORMAL, de0.FACE2.getType());
      assertEquals(1, (int)de0.FACE2.getValeur());
      assertNull(de0.FACE2.getNbSOL());
      assertNull(de0.FACE2.getNbLUN());
      assertNull(de0.FACE2.getNbOR());
      assertNull(de0.FACE2.getNbVICT());
      
      String string3 = face0.AfficheFace();
      assertEquals(string3, string1);
      assertEquals(string3, string2);
      assertEquals(string3, string0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertEquals("\u001B[33m1 OR\u001B[0m", string3);
      assertNotNull(string3);
      
      Face face1 = de0.faceMin();
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertSame(face1, face0);
      assertNotNull(face1);
      
      de0.initDe2();
      de0.initDe2();
      de0.setFACE(face0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertSame(face0, face1);
      
      de0.setFACE(face1);
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertSame(face1, face0);
      
      String string4 = de0.toString();
      assertNotEquals(string4, string0);
      assertNotEquals(string4, string2);
      assertNotEquals(string4, string3);
      assertNotEquals(string4, string1);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string4);
      assertNotNull(string4);
      
      de0.setFACE(face0);
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertSame(face0, face1);
      
      de0.initDe2();
      Face face2 = de0.getFace();
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertNull(face2.getNbVICT());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertNotNull(face2);
      
      de0.FACE4 = face0;
      assertNull(de0.FACE4.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbSOL());
      assertNull(de0.FACE4.getNbLUN());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertNull(de0.FACE4.getNbOR());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      
      String string5 = de0.toString();
      assertNotEquals(string5, string0);
      assertEquals(string5, string4);
      assertNotEquals(string5, string1);
      assertNotEquals(string5, string2);
      assertNotEquals(string5, string3);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string5);
      assertNotNull(string5);
      
      Face face3 = De.compare2Face(face2, face1);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertNotEquals(face1, face2);
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertNull(face2.getNbVICT());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbOR());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbLUN());
      assertNull(face3.getNbVICT());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertSame(face2, face3);
      assertNotSame(face3, face0);
      assertSame(face3, face2);
      assertNotSame(face3, face1);
      assertSame(face1, face0);
      assertNotSame(face1, face3);
      assertNotSame(face1, face2);
      assertNotNull(face3);
      
      de0.initDe1();
      Face face4 = de0.faceMin();
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face3);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face2);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbSOL());
      assertNull(face4.getNbOR());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbVICT());
      assertNotSame(face4, face1);
      assertNotSame(face4, face3);
      assertNotSame(face4, face0);
      assertNotSame(face4, face2);
      assertNotNull(face4);
      
      Type type0 = Type.PLUS;
      Integer integer0 = (-2900);
      assertEquals((-2900), (int)integer0);
      assertNotNull(integer0);
      
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face5 = new Face(type0, integer0, ressource0);
      assertNotEquals(face5, face3);
      assertNotEquals(face5, face2);
      assertNotEquals(face5, face4);
      assertNotEquals(face5, face1);
      assertNotEquals(face5, face0);
      assertNull(face5.getNbVICT());
      assertNull(face5.getNbOR());
      assertEquals(Ressource.SOLAIRE, face5.getRes());
      assertNull(face5.getNbSOL());
      assertEquals(Type.PLUS, face5.getType());
      assertEquals((-2900), (int)face5.getValeur());
      assertNull(face5.getNbLUN());
      assertNotNull(face5);
      
      Face face6 = De.compare2Face(de0.FACE4, face5);
      assertNotEquals(de0.FACE4, face4);
      assertNotEquals(de0.FACE4, face1);
      assertNotEquals(de0.FACE4, face3);
      assertNotEquals(de0.FACE4, face2);
      assertNotEquals(de0.FACE4, face5);
      assertNotEquals(de0.FACE4, face0);
      assertNotEquals(face0, face2);
      assertNotEquals(face0, face4);
      assertNotEquals(face0, face3);
      assertNotEquals(face0, face5);
      assertNotEquals(face5, face3);
      assertNotEquals(face5, face2);
      assertNotEquals(face5, face4);
      assertNotEquals(face5, face1);
      assertNotEquals(face5, face0);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face5);
      assertNull(de0.FACE4.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbSOL());
      assertNull(de0.FACE4.getNbLUN());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertNull(de0.FACE4.getNbOR());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNull(face5.getNbVICT());
      assertNull(face5.getNbOR());
      assertEquals(Ressource.SOLAIRE, face5.getRes());
      assertNull(face5.getNbSOL());
      assertEquals(Type.PLUS, face5.getType());
      assertEquals((-2900), (int)face5.getValeur());
      assertNull(face5.getNbLUN());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbSOL());
      assertEquals(Ressource.OR, face6.getRes());
      assertNull(face6.getNbVICT());
      assertNull(face6.getNbOR());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbLUN());
      assertNotSame(de0.FACE4, face4);
      assertNotSame(de0.FACE4, face1);
      assertNotSame(de0.FACE4, face3);
      assertNotSame(de0.FACE4, face2);
      assertNotSame(de0.FACE4, face5);
      assertSame(de0.FACE4, face6);
      assertNotSame(de0.FACE4, face0);
      assertSame(face0, face1);
      assertNotSame(face0, face2);
      assertNotSame(face0, face4);
      assertNotSame(face0, face5);
      assertNotSame(face0, face3);
      assertNotSame(face0, face6);
      assertNotSame(face5, face3);
      assertNotSame(face5, face6);
      assertNotSame(face5, face2);
      assertNotSame(face5, face4);
      assertNotSame(face5, face1);
      assertNotSame(face5, face0);
      assertNotSame(face6, face0);
      assertNotSame(face6, face3);
      assertNotSame(face6, face2);
      assertNotSame(face6, face4);
      assertNotSame(face6, face1);
      assertNotSame(face6, face5);
      assertNotNull(face6);
  }

  @Test(timeout = 4000)
  public void test41() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Face face0 = de0.getFace();
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertNotNull(face0);
      
      String string0 = face0.AfficheFace();
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      de0.FACE1 = face0;
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertNull(de0.FACE1.getNbSOL());
      assertNull(de0.FACE1.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbVICT());
      assertNull(de0.FACE1.getNbLUN());
      
      String string1 = face0.AfficheFace();
      assertEquals(string1, string0);
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);
      
      de0.FACE2 = face0;
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertNull(de0.FACE2.getNbOR());
      assertNull(de0.FACE2.getNbVICT());
      assertNull(de0.FACE2.getNbLUN());
      assertEquals(1, (int)de0.FACE2.getValeur());
      assertEquals(Ressource.OR, de0.FACE2.getRes());
      assertEquals(Type.NORMAL, de0.FACE2.getType());
      assertNull(de0.FACE2.getNbSOL());
      
      de0.setFACE(face0);
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      
      String string2 = de0.FACE1.AfficheFace();
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      de0.FACE1 = face0;
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertNull(de0.FACE1.getNbSOL());
      assertNull(de0.FACE1.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbVICT());
      assertNull(de0.FACE1.getNbLUN());
      
      de0.FACE1 = face0;
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertNull(de0.FACE1.getNbSOL());
      assertNull(de0.FACE1.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbVICT());
      assertNull(de0.FACE1.getNbLUN());
      
      de0.initDe2();
      Face face1 = de0.faceMin();
      assertNotEquals(face1, face0);
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      String string3 = de0.FACE1.AfficheFace();
      assertNotEquals(face0, face1);
      assertNotEquals(de0.FACE1, face0);
      assertEquals(string3, string1);
      assertEquals(string3, string0);
      assertEquals(string3, string2);
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbLUN());
      assertNull(de0.FACE1.getNbVICT());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertNull(de0.FACE1.getNbSOL());
      assertNull(de0.FACE1.getNbOR());
      assertNotSame(face0, face1);
      assertNotSame(de0.FACE1, face0);
      assertSame(de0.FACE1, face1);
      assertEquals("\u001B[33m1 OR\u001B[0m", string3);
      assertNotNull(string3);
      
      Face face2 = de0.faceMin();
      assertNotEquals(face2, face0);
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbLUN());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertEquals(1, (int)face2.getValeur());
      assertNull(face2.getNbSOL());
      assertNotSame(face2, face0);
      assertSame(face2, face1);
      assertNotNull(face2);
      
      Face face3 = De.compare2Face(face1, de0.FACE6);
      assertNotEquals(face1, face0);
      assertNotEquals(face3, face0);
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(1, (int)face3.getValeur());
      assertEquals(Ressource.OR, face3.getRes());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbLUN());
      assertNull(face3.getNbOR());
      assertNull(face3.getNbVICT());
      assertEquals(Type.NORMAL, face3.getType());
      assertSame(face1, face3);
      assertSame(face1, face2);
      assertNotSame(face1, face0);
      assertSame(face3, face1);
      assertSame(face3, face2);
      assertNotSame(face3, face0);
      assertNotNull(face3);
      
      Face face4 = De.compare2Face(de0.FACE2, de0.FACE4);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face3);
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Ressource.OR, face4.getRes());
      assertNull(face4.getNbSOL());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbVICT());
      assertNull(face4.getNbLUN());
      assertNotSame(face4, face2);
      assertNotSame(face4, face1);
      assertNotSame(face4, face0);
      assertNotSame(face4, face3);
      assertNotNull(face4);
      
      de0.initDe1();
      de0.initDe1();
      String string4 = de0.toString();
      assertNotEquals(string4, string3);
      assertNotEquals(string4, string0);
      assertNotEquals(string4, string1);
      assertNotEquals(string4, string2);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string4);
      assertNotNull(string4);
  }

  @Test(timeout = 4000)
  public void test42() {
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.FACE4;
      assertNull(face0);
      
      de0.FACE3 = null;
      de0.initDe1();
      de0.initDe1();
      String string0 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string0);
      assertNotNull(string0);
      
      Face face1 = de0.getFace();
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertNotNull(face1);
      
      de0.setFACE(null);
  }

  @Test(timeout = 4000)
  public void test43() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE4);
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      assertNotNull(face0);
      
      de0.FACE4 = face0;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      assertNull(de0.FACE4.getNbSOL());
      assertNull(de0.FACE4.getNbOR());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbVICT());
      assertNull(de0.FACE4.getNbLUN());
      
      de0.setFACE(null);
      Face face1 = de0.FACE4;
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertSame(face1, face0);
      assertNotNull(face1);
      
      Face face2 = De.compare2Face(face1, de0.FACE2);
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbOR());
      assertSame(face1, face2);
      assertSame(face1, face0);
      assertSame(face2, face1);
      assertSame(face2, face0);
      assertNotNull(face2);
  }

  @Test(timeout = 4000)
  public void test44() {
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.FACE5;
      assertNull(face0);
      
      de0.setFACE(null);
      de0.initDe2();
      Face face1 = De.compare2Face(de0.FACE1, de0.FACE5);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertNotNull(face1);
  }



  @Test(timeout = 4000)
  public void test46() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      Face face0 = de0.FACE5;
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbSOL());
      assertNotNull(face0);
      
      de0.setFACE(face0);
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbSOL());
  }

  @Test(timeout = 4000)
  public void test47() {
      De de0 = new De();
      assertNotNull(de0);
      
      // Undeclared exception!
      try { 
        de0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @Test(timeout = 4000)
  public void test48() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      de0.initDe1();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE2);
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertNotNull(face0);
      
      String string0 = face0.AfficheFace();
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      String string1 = de0.FACE5.AfficheFace();
      assertEquals(string1, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string1);
      assertNotNull(string1);
      
      de0.setFACE(face0);
      assertNull(face0.getNbSOL());
      assertEquals(Type.NORMAL, face0.getType());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertEquals(1, (int)face0.getValeur());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      
      Face face1 = de0.getFace();
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertSame(face1, face0);
      assertNotNull(face1);
      
      String string2 = de0.FACE5.AfficheFace();
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      String string3 = de0.toString();
      assertNotEquals(string3, string1);
      assertNotEquals(string3, string2);
      assertNotEquals(string3, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = de0.toString();
      assertNotEquals(string4, string1);
      assertNotEquals(string4, string2);
      assertNotEquals(string4, string0);
      assertEquals(string4, string3);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string4);
      assertNotNull(string4);
      
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(de0.FACE6);
      String string5 = de0.toString();
      assertNotEquals(string5, string0);
      assertNotEquals(string5, string3);
      assertNotEquals(string5, string2);
      assertNotEquals(string5, string1);
      assertNotEquals(string5, string4);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string5);
      assertNotNull(string5);
      
      de0.setFACE(de0.FACE1);
      Type type0 = Type.PLUS;
      Integer integer0 = 10;
      assertEquals(10, (int)integer0);
      assertNotNull(integer0);
      
      Face face2 = new Face(type0, integer0, integer0, integer0, integer0);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertEquals(10, (int)face2.getNbLUN());
      assertNull(face2.getRes());
      assertEquals(10, (int)face2.getNbSOL());
      assertEquals(10, (int)face2.getNbOR());
      assertNull(face2.getValeur());
      assertEquals(Type.PLUS, face2.getType());
      assertEquals(10, (int)face2.getNbVICT());
      assertNotNull(face2);
      
      String string6 = face2.AfficheFace();
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(string6, string1);
      assertNotEquals(string6, string3);
      assertNotEquals(string6, string5);
      assertNotEquals(string6, string4);
      assertNotEquals(string6, string2);
      assertNotEquals(string6, string0);
      assertEquals(10, (int)face2.getNbLUN());
      assertNull(face2.getRes());
      assertEquals(10, (int)face2.getNbSOL());
      assertEquals(10, (int)face2.getNbOR());
      assertNull(face2.getValeur());
      assertEquals(Type.PLUS, face2.getType());
      assertEquals(10, (int)face2.getNbVICT());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertEquals("echec", string6);
      assertNotNull(string6);
      
      Face face3 = De.compare2Face(face2, de0.FACE1);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertEquals(10, (int)face2.getNbLUN());
      assertNull(face2.getRes());
      assertEquals(10, (int)face2.getNbSOL());
      assertEquals(10, (int)face2.getNbOR());
      assertNull(face2.getValeur());
      assertEquals(Type.PLUS, face2.getType());
      assertEquals(10, (int)face2.getNbVICT());
      assertNull(face3.getRes());
      assertEquals(10, (int)face3.getNbSOL());
      assertNull(face3.getValeur());
      assertEquals(Type.PLUS, face3.getType());
      assertEquals(10, (int)face3.getNbLUN());
      assertEquals(10, (int)face3.getNbOR());
      assertEquals(10, (int)face3.getNbVICT());
      assertNotSame(face2, face0);
      assertSame(face2, face3);
      assertNotSame(face2, face1);
      assertSame(face3, face2);
      assertNotSame(face3, face0);
      assertNotSame(face3, face1);
      assertNotNull(face3);
      
      Face face4 = De.compare2Face(de0.FACE3, face2);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face3);
      assertEquals(10, (int)face2.getNbLUN());
      assertNull(face2.getRes());
      assertEquals(10, (int)face2.getNbSOL());
      assertEquals(10, (int)face2.getNbOR());
      assertNull(face2.getValeur());
      assertEquals(Type.PLUS, face2.getType());
      assertEquals(10, (int)face2.getNbVICT());
      assertNull(face4.getNbOR());
      assertEquals(Ressource.SOLAIRE, face4.getRes());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbSOL());
      assertEquals(1, (int)face4.getValeur());
      assertNull(face4.getNbVICT());
      assertNull(face4.getNbLUN());
      assertNotSame(face2, face0);
      assertNotSame(face2, face4);
      assertSame(face2, face3);
      assertNotSame(face2, face1);
      assertNotSame(face4, face2);
      assertNotSame(face4, face1);
      assertNotSame(face4, face0);
      assertNotSame(face4, face3);
      assertNotNull(face4);
      
      de0.setFACE(face3);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face4);
      assertNotEquals(face2, face1);
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face4);
      assertEquals(10, (int)face2.getNbLUN());
      assertNull(face2.getRes());
      assertEquals(10, (int)face2.getNbSOL());
      assertEquals(10, (int)face2.getNbOR());
      assertNull(face2.getValeur());
      assertEquals(Type.PLUS, face2.getType());
      assertEquals(10, (int)face2.getNbVICT());
      assertNull(face3.getRes());
      assertEquals(10, (int)face3.getNbSOL());
      assertNull(face3.getValeur());
      assertEquals(Type.PLUS, face3.getType());
      assertEquals(10, (int)face3.getNbLUN());
      assertEquals(10, (int)face3.getNbOR());
      assertEquals(10, (int)face3.getNbVICT());
      assertNotSame(face2, face0);
      assertNotSame(face2, face4);
      assertSame(face2, face3);
      assertNotSame(face2, face1);
      assertSame(face3, face2);
      assertNotSame(face3, face0);
      assertNotSame(face3, face1);
      assertNotSame(face3, face4);
  }

  @Test(timeout = 4000)
  public void test49() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1);
      assertEquals((-1), (int)integer0);
      assertNotNull(integer0);
      
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      assertEquals((-1), (int)face0.getValeur());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      assertEquals(Type.PLUS, face0.getType());
      assertNull(face0.getNbVICT());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNotNull(face0);
      
      de0.FACE6 = face0;
      assertEquals((-1), (int)face0.getValeur());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbOR());
      assertEquals(Type.PLUS, face0.getType());
      assertNull(face0.getNbVICT());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertEquals(Type.PLUS, de0.FACE6.getType());
      assertNull(de0.FACE6.getNbOR());
      assertNull(de0.FACE6.getNbSOL());
      assertNull(de0.FACE6.getNbLUN());
      assertEquals((-1), (int)de0.FACE6.getValeur());
      assertEquals(Ressource.LUNAIRE, de0.FACE6.getRes());
      assertNull(de0.FACE6.getNbVICT());
      
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE4);
      assertNotEquals(face1, face0);
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      de0.FACE4 = face1;
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbVICT());
      assertNull(de0.FACE4.getNbLUN());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      assertNull(de0.FACE4.getNbSOL());
      assertNull(de0.FACE4.getNbOR());
      
      String string0 = face1.AfficheFace();
      assertNotEquals(face1, face0);
      assertNull(face1.getNbSOL());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbLUN());
      assertNotSame(face1, face0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      de0.setFACE(null);
      Face face2 = De.compare2Face(de0.FACE3, de0.FACE2);
      assertNotEquals(face2, face1);
      assertNotEquals(face2, face0);
      assertNull(face2.getNbLUN());
      assertNull(face2.getNbOR());
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbSOL());
      assertEquals(Ressource.OR, face2.getRes());
      assertEquals(1, (int)face2.getValeur());
      assertNotSame(face2, face1);
      assertNotSame(face2, face0);
      assertNotNull(face2);
      
      Random.setNextRandom((-1));
  }

  @Test(timeout = 4000)
  public void test50() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Type type0 = Type.PLUS;
      Integer integer0 = (-1825);
      assertEquals((-1825), (int)integer0);
      assertNotNull(integer0);
      
      Ressource ressource0 = Ressource.LUNAIRE;
      Face face0 = new Face(type0, integer0, ressource0);
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.PLUS, face0.getType());
      assertNull(face0.getNbLUN());
      assertEquals((-1825), (int)face0.getValeur());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNotNull(face0);
      
      de0.FACE6 = face0;
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.PLUS, face0.getType());
      assertNull(face0.getNbLUN());
      assertEquals((-1825), (int)face0.getValeur());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Ressource.LUNAIRE, de0.FACE6.getRes());
      assertNull(de0.FACE6.getNbSOL());
      assertNull(de0.FACE6.getNbLUN());
      assertEquals((-1825), (int)de0.FACE6.getValeur());
      assertNull(de0.FACE6.getNbOR());
      assertEquals(Type.PLUS, de0.FACE6.getType());
      assertNull(de0.FACE6.getNbVICT());
      
      Face face1 = de0.FACE3;
      assertNotEquals(face1, face0);
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      de0.FACE4 = face1;
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(de0.FACE4.getNbOR());
      assertNull(de0.FACE4.getNbSOL());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbVICT());
      assertNull(de0.FACE4.getNbLUN());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      
      de0.setFACE(null);
      Face face2 = new Face(type0, integer0, integer0, integer0, integer0);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertEquals(Type.PLUS, face2.getType());
      assertNull(face2.getValeur());
      assertEquals((-1825), (int)face2.getNbSOL());
      assertEquals((-1825), (int)face2.getNbOR());
      assertNull(face2.getRes());
      assertEquals((-1825), (int)face2.getNbLUN());
      assertEquals((-1825), (int)face2.getNbVICT());
      assertNotNull(face2);
      
      Face face3 = De.compare2Face(face2, de0.FACE2);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face0);
      assertEquals(Type.PLUS, face2.getType());
      assertNull(face2.getValeur());
      assertEquals((-1825), (int)face2.getNbSOL());
      assertEquals((-1825), (int)face2.getNbOR());
      assertNull(face2.getRes());
      assertEquals((-1825), (int)face2.getNbLUN());
      assertEquals((-1825), (int)face2.getNbVICT());
      assertEquals((-1825), (int)face3.getNbVICT());
      assertEquals(Type.PLUS, face3.getType());
      assertEquals((-1825), (int)face3.getNbOR());
      assertEquals((-1825), (int)face3.getNbSOL());
      assertNull(face3.getRes());
      assertEquals((-1825), (int)face3.getNbLUN());
      assertNull(face3.getValeur());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertSame(face2, face3);
      assertNotSame(face3, face1);
      assertNotSame(face3, face0);
      assertSame(face3, face2);
      assertNotNull(face3);
      
      Random.setNextRandom((-1825));
      Integer integer1 = 4;
      assertNotEquals(integer1, integer0);
      assertEquals(4, (int)integer1);
      assertNotNull(integer1);
      
      Face face4 = new Face(type0, integer0, integer0, integer0, integer1);
      assertNotEquals(integer0, integer1);
      assertNotEquals(integer1, integer0);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face3);
      assertEquals(Type.PLUS, face4.getType());
      assertNull(face4.getValeur());
      assertEquals((-1825), (int)face4.getNbSOL());
      assertNull(face4.getRes());
      assertEquals((-1825), (int)face4.getNbOR());
      assertEquals(4, (int)face4.getNbVICT());
      assertEquals((-1825), (int)face4.getNbLUN());
      assertNotNull(face4);
      
      Face face5 = De.compare2Face(face0, face4);
      assertNotEquals(integer0, integer1);
      assertNotEquals(face0, face2);
      assertNotEquals(face0, face1);
      assertNotEquals(face0, face3);
      assertNotEquals(face0, face4);
      assertNotEquals(integer1, integer0);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face3);
      assertNotEquals(face5, face3);
      assertNotEquals(face5, face4);
      assertNotEquals(face5, face1);
      assertNotEquals(face5, face2);
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.PLUS, face0.getType());
      assertNull(face0.getNbLUN());
      assertEquals((-1825), (int)face0.getValeur());
      assertEquals(Ressource.LUNAIRE, face0.getRes());
      assertNull(face0.getNbSOL());
      assertEquals(Type.PLUS, face4.getType());
      assertNull(face4.getValeur());
      assertEquals((-1825), (int)face4.getNbSOL());
      assertNull(face4.getRes());
      assertEquals((-1825), (int)face4.getNbOR());
      assertEquals(4, (int)face4.getNbVICT());
      assertEquals((-1825), (int)face4.getNbLUN());
      assertEquals((-1825), (int)face5.getValeur());
      assertEquals(Ressource.LUNAIRE, face5.getRes());
      assertNull(face5.getNbSOL());
      assertEquals(Type.PLUS, face5.getType());
      assertNull(face5.getNbOR());
      assertNull(face5.getNbLUN());
      assertNull(face5.getNbVICT());
      assertSame(face0, face5);
      assertNotSame(face0, face2);
      assertNotSame(face0, face1);
      assertNotSame(face0, face3);
      assertNotSame(face0, face4);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertNotSame(face4, face2);
      assertNotSame(face4, face3);
      assertNotSame(face4, face5);
      assertNotSame(face5, face3);
      assertSame(face5, face0);
      assertNotSame(face5, face4);
      assertNotSame(face5, face1);
      assertNotSame(face5, face2);
      assertNotNull(face5);
      
      Face face6 = De.compare2Face(face4, de0.FACE6);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face2);
      assertNotEquals(integer0, integer1);
      assertNotEquals(integer1, integer0);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face3);
      assertNotEquals(face4, face5);
      assertEquals((-1825), (int)face6.getNbSOL());
      assertEquals(4, (int)face6.getNbVICT());
      assertEquals((-1825), (int)face6.getNbLUN());
      assertNull(face6.getValeur());
      assertEquals(Type.PLUS, face6.getType());
      assertNull(face6.getRes());
      assertEquals((-1825), (int)face6.getNbOR());
      assertEquals(Type.PLUS, face4.getType());
      assertNull(face4.getValeur());
      assertEquals((-1825), (int)face4.getNbSOL());
      assertNull(face4.getRes());
      assertEquals((-1825), (int)face4.getNbOR());
      assertEquals(4, (int)face4.getNbVICT());
      assertEquals((-1825), (int)face4.getNbLUN());
      assertSame(face6, face4);
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face0);
      assertNotSame(face6, face1);
      assertNotSame(face6, face2);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertNotSame(face4, face2);
      assertNotSame(face4, face3);
      assertSame(face4, face6);
      assertNotSame(face4, face5);
      assertNotNull(face6);
      
      // Undeclared exception!
      try { 
        de0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.De", e);
      }
  }

  @Test(timeout = 4000)
  public void test51() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      de0.FACE1 = de0.FACE2;
      assertNull(de0.FACE1.getNbLUN());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbVICT());
      assertNull(de0.FACE1.getNbSOL());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertNull(de0.FACE1.getNbOR());
      
      de0.initDe1();
      Random.setNextRandom(2);
      Face face0 = de0.getFace();
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbSOL());
      assertNull(face0.getNbLUN());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertEquals(Type.NORMAL, face0.getType());
      assertNotNull(face0);
      
      String string0 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string0);
      assertNotNull(string0);
      
      Face face1 = de0.FACE6;
      assertNotEquals(face1, face0);
      assertNull(face1.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      Face face2 = De.compare2Face(de0.FACE3, face1);
      assertNotEquals(face1, face0);
      assertNotEquals(face2, face1);
      assertNull(face1.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertNotSame(face1, face2);
      assertNotSame(face1, face0);
      assertSame(face2, face0);
      assertNotSame(face2, face1);
      assertNotNull(face2);
  }

  @Test(timeout = 4000)
  public void test52() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe2();
      Face face0 = de0.getFace();
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbLUN());
      assertNotNull(face0);
      
      de0.initDe2();
      de0.FACE1 = face0;
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbOR());
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbLUN());
      assertNull(de0.FACE1.getNbLUN());
      assertNull(de0.FACE1.getNbSOL());
      assertNull(de0.FACE1.getNbOR());
      assertEquals(1, (int)de0.FACE1.getValeur());
      assertEquals(Ressource.OR, de0.FACE1.getRes());
      assertEquals(Type.NORMAL, de0.FACE1.getType());
      assertNull(de0.FACE1.getNbVICT());
      
      Face face1 = de0.getFace();
      assertEquals(Ressource.OR, face1.getRes());
      assertNull(face1.getNbSOL());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbVICT());
      assertEquals(Type.NORMAL, face1.getType());
      assertSame(face1, face0);
      assertNotNull(face1);
      
      Random.setNextRandom((-7));
      Face face2 = de0.getFace();
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbSOL());
      assertEquals(Type.NORMAL, face2.getType());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertNotNull(face2);
      
      Face face3 = de0.FACE5;
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertEquals(Ressource.LUNAIRE, face3.getRes());
      assertNull(face3.getNbSOL());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbLUN());
      assertNotSame(face3, face2);
      assertNotSame(face3, face0);
      assertNotSame(face3, face1);
      assertNotNull(face3);
      
      Face face4 = de0.FACE3;
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face3);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbSOL());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbVICT());
      assertNotSame(face4, face2);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertNotSame(face4, face3);
      assertNotNull(face4);
      
      String string0 = face4.AfficheFace();
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face3);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbSOL());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbVICT());
      assertNotSame(face4, face2);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertNotSame(face4, face3);
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      Face face5 = De.compare2Face(face4, de0.FACE6);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face3);
      assertNotEquals(face5, face0);
      assertNotEquals(face5, face1);
      assertNotEquals(face5, face2);
      assertNotEquals(face5, face3);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbSOL());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbVICT());
      assertNull(face5.getNbSOL());
      assertEquals(1, (int)face5.getValeur());
      assertEquals(Type.NORMAL, face5.getType());
      assertEquals(Ressource.OR, face5.getRes());
      assertNull(face5.getNbLUN());
      assertNull(face5.getNbOR());
      assertNull(face5.getNbVICT());
      assertNotSame(face4, face2);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertSame(face4, face5);
      assertNotSame(face4, face3);
      assertNotSame(face5, face0);
      assertNotSame(face5, face1);
      assertSame(face5, face4);
      assertNotSame(face5, face2);
      assertNotSame(face5, face3);
      assertNotNull(face5);
      
      String string1 = de0.toString();
      assertNotEquals(string1, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string1);
      assertNotNull(string1);
      
      Face face6 = De.compare2Face(face4, de0.FACE5);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face0);
      assertNotEquals(face4, face1);
      assertNotEquals(face4, face3);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face3);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbOR());
      assertNull(face4.getNbSOL());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbVICT());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbSOL());
      assertEquals(Ressource.OR, face6.getRes());
      assertNull(face6.getNbVICT());
      assertNull(face6.getNbOR());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbLUN());
      assertNotSame(face4, face2);
      assertSame(face4, face6);
      assertNotSame(face4, face0);
      assertNotSame(face4, face1);
      assertSame(face4, face5);
      assertNotSame(face4, face3);
      assertSame(face6, face5);
      assertNotSame(face6, face0);
      assertNotSame(face6, face1);
      assertNotSame(face6, face3);
      assertNotSame(face6, face2);
      assertSame(face6, face4);
      assertNotNull(face6);
      
      Face face7 = De.compare2Face(face2, de0.FACE2);
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertNotEquals(face2, face4);
      assertNotEquals(face2, face5);
      assertNotEquals(face2, face3);
      assertNotEquals(face2, face6);
      assertNotEquals(face7, face5);
      assertNotEquals(face7, face3);
      assertNotEquals(face7, face0);
      assertNotEquals(face7, face1);
      assertNotEquals(face7, face6);
      assertNotEquals(face7, face4);
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbSOL());
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face7.getNbOR());
      assertNull(face7.getNbVICT());
      assertEquals(Type.NORMAL, face7.getType());
      assertNull(face7.getNbSOL());
      assertNull(face7.getNbLUN());
      assertEquals(1, (int)face7.getValeur());
      assertEquals(Ressource.OR, face7.getRes());
      assertSame(face2, face7);
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertNotSame(face2, face4);
      assertNotSame(face2, face5);
      assertNotSame(face2, face3);
      assertNotSame(face2, face6);
      assertNotSame(face7, face5);
      assertNotSame(face7, face3);
      assertSame(face7, face2);
      assertNotSame(face7, face0);
      assertNotSame(face7, face1);
      assertNotSame(face7, face6);
      assertNotSame(face7, face4);
      assertNotNull(face7);
  }

  @Test(timeout = 4000)
  public void test53() {
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.getFace();
      assertNull(face0);
      
      de0.initDe1();
      Face face1 = de0.getFace();
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNotNull(face1);
      
      de0.FACE4 = face1;
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(de0.FACE4.getNbLUN());
      assertNull(de0.FACE4.getNbVICT());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertEquals(Ressource.OR, de0.FACE4.getRes());
      assertNull(de0.FACE4.getNbSOL());
      assertNull(de0.FACE4.getNbOR());
      
      String string0 = face1.AfficheFace();
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      Face face2 = De.compare2Face(face1, face1);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertSame(face1, face2);
      assertSame(face2, face1);
      assertNotNull(face2);
      
      String string1 = de0.toString();
      assertNotEquals(string1, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string1);
      assertNotNull(string1);
      
      String string2 = face2.AfficheFace();
      assertEquals(string2, string0);
      assertNotEquals(string2, string1);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertSame(face1, face2);
      assertSame(face2, face1);
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      Face face3 = de0.FACE2;
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face2);
      assertNull(face3.getNbSOL());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbLUN());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNull(face3.getNbVICT());
      assertNotSame(face3, face1);
      assertNotSame(face3, face2);
      assertNotNull(face3);
      
      Random.setNextRandom((-1024));
      de0.setFACE(face1);
      assertNotEquals(face1, face3);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNotSame(face1, face3);
      assertSame(face1, face2);
      
      String string3 = de0.toString();
      assertNotEquals(string3, string0);
      assertEquals(string3, string1);
      assertNotEquals(string3, string2);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = de0.toString();
      assertNotEquals(string4, string2);
      assertEquals(string4, string3);
      assertNotEquals(string4, string0);
      assertEquals(string4, string1);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string4);
      assertNotNull(string4);
      
      Random.setNextRandom((-1024));
      de0.setFACE(face1);
      assertNotEquals(face1, face3);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNotSame(face1, face3);
      assertSame(face1, face2);
      
      Random.setNextRandom((-1024));
      de0.setFACE(face2);
      assertNotEquals(face1, face3);
      assertNotEquals(face2, face3);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertNull(face2.getNbSOL());
      assertNull(face2.getNbLUN());
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Ressource.OR, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertNotSame(face1, face3);
      assertSame(face1, face2);
      assertSame(face2, face1);
      assertNotSame(face2, face3);
      
      Face face4 = de0.faceMin();
      assertNotEquals(face4, face3);
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbSOL());
      assertEquals(Ressource.OR, face4.getRes());
      assertEquals(1, (int)face4.getValeur());
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbVICT());
      assertNull(face4.getNbOR());
      assertSame(face4, face1);
      assertSame(face4, face2);
      assertNotSame(face4, face3);
      assertNotNull(face4);
      
      Face face5 = de0.faceMin();
      assertNotEquals(face5, face3);
      assertNull(face5.getNbLUN());
      assertEquals(Type.NORMAL, face5.getType());
      assertNull(face5.getNbVICT());
      assertEquals(1, (int)face5.getValeur());
      assertEquals(Ressource.OR, face5.getRes());
      assertNull(face5.getNbOR());
      assertNull(face5.getNbSOL());
      assertSame(face5, face1);
      assertSame(face5, face4);
      assertSame(face5, face2);
      assertNotSame(face5, face3);
      assertNotNull(face5);
      
      String string5 = face1.AfficheFace();
      assertNotEquals(face1, face3);
      assertNotEquals(string5, string3);
      assertEquals(string5, string2);
      assertNotEquals(string5, string1);
      assertEquals(string5, string0);
      assertNotEquals(string5, string4);
      assertEquals(1, (int)face1.getValeur());
      assertEquals(Ressource.OR, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertNull(face1.getNbVICT());
      assertNotSame(face1, face3);
      assertSame(face1, face2);
      assertSame(face1, face4);
      assertSame(face1, face5);
      assertEquals("\u001B[33m1 OR\u001B[0m", string5);
      assertNotNull(string5);
      
      Face face6 = de0.getFace();
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face1);
      assertNull(face6.getNbVICT());
      assertNull(face6.getNbSOL());
      assertNull(face6.getNbLUN());
      assertEquals(Ressource.OR, face6.getRes());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbOR());
      assertEquals(Type.NORMAL, face6.getType());
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face2);
      assertNotSame(face6, face4);
      assertNotSame(face6, face1);
      assertNotNull(face6);
      
      Face face7 = De.compare2Face(de0.FACE4, de0.FACE2);
      assertNotEquals(face7, face6);
      assertNotEquals(face7, face3);
      assertNull(face7.getNbSOL());
      assertNull(face7.getNbLUN());
      assertNull(face7.getNbOR());
      assertEquals(1, (int)face7.getValeur());
      assertEquals(Ressource.OR, face7.getRes());
      assertNull(face7.getNbVICT());
      assertEquals(Type.NORMAL, face7.getType());
      assertSame(face7, face5);
      assertSame(face7, face1);
      assertNotSame(face7, face6);
      assertSame(face7, face4);
      assertNotSame(face7, face3);
      assertSame(face7, face2);
      assertNotNull(face7);
      
      Random.setNextRandom((-1024));
      de0.setFACE(face6);
      assertNotEquals(face6, face3);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face7);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face1);
      assertNull(face6.getNbVICT());
      assertNull(face6.getNbSOL());
      assertNull(face6.getNbLUN());
      assertEquals(Ressource.OR, face6.getRes());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbOR());
      assertEquals(Type.NORMAL, face6.getType());
      assertNotSame(face6, face3);
      assertNotSame(face6, face5);
      assertNotSame(face6, face2);
      assertNotSame(face6, face7);
      assertNotSame(face6, face4);
      assertNotSame(face6, face1);
      
      Face face8 = de0.FACE2;
      assertNotEquals(face8, face2);
      assertNotEquals(face8, face4);
      assertNotEquals(face8, face1);
      assertNotEquals(face8, face6);
      assertNotEquals(face8, face5);
      assertNotEquals(face8, face7);
      assertEquals(Type.NORMAL, face8.getType());
      assertNull(face8.getNbSOL());
      assertNull(face8.getNbVICT());
      assertNull(face8.getNbLUN());
      assertEquals(1, (int)face8.getValeur());
      assertEquals(Ressource.OR, face8.getRes());
      assertNull(face8.getNbOR());
      assertSame(face8, face3);
      assertNotSame(face8, face2);
      assertNotSame(face8, face4);
      assertNotSame(face8, face1);
      assertNotSame(face8, face6);
      assertNotSame(face8, face5);
      assertNotSame(face8, face7);
      assertNotNull(face8);
      
      de0.setFACE(face3);
      assertNotEquals(face3, face1);
      assertNotEquals(face3, face2);
      assertNotEquals(face3, face5);
      assertNotEquals(face3, face6);
      assertNotEquals(face3, face7);
      assertNotEquals(face3, face4);
      assertNull(face3.getNbSOL());
      assertEquals(Ressource.OR, face3.getRes());
      assertEquals(1, (int)face3.getValeur());
      assertNull(face3.getNbLUN());
      assertNull(face3.getNbOR());
      assertEquals(Type.NORMAL, face3.getType());
      assertNull(face3.getNbVICT());
      assertNotSame(face3, face1);
      assertNotSame(face3, face2);
      assertNotSame(face3, face5);
      assertNotSame(face3, face6);
      assertNotSame(face3, face7);
      assertNotSame(face3, face4);
      assertSame(face3, face8);
  }

  @Test(timeout = 4000)
  public void test54() {
      De de0 = new De();
      assertNotNull(de0);
      
      de0.initDe1();
      String string0 = de0.FACE4.AfficheFace();
      assertEquals("\u001B[33m1 OR\u001B[0m", string0);
      assertNotNull(string0);
      
      String string1 = de0.toString();
      assertNotEquals(string1, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string1);
      assertNotNull(string1);
      
      String string2 = de0.FACE1.AfficheFace();
      assertEquals(string2, string0);
      assertNotEquals(string2, string1);
      assertEquals("\u001B[33m1 OR\u001B[0m", string2);
      assertNotNull(string2);
      
      String string3 = de0.FACE5.AfficheFace();
      assertNotEquals(string3, string1);
      assertEquals(string3, string2);
      assertEquals(string3, string0);
      assertEquals("\u001B[33m1 OR\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = de0.FACE6.AfficheFace();
      assertNotEquals(string4, string1);
      assertNotEquals(string4, string0);
      assertNotEquals(string4, string2);
      assertNotEquals(string4, string3);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string4);
      assertNotNull(string4);
      
      String string5 = de0.FACE6.AfficheFace();
      assertNotEquals(string5, string2);
      assertNotEquals(string5, string1);
      assertNotEquals(string5, string3);
      assertNotEquals(string5, string0);
      assertEquals(string5, string4);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string5);
      assertNotNull(string5);
      
      String string6 = de0.FACE4.AfficheFace();
      assertEquals(string6, string3);
      assertNotEquals(string6, string1);
      assertNotEquals(string6, string4);
      assertEquals(string6, string0);
      assertNotEquals(string6, string5);
      assertEquals(string6, string2);
      assertEquals("\u001B[33m1 OR\u001B[0m", string6);
      assertNotNull(string6);
      
      String string7 = de0.toString();
      assertNotEquals(string7, string2);
      assertNotEquals(string7, string3);
      assertNotEquals(string7, string0);
      assertNotEquals(string7, string5);
      assertNotEquals(string7, string6);
      assertNotEquals(string7, string4);
      assertEquals(string7, string1);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string7);
      assertNotNull(string7);
      
      String string8 = de0.FACE2.AfficheFace();
      assertNotEquals(string8, string7);
      assertEquals(string8, string3);
      assertNotEquals(string8, string1);
      assertNotEquals(string8, string4);
      assertEquals(string8, string0);
      assertEquals(string8, string6);
      assertEquals(string8, string2);
      assertNotEquals(string8, string5);
      assertEquals("\u001B[33m1 OR\u001B[0m", string8);
      assertNotNull(string8);
      
      String string9 = de0.toString();
      assertNotEquals(string9, string8);
      assertEquals(string9, string1);
      assertNotEquals(string9, string2);
      assertNotEquals(string9, string4);
      assertEquals(string9, string7);
      assertNotEquals(string9, string3);
      assertNotEquals(string9, string0);
      assertNotEquals(string9, string5);
      assertNotEquals(string9, string6);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string9);
      assertNotNull(string9);
      
      String string10 = de0.FACE1.AfficheFace();
      assertNotEquals(string10, string5);
      assertEquals(string10, string2);
      assertNotEquals(string10, string7);
      assertEquals(string10, string8);
      assertNotEquals(string10, string9);
      assertEquals(string10, string3);
      assertNotEquals(string10, string1);
      assertNotEquals(string10, string4);
      assertEquals(string10, string0);
      assertEquals(string10, string6);
      assertEquals("\u001B[33m1 OR\u001B[0m", string10);
      assertNotNull(string10);
      
      String string11 = de0.FACE6.AfficheFace();
      assertEquals(string11, string4);
      assertEquals(string11, string5);
      assertNotEquals(string11, string1);
      assertNotEquals(string11, string0);
      assertNotEquals(string11, string9);
      assertNotEquals(string11, string8);
      assertNotEquals(string11, string6);
      assertNotEquals(string11, string3);
      assertNotEquals(string11, string2);
      assertNotEquals(string11, string7);
      assertNotEquals(string11, string10);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string11);
      assertNotNull(string11);
      
      de0.initDe2();
      Face face0 = De.compare2Face(de0.FACE1, de0.FACE5);
      assertNull(face0.getNbVICT());
      assertNull(face0.getNbOR());
      assertEquals(1, (int)face0.getValeur());
      assertEquals(Ressource.OR, face0.getRes());
      assertNull(face0.getNbLUN());
      assertEquals(Type.NORMAL, face0.getType());
      assertNull(face0.getNbSOL());
      assertNotNull(face0);
      
      de0.FACE3 = de0.FACE5;
      assertEquals(Type.NORMAL, de0.FACE3.getType());
      assertEquals(1, (int)de0.FACE3.getValeur());
      assertEquals(Ressource.LUNAIRE, de0.FACE3.getRes());
      assertNull(de0.FACE3.getNbVICT());
      assertNull(de0.FACE3.getNbLUN());
      assertNull(de0.FACE3.getNbOR());
      assertNull(de0.FACE3.getNbSOL());
      
      String string12 = de0.FACE5.AfficheFace();
      assertNotEquals(string12, string1);
      assertNotEquals(string12, string0);
      assertNotEquals(string12, string3);
      assertNotEquals(string12, string10);
      assertNotEquals(string12, string6);
      assertNotEquals(string12, string2);
      assertNotEquals(string12, string7);
      assertNotEquals(string12, string5);
      assertNotEquals(string12, string8);
      assertNotEquals(string12, string4);
      assertNotEquals(string12, string11);
      assertNotEquals(string12, string9);
      assertEquals("\u001B[34m1 LUNAIRE\u001B[0m", string12);
      assertNotNull(string12);
      
      de0.setFACE(de0.FACE2);
      de0.setFACE(de0.FACE6);
      String string13 = de0.toString();
      assertNotEquals(string13, string12);
      assertNotEquals(string13, string2);
      assertNotEquals(string13, string3);
      assertNotEquals(string13, string10);
      assertNotEquals(string13, string8);
      assertNotEquals(string13, string0);
      assertNotEquals(string13, string4);
      assertNotEquals(string13, string1);
      assertNotEquals(string13, string7);
      assertNotEquals(string13, string11);
      assertNotEquals(string13, string5);
      assertNotEquals(string13, string6);
      assertNotEquals(string13, string9);
      assertEquals("\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string13);
      assertNotNull(string13);
      
      Random.setNextRandom((-1575));
      de0.setFACE(de0.FACE5);
      Face face1 = De.compare2Face(de0.FACE1, de0.FACE6);
      assertNotEquals(face1, face0);
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.VICTOIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(2, (int)face1.getValeur());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbVICT());
      assertNotSame(face1, face0);
      assertNotNull(face1);
      
      Face face2 = de0.getFace();
      assertNotEquals(face2, face0);
      assertNotEquals(face2, face1);
      assertEquals(1, (int)face2.getValeur());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(Ressource.LUNAIRE, face2.getRes());
      assertNull(face2.getNbVICT());
      assertNull(face2.getNbLUN());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbSOL());
      assertNotSame(face2, face0);
      assertNotSame(face2, face1);
      assertNotNull(face2);
      
      Face face3 = de0.FACE5;
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertNull(face3.getNbOR());
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.LUNAIRE, face3.getRes());
      assertNull(face3.getNbSOL());
      assertEquals(1, (int)face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face0);
      assertSame(face3, face2);
      assertNotSame(face3, face1);
      assertNotNull(face3);
      
      String string14 = face3.AfficheFace();
      assertNotEquals(face3, face0);
      assertNotEquals(face3, face1);
      assertNotEquals(string14, string8);
      assertNotEquals(string14, string4);
      assertNotEquals(string14, string2);
      assertNotEquals(string14, string10);
      assertNotEquals(string14, string13);
      assertEquals(string14, string12);
      assertNotEquals(string14, string9);
      assertNotEquals(string14, string5);
      assertNotEquals(string14, string7);
      assertNotEquals(string14, string11);
      assertNotEquals(string14, string6);
      assertNotEquals(string14, string3);
      assertNotEquals(string14, string1);
      assertNotEquals(string14, string0);
      assertNull(face3.getNbOR());
      assertNull(face3.getNbVICT());
      assertNull(face3.getNbLUN());
      assertEquals(Ressource.LUNAIRE, face3.getRes());
      assertNull(face3.getNbSOL());
      assertEquals(1, (int)face3.getValeur());
      assertEquals(Type.NORMAL, face3.getType());
      assertNotSame(face3, face0);
      assertSame(face3, face2);
      assertNotSame(face3, face1);
      assertEquals("\u001B[34m1 LUNAIRE\u001B[0m", string14);
      assertNotNull(string14);
      
      String string15 = de0.toString();
      assertNotEquals(string15, string2);
      assertNotEquals(string15, string12);
      assertNotEquals(string15, string10);
      assertNotEquals(string15, string13);
      assertNotEquals(string15, string14);
      assertNotEquals(string15, string1);
      assertNotEquals(string15, string4);
      assertNotEquals(string15, string8);
      assertNotEquals(string15, string3);
      assertNotEquals(string15, string7);
      assertNotEquals(string15, string0);
      assertNotEquals(string15, string5);
      assertNotEquals(string15, string6);
      assertNotEquals(string15, string11);
      assertNotEquals(string15, string9);
      assertEquals("\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string15);
      assertNotNull(string15);
      
      Random.setNextRandom((-2646));
      de0.setFACE(de0.FACE6);
      Face face4 = de0.faceMin();
      assertNotEquals(face4, face3);
      assertNotEquals(face4, face2);
      assertNotEquals(face4, face0);
      assertNull(face4.getNbLUN());
      assertNull(face4.getNbVICT());
      assertEquals(Type.NORMAL, face4.getType());
      assertEquals(Ressource.VICTOIRE, face4.getRes());
      assertEquals(2, (int)face4.getValeur());
      assertNull(face4.getNbSOL());
      assertNull(face4.getNbOR());
      assertSame(face4, face1);
      assertNotSame(face4, face3);
      assertNotSame(face4, face2);
      assertNotSame(face4, face0);
      assertNotNull(face4);
      
      String string16 = de0.toString();
      assertNotEquals(string16, string11);
      assertNotEquals(string16, string6);
      assertNotEquals(string16, string3);
      assertNotEquals(string16, string7);
      assertNotEquals(string16, string0);
      assertNotEquals(string16, string5);
      assertNotEquals(string16, string9);
      assertNotEquals(string16, string12);
      assertNotEquals(string16, string4);
      assertNotEquals(string16, string8);
      assertNotEquals(string16, string13);
      assertNotEquals(string16, string1);
      assertEquals(string16, string15);
      assertNotEquals(string16, string10);
      assertNotEquals(string16, string14);
      assertNotEquals(string16, string2);
      assertEquals("\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string16);
      assertNotNull(string16);
      
      Random.setNextRandom(6);
      Face face5 = De.compare2Face(de0.FACE5, face1);
      assertNotEquals(face5, face0);
      assertNotEquals(face5, face1);
      assertNotEquals(face5, face4);
      assertNotEquals(face1, face3);
      assertNotEquals(face1, face2);
      assertNotEquals(face1, face0);
      assertNull(face5.getNbLUN());
      assertNull(face5.getNbOR());
      assertNull(face5.getNbVICT());
      assertEquals(Type.NORMAL, face5.getType());
      assertEquals(Ressource.LUNAIRE, face5.getRes());
      assertNull(face5.getNbSOL());
      assertEquals(1, (int)face5.getValeur());
      assertNull(face1.getNbLUN());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.VICTOIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertEquals(2, (int)face1.getValeur());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbVICT());
      assertNotSame(face5, face0);
      assertSame(face5, face3);
      assertSame(face5, face2);
      assertNotSame(face5, face1);
      assertNotSame(face5, face4);
      assertNotSame(face1, face3);
      assertSame(face1, face4);
      assertNotSame(face1, face2);
      assertNotSame(face1, face0);
      assertNotSame(face1, face5);
      assertNotNull(face5);
      
      Type type0 = Type.NORMAL;
      Integer integer0 = Integer.getInteger("\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", null);
      assertNull(integer0);
      
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face6 = new Face(type0, null, ressource0);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face3);
      assertNull(face6.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face6.getRes());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbSOL());
      assertNull(face6.getValeur());
      assertNull(face6.getNbLUN());
      assertNull(face6.getNbOR());
      assertNotNull(face6);
      
      Face face7 = De.compare2Face(face6, de0.FACE6);
      assertNotEquals(face6, face2);
      assertNotEquals(face6, face0);
      assertNotEquals(face6, face4);
      assertNotEquals(face6, face5);
      assertNotEquals(face6, face1);
      assertNotEquals(face6, face3);
      assertNotEquals(face7, face3);
      assertNotEquals(face7, face4);
      assertNotEquals(face7, face5);
      assertNotEquals(face7, face1);
      assertNotEquals(face7, face2);
      assertNotEquals(face7, face0);
      assertNull(face6.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face6.getRes());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbSOL());
      assertNull(face6.getValeur());
      assertNull(face6.getNbLUN());
      assertNull(face6.getNbOR());
      assertNull(face7.getNbOR());
      assertNull(face7.getNbLUN());
      assertNull(face7.getNbSOL());
      assertNull(face7.getValeur());
      assertEquals(Type.NORMAL, face7.getType());
      assertNull(face7.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face7.getRes());
      assertNotSame(face6, face2);
      assertNotSame(face6, face0);
      assertNotSame(face6, face4);
      assertNotSame(face6, face5);
      assertSame(face6, face7);
      assertNotSame(face6, face1);
      assertNotSame(face6, face3);
      assertNotSame(face7, face3);
      assertNotSame(face7, face4);
      assertNotSame(face7, face5);
      assertNotSame(face7, face1);
      assertNotSame(face7, face2);
      assertNotSame(face7, face0);
      assertSame(face7, face6);
      assertNotNull(face7);
  }

  @Test(timeout = 4000)
  public void test55() {
      Random.setNextRandom((-1025));
      De de0 = new De();
      assertNotNull(de0);
      
      Face face0 = de0.getFace();
      assertNull(face0);
      
      de0.initDe1();
      Face face1 = de0.getFace();
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNotNull(face1);
      
      String string0 = face1.AfficheFace();
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string0);
      assertNotNull(string0);
      
      de0.FACE4 = face1;
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNull(de0.FACE4.getNbVICT());
      assertNull(de0.FACE4.getNbOR());
      assertNull(de0.FACE4.getNbLUN());
      assertEquals(1, (int)de0.FACE4.getValeur());
      assertEquals(Type.NORMAL, de0.FACE4.getType());
      assertNull(de0.FACE4.getNbSOL());
      assertEquals(Ressource.SOLAIRE, de0.FACE4.getRes());
      
      String string1 = face1.AfficheFace();
      assertEquals(string1, string0);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string1);
      assertNotNull(string1);
      
      Face face2 = De.compare2Face(face1, face1);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face2.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertNull(face2.getNbSOL());
      assertSame(face1, face2);
      assertSame(face2, face1);
      assertNotNull(face2);
      
      String string2 = face1.AfficheFace();
      assertEquals(string2, string1);
      assertEquals(string2, string0);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string2);
      assertNotNull(string2);
      
      String string3 = face1.AfficheFace();
      assertEquals(string3, string2);
      assertEquals(string3, string1);
      assertEquals(string3, string0);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string3);
      assertNotNull(string3);
      
      String string4 = de0.toString();
      assertNotEquals(string4, string2);
      assertNotEquals(string4, string0);
      assertNotEquals(string4, string1);
      assertNotEquals(string4, string3);
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string4);
      assertNotNull(string4);
      
      String string5 = face1.AfficheFace();
      assertEquals(string5, string0);
      assertEquals(string5, string3);
      assertEquals(string5, string1);
      assertEquals(string5, string2);
      assertNotEquals(string5, string4);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m", string5);
      assertNotNull(string5);
      
      de0.setFACE(face1);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      
      Face face3 = de0.getFace();
      assertNull(face3.getNbLUN());
      assertNull(face3.getNbVICT());
      assertEquals(Ressource.SOLAIRE, face3.getRes());
      assertEquals(Type.NORMAL, face3.getType());
      assertNull(face3.getNbSOL());
      assertNull(face3.getNbOR());
      assertEquals(1, (int)face3.getValeur());
      assertSame(face3, face2);
      assertSame(face3, face1);
      assertNotNull(face3);
      
      de0.setFACE(face1);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      assertSame(face1, face3);
      
      String string6 = de0.toString();
      assertNotEquals(string6, string2);
      assertNotEquals(string6, string1);
      assertNotEquals(string6, string3);
      assertNotEquals(string6, string5);
      assertNotEquals(string6, string0);
      assertNotEquals(string6, string4);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string6);
      assertNotNull(string6);
      
      Random.setNextRandom((-1025));
      de0.setFACE(face1);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertSame(face1, face2);
      assertSame(face1, face3);
      
      Face face4 = De.compare2Face(face2, face1);
      assertNull(face4.getNbVICT());
      assertNull(face4.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face4.getRes());
      assertEquals(Type.NORMAL, face4.getType());
      assertNull(face4.getNbSOL());
      assertEquals(1, (int)face4.getValeur());
      assertNull(face4.getNbOR());
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face2.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertNull(face2.getNbSOL());
      assertSame(face4, face2);
      assertSame(face4, face1);
      assertSame(face4, face3);
      assertSame(face1, face4);
      assertSame(face1, face2);
      assertSame(face1, face3);
      assertSame(face2, face3);
      assertSame(face2, face4);
      assertSame(face2, face1);
      assertNotNull(face4);
      
      Random.setNextRandom((-1025));
      de0.setFACE(face2);
      assertNull(face1.getNbVICT());
      assertNull(face1.getNbOR());
      assertEquals(Ressource.SOLAIRE, face1.getRes());
      assertEquals(Type.NORMAL, face1.getType());
      assertNull(face1.getNbSOL());
      assertNull(face1.getNbLUN());
      assertEquals(1, (int)face1.getValeur());
      assertNull(face2.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face2.getRes());
      assertNull(face2.getNbOR());
      assertNull(face2.getNbVICT());
      assertEquals(Type.NORMAL, face2.getType());
      assertEquals(1, (int)face2.getValeur());
      assertNull(face2.getNbSOL());
      assertSame(face1, face4);
      assertSame(face1, face2);
      assertSame(face1, face3);
      assertSame(face2, face3);
      assertSame(face2, face4);
      assertSame(face2, face1);
      
      Face face5 = de0.FACE3;
      assertNull(face5.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face5.getRes());
      assertNull(face5.getNbOR());
      assertNull(face5.getNbSOL());
      assertEquals(1, (int)face5.getValeur());
      assertEquals(Type.NORMAL, face5.getType());
      assertNull(face5.getNbVICT());
      assertSame(face5, face2);
      assertSame(face5, face3);
      assertSame(face5, face1);
      assertSame(face5, face4);
      assertNotNull(face5);
      
      String string7 = de0.toString();
      assertNotEquals(string7, string2);
      assertNotEquals(string7, string1);
      assertNotEquals(string7, string0);
      assertNotEquals(string7, string3);
      assertNotEquals(string7, string5);
      assertNotEquals(string7, string4);
      assertNotEquals(string7, string6);
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string7);
      assertNotNull(string7);
      
      Face face6 = de0.faceMin();
      assertNull(face6.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face6.getRes());
      assertNull(face6.getNbOR());
      assertEquals(Type.NORMAL, face6.getType());
      assertNull(face6.getNbVICT());
      assertEquals(1, (int)face6.getValeur());
      assertNull(face6.getNbSOL());
      assertSame(face6, face2);
      assertSame(face6, face3);
      assertSame(face6, face4);
      assertSame(face6, face1);
      assertSame(face6, face5);
      assertNotNull(face6);
      
      Face face7 = de0.getFace();
      assertEquals(Type.NORMAL, face7.getType());
      assertEquals(1, (int)face7.getValeur());
      assertEquals(Ressource.SOLAIRE, face7.getRes());
      assertNull(face7.getNbVICT());
      assertNull(face7.getNbLUN());
      assertNull(face7.getNbSOL());
      assertNull(face7.getNbOR());
      assertSame(face7, face4);
      assertSame(face7, face1);
      assertSame(face7, face2);
      assertSame(face7, face5);
      assertSame(face7, face6);
      assertSame(face7, face3);
      assertNotNull(face7);
      
      Face face8 = de0.FACE5;
      assertNull(face8.getNbVICT());
      assertNull(face8.getNbLUN());
      assertEquals(1, (int)face8.getValeur());
      assertNull(face8.getNbOR());
      assertNull(face8.getNbSOL());
      assertEquals(Ressource.SOLAIRE, face8.getRes());
      assertEquals(Type.NORMAL, face8.getType());
      assertSame(face8, face5);
      assertSame(face8, face4);
      assertSame(face8, face6);
      assertSame(face8, face1);
      assertSame(face8, face3);
      assertSame(face8, face2);
      assertSame(face8, face7);
      assertNotNull(face8);
      
      Face face9 = de0.FACE5;
      assertNull(face9.getNbVICT());
      assertNull(face9.getNbLUN());
      assertEquals(Ressource.SOLAIRE, face9.getRes());
      assertEquals(Type.NORMAL, face9.getType());
      assertEquals(1, (int)face9.getValeur());
      assertNull(face9.getNbSOL());
      assertNull(face9.getNbOR());
      assertSame(face9, face1);
      assertSame(face9, face8);
      assertSame(face9, face6);
      assertSame(face9, face5);
      assertSame(face9, face4);
      assertSame(face9, face7);
      assertSame(face9, face2);
      assertSame(face9, face3);
      assertNotNull(face9);
      
      Random.setNextRandom((-1025));
  }

  @Test(timeout = 4000)
  public void test56() {
      De de0 = new De();
      de0.initDe2();
      de0.initDe2();
      Face face0 = De.compare2Face(de0.FACE6, de0.FACE5);
      de0.toString();
      de0.FACE4 = face0;
      de0.initDe1();
      de0.getFace();
      de0.initDe2();
      face0.AfficheFace();
      de0.initDe1();
      String string0 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string0);
      
      face0.AfficheFace();
      de0.initDe2();
      de0.FACE4.AfficheFace();
      face0.AfficheFace();
      de0.initDe2();
      de0.toString();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      String string1 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[34m1 LUNAIRE\u001B[0m\n\u001B[32m2 VICTOIRE\u001B[0m", string1);
      
      de0.getFace();
      Face face2 = De.compare2Face(de0.FACE6, face1);
      assertEquals(Ressource.OR, face2.getRes());

      de0.initDe1();
      Face face5 = de0.getFace();
      Face face8 = de0.faceMin();
      assertSame(face8, face5);
  }

  @Test(timeout = 4000)
  public void test57() {
      De de0 = new De();
      de0.initDe1();
      de0.FACE6 = de0.FACE5;
      de0.initDe2();
      de0.FACE5 = de0.faceMin();
      assertEquals(1, (int)de0.FACE5.getValeur());
      
      de0.initDe1();
      Face face1 = De.compare2Face(de0.FACE6, de0.FACE2);
      face1.AfficheFace();
      de0.FACE5.AfficheFace();
      de0.setFACE(face1);
      Face face2 = de0.getFace();
      Face face3 = de0.FACE5;
      Face face4 = De.compare2Face(de0.FACE1, de0.FACE5);
      de0.toString();
      String string0 = de0.toString();
      assertEquals("\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string0);
      
      de0.initDe1();
      de0.setFACE(de0.FACE6);
      de0.setFACE(face4);
      assertSame(face4, face2);
      
      String string1 = de0.toString();
      assertEquals("\u001B[31m1 SOLAIRE\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[33m1 OR\u001B[0m\n\u001B[31m1 SOLAIRE\u001B[0m", string1);
      
      Type type0 = Type.PLUS;
      Integer integer0 = (-1926);
      Integer integer1 = (-1926);
      Face face5 = new Face(type0, integer0, integer1, integer1, integer0);
      De.compare2Face(face5, de0.FACE1);
      de0.setFACE(face3);
      Face face6 = De.compare2Face(de0.FACE3, face5);
      assertNotSame(face6, face3);
  }
}
