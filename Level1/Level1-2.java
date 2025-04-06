//2
/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in 
method substring() to find the substring of the text. Finally Compare the the two strings and display the 
results
 */

import java.util.Scanner;
class subStrings{
    public static String subString1(String str, int start, int end){
        StringBuilder sub = new StringBuilder();
        for(int i=start; i<end; i++){
            sub.append(str.charAt(i));
        }
        String substr1 = sub.toString();
        return substr1;
    }
    public static boolean compareMethod(String str, String substr){
        if(str.length()!=substr.length()) return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != substr.charAt(i)) return false;
        }
        return true;
    }
    public static String subString2(String str,int start,int end){
        String sub = str.substring(start,end);
        return sub;
    }
    public static void main(String[] args){
        String str;
        int start,end;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = input.next();

        System.out.print("Enter starting index for a substring : ");
        start = input.nextInt();
        System.out.print("Enter ending index for a substring : ");
        end = input.nextInt();
        input.close();

        String substr1 = subStrings.subString1(str, start, end);
        System.out.print("Sub string using charAt method : ");
        System.out.println(substr1);

        boolean res1 = subStrings.compareMethod(str, substr1);
        if(res1) System.out.println("Both are same");
        else System.out.println("Both are not same");

        String substr2 = subStrings.subString2(str, start, end);
        System.out.print("Sub string using builtin substring method : ");
        System.out.println(substr2);

        boolean res2 = subStrings.compareMethod(str, substr1);
        if(res2) System.out.println("Both are same");
        else System.out.println("Both are not same");
    }
}