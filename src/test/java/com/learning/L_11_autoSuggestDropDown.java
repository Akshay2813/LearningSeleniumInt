package com.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class L_11_autoSuggestDropDown {

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
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
	
//		Thread.sleep(2000);
		for(WebElement suggest: suggestionList )
		{
//			System.out.print(suggest.getText());
			String country = suggest.getText();
			
			if(country.equals("Indonesia"))

			{
				suggest.click();
			}
		}
		
	

	}
	

}
