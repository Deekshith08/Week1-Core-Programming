//1

import java.util.Scanner;
import java.lang.Math;
class NumberGuessGame{
    public static void checker(int user, int comp){
        Scanner input = new Scanner(System.in);
        while(true){
            if(user==comp) {
                System.out.println("You guessed the correct number");
                break;
                }
            else if(user>comp){
                System.out.println("Go Low");
                System.out.print("Guess the number : ");
                user = input.nextInt();
            }
            
            else if(user<comp){
                System.out.println("Go High");
                System.out.print("Guess the number : ");
                user = input.nextInt();
            }
        }
        input.close();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number : ");
        int user = input.nextInt();
        int comp = (int)(Math.random()*100) + 1;
        checker(user, comp);
        input.close();
    }
}