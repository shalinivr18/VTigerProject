package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class TestNGPractice {
	@Test(priority=3,invocationCount=5)
	public void createUser()
    {
	System.out.println("user created");
    }
	@Test(priority=2,dependsOnMethods= {"createUser"})
	public void modifyUser() {
	System.out.println("user modify");
    }
	@Test(priority=1)
	public void deleteUser() {
	System.out.println("user deleted");
    }
	@Ignore
	@Test(priority=1)
	public void ignoreUser1() {
		System.out.println("user ignored 1");
	}
	@Test(priority=1,invocationCount=0)
	public void ignoreUser2() {
		System.out.println("user ignored 2");
	}
	@Test(priority=1,enabled=false)
	public void ignoreUser3() {
		System.out.println("user ignored 3");
	}
	
}
