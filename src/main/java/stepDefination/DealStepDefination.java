package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class DealStepDefination {

	LoginPage lp = new LoginPage();

	WebDriver driver;

	@Given("^User is present on Login Page$") public void User_on_login_page()
			throws InterruptedException { lp.openBrowser(); lp.loginPage(); lp.popup(); }

	@When("^title of login page is \"([^\"]*)\"$") public void
	 title_of_login_page_is(String title) throws Throwable { String title1 =
	 lp.login_Title_page(); Assert.assertEquals(title, title1); }
	
	@Then("user enter username and password") public void
	user_enter_username_and_password(DataTable credentials) { List<List<String>>
	data = credentials.raw();
	lp.enterEmailPassword(data.get(0).get(0),data.get(0).get(1)); }

	@Then("^user click on login button$") public void
	user_click_on_login_button() throws Throwable { lp.submit(); }

	@Then("^user is on Home Page \"([^\"]*)\"$") public void
	user_is_on_Home_Page(String arg1) throws Throwable {
		Assert.assertEquals(arg1, lp.login_Title_page()); }

	@Then("^user moves to a new deal page$")
	public void user_moves_to_a_new_deal_page() {
		lp.DealPage_Test();
	}
	@Then("^user enter deal detail$")
	public void user_enter_deal_detail(DataTable dealData) { 
	List<List<String>> data1 = dealData.raw();
	lp.createDeal(data1.get(0).get(0),data1.get(0).get(1),data1.get(0).get(2),data1.get(0).get(3));

	}
	@Then("^quite Browser$") public void quite_Browser() throws Throwable {
		  lp.close();
		  }



}
