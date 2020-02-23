import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void passingTest() {
        System.out.println("This test will always pass!");
    }

    @Test
    public void secondTest() {
        System.out.println("never failing test");
    }
    @Test
    public void failingTest() {
        Assert.fail ("Failing test");
    }
}
