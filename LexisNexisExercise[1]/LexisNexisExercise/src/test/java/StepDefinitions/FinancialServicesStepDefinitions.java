package StepDefinitions;

import com.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.FinancialServicesPage;

public class FinancialServicesStepDefinitions {
	private FinancialServicesPage financialServicesPage = new FinancialServicesPage(
			DriverFactory.getDriver());
	
	@When("User should see following links on Financial Services")
	public void user_should_see_following_links_on_financial_services(DataTable table) {		
		financialServicesPage.checkLinksOnAvailableFinancialServciesPage(table);
	}
	
	@When("User clicks on Financial Crime Compliance link")
	public void user_clicks_on_financial_Crime_compliance_link() {		
		financialServicesPage.clickOnFinancialCrimeComplianceLink();
	}
}
