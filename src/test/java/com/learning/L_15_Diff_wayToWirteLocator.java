package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_15_Diff_wayToWirteLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//class="btn-style class1"
		
		driver.findElement(By.xpath("//*[@class='btn-style class1']")).isDisplayed();
		
//		driver.findElement(By.className("btn-style class1"));	//this Invalid
		
		driver.findElement(By.className("btn-style"));
		
		driver.findElement(By.className("class1"));
		driver.findElement(By.cssSelector(".btn-style.class1"));
		
		
		System.out.print("Done");
//		If the element type is known and the class attribute is unique:
//		By.cssSelector("tagname.xyz.abc")

		
	}

}
