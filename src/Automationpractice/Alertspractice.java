package Automationpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertspractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		Alert ALTWIN=driver.switchTo().alert();
		ALTWIN.sendKeys("Naveen");
		Thread.sleep(3000);
		ALTWIN.accept();
		//double click
		Actions Act=new Actions(driver);
		WebElement Double=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Act.doubleClick(Double).perform();
		//Frames
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Frame=driver.findElement(By.xpath("//*[@id=\"frame-one796456169\"]"));
		driver.switchTo().frame(Frame);
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Naveen");


	}

}
