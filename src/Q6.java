import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r :");
		//radius
		int r = input.nextInt();
		
		System.out.println("Enter PI :");
		//Constant value
		double PI = Math.PI;
		
	
	    double area = PI*r*r;
		System.out.println("Enter the area of circle : "+area);
		
        
		
		System.out.println("Enter l: ");
		//length
		int l = input.nextInt();
		
		System.out.println("Enter b: ");
		//width
		int b = input.nextInt();
		
		int a = l*b;
		System.out.println("Area of rectangle is: "+a);
		
	
		input.close();
		
	

	}

}
