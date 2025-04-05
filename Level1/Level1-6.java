//6
//Create a program to find the mean height of players present in a football team.

import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int height;
        double[] team = new double[11];

        Scanner input = new Scanner(System.in);
        double sum=0;
        for(int i=0; i<(team.length); i++){
            System.out.print("Enter height of player " + (i+1) + " : ");
            height = input.nextInt();
            team[i] = height;
            sum += team[i];
        }

        double mean = sum/(team.length);
        System.out.print("The mean of the heights is : " + mean);
        input.close();
    }
}
