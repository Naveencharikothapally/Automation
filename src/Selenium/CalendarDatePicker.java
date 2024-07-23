package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDatePicker {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String aMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear =driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(aMonth.equals("September") && aYear.equals("2024")))
		{
		   driver.findElement(By.xpath("//a[@data-Handler='next']")).click();
		   aMonth =driver.findElement(By.className("ui-datepicker-month")).getText();
		   aYear =driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		  driver.findElement(By.xpath("//*//td[@data-handler='selectDay']/a[text()='15']")).click();

}

}

