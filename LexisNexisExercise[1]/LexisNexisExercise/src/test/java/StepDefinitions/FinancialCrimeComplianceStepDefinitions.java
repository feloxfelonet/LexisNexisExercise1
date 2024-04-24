package StepDefinitions;

import com.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FinancialCrimeCompliancePage;

public class FinancialCrimeComplianceStepDefinitions {
	
	private FinancialCrimeCompliancePage financialCrimeCompliancePage = new FinancialCrimeCompliancePage(DriverFactory.getDriver());

	@Then("Verify the title page is matched")
	public void user_clicks_on_financial_Crime_compliance_link() {		
		financialCrimeCompliancePage.verifyHeader();
	}

}
