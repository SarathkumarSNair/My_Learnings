import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.remote.ScreenshotException;
import org.apache.commons.io.FileUtils;
import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation;
import okhttp3.internal.http2.Http2Connection;

public class javaExe {
public static void main(String[]args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	//BrokenBarrierException URl
	//Java method will call url and get the staus of all Link
	//If status code is less than 400 then that link is not working
	String url = driver.findElement(By.cssSelector("a[href*='facebook']")).getAttribute("href");
	HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	connection.setRequestMethod("HEAD");
	connection.connect();
	int responsecode= connection.getResponseCode();
	System.out.println(responsecode);
	
	 

	//System.out.println(driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).getText());
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.id("ap_email")).sendKeys("sarath01@gmail.com");;
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Sarath456");
	driver.findElement(By.id("signInSubmit")).click();
	driver.findElement(By.className("nav-a  ")).click();
	
	//In order to take screen shots
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\saratnai\\Pictures\\SavedPictures.png"));
		
	
	
	
	//in order to fetch the hidden text we use javascript in selenium that is called Ajax Implementation
	//Javascript DOM can extract hidden elements
	//because selenium cannot identify hidden elements - (Ajax implementation)
	//investigate the properties of object if it have any hidden text
	//JavascriptExecutor
	
	//JavascriptExecutor js= (JavascriptExecutor)driver;
	//String script= "return document.getElementsByClassName(\"desktop-searchBar\").value;";
	//String text = (String)js.executeScript(script);
	//System.out.println(text);
	
	
}
	
}
