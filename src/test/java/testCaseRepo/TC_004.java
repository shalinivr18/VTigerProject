package testCaseRepo;

import org.testng.annotations.Test;

import PomOrObjectRepository.ContactsPage;
import PomOrObjectRepository.CreatingNewContactPage;
import PomOrObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass{
	@Test
	public void CON_001()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreatingNewContatctsIcon();
		
		String lName=eUtil.getDataFromExcelFile("contacts", 2, 1);
		String title=eUtil.getDataFromExcelFile("contacts", 2, 2);
		String organization=eUtil.getDataFromExcelFile("contacts", 2, 3);
		
		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.CreateNewContact(lName, title, organization);
	}

}
