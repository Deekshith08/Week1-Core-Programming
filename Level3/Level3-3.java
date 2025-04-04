//3
//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 


import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int maths,physics,chemistry;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter marks in maths : ");
		maths = input.nextInt();
        System.out.print("Enter marks in physics : ");
		physics = input.nextInt();	
        System.out.print("Enter marks in chemistry : ");
		chemistry = input.nextInt();
		
		float sum = maths + physics + chemistry;
		float total = 300;
		float percentage = sum/total*100;
		
		System.out.print("The percentage is " + percentage + "\n");
		
		if (percentage>=80){
			System.out.print("Grade A\n" + " Level 4, above agency-normalized standards");
		}
		else if (percentage>=70 && percentage<=79){
			System.out.print("Grade B\n" + " Level 3, at agency-normalized standards");
		}
		else if (percentage>=60 && percentage<=69){
			System.out.print("Grade C\n" + " Level 2,below,but approaching agency-normalized standards");
		}
		else if (percentage>=50 && percentage<=59){
			System.out.print("Grade D\n" + " Level 1, well below agency-normalized standards");
		}
		else if (percentage>=40 && percentage<=49){
			System.out.print("Grade E\n" + " Level 1-, too below agency-normalized standards");
		}
		else{
			System.out.print("Remedial Standards");
		}
		
			
	}
}