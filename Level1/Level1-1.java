//1
/*Write a program to compare two strings using the charAt() method and check the result 
with the built-in String equals() method
 */

import java.util.Scanner;
class compareStrings{
    public static boolean compareMethod(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1!=len2) return false;
        for(int i=0; i<len1; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean builtinMethod(String str1, String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter first string : ");
        str1 = input.next();
        System.out.print("Enter second string : ");
        str2 = input.next();

        boolean compare = compareStrings.compareMethod(str1, str2);
        if(compare==true) System.out.println("By comparing both are same");
        else  System.out.println("By comparing both are not same");
    
        boolean builtin = compareStrings.builtinMethod(str1, str2);
        if(builtin==true) System.out.println("By builtin method both are same");
        else  System.out.println("By builtin method both are not same");
        input.close();
    }
}