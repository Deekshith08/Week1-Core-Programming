//5
//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
class numberCheck{
    public int check(int number){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = input.nextInt();
        numberCheck obj = new numberCheck();

        int res = obj.check(number);
        if(res==1){ System.out.print("Enter number is positive");}
        else if(res==-1) {System.out.print("Enter number is negative");}
        else {System.out.print("Enter number is zero");}

        input.close();
    }
}
