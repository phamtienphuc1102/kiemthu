import org.junit.Assert;
import org.junit.Test;
/*kiểm thử giá trị biên thường */
public class exTest1 {
    @Test
    public void tes1(){
        Assert.assertEquals("trùng nhau", ex.tuongquan2dt(0,0,50,0,0,50));
    }
    @Test
    public void test2(){
        Assert.assertEquals("không giao nhau", ex.tuongquan2dt(0,0,50,0,0,1));
    }
    @Test
    public void test3(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,0,-99,50));
    }
    @Test
    public void test4(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,0,-98,50));
    }
    @Test
    public void test5(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,0,98,50));
    }
    @Test
    public void test6(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,0,99,50));
    }
    @Test
    public void test7(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,-99,0,50));
    }
    @Test
    public void test8(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,-98,0,50));
    }
    @Test
    public void test9(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,98,0,50));
    }
    @Test
    public void test10(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,0,50,99,0,50));
    }
    @Test
    public void test11(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,-99,50,0,0,50));
    }
    @Test
    public void test12(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,-98,50,0,0,50));
    }
    @Test
    public void test13(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,98,50,0,0,50));
    }
    @Test
    public void test14(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(0,99,50,0,0,50));
    }
    @Test
    public void test15(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(-99,0,50,0,0,50));
    }
    @Test
    public void test16(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(-98,0,50,0,0,50));
    }
    @Test
    public void test17(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(98,0,50,0,0,50));
    }
    @Test
    public void test18(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(99,0,50,0,0,50));
    }
}
