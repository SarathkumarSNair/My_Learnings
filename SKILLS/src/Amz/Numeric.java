package Amz;
import java.util.Scanner;
public class Numeric {
	



	public static void main(String[]args) {

		Scanner A=new Scanner(System.in);
		String inputstring;
		System.out.println("Enter the string with numeric");
		inputstring = A.nextLine();

		System.out.print("following are the integer");
		for(char ch:inputstring.toCharArray()) {
			if(Character.isDigit(ch)){
				System.out.println(" "+ch);
			}
		}
			}

		}

