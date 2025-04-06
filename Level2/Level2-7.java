//7
/* Write a program to trim the leading and trailing spaces from a string using the charAt() method 
*/

import java.util.Scanner;
class TrimSpaces{
    public static int[] trimmingSpaces(String str){
        int start=0,end=0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c!=' ') {
                start = i;
                break;
            }
        }
        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            if(c!=' ') {
                end = i+1;
                break;
            }
        }
        int[] result = {start,end};
        return result;
    }
    public static String SubStrings(String str, int start, int end){
        return str.substring(start,end);
    }
    public static boolean comparision(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        for(int i=0; i<str1.length(); i++){
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if(a!=b) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        str =  input.nextLine();
        int[] indices = TrimSpaces.trimmingSpaces(str);
        String str1 = TrimSpaces.SubStrings(str, indices[0], indices[1]);
        System.out.println("String entered : " + str);
        System.out.println("String trimmed : " + str1);
        boolean compare = TrimSpaces.comparision(str.trim(), str1);
        if(compare) System.out.println("Both results using trim method and user defined are same");
        else System.out.println("Both results using trim method and user defined are not same");
        
        input.close();
    }
}