//14
//Write a program the find the distance in yards and miles for the distance provided by user in feets


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double distance;
	    Scanner input = new Scanner(System.in);
	    System.out.println(" enter distance in feets");
	    distance = input.nextInt();
	    double yards = distance/3;
	    double miles = distance/1760;
	    System.out.println(" the distance given in feets is "+ distance +" \n the distance in yards is"+yards +" \n the distance  in miles is" +miles);
	}
}