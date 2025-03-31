package testCaseRepo;

import org.testng.annotations.Test;

import PomOrObjectRepository.CreatingNewLeadPage;
import PomOrObjectRepository.HomePage;
import PomOrObjectRepository.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass {

	@Test
	public void LE_003() throws Exception
	{
		HomePage hp= new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep= new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String lName=eUtil.getDataFromExcelFile("leads",8,1);
		String company=eUtil.getDataFromExcelFile("leads",8,2);
		String leadSource=eUtil.getDataFromExcelFile("leads",8,3);
		String noOFemployee=eUtil.getDataFromExcelFile("leads",8,4);
		String city=eUtil.getDataFromExcelFile("leads",8,5);
		String country=eUtil.getDataFromExcelFile("leads",8,6);
		String state=eUtil.getDataFromExcelFile("leads",8,7);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, lName, company, city, country, state);
	}
}
