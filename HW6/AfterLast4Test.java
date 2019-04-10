import org.junit.Assert;
import org.junit.Test;


public class AfterLast4Test {


    AfterLast4 m1 = new AfterLast4(new int[]{1, 2, 3, 4, 5, 6, 7});
    AfterLast4 m2 = new AfterLast4(new int[]{1, 2, 3, 5, 6, 7});
    AfterLast4 m3 = new AfterLast4(new int[]{1, 2, 3, 4, 5, 6, 4});


    @Test(expected = RuntimeException.class)
    public void testM1() {
        Assert.assertEquals(m1.lastFour(), -1);
    }

    @Test(expected = RuntimeException.class)
    public void testM2() {
        Assert.assertEquals(m2.lastFour(), -1);
    }
//
    @Test(expected = RuntimeException.class)
    public void testM3() {
        Assert.assertEquals(m3.lastFour(), -1);
    }
}