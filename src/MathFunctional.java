import java.util.Scanner;

public class MathFunctional {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//sound
		
		System.out.println("Enter u: ");
		//speed of sound
		int u = input.nextInt();
		
		System.out.println("Enter t: ");
		//time
		int t = input.nextInt();
		
		System.out.println("Enter a: ");
		//constant
		int a = input.nextInt();
		
		
		double Mi = u*t+(0.5*a*t*t);
		System.out.println("Enter the formula of sound : "+Mi);
		
		
		input.close();
		
		

	}

}
