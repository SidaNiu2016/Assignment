import org.junit.Test;
import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class printNumbersTest {
	
	@Test
	public void test() {
		printNumbers test = new printNumbers();
		String ecpectedOutput = "1 3 5 ";
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
        // cache stream
        PrintStream cacheStream = new PrintStream(baoStream);
        System.setOut(cacheStream);
		test.printNumbers(3);
		String output = baoStream.toString();
		Assert.assertTrue( ecpectedOutput.equals(output) );
		
	}

}
