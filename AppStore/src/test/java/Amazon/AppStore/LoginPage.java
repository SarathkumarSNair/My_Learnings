package Amazon.AppStore;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage1;
import Resources.BaseClass;

public class LoginPage extends BaseClass{
	
	@Test
	public void LoginPageFunc(String username, String password) throws IOException   {
		driver=DriverIntializer();
		driver.get("https://alexa.amazon.com");
		 LoginPage1 login = new LoginPage1(driver);
		 login.getEmail().sendKeys(username);
		 login.getPassword().sendKeys(password);
		 login.getLoginButton().click();
	}
	// fetch data using dataprovider annotation using array
 @DataProvider
 public Object[][] getdata() {
	 Object[][] data= new Object[2][2];
			 data[0][0]="King112@gmail.com";
			 data[0][1]="1132576";
			 
			 data[1][0]= "hunter456@yahoo.com";
			 data[1][1]="asjdas12";
			 return data;
 }

}
