package com.learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_14_windowHandle_Part_B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		
		String parentWindID=driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
	
		Set<String> windowID = driver.getWindowHandles();
		
		for(String w:windowID)
		{
			if( ! w.equals(parentWindID))
			{
				//we will have child windID
				driver.switchTo().window(w);
			}
		}
	
		
		

	}

}
