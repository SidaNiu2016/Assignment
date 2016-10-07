import org.junit.Assert;
import org.junit.Test;

public class lengthOfLastWordTest {
	
	@Test
	public void test(){
		lengthOfLastWord test = new lengthOfLastWord();
		Assert.assertTrue(test.lengthOfLastWord("hello NEU   ") == 3);
		Assert.assertTrue(test.lengthOfLastWord("      NEU   ") == 3);
		Assert.assertTrue(test.lengthOfLastWord("            ") == 0);
	}

}
