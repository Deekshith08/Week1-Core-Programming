//2
/*Write a Java program to reverse a given string without using any built-in reverse 
functions.  */

import java.util.Scanner;
class StringReverse{
    public static void isReverse(String text){
        String rev = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            rev = ch+rev;
        }
        System.out.println("Reverse of the given String : "+ rev);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = input.next();
        isReverse(text);

        input.close();
    }
}