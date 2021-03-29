package Tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupport {
	@Test
	public  void loan(){
		System.out.println("smart");
	}

	@Test
	public  void loan2(){
		System.out.println("9999");
	}
	// 
	@Test(dataProvider="getdata")
	public  void loan3(String username,String password){
		System.out.println("10000");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public  void loan4(){
		System.out.println("5000");
	}
	
	@DataProvider 
	//this to show multiple data feed to a test case rather than using from xml file
	public Object[][] getdata() {
		// first number of times and the second total number of inputs 
	Object[][] data = new Object[3][2];
	//first data 
	data [0][0]="username1";
	data [0][1]="password1";
	//second 
	data [1][0]="username2";
	data [1][1]="password2";
	//third
	data [2][0] ="USERNAME3";
	data [2][1] ="password3";
	return data;
	
}

}
