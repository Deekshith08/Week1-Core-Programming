//7
//Write a program to demonstrate NumberFormatException

import java.util.Scanner;
class NUmberFormat{
    public static void generateException(String str){
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
    public static void handleException(String str){
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format exception : " + e.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        //generateException(str);
        handleException(str);
        input.close();
    }
}
