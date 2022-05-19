import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter p: ");
		// principal 
		int p = input.nextInt();
		
		System.out.println("Enter the t: ");
		//time
		int t = input.nextInt();
		
		System.out.println("Enter the r: ");
		//rate of interest per annum
		int r = input.nextInt();
		
		int si = p*t*r/100;
		System.out.println("simple interest is: "+si);
		
		input.close();
		

	}

}
