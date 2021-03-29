import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@Src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@Src='/frame_middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());	
		
	}

}
