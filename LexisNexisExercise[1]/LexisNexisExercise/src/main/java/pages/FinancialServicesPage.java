package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class FinancialServicesPage {


	private WebDriver driver;

	private By financialCrimeCompliance = By.xpath("//a[@href='/financial-services/financial-crime-compliance']//div[@class='subpage-title'][normalize-space()='Financial Crime Compliance']");
	private By customerDataManagement= By.xpath("//a[@href='/financial-services/customer-data-management']//div[@class='subpage-title'][normalize-space()='Customer Data Management']");
	private By collectionsAndRecovery = By.xpath("//a[@href='/financial-services/collections-and-recovery']//div[@class='subpage-title'][normalize-space()='Collections and Recovery']");
	private By riskOrchestration = By.xpath("//a[@href='/financial-services/risk-orchestration']//div[@class='subpage-title'][normalize-space()='Risk Orchestration']");
	private By fraudIdentityManagement = By.xpath("//a[@href='/financial-services/fraud-and-identity-management']//div[@class='subpage-title'][normalize-space()='Fraud and Identity Management']");
	private By creditRiskAssessment = By.xpath("//a[@href='/financial-services/credit-risk-assessment']//div[@class='subpage-title'][normalize-space()='Credit Risk Assessment']");
	private By investigationsDueDiligence = By.xpath("//a[@href='/financial-services/tracing-and-investigations']//div[@class='subpage-title'][normalize-space()='Investigations and Due Diligence']");
	
	
	public FinancialServicesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnFinancialCrimeComplianceLink() {
		driver.findElement(financialCrimeCompliance).click();
		
	}
	public void checkLinksOnAvailableFinancialServciesPage(DataTable table){
		
		DataTable subTable = table.subTable(1, 0);
		List<String> list = subTable.asList();
		for (String e : list){
			Assert.assertTrue(driver.findElement(By.linkText(e)).isDisplayed());
		}
			
	}
}
