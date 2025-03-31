package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {

	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplemenation.class)
	public void sample()
	{
		System.out.println("hello");
		Assert.fail();
	}
}
