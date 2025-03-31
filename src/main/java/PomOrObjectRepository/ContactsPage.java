package PomOrObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getCreateNewContactsIcon() {
		return createNewContactsIcon;
	}
	/**
	 * this is a business library to create a new contact
	 */
	public void clickOnCreatingNewContatctsIcon()
	{
		getCreateNewContactsIcon().click();
	}
}
