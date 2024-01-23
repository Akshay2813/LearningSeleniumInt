package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class L_04_navigate_Refresh {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
	}

}
