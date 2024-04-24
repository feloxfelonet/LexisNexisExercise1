package StepDefinitions;

import com.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FinancialServicesPage;
import pages.LexisNexisHomePage;
import util.CookiePopUpHandler;


public class LexisNexisStepDefinitions {

	private LexisNexisHomePage homePage = new LexisNexisHomePage(DriverFactory.getDriver());
	
	
	@Given("User is on Home page of LexisNexis site")
	public void user_is_on_home_page_of_lexis_nexis_site() {
		DriverFactory.getDriver().get("https://risk.lexisnexis.co.uk/");
	}

	@When("User clicks on Choose Your Industry option")
	public void user_clicks_on_choose_your_industry_option() {
		homePage.clickOnChooseYourIndustryList();
	}

	@Then("User should see following option")
	public void user_should_see_option(DataTable table) {
		homePage.checkIndustryLinks(table);
	}

	@When("User clicks on Financial services link")
	public void user_clicks_on_financial_services_link() {
		homePage.clickOnFinancialServiceLink();
	}
	
	@When("User accepts the cookie pop-up")
	public void user_accepts_cookie_pop_up() {
	    CookiePopUpHandler.handleCookiePopUp(DriverFactory.getDriver());
	}	
	
	@When("User clicks on Insurance option")
	public void user_clicks_on_insurance_option() {
		homePage.clickOnInsuranceOption();
	}

	@When("Refresh the page")
	public void refresh_the_page() {
		DriverFactory.getDriver().navigate().refresh();
	}

	@When("User clicks on Life and Pensions option")
	public void user_clicks_on_life_and_pensions_option() {
		homePage.clickOnLifeAndPensionsOption();
	}

	@When("User clicks on Corporations and Non-Profits option")
	public void user_clicks_on_corporations_and_non_profits_option() {
	   homePage.clickOnCorporationsAndNonProfitsOption();
	}

	
}


