package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	
	public static void main(String[] args) {

	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/V4/");
	driver.findElement(By.name("uid")).sendKeys("mngr578946");
    driver.findElement(By.name("password")).sendKeys("bysYmub");
    driver.findElement(By.name("btnLogin")).click();
	WebElement image = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/img[1]"));
	
	if (image.isDisplayed()) {
		System.out.println("login success");
	}
	else {
	     System.out.println("login failed");
	}
	
          }

}