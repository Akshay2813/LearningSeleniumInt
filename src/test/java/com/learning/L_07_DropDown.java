package com.learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_07_DropDown {
	
	public static void selectOption_generalMethod(WebElement w, String value)
	{
		Select dropDown = new Select(w);
		
		List<WebElement> dropDownOptionList = dropDown.getOptions();
		
		for(WebElement option : dropDownOptionList)
		{
		
			//System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown=new Select(w);
	
		//method -1
		dropDown.selectByIndex(1);
		
		Thread.sleep(3000);
		
		//method -2
		dropDown.selectByValue("option3");
		
		Thread.sleep(3000);
		
		//method -3
		dropDown.selectByVisibleText("Option2");
	
		
		//method -4
		List<WebElement> dropDownOptionList = dropDown.getOptions();
		
		for(WebElement option : dropDownOptionList)
		{
		
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("option2"))
			{
				option.click();
				break;
			}
		}
		
		//method -5
		selectOption_generalMethod(w,"Option2");

		

	}

}
