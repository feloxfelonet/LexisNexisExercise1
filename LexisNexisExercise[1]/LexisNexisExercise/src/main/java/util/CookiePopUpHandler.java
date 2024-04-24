package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CookiePopUpHandler {

	public static void handleCookiePopUp(WebDriver driver) {
		 	
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
		 
		 if (element.isDisplayed())
		 {
		 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		 }
	}
}
