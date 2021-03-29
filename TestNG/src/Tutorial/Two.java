package Tutorial;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two {
	@Test
	public  void test10(){
		System.out.println("relax");
	}
	
		@Test
		public  void test11(){
			System.out.println("Happines");
		}
		@BeforeSuite
		public  void simba(){
			System.out.println("first");
		}
		
		@BeforeMethod
		public  void method(){
			System.out.println("where will this print");
		}
		@Test(groups ={"smoke"}) 
			public  void test12(){
				System.out.println("love");	
			}
			@BeforeTest
			public void test13() {
				System.out.println("testing job");
			}
			@AfterMethod
			public  void aftermethod(){
				System.out.println("where is the position");
			}
}

