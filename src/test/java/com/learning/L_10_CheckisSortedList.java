package com.learning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class L_10_CheckisSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		
		WebElement w = driver.findElement(By.xpath("//select[@name='category_id']"));
		
		Select dropDown= new Select(w);
		
		List<WebElement> optionList= dropDown.getOptions();
		
		
		System.out.println(optionList.size());
		
		ArrayList orginalList= new ArrayList();
		ArrayList tempList= new ArrayList();
		
		for(WebElement option:optionList)
		{
			orginalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		Collections.sort(tempList);
		
		if(tempList.equals(orginalList))
		{
			System.out.println("DropDown Are Sroted");
		}
		else
		{
			System.out.println("DropDown Are NOT Sroted");
		}
		

	}

}
