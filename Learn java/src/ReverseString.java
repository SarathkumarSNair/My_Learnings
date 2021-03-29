import javax.naming.spi.Resolver;

public class ReverseString {
public static void main(String[]args) {
	String s= "hello this is sarath";
//	String reverseStrings="";
//	for (int i =s.length()-1;i>=0;i--) {
	//	reverseStrings = reverseStrings + s.charAt(i);
	//	System.out.println(reverseStrings);
		
	//}
	
	StringBuffer str= new StringBuffer(s);
	System.out.println(str.reverse());
	
	
}
}

