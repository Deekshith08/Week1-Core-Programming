//5
//Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.



import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		if(age>=18){
			System.out.print("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.print("The person's age is " + age + " and cannot vote.");
		}

	}
}