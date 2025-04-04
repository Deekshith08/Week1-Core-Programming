
//13
//Write a program to find the side of the square whose parameter you read from user 


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float perimeter;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter perimeter : ");
	    perimeter = input.nextFloat();
	    
	    float side = perimeter/4;
	    
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter
);
	}
}