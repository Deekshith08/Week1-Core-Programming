//5
/* Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in
the string
*/

import java.util.Scanner;
class VowelsAndConsonants{
    public static int[] countvowAndcons(String str){
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
        int vow=0,con=0,letter=0;
        for(int i=0; i<newstr.length();i++){
            char c = newstr.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vow++;
            }
            else if(Character.isDigit(c)){
                letter++;
            }
            else con++;
        }
        int[] result = {vow,con,letter};
        return result;
    }
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        int[] result = VowelsAndConsonants.countvowAndcons(str);
        System.out.println("vowels - " + result[0]);
        System.out.println("consonants - " + result[1]);
        System.out.println("not a letter - " + result[2]);

        input.close();

    }
}