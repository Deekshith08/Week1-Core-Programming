//8
/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based 
on their ages and tallest among the friends based on their heights and display it
 */

import java.util.Scanner;
class YoungAndTall{
    public static int CheckYoung(int[] ages){
        int index = 0;
        int youngest = ages[0];
        for(int i=0; i<3; i++){
            if(ages[i]<youngest) {
                youngest = ages[i];
                index=i;
            }
        }
        return index;
    }
    public static int CheckTall(int[] heights){
        int index = 0;
        int tallest = heights[0];
        for(int i=0; i<3; i++){
            if(heights[i]>tallest) {
                tallest = heights[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.print("Enter age of " + names[i] + " : ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " : ");
            heights[i] = input.nextInt();
        }
        int youngIndex = CheckYoung(ages);
        int tallIndex = CheckTall(heights);
        System.out.println("\nThe youngest friend is: " + names[youngIndex]);
        System.out.println("The tallest friend is: " + names[tallIndex]);

        input.close();
        }
}