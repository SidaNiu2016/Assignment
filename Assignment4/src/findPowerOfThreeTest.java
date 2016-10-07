import org.junit.Assert;
import org.junit.Test;

public class findPowerOfThreeTest {
	
	@Test
	public void test(){
		findPowerOfThree test = new findPowerOfThree();
		int[] expectedOuput = {1, 3, 9, 27};
		int[] actuals = test.findPowerOfThree(4);
		
		Assert.assertArrayEquals(expectedOuput, actuals);
	}

}
