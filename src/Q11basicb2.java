import java.util.Scanner;

public class Q11basicb2 {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		
		System.out.println("Value of a before swapping: "+a);
		System.out.println("Value of b before swapping: "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a after swapping: "+a);
		System.out.println("Value of b after swapping: "+b);
		

	}

}
