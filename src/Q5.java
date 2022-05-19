import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//area of circle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the r :");
		double r = input.nextDouble();
		// radius
		
		int PI = (int) Math.PI;
		
		int a = (int) (PI * r * r); 
		
		System.out.println("Area of circle is :"+a);
		
		
		//area of rectangle
		System.out.println("Enter the l:");
		int l = input.nextInt();
		// length
		
		System.out.println("Enter the b");
		int b = input.nextInt();
		// width
		
		int area = l*b;
		System.out.println("rectangle is :"+area);
		
		//area of triangle
		System.out.println("Enter the b:");
		b = input.nextInt();
		//base of triangle 
		
		System.out.println("Enterthe h :");
		int h = input.nextInt();
		//height of triangle
		double Rad = (double)0.5*b*h;
		System.out.println("Area of triangle is :"+Rad);
		
		
		input.close();
		

	}

}
