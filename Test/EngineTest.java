import Model.Engine;
import org.junit.Test;
import org.junit.Assert;

public class EngineTest {

    @Test
    public void TestAdd(){
        Engine engine = new Engine();
        String Addtest = engine.binaryAdd("101", "001");
        Assert.assertEquals("110", Addtest);
    }

    @Test
    public void TestSubtract(){
        Engine engine = new Engine();
        String SubtractString = engine.binarySubtract("1010", "0010");
        Assert.assertEquals("1000", SubtractString);
    }

    @Test
    public void TestMultiplication(){
        Engine engine = new Engine();
        String MultiplyString = engine.binaryMultiply("1111", "0101");
        Assert.assertEquals("1001011", MultiplyString);
    }

    @Test
    public void TestDivide(){
        Engine engine = new Engine();
        String DivideString = engine.binaryDivide("1111", "0101");
        Assert.assertEquals("11", DivideString);
    }

    @Test
    public void TestSquare(){
        Engine engine = new Engine();
        String SquareString = engine.binarySquare("1111");
        Assert.assertEquals("11100001", SquareString);
    }

    @Test
    public void TestSquareRoot(){
        Engine engine = new Engine();
        String SquareRootString = engine.binaryRoot("1111");
        Assert.assertEquals("11", SquareRootString);
    }


}
