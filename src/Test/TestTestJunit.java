import junit.framework.Assert;
import org.junit.Test;

public class TestTestJunit {  // le test unitaire du fichier TestJunit

    @Test
    public void unit_test1() {
        TestJunit jtest = new TestJunit() ;
        Assert.assertEquals(10,jtest.test());
        Assert.assertEquals("This is not 10!!",10,jtest.test());
        System.out.println("Unit test1 finished without error");
    }
}