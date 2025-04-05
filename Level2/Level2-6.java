//6
//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons
// in the team. For this create a program to find the BMI and display the height, weight,
// BMI and status of each individual

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int people;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of persons :  ");
        people = input.nextInt();

        double[] weight = new double[people];
        double[] height = new double[people];
        double[] bmi = new double[people];
        String[] status = new String[people];

        for(int i=0; i<people; i++){
            System.out.print("Enter weight of person " + (i+1) + " : ");
            weight[i] = input.nextDouble();
            System.out.print("Enter height of person " + (i+1) + " : ");
            height[i] = input.nextDouble();
            height[i] *= 0.01;
        }
        //coverting height into m
        for(int i=0; i<people; i++){
            bmi[i] = weight[i]/(height[i]*height[i]);
            System.out.print(bmi[i]+ "\n");
            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for(int j=0; j<people; j++){
            System.out.print("BMI report of person " + (j+1) + " : \n");
            System.out.print("Height : " + height[j] + " \n");
            System.out.print("Weight : " + weight[j] + " \n");
            System.out.print("BMI : " + bmi[j] + " \n");
            System.out.print("Weight Status : " + status[j] + " \n");
        }
        input.close();
    }
}

