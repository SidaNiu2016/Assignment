import org.junit.Assert;
import org.junit.Test;

public class generatePascalsTriangleTest {
	
	@Test
	public void test(){
		generatePascalsTriangle test = new generatePascalsTriangle();
		int[][] expectedOutput = new int[][]{{1,0,0,0}, {1, 1,0,0}, {1, 2, 1,0}, {1, 3, 3, 1}};
		int[][] actuals = test.generatePascalsTriangle(4);
		Assert.assertArrayEquals(expectedOutput, actuals);
	}

}
