//8
/*Write a Java program to compare two strings lexicographically (dictionary order)
without using built-in compare methods. 
 */

import java.util.Scanner;
class StringCompare{
    public static void compare(String str1, String str2){
        int len = Math.min(str1.length(),str2.length());
        for(int i=0;i<len;i++){
            int a = (int)str1.charAt(i);
            int b = (int)str2.charAt(i);
            if(a > b){
                System.out.println(str1 + " comes after " + str2 + " in lexicographical order ");
                break;
            }
            else if(a<b){
                System.out.println(str2 + " comes after " + str1 + " in lexicographical order ");
                break;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = input.next();
        System.out.print("Enter second String : ");
        String str2 = input.next();
        compare(str1, str2);
        input.close();
    }
}