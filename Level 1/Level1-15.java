
//15
//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float unitprice;
	    float quantity,totalprice;
	    
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the unit price : ");
	    unitprice = input.nextFloat();
	    System.out.print("Enter the quantity : ");
	    quantity = input.nextFloat();
	    
	    totalprice = unitprice*quantity;
	    
		System.out.println("The total purchase price is INR " + totalprice + " if the quantity " + quantity + " and unit price is INR " + unitprice);

	}
}