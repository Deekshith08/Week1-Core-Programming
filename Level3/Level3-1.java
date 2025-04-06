//1
/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10
members. For this create a program to find the BMI and display the height, weight, BMI and status of each
individual
 */

import java.util.Scanner;
class BodyMassIndex {

    public static double[][] calculateBMI(double[][] arr){
        for(int i=0; i<arr.length; i++){
            double weight = arr[i][0], height = arr[i][1];
            arr[i][2] =  weight/(height*height);
        }
        return arr;
    } 
    public static String[]  statusBMI(double[][] arr){
        String[] status = new String[arr.length];
        for(int i=0; i<status.length; i++){
            double bmi = arr[i][2];
            if(bmi<=18.4) status[i] =  "Underweight";
            else if(bmi>=18.5 && bmi<=24.9) status[i] = "Normal";
            else if(bmi>=25 && bmi<=39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }
    public static void TableFormat(double[][] arr, String[] status){
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Weight","Height","BMI","BMI Status");
        System.out.println("-------------------------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%-15.1f %-15.2f %-15f %-15s\n", arr[i][0],arr[i][1],arr[i][2],status[i]);
        }
    }
    public static void main(String[] args) {
        int rows =3,columns =3;
        double[][] arr = new double[rows][columns];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<rows; i++){
            System.out.print("Enter the weight in kgs for person " + (i+1) + " : ");
            arr[i][0] = input.nextDouble();
            System.out.print("Enter the height in cm for person " + (i+1) + " : ");
            arr[i][1] = input.nextDouble();
            arr[i][1] *= 0.01;//converting height cm to m
        }
        double[][] resArr = BodyMassIndex.calculateBMI(arr);
        String[] statusBMI = BodyMassIndex.statusBMI(resArr);
        
        TableFormat(resArr, statusBMI);
        input.close();
    }
}