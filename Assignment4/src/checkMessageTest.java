import org.junit.Assert;
import org.junit.Test;

public class checkMessageTest {
	
	@Test
	public void test(){
		checkMessage test = new checkMessage();
		Assert.assertTrue(test.checkMessage("SOSOSS") == 2);
		Assert.assertTrue(test.checkMessage("SOSSOssOS") == 2);
	}

}
