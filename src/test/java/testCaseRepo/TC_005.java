package testCaseRepo;

import org.testng.annotations.Test;

import PomOrObjectRepository.ContactsPage;
import PomOrObjectRepository.CreatingNewContactPage;
import PomOrObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass{
	@Test(groups={"Smoke"})
	public void CON_002()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreatingNewContatctsIcon();
		
		String lName=eUtil.getDataFromExcelFile("contacts", 8, 1);
		String email=eUtil.getDataFromExcelFile("contacts", 8, 2);
		String mobile=eUtil.getDataFromExcelFile("contacts", 8, 3);
		String mailingcity=eUtil.getDataFromExcelFile("contacts", 8, 4);
		
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, email, mobile, mailingcity);
	}
}
