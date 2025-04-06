//3
/*Write a Java program to check if a given string is a palindrome (a string that reads
the same forward and backward). 
*/

import java.util.Scanner;
class Palindrome{
    public static void isPalindrome(String text){
        String rev = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            rev = ch+rev;
        }
        if(text.equals(rev)) System.out.println("Its a Palindrome ");
        else System.out.println("Its not a Palindrome ");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = input.next();
        isPalindrome(text);

        input.close();
    }
}