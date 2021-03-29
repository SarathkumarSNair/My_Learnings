import java.util.concurrent.CountDownLatch;

public class WordsIdenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="com com sim com com silly question";
String[] p= str.split("com");
for(int i=0; i<=str.length();i++) {
	if (p[i]=="com") {
		int s= i+1;
		System.out.println(s);
	}


	}

}}
