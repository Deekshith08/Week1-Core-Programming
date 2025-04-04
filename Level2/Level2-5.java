//5
//Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		float fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit: ");
		fahrenheit = input.nextFloat();
		float celsius =   (fahrenheit - 32) * 5/9;
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius "
);
	}
}