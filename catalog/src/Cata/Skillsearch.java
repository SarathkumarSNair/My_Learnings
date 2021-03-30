package Cata;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.concurrent.TimeUnit;

import javax.swing.text.AbstractDocument.Content;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class Skillsearch {
	
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://alexa.amazon.com/spa/index.html#cards");
		WebElement id = driver.findElement(By.id("ap_email"));
		id.sendKeys("sarat123@gmail.com");
		File file=id.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\saratnai\\Pictures\\SavedPictures.png"));
		driver.findElement(By.id("ap_password")).sendKeys("testing@123");
		driver.findElement(By.xpath("//label[@for='auth-show-password-checkbox']//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy a-control-row a-touch-checkbox']//label//i[@class='a-icon a-icon-checkbox']")).click();
driver.findElement(By.id("ap_email_icon")).click();
driver.findElement(By.id("ap_password_icon")).click();

		driver.findElement(By.id("remember_me_learn_more_link")).click();
		System.out.println("header-"+ driver.findElement(By.id("a-popover-header-1")).getText());
		System.out.println("Content-"+ driver.findElement(By.xpath("//div[@id='a-popover-content-1']")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'a-button-close a-declarative')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'© 1996-2020, Amazon.com, Inc. or its affiliates')]")).getText());
		
	}

}
