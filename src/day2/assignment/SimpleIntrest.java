package day2.assignment;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
	
		
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter P: ");
		//principal amount
		int p = Input.nextInt();
		System.out.println("Enter r: ");
		//rate per annum
		int r = Input.nextInt();
		System.out.println("Enter t: ");
		//time
		int t = Input.nextInt();
		
		int si = p*r*t/100;
		//simple interest
		
	
		
		System.out.println("simple interest is: "+si);
		
		Input.close();

	}

}
