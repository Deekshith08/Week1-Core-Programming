//8
/* Write a program to demonstrate ArrayIndexOutOfBoundsException*/

import java.util.Scanner;
class ArrayIndexOutOfBounds{
    public static void generateException(String[] names){
        System.out.println(names[10]);
    }
    public static void handleException(String[] names){
        try{
            System.out.println(names[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds exception : " + e.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];

        // Taking input for names
        System.out.println("Enter three names:");
        for (int i = 0; i < 3; i++) {
            names[i] = input.nextLine();
        }

        //generateException(names);
        handleException(names);
        input.close();
    }
}