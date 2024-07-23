package Automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement Frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(Frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Naveen1");
		driver.switchTo().defaultContent();
		WebElement Frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(Frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Avinash");
		driver.switchTo().defaultContent();
		WebElement Frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(Frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Sainath");
		driver.switchTo().defaultContent();
		WebElement Frame4=driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(Frame4);
		driver.findElement(By.name("mytext4")).sendKeys("Suresh");
		driver.switchTo().defaultContent();

	}

}
