//2
//Create a program to find the bonuses of employees based on their years of service.


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int salary,yearsOfService;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter salary: ");
		salary = input.nextInt();
		
		System.out.print("Enter no of years of service: ");
		yearsOfService = input.nextInt();
		if(yearsOfService>5){
			double bonus_amount = (5.0/100.0)*(double)salary;
			System.out.print("Bonus amount is : " + bonus_amount);
		}
		else{
			System.out.print("No bonus since less service years");
		}
	}
}