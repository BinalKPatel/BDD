/*
 * package stepDefination;
 * 
 * import org.junit.Assert; import org.openqa.selenium.WebDriver; import
 * cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import pages.ContactPage; import pages.LoginPage;
 * 
 * public class LoginStepDefination {
 * 
 * LoginPage lp = new LoginPage();
 * 
 * WebDriver driver;
 * 
 * @Given("^User is present on Login Page$") public void User_on_login_page()
 * throws InterruptedException { lp.openBrowser(); lp.loginPage(); lp.popup(); }
 * 
 * @When("^title of login page is free CRM$") public void
 * title_of_login_page_is_free_CRM() throws Throwable { lp.login_Title_page(); }
 * 
 * @When("^title of login page is \"([^\"]*)\"$") public void
 * title_of_login_page_is(String title) throws Throwable { String title1 =
 * lp.login_Title_page(); Assert.assertEquals(title, title1); }
 * 
 * @Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$") public void
 * user_enter_username_and_password(String a,String b) throws Throwable {
 * lp.enterEmailPassword(a,b); }
 * 
 * @Then("^user click on login button$") public void
 * user_click_on_login_button() throws Throwable { lp.submit(); }
 * 
 * @Then("^user is on Home Page \"([^\"]*)\"$") public void
 * user_is_on_Home_Page(String arg1) throws Throwable {
 * Assert.assertEquals(arg1, lp.login_Title_page()); }
 * 
 * @Then("^quite Browser$") public void quite_Browser() throws Throwable {
 * lp.close(); }
 * 
 * @Then("^user moves to a new contact page$") public void
 * user_moves_to_a_new_contact_page() { lp.ContactPage_Test(); }
 * 
 * @Then("^user enter \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$") public void
 * user_enter_and(String arg1, String arg2, String arg3) {
 * lp.createNewContact(arg3, arg1, arg2); }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */