import java.util.Scanner;

public class WeightConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		//kg to pound 
		
		System.out.println("Enter the kg :");
		int kg = input.nextInt();
		
		double pound = (int) 1 * 0.45359237;
		System.out.println("The pound is equal to :"+kg);
		
		// pound to kg
		System.out.println("Enter the kg :");
		
		pound = input.nextInt();
		kg = (int) (1 * 0.45359237);
		
		System.out.println("The kg is equal to :"+pound);
		
		input.close();

	}

}
