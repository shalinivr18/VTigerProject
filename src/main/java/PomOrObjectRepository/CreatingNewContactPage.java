package PomOrObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage{

	@FindBy(name="lastname")
	private WebElement lastNameTextFeild;
	
	@FindBy(name="title")
	private WebElement titleTextFeild;
	
	@FindBy(name="account_name")
	private WebElement organizationNameTextFeild;
	
	@FindBy(name="email")
	private WebElement emailTextFeild;
	
	@FindBy(name="mobile")
	private WebElement mobileTextFeild;
	
	@FindBy(name="mailingcity")
	private WebElement mailingCityTextFeild;
	
	@FindBy(name="mailingcity")
	private WebElement mailingstateTextFeild;
	
	@FindBy(name="mailingcity")
	private WebElement mailingcountryTextFeild;
	 
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getTitleTextFeild() {
		return titleTextFeild;
	}

	public WebElement getOrganizationNameTextFeild() {
		return organizationNameTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getMobileTextFeild() {
		return mobileTextFeild;
	}

	public WebElement getMailingCityTextFeild() {
		return mailingCityTextFeild;
	}

	public WebElement getMailingstateTextFeild() {
		return mailingstateTextFeild;
	}

	public WebElement getMailingcountryTextFeild() {
		return mailingcountryTextFeild;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	 
	public void CreateNewContact(String lastName,String title,String organizationName)
	{
		getLastNameTextFeild().sendKeys(lastName);
		getLastNameTextFeild().sendKeys(title);
		getOrganizationNameTextFeild().sendKeys(organizationName);
		getSaveButton().click();
	}
	
	public void CreateNewContact(String lastName,String email,String mobile,String mailingCity)
	{
		getLastNameTextFeild().sendKeys(lastName);
		getEmailTextFeild().sendKeys(email);
		getMobileTextFeild().sendKeys(mobile);
		getMailingCityTextFeild().sendKeys(mailingCity);
		getSaveButton().click();
	}
	
	public void CreateNewContact(String lastName,String email,String mobile,String mailingCity,String mailingState,String mailingCountry)
	{
		getLastNameTextFeild().sendKeys(lastName);
		getEmailTextFeild().sendKeys(email);
		getMobileTextFeild().sendKeys(mobile);
		getMailingCityTextFeild().sendKeys(mailingCity);
		getMailingstateTextFeild().sendKeys(mailingState);
		getMailingcountryTextFeild().sendKeys(mailingCountry);
		getSaveButton().click();
	}
	
}
