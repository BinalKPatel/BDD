package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath ="//input[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	@FindBy(xpath = "//select[@name='title']")
	WebElement selectTitle;
	
	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "surname" )
	WebElement surName;
	
	@FindBy(name = "client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver(); 
		PageFactory.initElements(driver, this);
		}
	public void loginPage() {
		driver.get("https://classic.crmpro.com/index.html");
	}
	public String login_Title_page() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	public void enterEmailPassword(String lgn,String pswd) {
		username.sendKeys(lgn);
		password.sendKeys(pswd);
		
	}
	public void submit() {
		login.click();
	}
	public void popup() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame("intercom-borderless-frame");
		driver.findElement(By.xpath("//div[@class='intercom-19gqqlk e13xul2n4']//span")).click();
		driver.switchTo().defaultContent();
		
	}
	public void close() {
		driver.quit();
	}
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
