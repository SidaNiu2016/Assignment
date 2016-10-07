import org.junit.Assert;
import org.junit.Test;

public class reverseString2Test {
	
	@Test
	public void test(){
		reverseString2 test = new reverseString2();
		String expectedOutput = "NEU  Husky     Hi";
		String actuals = test.reverseString2("Hi     Husky  NEU");
		Assert.assertEquals(expectedOutput, actuals);
	}

}
