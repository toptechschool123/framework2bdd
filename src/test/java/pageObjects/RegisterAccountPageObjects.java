package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.BaseClass;

public class RegisterAccountPageObjects extends BaseClass {



	public RegisterAccountPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"Top_bar\"]/div/div/div[2]/div/a[4]")
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	private WebElement clickRegister;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-firstname\"]")
	private WebElement firstName;
	
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\"input-lastname\"]")
	//private WebElement lastName;
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	@FindBy(how = How.XPATH, using = "//input[@name='wpwc_custom_registration_field_127']")
	private WebElement enterAddress;

	//@FindBy(how = How.XPATH, using = "//*[@id=\"input-email\"]")
	//private WebElement enterEmail;
	@FindBy(id = "input-email")
	private WebElement enterEmail;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\'input-telephone\']")
	private WebElement enterTelephone;
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\'account\']/div[5]/div/select")
//	private WebElement country;
	@FindBy(name = "country")
	private WebElement country;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='reg_password']")
	private WebElement enterPassword;

	@FindBy(how = How.XPATH, using = "//input[@id='reg_password']")
	private WebElement enterConfPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@name='newsletter' and@value='1']")
	private WebElement subscribe;

	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement clickPrivacyCheckBox;
	
	@FindBy(id = "signupbtn")
	private WebElement continueBttn;
	
	
	public void clickOnMyAccount() {

		myAccount.click();
}
	
	public void clickRegister() {
		clickRegister.click();
	}
	
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	public void enteLastName( String lastname) {
		lastName.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}
	public void enterTelephone(String phone	) {
		enterTelephone.sendKeys(phone);
	}
	
	public void selectCountry() {
		country.click();
		Select s = new Select(country);
		s.selectByValue("Afghanistan");
	}
	public void enterPassword(String pass) {
		enterPassword.sendKeys(pass);
	}
	public void enterConfPassword(String Confpass) {
		enterPassword.sendKeys(Confpass);
	}
	
	public void clickSubscribe() {
		subscribe.click();
}
	public void clickPrivacyPolicy() {
		clickPrivacyCheckBox.click();
	}
	
	public void clickContinueBttn() {
		continueBttn.click();
	}
}