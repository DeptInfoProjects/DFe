package Bot;

import De.Ressource;
import junit.framework.Assert;
import org.junit.Test;

public class JouerTest {

    @Test
    public void lancerDe1() {
        Jouer tjouer = new Jouer() ;
        Assert.assertEquals(Ressource.OR,tjouer.lancerDe1().getRes());
        Assert.assertEquals("This is not Ressource",Ressource.OR,tjouer.lancerDe1().getRes());
        System.out.println("Unit test1 finished without error");
    }
}