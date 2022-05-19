import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator");
		int operator = input.next().charAt(0); 
		
		
		int a =0, b=0;
		if (operator == '+' ||operator  == '-' || operator == '*' || operator == '/') {
		
		switch (operator) {
		case '+':
			int sum = a+b;
			System.out.println("Sum is: "+sum);
			break;
		case '-':
			int sub = a-b;
			System.out.println("Sub is: "+sub);
			break;
		case '*':
			int mul = a*b;
			System.out.println("mul is: "+mul);
			break;
		case '/':
			int div = a/b;
			System.out.println("div is: "+div);
			break;
			default:
				System.out.println("Wrong operator selection!!!");
				break;
		}
System.out.println("Exit");

	}

}
}
