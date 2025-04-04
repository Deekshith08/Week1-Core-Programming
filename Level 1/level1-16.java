
//16

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int noofstudents;
	    int combination;
	    
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter no of students : ");
	    noofstudents = input.nextInt();
	    
	    combination =  (noofstudents * (noofstudents - 1)) / 2;
	   
	    

		System.out.println(combination);
	}
}