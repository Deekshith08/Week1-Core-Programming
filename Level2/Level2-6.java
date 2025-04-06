//6
/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or
Not a Letter */

import java.util.Scanner;
class VowelsAndConsonants2D{
    public static String[][] countvowAndcons(String str){
        String newstr = "";
        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>'A' && ch<'Z'){
                ch = (char)(ch+32);
                newstr = newstr + ch;
            }
            else{
                newstr+=ch;
            }
        }
        
        String[][] result = new String[newstr.length()][2];
        for(int i=0; i<newstr.length();i++){
            char c = newstr.charAt(i);
            result[i][0] = Character.toString(c);
                        
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                result[i][1] = "vowel";
            }
            else if(Character.isDigit(c)){
                result[i][1] = "Not a Letter";
            }
            else result[i][1] = "Consonant";
        }
        
        return result;
    }
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        String[][] result = VowelsAndConsonants2D.countvowAndcons(str);
        for(int i=0;i<result.length; i++){
            
            System.out.println(result[i][0] + " - " + result[i][1]);
        }
        input.close();
    }
}
