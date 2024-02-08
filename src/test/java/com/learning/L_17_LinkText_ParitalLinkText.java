package com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class L_17_LinkText_ParitalLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//		driver.findElement(By.linkText("REST API")).click();
		
//		driver.findElement(By.partialLinkText("REST")).click();
		
		//how many links present on apage
		
		int totalPageLink= driver.findElements(By.tagName("a")).size();
		System.out.println("totalPageLink= "+ totalPageLink);
		
		////how many links present on footer section
		
		WebElement footer =driver.findElement(By.xpath("//table[@class='gf-t']"));
		
	int footerPageLink	=footer.findElements(By.tagName("a")).size();
	
	System.out.println("footerPageLink= "+ footerPageLink);
	
	// how many link in each columm
	
	List<WebElement> column = driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td"));
	
	for(int i=1; i<=column.size();i++)
	{
		WebElement col = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td["+i+"]"));
		int count =col.findElements(By.tagName("a")).size();
		System.out.println("ColumPageLink at colum "+i+ " = "+ count );
	}

		
	}

}
