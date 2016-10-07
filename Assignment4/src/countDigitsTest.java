import org.junit.Assert;
import org.junit.Test;

public class countDigitsTest {
	
	@Test
	public void test(){
		countDigits test = new countDigits();
		Assert.assertTrue(test.countDigits(100)==1);
		Assert.assertTrue(test.countDigits(134)==2);
		Assert.assertTrue(test.countDigits(349)==1);
		Assert.assertTrue(test.countDigits(9234)==2);
	}

}
