package com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class L_13_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EdgeOptions edgeOptions = new EdgeOptions();

        // Disable notifications
        edgeOptions.addArguments("--disable-notifications");
        
        edgeOptions.setExperimentalOption("useAutomationExtension", false);
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
//		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
//		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
//		List<WebElement>  li =driver.findElements(By.xpath("//div[@class='checkbox']"));
		
		
		
		//select specific checkbox
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.id("checkBoxOption2")).click();
		
		//select all check box
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		for(WebElement check: checkboxes)
//		{
//			check.click();
//		}
		
		
		//select last 2
//		
		for(int i=checkboxes.size()-2;i<checkboxes.size();i++)  //1 
		{
			checkboxes.get(i).click();
		}
		
		
		//select first 2
		
//		for(int i=0;i<2;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
		//input[@type='checkbox' and contains(@id,'day')]

	}

}
