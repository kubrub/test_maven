import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void test1(){
        int a = 5, b = 6;
        int result = 11;
        int actual = a + b;
        Assert.assertEquals(actual, result);
    }
    @Test
    public void test2(){
        int a = 11, b = 1;
        int result = 10;
        int actual = a - b;
        Assert.assertEquals(actual, result);
    }
    @Test
    public void test3(){
        int a = 11, b = 2;
        int result = 22;
        int actual = a * b;
        Assert.assertEquals(actual, result);
    }
}
