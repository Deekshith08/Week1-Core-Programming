//7
/*Write a Java program to toggle the case of each character in a given string. Convert 
uppercase letters to lowercase and vice versa. 
 */

import java.util.Scanner;
class ToggleCase{
    public static void CaseConvert(String str){
        char[] s = str.toCharArray();
        for(int i=0; i<s.length; i++){
            if(Character.isUpperCase(s[i])){
                s[i] = Character.toLowerCase(s[i]);                
            }
            else if(Character.isLowerCase(s[i])){
                s[i] = Character.toUpperCase(s[i]);                
            }
        }
        s.toString();
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        CaseConvert(str);
        input.close();

    }
}