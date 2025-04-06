//10
/* Write a program to convert the complete text to lowercase and compare the results
*/

import java.util.Scanner;
class ConvertLowerCase{
    public static String lowerconvert(String str){
        StringBuilder resultString = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>='A' && c<='Z'){
                c = (char)(c+32);
            }
            resultString.append(c);
        }
        return resultString.toString();
    }
    public static boolean compare(String str1, String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();

        String str1 = ConvertLowerCase.lowerconvert(str);
        boolean res = ConvertLowerCase.compare(str, str1);
        
        if(res) System.out.println("Both are same");
        else System.out.println("Both are same");

        input.close();
    }
}
