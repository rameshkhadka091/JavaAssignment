import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Fahrenheit to Celcius 
		
		System.out.println("Enter the Fahrenheit :");
		int Fahrenheit = input.nextInt();
		
		int Celcius = (Fahrenheit - 32) * 5 / 9;
		System.out.println("The Celcius is equal to :"+Fahrenheit);
		
		// Celcius to Fahrenheit
		System.out.println("Enter the Celcisu :");
		
		Celcius = input.nextInt();
		Fahrenheit = Celcius * 5 / 9 + 32;
		
		System.out.println("The Fahrenheit is equal to :"+Celcius);
		
		input.close();
		
		
		
		
		
		
			
		

	}

}
