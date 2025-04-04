//4
//Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		float celsius;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter temperature in celsius: ");
		celsius = input.nextFloat();
		float fahrenheit =  (celsius * 9/5) + 32;
		System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit ");
	}
}