
public class Paliandrom {
public static void main(String[]args){
	int num=133,reversalInteger=0,remainder, orginalInteger;
	orginalInteger = num;
	while(num!= 0) {
		remainder = num % 10;
		reversalInteger= reversalInteger * 10 + remainder;
		num /=10;
	}
		if(orginalInteger==reversalInteger) {
			System.out.println(orginalInteger + "Palindrome");
		}
		else {
			System.out.println(orginalInteger + "not palindrome");
		}
		
	
	
}
}
