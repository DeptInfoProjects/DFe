package bot;

import de.Face;
import de.Ressource;
import de.Type;
import iles.Exploit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

@SuppressWarnings("ALL")
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestInventaire extends TestInventaire2 {

  @Test(timeout = 4000)
  public void test00() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire((-1), 2, 1, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(1, inventaire1.getNbLunaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list1 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(1, inventaire1.getNbLunaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(0, list1.size());
      assertTrue(list1.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list1);
      assertSame(list2, list0);
      assertNotNull(list2);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list2.size());
      assertTrue(list2.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Type type0 = Type.NORMAL;
      Ressource ressource0 = Ressource.SOLAIRE;
      Ressource ressource1 = Ressource.LUNAIRE;
      Ressource ressource2 = Ressource.LUNAIRE;
      Integer integer0 = new Integer(328);
      assertNotNull(integer0);
      assertEquals(328, (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource1, ressource1, ressource2).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      doReturn(integer0).when(face0).getValeur();
      inventaire0.setNbVictoire(1);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire1.adderFace(face0);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertNotSame(ressource0, ressource2);
      assertNotSame(ressource0, ressource1);
      assertNotSame(ressource1, ressource0);
      assertSame(ressource1, ressource2);
      assertSame(ressource2, ressource1);
      assertNotSame(ressource2, ressource0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(329, inventaire1.getNbLunaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(ressource0, (Object) ressource2);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(ressource1, (Object) ressource0);
      assertNotEquals(ressource2, (Object) ressource0);
      
      inventaire1.setNbVictoire(101);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(329, inventaire1.getNbLunaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Random.setNextRandom(7);
      Type type1 = Type.NORMAL;
      Ressource ressource3 = Ressource.LUNAIRE;
      Ressource ressource4 = Ressource.SOLAIRE;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource3, ressource4, ressource2, ressource0).when(face1).getRes();
      doReturn(type0).when(face1).getType();
      doReturn(integer0, integer0).when(face1).getValeur();
      inventaire1.adderFace(face1);
      assertSame(ressource3, ressource1);
      assertSame(ressource3, ressource2);
      assertNotSame(ressource3, ressource4);
      assertNotSame(ressource3, ressource0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(ressource4, ressource1);
      assertSame(ressource4, ressource0);
      assertNotSame(ressource4, ressource2);
      assertNotSame(ressource4, ressource3);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertSame(type0, type1);
      assertSame(ressource0, ressource4);
      assertNotSame(ressource0, ressource2);
      assertNotSame(ressource0, ressource3);
      assertNotSame(ressource0, ressource1);
      assertSame(ressource2, ressource1);
      assertNotSame(ressource2, ressource4);
      assertSame(ressource2, ressource3);
      assertNotSame(ressource2, ressource0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(330, inventaire1.getNbSolaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertNotEquals(ressource3, (Object) ressource4);
      assertNotEquals(ressource3, (Object) ressource0);
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(ressource4, (Object) ressource1);
      assertNotEquals(ressource4, (Object) ressource2);
      assertNotEquals(ressource4, (Object) ressource3);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(ressource0, (Object) ressource2);
      assertNotEquals(ressource0, (Object) ressource3);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(ressource2, (Object) ressource4);
      assertNotEquals(ressource2, (Object) ressource0);
      
      Ressource ressource5 = Ressource.OR;
      Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource1, ressource1, ressource2, ressource5).when(face2).getRes();
      doReturn(type1).when(face2).getType();
      doReturn(integer0).when(face2).getValeur();
      inventaire0.adderFace(face2);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(ressource5, ressource4);
      assertNotSame(ressource5, ressource2);
      assertNotSame(ressource5, ressource3);
      assertNotSame(ressource5, ressource0);
      assertNotSame(ressource5, ressource1);
      assertNotSame(ressource1, ressource0);
      assertSame(ressource1, ressource2);
      assertNotSame(ressource1, ressource4);
      assertSame(ressource1, ressource3);
      assertNotSame(ressource1, ressource5);
      assertSame(ressource2, ressource1);
      assertNotSame(ressource2, ressource5);
      assertNotSame(ressource2, ressource4);
      assertSame(ressource2, ressource3);
      assertNotSame(ressource2, ressource0);
      assertSame(type1, type0);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(ressource5, (Object) ressource4);
      assertNotEquals(ressource5, (Object) ressource2);
      assertNotEquals(ressource5, (Object) ressource3);
      assertNotEquals(ressource5, (Object) ressource0);
      assertNotEquals(ressource5, (Object) ressource1);
      assertNotEquals(ressource1, (Object) ressource0);
      assertNotEquals(ressource1, (Object) ressource4);
      assertNotEquals(ressource1, (Object) ressource5);
      assertNotEquals(ressource2, (Object) ressource5);
      assertNotEquals(ressource2, (Object) ressource4);
      assertNotEquals(ressource2, (Object) ressource0);
      
      Type type2 = Type.CHOIX;
      Face face3 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(type2, type0, type0).when(face3).getType();
      inventaire1.adderFace(face3);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertSame(type0, type1);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(330, inventaire1.getNbSolaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(type0, (Object) type2);
      assertNotEquals(type2, (Object) type1);
      assertNotEquals(type2, (Object) type0);
      
      List<Exploit> list3 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list3);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list3, list2);
      assertSame(list3, list0);
      assertSame(list3, list1);
      assertNotNull(list3);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(330, inventaire1.getNbSolaire());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(0, list3.size());
      assertTrue(list3.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type3 = Type.NORMAL;
      Ressource ressource6 = Ressource.SOLAIRE;
      Integer integer1 = new Integer(1);
      assertNotNull(integer1);
      assertNotEquals(integer1, (Object) integer0);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(1);
      assertNotNull(integer2);
      assertNotEquals(integer2, (Object) integer0);
      assertEquals(integer2, (Object) integer1);
      assertEquals(1, (int)integer2);
      
      Face face4 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource5, ressource0, ressource6, ressource3).when(face4).getRes();
      doReturn(type3).when(face4).getType();
      doReturn(integer1, integer2).when(face4).getValeur();
      inventaire1.adderFace(face4);
      assertSame(ressource3, ressource1);
      assertSame(ressource3, ressource2);
      assertNotSame(ressource3, ressource4);
      assertNotSame(ressource3, ressource0);
      assertNotSame(ressource3, ressource5);
      assertNotSame(ressource3, ressource6);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list3);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertNotSame(ressource5, ressource4);
      assertNotSame(ressource5, ressource2);
      assertNotSame(ressource5, ressource3);
      assertNotSame(ressource5, ressource6);
      assertNotSame(ressource5, ressource0);
      assertNotSame(ressource5, ressource1);
      assertNotSame(ressource0, ressource5);
      assertSame(ressource0, ressource4);
      assertNotSame(ressource0, ressource2);
      assertNotSame(ressource0, ressource3);
      assertNotSame(ressource0, ressource1);
      assertSame(ressource0, ressource6);
      assertSame(type3, type1);
      assertSame(type3, type0);
      assertNotSame(ressource6, ressource5);
      assertSame(ressource6, ressource4);
      assertNotSame(ressource6, ressource1);
      assertNotSame(ressource6, ressource2);
      assertNotSame(ressource6, ressource3);
      assertSame(ressource6, ressource0);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(331, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertNotEquals(ressource3, (Object) ressource4);
      assertNotEquals(ressource3, (Object) ressource0);
      assertNotEquals(ressource3, (Object) ressource5);
      assertNotEquals(ressource3, (Object) ressource6);
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(ressource5, (Object) ressource4);
      assertNotEquals(ressource5, (Object) ressource2);
      assertNotEquals(ressource5, (Object) ressource3);
      assertNotEquals(ressource5, (Object) ressource6);
      assertNotEquals(ressource5, (Object) ressource0);
      assertNotEquals(ressource5, (Object) ressource1);
      assertNotEquals(ressource0, (Object) ressource5);
      assertNotEquals(ressource0, (Object) ressource2);
      assertNotEquals(ressource0, (Object) ressource3);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(type3, (Object) type2);
      assertNotEquals(ressource6, (Object) ressource5);
      assertNotEquals(ressource6, (Object) ressource1);
      assertNotEquals(ressource6, (Object) ressource2);
      assertNotEquals(ressource6, (Object) ressource3);
      assertNotEquals(integer1, (Object) integer0);
      assertEquals(integer1, (Object) integer2);
      assertNotEquals(integer2, (Object) integer0);
      assertEquals(integer2, (Object) integer1);
      
      Random.setNextRandom(39);
      List<Exploit> list4 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list3);
      assertSame(list0, list2);
      assertSame(list0, list4);
      assertSame(list4, list0);
      assertSame(list4, list1);
      assertSame(list4, list2);
      assertSame(list4, list3);
      assertNotSame(inventaire1, inventaire0);
      assertNotNull(list4);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(0, list4.size());
      assertTrue(list4.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(331, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list5 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list5, list1);
      assertSame(list5, list4);
      assertSame(list5, list2);
      assertSame(list5, list3);
      assertSame(list5, list0);
      assertNotNull(list5);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list5.isEmpty());
      assertEquals(0, list5.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      List<Exploit> list6 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list3);
      assertSame(list0, list2);
      assertSame(list0, list6);
      assertSame(list0, list4);
      assertSame(list0, list5);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list6, list5);
      assertSame(list6, list1);
      assertSame(list6, list4);
      assertSame(list6, list3);
      assertSame(list6, list2);
      assertSame(list6, list0);
      assertNotNull(list6);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(331, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertTrue(list6.isEmpty());
      assertEquals(0, list6.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list7 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list7);
      assertSame(list0, list3);
      assertSame(list0, list2);
      assertSame(list0, list6);
      assertSame(list0, list4);
      assertSame(list0, list5);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list7, list1);
      assertSame(list7, list6);
      assertSame(list7, list0);
      assertSame(list7, list4);
      assertSame(list7, list5);
      assertSame(list7, list3);
      assertSame(list7, list2);
      assertNotNull(list7);
      assertEquals(328, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(657, inventaire1.getNbLunaire());
      assertEquals(101, inventaire1.getNbVictoire());
      assertEquals(331, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertTrue(list7.isEmpty());
      assertEquals(0, list7.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Random.setNextRandom(7);
      Random.setNextRandom(2511);
  }

  @Test(timeout = 4000)
  public void test01() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(9, 9, 9, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type0 = Type.CHOIX;
      Type type1 = Type.CHOIX;
      Integer integer0 = new Integer((-3078));
      assertNotNull(integer0);
      assertEquals((-3078), (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(face0).getNbSOL();
      doReturn(type0, type1, type1).when(face0).getType();
      inventaire0.adderFace(face0);
      assertNotSame(inventaire0, inventaire1);
      assertSame(type0, type1);
      assertSame(type1, type0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire1.setNbLunaire(264);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type2 = Type.CHOIX;
      int int0 = inventaire1.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(264, int0);
      
      List<Exploit> list1 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertTrue(list1.isEmpty());
      assertEquals(0, list1.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list1);
      assertSame(list2, list0);
      assertNotNull(list2);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list2.isEmpty());
      assertEquals(0, list2.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setInventaire(264, 0, 0, 264, list2);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list1);
      assertSame(list2, list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(264, inventaire0.getNbOR());
      assertTrue(list2.isEmpty());
      assertEquals(0, list2.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int1 = inventaire1.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(264, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int1, int0);
      assertEquals(9, int1);
      
      Type type3 = Type.NORMAL;
      Ressource ressource0 = Ressource.SOLAIRE;
      Ressource ressource1 = Ressource.SOLAIRE;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource0, ressource1, ressource0).when(face1).getRes();
      doReturn(type3).when(face1).getType();
      doReturn(integer0).when(face1).getValeur();
      inventaire1.adderFace(face1);
      assertSame(ressource0, ressource1);
      assertNotSame(inventaire0, inventaire1);
      assertSame(ressource1, ressource0);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(264, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals((-3069), inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(integer0, (Object) int0);
      assertNotEquals(integer0, (Object) int1);
      assertNotEquals(type3, (Object) type2);
      assertNotEquals(type3, (Object) type0);
      assertNotEquals(type3, (Object) type1);
      
      inventaire1.setNbVictoire(9);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertSame(list0, list2);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(264, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbVictoire());
      assertEquals((-3069), inventaire1.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int2 = inventaire0.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(264, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      assertEquals(0, int2);
      
      inventaire0.setNbOR((-1265));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-1265), inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Type type4 = Type.PLUS;
      Integer integer1 = new Integer(1);
      assertNotNull(integer1);
      assertNotEquals(integer1, (Object) int1);
      assertNotEquals(integer1, (Object) integer0);
      assertNotEquals(integer1, (Object) int2);
      assertNotEquals(integer1, (Object) int0);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(1);
      assertNotNull(integer2);
      assertEquals(integer2, (Object) integer1);
      assertNotEquals(integer2, (Object) int1);
      assertNotEquals(integer2, (Object) int2);
      assertNotEquals(integer2, (Object) integer0);
      assertNotEquals(integer2, (Object) int0);
      assertEquals(1, (int)integer2);
      
      Integer integer3 = new Integer((-867));
      assertNotNull(integer3);
      assertNotEquals(integer3, (Object) int0);
      assertNotEquals(integer3, (Object) int2);
      assertNotEquals(integer3, (Object) integer2);
      assertNotEquals(integer3, (Object) integer1);
      assertNotEquals(integer3, (Object) integer0);
      assertNotEquals(integer3, (Object) int1);
      assertEquals((-867), (int)integer3);
      
      Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer2).when(face2).getNbOR();
      doReturn(integer1, integer3).when(face2).getNbSOL();
      doReturn((Integer) null).when(face2).getNbVICT();
      doReturn(type4, type1, type2, type2).when(face2).getType();
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test02() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      Type type0 = Type.NORMAL;
      Type type1 = Type.PLUS;
      Type type2 = Type.CHOIX;
      Ressource ressource0 = Ressource.OR;
      Ressource ressource1 = Ressource.LUNAIRE;
      Integer integer0 = new Integer((-549));
      assertNotNull(integer0);
      assertEquals((-549), (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource0, ressource0, ressource1).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      doReturn(integer0).when(face0).getValeur();
      inventaire0.setNbLunaire((-992));
      assertEquals((-992), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      inventaire0.adderFace(face0);
      assertNotSame(ressource0, ressource1);
      assertNotSame(ressource1, ressource0);
      assertEquals((-992), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-549), inventaire0.getNbOR());
      assertNotEquals(type0, (Object) type1);
      assertNotEquals(type0, (Object) type2);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(ressource1, (Object) ressource0);
      
      Type type3 = Type.CHOIX;
      Ressource ressource2 = Ressource.OR;
      Ressource ressource3 = Ressource.VICTOIRE;
      Integer integer1 = new Integer((-992));
      assertNotNull(integer1);
      assertNotEquals(integer1, (Object) integer0);
      assertEquals((-992), (int)integer1);
      
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource1, ressource2, ressource0, ressource3).when(face1).getRes();
      doReturn(type0).when(face1).getType();
      doReturn(integer1).when(face1).getValeur();
      inventaire0.adderFace(face1);
      assertSame(ressource0, ressource2);
      assertNotSame(ressource0, ressource3);
      assertNotSame(ressource0, ressource1);
      assertNotSame(ressource1, ressource2);
      assertNotSame(ressource1, ressource3);
      assertNotSame(ressource1, ressource0);
      assertNotSame(ressource2, ressource1);
      assertNotSame(ressource2, ressource3);
      assertSame(ressource2, ressource0);
      assertNotSame(ressource3, ressource0);
      assertNotSame(ressource3, ressource2);
      assertNotSame(ressource3, ressource1);
      assertEquals((-992), inventaire0.getNbLunaire());
      assertEquals((-992), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-549), inventaire0.getNbOR());
      assertNotEquals(type0, (Object) type1);
      assertNotEquals(type0, (Object) type3);
      assertNotEquals(type0, (Object) type2);
      assertNotEquals(ressource0, (Object) ressource3);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(ressource1, (Object) ressource2);
      assertNotEquals(ressource1, (Object) ressource3);
      assertNotEquals(ressource1, (Object) ressource0);
      assertNotEquals(ressource2, (Object) ressource1);
      assertNotEquals(ressource2, (Object) ressource3);
      assertNotEquals(ressource3, (Object) ressource0);
      assertNotEquals(ressource3, (Object) ressource2);
      assertNotEquals(ressource3, (Object) ressource1);
      assertNotEquals(integer1, (Object) integer0);
      
      int int0 = inventaire0.getNbLunaire();
      assertEquals((-992), inventaire0.getNbLunaire());
      assertEquals((-992), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-549), inventaire0.getNbOR());
      assertEquals((-992), int0);
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals((-992), inventaire0.getNbLunaire());
      assertEquals((-992), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-549), inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setInventaire((-992), 0, 4091, 0, list0);
      assertEquals(4091, inventaire0.getNbLunaire());
      assertEquals((-992), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setNbOR(0);
      assertEquals(4091, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      Integer integer2 = new Integer(5202);
      assertNotNull(integer2);
      assertNotEquals(integer2, (Object) integer0);
      assertNotEquals(integer2, (Object) int0);
      assertNotEquals(integer2, (Object) integer1);
      assertEquals(5202, (int)integer2);
      
      Integer integer3 = new Integer(4091);
      assertNotNull(integer3);
      assertNotEquals(integer3, (Object) int0);
      assertNotEquals(integer3, (Object) integer1);
      assertNotEquals(integer3, (Object) integer2);
      assertNotEquals(integer3, (Object) integer0);
      assertEquals(4091, (int)integer3);
      
      Integer integer4 = new Integer((-992));
      assertNotNull(integer4);
      assertNotEquals(integer4, (Object) integer2);
      assertEquals(integer4, (Object) int0);
      assertNotEquals(integer4, (Object) integer0);
      assertEquals(integer4, (Object) integer1);
      assertNotEquals(integer4, (Object) integer3);
      assertEquals((-992), (int)integer4);
      
      Type type4 = Type.NORMAL;
      Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer3).when(face2).getNbOR();
      doReturn(integer2).when(face2).getNbSOL();
      doReturn((Integer) null).when(face2).getNbVICT();
      doReturn(type1, type3, type3, type4).when(face2).getType();
      // Undeclared exception!
      try { 
        inventaire0.adderFace(face2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test03() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(9, 9, 9, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type0 = Type.CHOIX;
      Type type1 = Type.CHOIX;
      Integer integer0 = new Integer((-3078));
      assertNotNull(integer0);
      assertEquals((-3078), (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(face0).getNbSOL();
      doReturn(type0, type1, type1).when(face0).getType();
      inventaire0.adderFace(face0);
      assertNotSame(inventaire0, inventaire1);
      assertSame(type0, type1);
      assertSame(type1, type0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire1.setNbLunaire(264);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type2 = Type.CHOIX;
      int int0 = inventaire1.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(264, int0);
      
      List<Exploit> list1 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, list1.size());
      assertTrue(list1.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list0);
      assertSame(list2, list1);
      assertNotNull(list2);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list2.size());
      assertTrue(list2.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setInventaire(264, 0, 0, 264, list2);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list0);
      assertSame(list2, list1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, list2.size());
      assertTrue(list2.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int1 = inventaire1.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list2);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int1, int0);
      assertEquals(9, int1);
      
      Type type3 = Type.NORMAL;
      Ressource ressource0 = Ressource.SOLAIRE;
      Ressource ressource1 = Ressource.SOLAIRE;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource0, ressource1, ressource0).when(face1).getRes();
      doReturn(type3).when(face1).getType();
      doReturn(integer0).when(face1).getValeur();
      inventaire1.adderFace(face1);
      assertSame(ressource0, ressource1);
      assertNotSame(inventaire0, inventaire1);
      assertSame(ressource1, ressource0);
      assertSame(list0, list2);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-3069), inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(integer0, (Object) int1);
      assertNotEquals(integer0, (Object) int0);
      assertNotEquals(type3, (Object) type1);
      assertNotEquals(type3, (Object) type0);
      assertNotEquals(type3, (Object) type2);
      
      inventaire1.setNbVictoire(9);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list2);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-3069), inventaire1.getNbSolaire());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int2 = inventaire0.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      assertEquals(0, int2);
      
      inventaire0.setNbOR((-1265));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-1265), inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Type type4 = Type.PLUS;
      Integer integer1 = new Integer(1);
      assertNotNull(integer1);
      assertNotEquals(integer1, (Object) int0);
      assertNotEquals(integer1, (Object) int1);
      assertNotEquals(integer1, (Object) integer0);
      assertNotEquals(integer1, (Object) int2);
      assertEquals(1, (int)integer1);
      
      Integer integer2 = new Integer(0);
      assertNotNull(integer2);
      assertNotEquals(integer2, (Object) integer1);
      assertNotEquals(integer2, (Object) integer0);
      assertNotEquals(integer2, (Object) int0);
      assertNotEquals(integer2, (Object) int1);
      assertEquals(integer2, (Object) int2);
      assertEquals(0, (int)integer2);
      
      Integer integer3 = new Integer(2);
      assertNotNull(integer3);
      assertNotEquals(integer3, (Object) int0);
      assertNotEquals(integer3, (Object) int2);
      assertNotEquals(integer3, (Object) integer2);
      assertNotEquals(integer3, (Object) int1);
      assertNotEquals(integer3, (Object) integer0);
      assertNotEquals(integer3, (Object) integer1);
      assertEquals(2, (int)integer3);
      
      Type type5 = Type.PLUS;
      Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer2).when(face2).getNbOR();
      doReturn(integer1).when(face2).getNbSOL();
      doReturn((Integer) null).when(face2).getNbVICT();
      doReturn(type4, type1, type2, type5).when(face2).getType();
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test04() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire(9, 9, 9, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type0 = Type.NORMAL;
      Type type1 = Type.PLUS;
      Ressource ressource0 = Ressource.SOLAIRE;
      Ressource ressource1 = Ressource.LUNAIRE;
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource1, ressource0, ressource0).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      inventaire0.adderFace(face0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(ressource0, ressource1);
      assertNotSame(ressource1, ressource0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(type0, (Object) type1);
      assertNotEquals(ressource0, (Object) ressource1);
      assertNotEquals(ressource1, (Object) ressource0);
      
      inventaire1.setNbLunaire(264);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(264, inventaire1.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type2 = Type.CHOIX;
      Integer integer0 = new Integer(264);
      assertNotNull(integer0);
      assertEquals(264, (int)integer0);
      
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(face1).getNbOR();
      doReturn(integer0).when(face1).getNbSOL();
      doReturn((Integer) null).when(face1).getNbVICT();
      doReturn(type1, type0, type2, type1).when(face1).getType();
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test05() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(9, 9, 9, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type0 = Type.CHOIX;
      Type type1 = Type.CHOIX;
      Integer integer0 = new Integer(1183);
      assertNotNull(integer0);
      assertEquals(1183, (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(face0).getNbOR();
      doReturn(integer0).when(face0).getNbSOL();
      doReturn(type0, type1, type1).when(face0).getType();
      // Undeclared exception!
      try { 
        inventaire0.adderFace(face0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test06() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      inventaire0.setNbSolaire(11);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(11, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(11, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire(0, 0, 7, (-3594), list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(11, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(7, inventaire1.getNbLunaire());
      assertEquals((-3594), inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbSolaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(11, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(7, inventaire1.getNbLunaire());
      assertEquals((-3594), inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(0, int0);
      
      Type type0 = Type.NORMAL;
      Ressource ressource0 = Ressource.OR;
      Ressource ressource1 = Ressource.VICTOIRE;
      Ressource ressource2 = Ressource.OR;
      Ressource ressource3 = Ressource.VICTOIRE;
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      doReturn((Integer) null).when(face0).getValeur();
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test07() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(9, 9, 9, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(9, inventaire1.getNbLunaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type0 = Type.CHOIX;
      Type type1 = Type.CHOIX;
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      inventaire1.setNbLunaire(264);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Type type2 = Type.PLUS;
      int int0 = inventaire1.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(264, int0);
      
      List<Exploit> list1 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertTrue(list1.isEmpty());
      assertEquals(0, list1.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list0);
      assertSame(list2, list1);
      assertNotNull(list2);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list2.isEmpty());
      assertEquals(0, list2.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setInventaire(264, 0, 0, 264, list2);
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list0);
      assertSame(list2, list1);
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list2.isEmpty());
      assertEquals(0, list2.size());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int1 = inventaire1.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list2);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(264, inventaire0.getNbOR());
      assertEquals(264, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(264, inventaire1.getNbLunaire());
      assertEquals(9, inventaire1.getNbOR());
      assertEquals(9, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int1, int0);
      assertEquals(9, int1);
      
      Type type3 = Type.NORMAL;
      Ressource ressource0 = Ressource.SOLAIRE;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource0).when(face1).getRes();
      doReturn(type3).when(face1).getType();
      doReturn((Integer) null).when(face1).getValeur();
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test08() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      inventaire0.setNbLunaire(438);
      assertEquals(438, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      inventaire0.setNbLunaire(0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setInventaire(2472, 12, (-3564), 2472, list0);
      assertEquals(12, inventaire0.getNbSolaire());
      assertEquals(2472, inventaire0.getNbVictoire());
      assertEquals(2472, inventaire0.getNbOR());
      assertEquals((-3564), inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setNbLunaire((-3564));
      assertEquals(12, inventaire0.getNbSolaire());
      assertEquals(2472, inventaire0.getNbVictoire());
      assertEquals(2472, inventaire0.getNbOR());
      assertEquals((-3564), inventaire0.getNbLunaire());
      
      inventaire0.setNbLunaire(0);
      assertEquals(12, inventaire0.getNbSolaire());
      assertEquals(2472, inventaire0.getNbVictoire());
      assertEquals(2472, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      Type type0 = Type.PLUS;
      Integer integer0 = new Integer((-2495));
      assertNotNull(integer0);
      assertEquals((-2495), (int)integer0);
      
      Integer integer1 = new Integer((-2495));
      assertNotNull(integer1);
      assertEquals(integer1, (Object) integer0);
      assertEquals((-2495), (int)integer1);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(face0).getNbLUN();
      doReturn(integer1).when(face0).getNbOR();
      doReturn(integer1).when(face0).getNbSOL();
      doReturn(integer0).when(face0).getNbVICT();
      doReturn(type0, type0).when(face0).getType();
      inventaire0.adderFace(face0);
      assertEquals((-2483), inventaire0.getNbSolaire());
      assertEquals((-2495), inventaire0.getNbLunaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      assertEquals(integer0, (Object) integer1);
      assertEquals(integer1, (Object) integer0);
      
      int int0 = inventaire0.getNbVictoire();
      assertEquals((-2483), inventaire0.getNbSolaire());
      assertEquals((-2495), inventaire0.getNbLunaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      assertEquals((-23), int0);
      
      int int1 = inventaire0.getNbSolaire();
      assertEquals((-2483), inventaire0.getNbSolaire());
      assertEquals((-2495), inventaire0.getNbLunaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      assertNotEquals(int1, int0);
      assertEquals((-2483), int1);
      
      inventaire0.setNbLunaire(2472);
      assertEquals(2472, inventaire0.getNbLunaire());
      assertEquals((-2483), inventaire0.getNbSolaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      
      inventaire0.setNbSolaire(2472);
      assertEquals(2472, inventaire0.getNbLunaire());
      assertEquals(2472, inventaire0.getNbSolaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      
      int int2 = inventaire0.getNbLunaire();
      assertEquals(2472, inventaire0.getNbLunaire());
      assertEquals(2472, inventaire0.getNbSolaire());
      assertEquals((-23), inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      assertEquals(2472, int2);
      
      inventaire0.setNbOR(2397);
      assertEquals(2472, inventaire0.getNbLunaire());
      assertEquals(2472, inventaire0.getNbSolaire());
      assertEquals(2397, inventaire0.getNbOR());
      assertEquals((-23), inventaire0.getNbVictoire());
  }

  @Test(timeout = 4000)
  public void test09() {
      Inventaire inventaire0 = new Inventaire(0, 0, 0, 0, (List<Exploit>) null);
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbOR(0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setInventaire(0, 0, 0, 0, (List<Exploit>) null);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbVictoire(0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbOR(0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbSolaire(521);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbLunaire(521);
      assertEquals(521, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      int int0 = inventaire0.getNbLunaire();
      assertEquals(521, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(521, int0);
      
      inventaire0.setNbVictoire((-1895));
      assertEquals((-1895), inventaire0.getNbVictoire());
      assertEquals(521, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbSolaire(521);
      assertEquals((-1895), inventaire0.getNbVictoire());
      assertEquals(521, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbOR(521);
      assertEquals((-1895), inventaire0.getNbVictoire());
      assertEquals(521, inventaire0.getNbLunaire());
      assertEquals(521, inventaire0.getNbOR());
      assertEquals(521, inventaire0.getNbSolaire());
      
      Type type0 = Type.PLUS;
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(face0).getNbSOL();
      doReturn(type0, type0).when(face0).getType();
      // Undeclared exception!
      try { 
        inventaire0.adderFace(face0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test10() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      inventaire0.setNbVictoire(0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      Type type0 = Type.NORMAL;
      Type type1 = Type.PLUS;
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Ressource) null, (Ressource) null, (Ressource) null, (Ressource) null).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      inventaire0.adderFace(face0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertNotEquals(type0, (Object) type1);
      assertNotEquals(type1, (Object) type0);
      
      Type type2 = Type.CHOIX;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(face1).getNbSOL();
      doReturn(type2, type2, type2).when(face1).getType();
      // Undeclared exception!
      try { 
        inventaire0.adderFace(face1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test11() {
      Inventaire inventaire0 = new Inventaire(0, 663, 0, 1, (List<Exploit>) null);
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(663, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      
      inventaire0.setNbVictoire(0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(663, inventaire0.getNbSolaire());
      
      Exploit exploit0 = mock(Exploit.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        inventaire0.addCartes(exploit0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test12() {
      Inventaire inventaire0 = new Inventaire(5, 5, 5, 0, (List<Exploit>) null);
      assertNotNull(inventaire0);
      assertEquals(5, inventaire0.getNbOR());
      assertEquals(5, inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setInventaire(51, 5, 5, 0, (List<Exploit>) null);
      assertEquals(51, inventaire0.getNbOR());
      assertEquals(5, inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face0).getType();
      inventaire0.adderFace(face0);
      assertEquals(51, inventaire0.getNbOR());
      assertEquals(5, inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face1).getType();
      inventaire0.adderFace(face1);
      assertEquals(51, inventaire0.getNbOR());
      assertEquals(5, inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNull(list0);
      assertEquals(51, inventaire0.getNbOR());
      assertEquals(5, inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbSolaire((-681));
      assertEquals(51, inventaire0.getNbOR());
      assertEquals((-681), inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      int int0 = inventaire0.getNbLunaire();
      assertEquals(51, inventaire0.getNbOR());
      assertEquals((-681), inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(5, int0);
      
      int int1 = inventaire0.getNbSolaire();
      assertEquals(51, inventaire0.getNbOR());
      assertEquals((-681), inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertNotEquals(int1, int0);
      assertEquals((-681), int1);
      
      int int2 = inventaire0.getNbVictoire();
      assertEquals(51, inventaire0.getNbOR());
      assertEquals((-681), inventaire0.getNbSolaire());
      assertEquals(5, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertNotEquals(int2, int0);
      assertNotEquals(int2, int1);
      assertEquals(0, int2);
  }

  @Test(timeout = 4000)
  public void test13() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(0, (-4337), 0, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-4337), inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbSolaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-4337), inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals((-4337), int0);
  }

  @Test(timeout = 4000)
  public void test14() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      inventaire0.setNbOR((-567));
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      inventaire0.setNbVictoire((-415));
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      Inventaire inventaire1 = new Inventaire(8, 8, 8, 8, list0);
      assertNotNull(inventaire1);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(8, inventaire1.getNbVictoire());
      assertEquals(8, inventaire1.getNbSolaire());
      assertEquals(8, inventaire1.getNbLunaire());
      assertEquals(8, inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setInventaire(8, 8, 8, 8, list0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(8, inventaire1.getNbVictoire());
      assertEquals(8, inventaire1.getNbSolaire());
      assertEquals(8, inventaire1.getNbLunaire());
      assertEquals(8, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire0.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertEquals(0, int0);
      
      inventaire1.setNbVictoire((-567));
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(8, inventaire1.getNbSolaire());
      assertEquals(8, inventaire1.getNbLunaire());
      assertEquals(8, inventaire1.getNbOR());
      assertEquals((-567), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int1 = inventaire1.getNbSolaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(8, inventaire1.getNbSolaire());
      assertEquals(8, inventaire1.getNbLunaire());
      assertEquals(8, inventaire1.getNbOR());
      assertEquals((-567), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int1, int0);
      assertEquals(8, int1);
      
      int int2 = inventaire1.getNbVictoire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-415), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-567), inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(8, inventaire1.getNbSolaire());
      assertEquals(8, inventaire1.getNbLunaire());
      assertEquals(8, inventaire1.getNbOR());
      assertEquals((-567), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      assertEquals((-567), int2);
  }

  @Test(timeout = 4000)
  public void test15() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbVictoire(2);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(2, inventaire0.getNbVictoire());
      
      inventaire0.setNbVictoire(425);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(425, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(425, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      int int0 = inventaire0.getNbOR();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(425, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, int0);
      
      int int1 = inventaire0.getNbVictoire();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(425, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(int1, int0);
      assertEquals(425, int1);
      
      int int2 = inventaire0.getNbSolaire();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(425, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(int2, int0);
      assertNotEquals(int2, int1);
      assertEquals(0, int2);
  }

  @Test(timeout = 4000)
  public void test16() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(2, 2, 0, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(2, inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(2, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      inventaire0.setInventaire(0, 0, 0, 0, list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      inventaire0.setNbSolaire(0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      inventaire0.setNbOR(0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      int int0 = inventaire0.getNbSolaire();
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, int0);
      
      int int1 = inventaire0.getNbVictoire();
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(int1, int0);
      assertEquals(0, int1);
      
      List<Exploit> list1 = inventaire0.getCartes();
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list1.size());
      assertTrue(list1.isEmpty());
      
      // Undeclared exception!
      try { 
        inventaire0.adderFace((Face) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test18() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbSolaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setInventaire(1405, 1405, 1405, 0, list0);
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbLunaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      int int0 = inventaire0.getNbOR();
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbLunaire());
      assertEquals(1405, int0);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face0).getType();
      inventaire0.adderFace(face0);
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbLunaire());
      
      Exploit exploit0 = mock(Exploit.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(exploit0).toString();
      inventaire0.addCartes(exploit0);
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbLunaire());
      
      inventaire0.setNbOR(1405);
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbLunaire());
      
      inventaire0.setNbVictoire((-838));
      assertEquals((-838), inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(1405, inventaire0.getNbLunaire());
      
      inventaire0.setNbLunaire(569);
      assertEquals((-838), inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(569, inventaire0.getNbLunaire());
      
      inventaire0.setNbLunaire(0);
      assertEquals((-838), inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      List<Exploit> list1 = inventaire0.getCartes();
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals((-838), inventaire0.getNbVictoire());
      assertEquals(1405, inventaire0.getNbSolaire());
      assertEquals(1405, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertFalse(list1.isEmpty());
      assertEquals(1, list1.size());
      assertTrue(list1.contains(exploit0));
  }

  @Test(timeout = 4000)
  public void test19() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      inventaire0.setNbSolaire(1158);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1158, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      inventaire0.setNbVictoire(0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1158, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(1158, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      inventaire0.setInventaire(0, (-1249), 193, (-1), list0);
      assertEquals((-1), inventaire0.getNbVictoire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(193, inventaire0.getNbLunaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      inventaire0.setNbLunaire((-1249));
      assertEquals((-1), inventaire0.getNbVictoire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1249), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbVictoire((-1244));
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals((-1249), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbVictoire((-1244));
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals((-1249), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbLunaire((-205));
      assertEquals((-205), inventaire0.getNbLunaire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbLunaire((-1244));
      assertEquals((-1244), inventaire0.getNbLunaire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list1 = inventaire0.getCartes();
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals((-1244), inventaire0.getNbLunaire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list1.isEmpty());
      assertEquals(0, list1.size());
      
      int int0 = inventaire0.getNbLunaire();
      assertEquals((-1244), inventaire0.getNbLunaire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-1244), int0);
      
      inventaire0.setNbVictoire((-1244));
      assertEquals((-1244), inventaire0.getNbLunaire());
      assertEquals((-1249), inventaire0.getNbSolaire());
      assertEquals((-1244), inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      Face face0 = null;
      // Undeclared exception!
      try { 
        inventaire0.adderFace((Face) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test20() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      int int0 = inventaire0.getNbOR();
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire((-1), 1263, 0, 1263, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(1263, inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbVictoire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire0.setNbVictoire(1263);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire1.setNbVictoire(936);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(936, inventaire1.getNbVictoire());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(1263, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setNbSolaire((-155));
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(936, inventaire1.getNbVictoire());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals((-155), inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setInventaire(5, 936, (-933), (-2079), list0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals(936, inventaire1.getNbSolaire());
      assertEquals((-2079), inventaire1.getNbVictoire());
      assertEquals(5, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setNbOR(1263);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals(936, inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbOR());
      assertEquals((-2079), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbVictoire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals(936, inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbOR());
      assertEquals((-2079), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals((-2079), int0);
      
      inventaire0.setNbOR(0);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int1 = inventaire0.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(int1, int0);
      assertEquals(0, int1);
      
      inventaire0.setNbOR((-1));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int2 = inventaire1.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals(936, inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbOR());
      assertEquals((-2079), inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertNotEquals(int2, int1);
      assertNotEquals(int2, int0);
      assertEquals(1263, int2);
      
      inventaire1.setNbVictoire(1263);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals(936, inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbOR());
      assertEquals(1263, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setNbSolaire((-1));
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals((-933), inventaire1.getNbLunaire());
      assertEquals((-1), inventaire1.getNbSolaire());
      assertEquals(1263, inventaire1.getNbOR());
      assertEquals(1263, inventaire1.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire0.setNbLunaire((-2551));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals((-2551), inventaire0.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setNbSolaire((-2079));
      assertNotSame(inventaire0, inventaire1);
      assertEquals((-2079), inventaire0.getNbSolaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals((-2551), inventaire0.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      int int3 = inventaire0.getNbOR();
      assertNotSame(inventaire0, inventaire1);
      assertEquals((-2079), inventaire0.getNbSolaire());
      assertEquals((-1), inventaire0.getNbOR());
      assertEquals(1263, inventaire0.getNbVictoire());
      assertEquals((-2551), inventaire0.getNbLunaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(int3, int1);
      assertNotEquals(int3, int0);
      assertNotEquals(int3, int2);
      assertEquals((-1), int3);
  }

  @Test(timeout = 4000)
  public void test22() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      Inventaire inventaire1 = new Inventaire(0, 0, 211, (-2654), list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals(0, inventaire1.getNbSolaire());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals(211, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire0.setNbSolaire(211);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(211, inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setNbSolaire((-429));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Exploit exploit0 = mock(Exploit.class, new ViolatedAssumptionAnswer());
      inventaire0.setNbLunaire((-2654));
      assertNotSame(inventaire0, inventaire1);
      assertEquals((-2654), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire1.setNbSolaire((-1671));
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-2654), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertFalse(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.addCartes(exploit0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-2654), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertEquals(0, inventaire1.getNbOR());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setNbOR((-3943));
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals((-2654), inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals((-3943), inventaire1.getNbOR());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire0.setNbLunaire(1702);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(1702, inventaire0.getNbLunaire());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Exploit exploit1 = mock(Exploit.class, new ViolatedAssumptionAnswer());
      inventaire0.addCartes(exploit1);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(1702, inventaire0.getNbLunaire());
      assertEquals((-429), inventaire0.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      inventaire0.setInventaire(3025, (-1104), (-1914), 5, list0);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(3025, inventaire0.getNbOR());
      assertEquals((-1104), inventaire0.getNbSolaire());
      assertEquals((-1914), inventaire0.getNbLunaire());
      assertEquals(5, inventaire0.getNbVictoire());
      assertEquals(2, list0.size());
      assertFalse(list0.isEmpty());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face0).getType();
      inventaire1.adderFace(face0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(3025, inventaire0.getNbOR());
      assertEquals((-1104), inventaire0.getNbSolaire());
      assertEquals((-1914), inventaire0.getNbLunaire());
      assertEquals(5, inventaire0.getNbVictoire());
      assertEquals(2, list0.size());
      assertFalse(list0.isEmpty());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals((-3943), inventaire1.getNbOR());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face1).getType();
      inventaire1.adderFace(face1);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(3025, inventaire0.getNbOR());
      assertEquals((-1104), inventaire0.getNbSolaire());
      assertEquals((-1914), inventaire0.getNbLunaire());
      assertEquals(5, inventaire0.getNbVictoire());
      assertEquals(2, list0.size());
      assertFalse(list0.isEmpty());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals((-3943), inventaire1.getNbOR());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbLunaire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(3025, inventaire0.getNbOR());
      assertEquals((-1104), inventaire0.getNbSolaire());
      assertEquals((-1914), inventaire0.getNbLunaire());
      assertEquals(5, inventaire0.getNbVictoire());
      assertEquals(2, list0.size());
      assertFalse(list0.isEmpty());
      assertEquals((-2654), inventaire1.getNbVictoire());
      assertEquals((-3943), inventaire1.getNbOR());
      assertEquals(211, inventaire1.getNbLunaire());
      assertEquals((-1671), inventaire1.getNbSolaire());
      assertTrue(list0.contains(exploit0));
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals(211, int0);
      
      inventaire0.setNbSolaire((-1104));
      assertNotSame(inventaire0, inventaire1);
      assertEquals(3025, inventaire0.getNbOR());
      assertEquals((-1104), inventaire0.getNbSolaire());
      assertEquals((-1914), inventaire0.getNbLunaire());
      assertEquals(5, inventaire0.getNbVictoire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      // Undeclared exception!
      try { 
        inventaire0.adderFace((Face) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test23() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setInventaire(0, 1221, 0, (-453), list0);
      assertEquals(1221, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals((-453), inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setNbVictoire(0);
      assertEquals(1221, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      
      int int0 = inventaire0.getNbOR();
      assertEquals(1221, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      int int0 = inventaire0.getNbVictoire();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, int0);
      
      int int1 = inventaire0.getNbOR();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(int1, int0);
      assertEquals(0, int1);
      
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null, (Type) null, (Type) null).when(face0).getType();
      inventaire0.adderFace(face0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
  }

  @Test(timeout = 4000)
  public void test25() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire((-4894), 10, (-4894), (-4894), list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals((-4894), inventaire1.getNbVictoire());
      assertEquals((-4894), inventaire1.getNbOR());
      assertEquals((-4894), inventaire1.getNbLunaire());
      assertEquals(10, inventaire1.getNbSolaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.addCartes((Exploit) null);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals((-4894), inventaire1.getNbVictoire());
      assertEquals((-4894), inventaire1.getNbOR());
      assertEquals((-4894), inventaire1.getNbLunaire());
      assertEquals(10, inventaire1.getNbSolaire());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
  }

  @Test(timeout = 4000)
  public void test26() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      inventaire0.setNbLunaire(751);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(751, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      
      int int0 = inventaire0.getNbLunaire();
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(751, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(751, int0);
  }

  @Test(timeout = 4000)
  public void test27() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      
      inventaire0.setNbOR(3204);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(3204, inventaire0.getNbOR());
      
      inventaire0.setNbVictoire(1814);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(3204, inventaire0.getNbOR());
      assertEquals(1814, inventaire0.getNbVictoire());
  }

  @Test(timeout = 4000)
  public void test28() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      inventaire0.setInventaire((-163), (-163), 1697, (-163), list0);
      assertEquals(1697, inventaire0.getNbLunaire());
      assertEquals((-163), inventaire0.getNbOR());
      assertEquals((-163), inventaire0.getNbSolaire());
      assertEquals((-163), inventaire0.getNbVictoire());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      List<Exploit> list1 = inventaire0.getCartes();
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(1697, inventaire0.getNbLunaire());
      assertEquals((-163), inventaire0.getNbOR());
      assertEquals((-163), inventaire0.getNbSolaire());
      assertEquals((-163), inventaire0.getNbVictoire());
      assertTrue(list1.isEmpty());
      assertEquals(0, list1.size());
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertSame(list2, list1);
      assertSame(list2, list0);
      assertNotNull(list2);
      assertEquals(1697, inventaire0.getNbLunaire());
      assertEquals((-163), inventaire0.getNbOR());
      assertEquals((-163), inventaire0.getNbSolaire());
      assertEquals((-163), inventaire0.getNbVictoire());
      assertEquals(0, list2.size());
      assertTrue(list2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      inventaire0.setNbVictoire(2199);
      assertEquals(2199, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      int int0 = inventaire0.getNbOR();
      assertEquals(2199, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire(7, 7, 7, 26, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(26, inventaire1.getNbVictoire());
      assertEquals(7, inventaire1.getNbSolaire());
      assertEquals(7, inventaire1.getNbLunaire());
      assertEquals(7, inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      inventaire1.setNbSolaire(0);
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals(0, inventaire1.getNbSolaire());
      assertEquals(26, inventaire1.getNbVictoire());
      assertEquals(7, inventaire1.getNbLunaire());
      assertEquals(7, inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
  }

  @Test(timeout = 4000)
  public void test31() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire((-1079), (-1079), (-1079), (-1079), list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals((-1079), inventaire1.getNbSolaire());
      assertEquals((-1079), inventaire1.getNbLunaire());
      assertEquals((-1079), inventaire1.getNbVictoire());
      assertEquals((-1079), inventaire1.getNbOR());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      int int0 = inventaire1.getNbVictoire();
      assertNotSame(inventaire0, inventaire1);
      assertNotSame(inventaire1, inventaire0);
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals((-1079), inventaire1.getNbSolaire());
      assertEquals((-1079), inventaire1.getNbLunaire());
      assertEquals((-1079), inventaire1.getNbVictoire());
      assertEquals((-1079), inventaire1.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      assertEquals((-1079), int0);
  }

  @Test(timeout = 4000)
  public void test32() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      
      int int0 = inventaire0.getNbSolaire();
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33() {
      Inventaire inventaire0 = new Inventaire();
      assertNotNull(inventaire0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      
      List<Exploit> list0 = inventaire0.getCartes();
      assertNotNull(list0);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      
      Inventaire inventaire1 = new Inventaire((-1), 2, 1, 0, list0);
      assertNotNull(inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(1, inventaire1.getNbLunaire());
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list1 = inventaire1.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list0, list1);
      assertNotSame(inventaire1, inventaire0);
      assertSame(list1, list0);
      assertNotNull(list1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertEquals((-1), inventaire1.getNbOR());
      assertEquals(2, inventaire1.getNbSolaire());
      assertEquals(0, inventaire1.getNbVictoire());
      assertEquals(1, inventaire1.getNbLunaire());
      assertEquals(0, list1.size());
      assertTrue(list1.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      assertNotEquals(inventaire1, (Object) inventaire0);
      
      List<Exploit> list2 = inventaire0.getCartes();
      assertNotSame(inventaire0, inventaire1);
      assertSame(list2, list1);
      assertSame(list2, list0);
      assertNotNull(list2);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(0, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertEquals(0, list2.size());
      assertTrue(list2.isEmpty());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      Type type0 = Type.NORMAL;
      Ressource ressource0 = Ressource.SOLAIRE;
      Ressource ressource1 = Ressource.LUNAIRE;
      Ressource ressource2 = Ressource.LUNAIRE;
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource1, ressource1).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      doReturn((Integer) null).when(face0).getValeur();
      inventaire0.setNbVictoire(1);
      assertNotSame(inventaire0, inventaire1);
      assertEquals(0, inventaire0.getNbLunaire());
      assertEquals(0, inventaire0.getNbSolaire());
      assertEquals(1, inventaire0.getNbVictoire());
      assertEquals(0, inventaire0.getNbOR());
      assertNotEquals(inventaire0, (Object) inventaire1);
      
      // Undeclared exception!
      try { 
        inventaire1.adderFace(face0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }

  @Test(timeout = 4000)
  public void test34() {
      Inventaire inventaire0 = new Inventaire();
      Type type0 = Type.NORMAL;
      Type type1 = Type.CHOIX;
      Type type2 = Type.CHOIX;
      Ressource ressource0 = Ressource.OR;
      Ressource ressource1 = Ressource.LUNAIRE;
      Integer integer0 = new Integer(1183);
      Face face0 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource0, ressource0, ressource0, ressource1).when(face0).getRes();
      doReturn(type0).when(face0).getType();
      doReturn(integer0).when(face0).getValeur();
      inventaire0.setNbLunaire((-992));
      inventaire0.adderFace(face0);
      Type type3 = Type.CHOIX;
      Ressource ressource2 = Ressource.OR;
      Ressource ressource3 = Ressource.VICTOIRE;
      Face face1 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(ressource1, ressource2, ressource0, ressource3).when(face1).getRes();
      doReturn(type0).when(face1).getType();
      doReturn(integer0).when(face1).getValeur();
      inventaire0.adderFace(face1);
      inventaire0.getNbLunaire();
      List<Exploit> list0 = inventaire0.getCartes();
      inventaire0.setInventaire((-992), 0, 4062, 0, list0);
      inventaire0.setNbOR(0);
      Integer integer1 = new Integer(5202);
      Integer integer2 = new Integer(1183);
      Integer integer3 = new Integer((-1));
      Type type4 = Type.CHOIX;
      Face face2 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer2, integer3).when(face2).getNbOR();
      doReturn(integer1, integer2).when(face2).getNbSOL();
      doReturn(type1, type3, type3, type4).when(face2).getType();
      inventaire0.adderFace(face2);
      inventaire0.setNbSolaire((-992));
      Type type5 = Type.CHOIX;
      inventaire0.getCartes();
      Type type6 = Type.PLUS;
      Integer integer4 = new Integer((-1));
      Integer integer5 = new Integer((-1417));
      Face face3 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer1).when(face3).getNbLUN();
      doReturn(integer1).when(face3).getNbOR();
      doReturn(integer4).when(face3).getNbSOL();
      doReturn(integer5).when(face3).getNbVICT();
      doReturn(type5, type6).when(face3).getType();
      inventaire0.adderFace(face3);
      Type type7 = Type.CHOIX;
      Type type8 = Type.CHOIX;
      Integer integer6 = new Integer(745);
      Integer integer7 = new Integer(1330);
      Integer integer8 = new Integer(1);
      Type type9 = Type.NORMAL;
      Integer integer9 = new Integer(1);
      Face face4 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer7).when(face4).getNbOR();
      doReturn(integer6).when(face4).getNbSOL();
      doReturn(integer9).when(face4).getNbVICT();
      doReturn(type2, type7, type8, type9).when(face4).getType();
      inventaire0.adderFace(face4);
      inventaire0.getNbLunaire();
      Type type10 = Type.CHOIX;
      Type type11 = Type.CHOIX;
      Integer integer10 = new Integer(0);
      Type type12 = Type.CHOIX;
      Face face5 = mock(Face.class, new ViolatedAssumptionAnswer());
      doReturn(integer6).when(face5).getNbOR();
      doReturn(integer9, integer10).when(face5).getNbSOL();
      doReturn((Integer) null).when(face5).getNbVICT();
      doReturn(type1, type10, type11, type12).when(face5).getType();
      inventaire0.setNbLunaire(4062);
      // Undeclared exception!
      try { 
        inventaire0.adderFace(face5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bot.Inventaire", e);
      }
  }
}
