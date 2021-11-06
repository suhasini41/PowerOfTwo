package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfTwo 
{
	private boolean findNumberSquareOrNot(int n) {
		boolean flag = false;
		for(int i=1;i<=n/2;i++)
		{
			if(i*i==n)
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findNumberSquareOrNot(-2), false);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findNumberSquareOrNot(6), false);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findNumberSquareOrNot(4), true);
	}
	
	@Test
	public void testCase4()
	{
		Assert.assertEquals(findNumberSquareOrNot(25), true);
	}

}
