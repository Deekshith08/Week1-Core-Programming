//11
//Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):


import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        
        int m,d,y;
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter date : ");
        d = input.nextInt();

        System.out.print("Enter number in month : ");
        m = input.nextInt();
		
		System.out.print("Enter year : ");
        y = input.nextInt();
		
		double y0 = y-(14-m)/12;
		double x = y0+y0/4-y0/100+y0/400;
		double m0 = m+12*((14-m)/12)-2;
		double d0 = (d+x+31*m0/12)%7;
		
		
		switch((int)d0){
			case 0:
			System.out.print("Its Sunday");
			break;
			case 1:
			System.out.print("Its Monday");
			break;
			case 2:
			System.out.print("Its Tuesday");
			break;
			case 3:
			System.out.print("Its Wednesday");
			break;
			case 4:
			System.out.print("Its Thursday");
			break;
			case 5:
			System.out.print("Its Friday");
			break;
			case 6:
			System.out.print("Its Saturday");
			break;
			default:
			System.out.print("Invalid");
		}
	}
}
		
		