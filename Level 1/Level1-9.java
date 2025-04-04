import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double fee;
	    Scanner input = new Scanner(System.in);
	    System.out.println(" enter your fees");
	    fee = input.nextInt();
	    double discount = fee/10;
	    System.out.println(" your fees is " + fee +"your discount is " + discount);
	}
}