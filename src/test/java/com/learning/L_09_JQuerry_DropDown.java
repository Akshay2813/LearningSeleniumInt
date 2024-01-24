package com.learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_09_JQuerry_DropDown {
	
	public static void selectChoicValues(List<WebElement> optionList, String... value)
	{
		if(!value[0].equalsIgnoreCase("All"))
		{
			for(WebElement option :optionList )
			{
				String optionVal=option.getText();
				for(String val : value)
				{
					if(val.equalsIgnoreCase(optionVal))
					{
						option.click();
						break;
					}
				}
			}
		}
		else
		{
			
			for(WebElement option :optionList )
			{
				option.click();
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		
			// Create Edge browser options
	        EdgeOptions edgeOptions = new EdgeOptions();

	        // Disable notifications
	        edgeOptions.addArguments("--disable-notifications");
	        
	        edgeOptions.setExperimentalOption("useAutomationExtension", false);

	        // Create a new Edge browser instance with the specified options
	    	
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver(edgeOptions);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			
			driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
			
			List<WebElement> optionList= driver.findElements(By.xpath("//li[@class='ComboTreeItemChlid']"));
			
//			selectChoicValues(optionList, "ALL");
			
//			selectChoicValues(optionList, "choice 1");
			
			selectChoicValues(optionList, "choice 1","choice 6 1","choice 2 2");
			
//			for(WebElement option :optionList )
//			{
//				String optionVal=option.getText();
//				System.out.println(optionVal);
//			}
			
			

	}

}
