import org.junit.Assert;
import org.junit.Test;
/*kiểm thử bằng bản quyết định */
public class exTest2 {
    @Test
    public void test1(){
        Assert.assertEquals("input không hợp lệ", ex.tuongquan2dt(1,1,0,2,2,2));
    }
    @Test
    public void test2(){
        Assert.assertEquals("input không hợp lệ", ex.tuongquan2dt(1,2,3,4,7,-2));
    }
    @Test
    public void test3(){
        Assert.assertEquals("trùng nhau", ex.tuongquan2dt(0,0,3,0,0,3));
    }
    @Test
    public void test4(){
        Assert.assertEquals("không giao nhau", ex.tuongquan2dt(0,0,3,0,0,4));
    }
    @Test
    public void test5(){
        Assert.assertEquals("không giao nhau", ex.tuongquan2dt(1,2,2,7,8,2));
    }
    @Test
    public void test6(){
        Assert.assertEquals("tiếp xúc", ex.tuongquan2dt(0,0,3,0,7,4));
    }
    @Test
    public void test7(){
        Assert.assertEquals("tiếp xúc", ex.tuongquan2dt(0,0,2,0,5,7));
    }
    @Test
    public void test8(){
        Assert.assertEquals("giao nhau", ex.tuongquan2dt(1,2,3,3,4,5));
    }
}
