//5
//Write a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;
class StringIndexOutOfBounds{
    public static void generateException(String str){
        System.out.println(str.charAt(19));
    }
    public static void handleException(String str){
        try{
            System.out.println(str.charAt(19));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringINdexOutOfBounds exception : " + e.getMessage());
        }
    }

    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = input.nextLine();
        //generateException(str);
        handleException(str);
        input.close();
    }
}

