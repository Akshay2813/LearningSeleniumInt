package com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_08_DynamicDropDown {

	public static void selectDynamicDropDown_generalMethod(List<WebElement> optionList, String value )
	{
		for(WebElement option: optionList)
		{
			
			System.out.println(option.getText());
			
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
		}
	}
	public static void main(String[] args) {

		
		//dropdown webelement do not have SELECT tag
		
		 // Create Edge browser options
        EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
//        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);


        // Create a new Edge browser instance with the specified options
        
			
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver(edgeOptions);
		
		driver.get("https://www.hdfc.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
		
		List<WebElement> optionList =driver.findElements(By.xpath("//ul[@id='productType']/li"));
		
		System.out.print(optionList.size());
//		
//		for(WebElement option: optionList)
//		{
//			
////			System.out.println(option.getText());
//			
//			if(option.getText().equalsIgnoreCase("Housing Loans"))
//			{
//				option.click();
//				break;
//			}
//		}
		
		selectDynamicDropDown_generalMethod(optionList,"Housing Loans");
		
	}

}
