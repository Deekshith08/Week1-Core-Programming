//2
//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] height = new int[3];
        int[] age = new int[3];

        String[] names = {"Amar", "Akbar", "Anthony"};
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.print("Enter height of " + names[i] + " : ");
            height[i] = input.nextInt();
            System.out.print("Enter age of " + names[i] + " : ");
            age[i] = input.nextInt();
        }

        int tallest = height[0];
        int youngest = age[0];
        String tall = names[0];
        String young = names[0];
        for(int i=0; i<3; i++){
            if (height[i]>tallest){
                tallest = height[i];
                tall = names[i];
            }
            if (age[i]<youngest){
                youngest = age[i];
                young = names[i];
            }
        }

        System.out.print("The youngest among three friends is : " + young);
        System.out.print("The tallest among three friends is : " + tall);
        input.close();
    }
}
