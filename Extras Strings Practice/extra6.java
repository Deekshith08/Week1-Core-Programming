//6
/*Write a Java program to count how many times a given substring occurs in a string.  */

import java.util.Scanner;
class SubstringOccurance{
    public static void countSubstring(String text, String substr){
        int count = 0;
        int len = substr.length();
        for(int i=0; i<=text.length()-len; i++){
            if(text.substring(i,i+len).equals(substr)){
                count++;
            }
        }
        System.out.println("Occurances : " + count);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = input.nextLine();
        System.out.print("Enter a Sub String : ");
        String substr = input.nextLine();
        countSubstring(text, substr);

        input.close();
    }
}