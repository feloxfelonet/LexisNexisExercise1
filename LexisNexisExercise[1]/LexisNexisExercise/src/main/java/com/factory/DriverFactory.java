package com.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>(); 
	
	public WebDriver init_driver(String browser){
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		if (browser.equals("chrome")){
			WebDriverManager.chromedriver().clearDriverCache().setup();
			tlDriver.set(new ChromeDriver(options));
		}
		else
		{
			System.out.println("Broswer specified is not available");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return getDriver();
				
	}

	public static WebDriver getDriver(){
		return tlDriver.get();
	}
}
