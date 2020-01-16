import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {

    @BeforeMethod
    public void hello(){
        System.out.println("Hello");
        Assert.assertTrue(true,"Bad");
    }

    @Test
    public void testHello(){
        System.out.println("Hello from Test");
    }

    @Test
    public  void testGoodBye(){
        System.out.println("Goodbye");
    }
}
