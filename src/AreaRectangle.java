import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
