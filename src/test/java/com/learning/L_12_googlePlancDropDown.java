package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_12_googlePlancDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create Edge browser options
        EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		Thread.sleep(5000);
		WebElement placeSearch=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		

		

		
		placeSearch.sendKeys("Ind");
		
		String text;
		do {
			placeSearch.sendKeys(Keys.ARROW_DOWN);
			text=placeSearch.getAttribute("value");
			
			if(text.equals("Indianapolis, IN, USA"))
			{
				placeSearch.sendKeys(Keys.ENTER);
			}
			
		}while(!text.isEmpty());
		
		

	}

}
