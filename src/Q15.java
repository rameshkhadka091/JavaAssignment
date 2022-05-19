import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		char n = (char) input.nextInt();
		if (n>= 0 && n<=128); {
			char asciiCode = (char)n;
			System.out.println("The corresponding character is: "+asciiCode);
		}

	}

}
