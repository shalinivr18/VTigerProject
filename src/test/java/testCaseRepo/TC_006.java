package testCaseRepo;

import org.testng.annotations.Test;

import PomOrObjectRepository.ContactsPage;
import PomOrObjectRepository.CreatingNewContactPage;
import PomOrObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass{

@Test(groups={"Smoke","Regression"})
public void CON_003() throws Exception

{

HomePage hp = new HomePage(driver);
hp.clickOnContactMenu();

ContactsPage cp = new ContactsPage(driver);
cp.clickOnCreatingNewContatctsIcon();

String lName= eUtil.getDataFromExcelFile("contacts", 8, 1);
String email=eUtil.getDataFromExcelFile("contacts", 8, 2);
String mobile =eUtil.getDataFromExcelFile("contacts", 8, 3);
String mailingCity = eUtil.getDataFromExcelFile("contacts", 8, 4);
String mailingState = eUtil.getDataFromExcelFile("contacts", 8, 5);
String mailingCountry=eUtil.getDataFromExcelFile("contacts", 8, 6);

CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
cncp.CreateNewContact(lName, email, mobile, mailingCity, mailingState, mailingCountry);
}
}
