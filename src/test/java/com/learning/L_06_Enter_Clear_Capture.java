package com.learning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class L_06_Enter_Clear_Capture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		//Enter text
		WebElement w = driver.findElement(By.xpath("//input[@id='Email']"));
		
		String val= w.getText();
		System.out.println("ValueBefore= " + val);  // will be blank as it only return inner text
		// Eg: input name="Name" id="QWE123"> ThisINNERText </input>
		w.clear();
		w.sendKeys("akshaya");	
		
		//capture Inner Text
		val= w.getText();
		System.out.println("ValueAfter= " + val); // will be blank as it only return inner text
		// Eg: input name="Name" id="QWE123"> ThisINNERText </input>
		
		//capture value of Attribute
		
		System.out.println(w.getAttribute("id"));
		System.out.println(w.getAttribute("value"));
		
		//clear Text
	//	name.clear();
	}

}
