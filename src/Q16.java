import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = input.nextInt();
		
		if (a%2 !=0) {
			System.out.println("The number is odd: ");
		}else {
			System.out.println("The number is even: ");
		}

	}

}
