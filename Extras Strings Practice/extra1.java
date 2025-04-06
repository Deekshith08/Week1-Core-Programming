//1
/*Write a Java program to count the number of vowels and consonants in a given string.*/

import java.util.Scanner;
class VowelsAndConsonants{
    public static void count(String str){
        int vows=0, cons=0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            String s = Character.toString(ch);
            if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") ||
            s.equalsIgnoreCase("i") ||s.equalsIgnoreCase("o")|| 
            s.equalsIgnoreCase("u")){
                vows++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels - " + vows);
        System.out.println("Consonants - " + cons);
    }
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        count(str);
        input.close();
    }
}