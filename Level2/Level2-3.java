//3
//Write a program that takes a year as input and outputs the Year is a Leap Year or not 

import java.util.Scanner;
class Leapyear{
    public int checkleap(int year){
        if(year%4==0 && year%100!=0) return 1;
        else if(year%400 == 0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a valid year : ");
        year = input.nextInt();
        if(year<1582){
            System.err.println("Entered year is not valid");
            System.exit(0);
        }
        Leapyear obj = new Leapyear();
        int res = obj.checkleap(year);
        if(res == 1) System.out.println("Entered year is a leap year");
        else System.out.println("Entered year is a not a leap year");
        input.close();
    }
}
