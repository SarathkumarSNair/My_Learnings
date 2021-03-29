import java.util.Scanner;

public class TrainingModule {
	public static void main(String[]args) {
		Scanner scar= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scar.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
