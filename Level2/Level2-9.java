//9
//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.Scanner;
public class n{
	public static void main(String[] args){
		int perimeter;
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter side a : ");
		a = in.nextInt();
		System.out.print("Enter side b : ");
		b = in.nextInt();
		System.out.print("Enter side c : ");
		c = in.nextInt();
		
		perimeter = a+b+c;
		 
		int x=5000;
		double rounds=5000/perimeter;
		
		System.out.print("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
	}
}
		