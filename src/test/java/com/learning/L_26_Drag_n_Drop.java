package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class L_26_Drag_n_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications"); 
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver(options);
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box1']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='box102']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
	}

}
