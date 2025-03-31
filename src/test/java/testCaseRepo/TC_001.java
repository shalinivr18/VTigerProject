package testCaseRepo;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import PomOrObjectRepository.CreatingNewLeadPage;
import PomOrObjectRepository.HomePage;
import PomOrObjectRepository.LeadsPage;
import genericUtility.BaseClass;

public class TC_001 extends BaseClass{
	@Test(groups= {"Smoke", "Regression"})
	public void Leads_001() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep= new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String fname =eUtil.getDataFromExcelFile("leads", 2, 1);
		String lname =eUtil.getDataFromExcelFile("leads", 2, 2);
		String company =eUtil.getDataFromExcelFile("leads", 2, 3);
		//Assert.fail();
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLeads(fname, lname, company);
		
		
	}
}
