package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		System.setProperty("C:\\Program Files\\Java", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Resizabler=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions Act=new Actions(driver);
		Act.dragAndDropBy(Resizabler, 10, 10).perform();


	}

}
