package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactPage extends LoginPage{
//	WebDriver driver;
//	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
//	WebElement contactsLink;
//	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
//	WebElement newContactLink;
//	@FindBy(xpath = "//select[@name='title']")
//	WebElement selectTitle;
//	
//	@FindBy(name = "first_name")
//	WebElement firstName;
//	
//	@FindBy(name = "surname" )
//	WebElement surName;
//	
//	@FindBy(name = "client_lookup")
//	WebElement company;
//	
//	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
//	WebElement saveBtn;
//	
//	public ContactPage() {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	
	public void ContactPage_Test() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",newContactLink);
	}
	public void createNewContact(String ftname,String ltName , String comp) {
		firstName.sendKeys(ftname);
		surName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
	}
	

}
