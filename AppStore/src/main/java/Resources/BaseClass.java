package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class BaseClass {
	public WebDriver driver;
	public WebDriver DriverIntializer() throws IOException {
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\saratnai\\eclipse-workspace\\AppStore\\src\\main\\java\\Resources\\Browser.properties");
	prop.load(fis);
	String Browsers=prop.getProperty("browser");
	if (Browsers.equals("chrome")) {
		//Chrome browser execution
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	else if(Browsers.equals("Firefox")) {
		//execute fire fox
		System.setProperty("webdriver.gecko.driver", "C:\\chrome\\chromedriver.exe");
		driver= new FirefoxDriver();
	}
	else if(Browsers.equals("IE")) {
		//Execute IE
		System.setProperty("webdriver.gecko.driver", "C:\\chrome\\chromedriver.exe");
	    driver= new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}

}
