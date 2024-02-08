package com.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_29_slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement firstPoint= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		
		System.out.println("Intial Slider location= "  +firstPoint.getLocation());
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(firstPoint, 100, 0).build().perform();
		
		System.out.println("After drag dropBy  first Slider location= "  +firstPoint.getLocation());
		
		WebElement lastPoint= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));

		System.out.println("Last Slider location= "  +lastPoint.getLocation());

		act.dragAndDropBy(lastPoint, -30, 0).build().perform();
		
		System.out.println("After drag dropBy  last Slider location= "  +lastPoint.getLocation());
		
		System.out.println("Dimension= "  +lastPoint.getSize());

		System.out.println("Dimension heght= "  +lastPoint.getSize().getWidth());
		System.out.println("Dimension width= "  +lastPoint.getSize().getWidth());
	}

}
