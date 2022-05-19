package day2.assignment;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter L: ");
		//Length
		int L = Input.nextInt();
		System.out.println("Enter B: ");
		//width
		int B = Input.nextInt();
		
		
		int area = L*B;
		//area 
		
		System.out.println("simple interest is: "+area);
		
		Input.close();
		

	}

}
