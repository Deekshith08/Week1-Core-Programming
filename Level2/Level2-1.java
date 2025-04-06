//1
/*Write a program to find and return the length of a string without using the length() 
method */

import java.util.Scanner;
class ReturnLength{
    public static int noBuiltin(String str){
        int len=0;
        try{
            while(true){
                str.charAt(len);
                len++;
            }
        }
        catch(RuntimeException e){
            return len;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.next();
        int len1 = str.length();
        int len2 = ReturnLength.noBuiltin(str);
        System.out.println(len1);
        System.out.println(len2);

        input.close();
    }
}