//12
//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double height;
	    Scanner input = new Scanner(System.in);
	    System.out.println(" enter height of triangle");
	    height = input.nextInt();
	    double base;
	    System.out.println(" enter base of triangle");
	    base = input.nextInt();
	    double area = height*base*0.5;
	    System.out.println(" the area of triangle is "+ area);
	}
}