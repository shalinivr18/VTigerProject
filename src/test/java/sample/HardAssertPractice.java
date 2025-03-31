package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {
	@Test
	public void strictLevelComparision()
	{
		String expectedName="Raja";
		String actualName="Raja";
		
		Assert.assertEquals(actualName, expectedName);
		System.out.println("Hard assertion strict level completed");
	}
	
	@Test
	public void containsLevelComparision()
	{
		String a1="Don";
		String a2="london";
		
		Assert.assertTrue(a2.contains(a1));
		System.out.println("Hard Assertion contains level completed");
	}
}
