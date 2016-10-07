import org.junit.Assert;
import org.junit.Test;

public class reverseVowelsTest {
	
	@Test
	public void test(){
		reverseVowels test = new reverseVowels();
		String expectedOutput = "holle";
		String actuals = test.reverseVowels("hello");
		Assert.assertTrue(expectedOutput.equals(actuals));
				
	}

}
