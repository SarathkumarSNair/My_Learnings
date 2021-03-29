package Tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class One {
	@Test
	public  void test1(){
		System.out.println("were");
	}
	
		@Test
		public  void test2(){
			System.out.println("space");
		}
		
		@AfterSuite
		public  void matrix(){
			System.out.println("last one");
		}
			@Test(groups ={"smoke"})
			public  void test3(){
				System.out.println("time");
				Assert.assertTrue(false);
			}
			@AfterTest
			public  void test15(){
				System.out.println("Goal");
			}

}
