package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FinancialCrimeCompliancePage {
	private WebDriver driver;

	private By financialCrimeComplianceHeader = By.xpath("//h2[normalize-space()='Making financial crime prevention simple']");
	
	
	public FinancialCrimeCompliancePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyHeader(){
		Assert.assertEquals(driver.findElement(financialCrimeComplianceHeader).getText(), "Making financial crime prevention simples","Financial Crime Compliance header text not matached");
	}
}
