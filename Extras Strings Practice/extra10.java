//10
/*Write a Java program to remove all occurrences of a specific character from a string.  */

import java.util.Scanner;
class RemoveOccurance{
    public static void removechar(String str,char ch){
        String s = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                s = s + str.charAt(i);
            }
        }
        System.out.println("Modified String : " + s);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.next();
        System.out.print("Enter the character to remove : ");
        char ch = input.next().charAt(0);
        removechar(str,ch);
        input.close();
    }
}