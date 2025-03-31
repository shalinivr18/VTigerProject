package testCaseRepo;

import org.testng.annotations.Test;

import PomOrObjectRepository.CreatingNewLeadPage;
import PomOrObjectRepository.HomePage;
import PomOrObjectRepository.LeadsPage;
import genericUtility.BaseClass;

public class TC_002 extends BaseClass {

	@Test
	public void LE_002()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String fName=eUtil.getDataFromExcelFile("leads",5,1);
		String lName=eUtil.getDataFromExcelFile("leads",5,2);
		String company=eUtil.getDataFromExcelFile("leads",5,3);
		String title=eUtil.getDataFromExcelFile("leads",5,4);
		String mobile=eUtil.getDataFromExcelFile("leads",5,5);
		String email=eUtil.getDataFromExcelFile("leads",5,6);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company, title, mobile, email);
		
}
}
