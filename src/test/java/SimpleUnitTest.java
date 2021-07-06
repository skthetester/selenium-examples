import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleUnitTest {
    @Test
    public void test1(){
        System.out.println("Hello World!");
    }

    @Test
    public void test2(){
        Assert.assertEquals("Hello", "World");
    }
}
