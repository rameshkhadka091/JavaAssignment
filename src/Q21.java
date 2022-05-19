import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 5;
			switch (choice) {//start

			case 1:
				System.out.println("this is monday :");
			break;
			case 2:
				System.out.println("today is tuesday :");
			break;
			case 3:
				System.out.println("today is wednesday :");
				
				break; 
			case 4:
				System.out.println("today is thursday :");
				break;
			case 5:
				System.out.println("today is friday :");
				break;
			case 6:
				System.out.println("today i saturday :");
				break;
			case 7:
				System.out.println("today is Sunday");
				default:
					System.out.println("wrong choice!!!");
		}//end 
			System.out.println("exit");

	}

}
