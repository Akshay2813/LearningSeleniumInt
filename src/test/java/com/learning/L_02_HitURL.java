package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class L_02_HitURL {

	
	
	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		//Open URL
		driver.get("https://testpages.eviltester.com/styled/index.html");

		String url = driver.getCurrentUrl();
		System.out.println("Current URL of page is = "+ url);

		String title = driver.getTitle();
		System.out.println("Current title of page is = "+ title);

		String pageSource = driver.getPageSource();
		
		System.out.println("Current Page Source Code is = "+ pageSource);
		
		//Close browser page
		//driver.close();
		
		//close Brwoser
		
		driver.quit();
		
	}

}
