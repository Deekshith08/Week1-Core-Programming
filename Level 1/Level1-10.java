//10
//Write a program that takes your height in centimeters and converts it into feet and inches

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double height;
	    Scanner input = new Scanner(System.in);
	    System.out.println(" enter your height in cm");
	    height = input.nextInt();
	    double feet = height/30;
	    double inches = height%30;
	    System.out.println(" your height in cm is " + height +" while in feet is " + feet +"while in inches is "+ inches);
	}
}