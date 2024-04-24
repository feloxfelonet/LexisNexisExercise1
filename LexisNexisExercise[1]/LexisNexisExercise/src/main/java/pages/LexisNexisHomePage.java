package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class LexisNexisHomePage{
	
	private WebDriver driver;

	private By chooseYourIndustryList = By.xpath("//a[normalize-space()='Choose Your Industry']");
	private By financialServicesLink = By.xpath("//div[normalize-space()='Financial Services']");
	private By insuranceLink = By.xpath("//div[normalize-space()='Insurance']");
	private By lifeAndPensionsLink = By.xpath("//div[normalize-space()='Life and Pensions']");
	private By corporationsAndNonProfitLink = By.xpath("//div[normalize-space()='Corporations and Non-Profits']");

	public LexisNexisHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnChooseYourIndustryList() {
		driver.findElement(chooseYourIndustryList).click();
	}

	public void checkIndustryLinks(DataTable table)
	{
		DataTable subTable = table.subTable(1, 0);
		List<String> list = subTable.asList();
		for (String e : list){
			Assert.assertTrue(driver.findElement(By.xpath("//a[text()='"+e+"']")).isEnabled());
		}
	}

	public void clickOnFinancialServiceLink(){
		driver.findElement(financialServicesLink).click();
	}
	
	public void clickOnInsuranceOption(){
		driver.findElement(insuranceLink).click();
	}
	
	public void clickOnLifeAndPensionsOption(){
		driver.findElement(lifeAndPensionsLink).click();
	}
	
	public void clickOnCorporationsAndNonProfitsOption(){
		driver.findElement(corporationsAndNonProfitLink).click();
	}
}
