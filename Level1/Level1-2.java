//2
//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;
class Main{

    public double simpleIntrest(int principal,int rate,int time){
        double intrest = principal * rate * time / 100;
        return intrest;
    }
    public static void main(String[] args) {
        int principal,rate,time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        principal = input.nextInt();

        System.out.print("Enter rate : ");
        rate = input.nextInt();

        System.out.print("Enter time in years : ");
        time = input.nextInt();

        Main obj = new Main();
        
        double intrest = obj.simpleIntrest(principal, rate, time);
        System.out.println( "The Simple Interest is " + intrest + " for Principal " + principal + ", Rate of Interest " +  rate  + " and Time " + time );
        input.close();
    }
}