import java.sql.Driver;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandler {
public static void main(String[]args){
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/flights/?cmp=disp_dgm_DF&source=71779");
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	 //while(!driver.findElement(By.cssSelector("[class='DayPicker-wrapper'][class='DayPicker-Caption']")).getText().contains("January 2021")){
		 //  driver.findElement(By.xpath("//span[@rule='button']"));
	  // }
		List<WebElement> dates = driver.findElements(By.className("dateInnerCell"));
		int count=driver.findElements(By.className("dateInnerCell")).size();
		for(int i=0;i<count;i++) {
			String text = driver.findElements(By.className("dateInnerCell")).get(i).getText();
			if(text.equalsIgnoreCase("25")) {
				driver.findElements(By.className("dateInnerCell")).get(i).click();
			}
		}
		
	}		
}
