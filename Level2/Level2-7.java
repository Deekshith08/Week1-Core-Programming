//7
//Rewrite the above program using multi-dimensional array to store height, weight, and 
//BMI in 2D array for all the persons


import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int people;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of persons :  ");
        people = input.nextInt();

        //double[] weight = new double[people];
        //double[] height = new double[people];
        //double[] bmi = new double[people];
        double[][] data = new double[people][3];
        String[] status = new String[people];

        for(int i=0; i<people; i++){
            System.out.print("Enter weight of person " + (i+1) + " : ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height of person " + (i+1) + " : ");
            data[i][1] = input.nextDouble();
            data[i][1] *= 0.01;
        }
        //coverting height into m
        for(int i=0; i<people; i++){
            data[i][2] = data[i][0]/(data[i][1]*data[i][1]);
            System.out.print(data[i][2]+ "\n");
            // Determine weight status
            if (data[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                status[i] = "Normal weight";
            } else if (data[i][2] >= 25 && data[i][2] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for(int j=0; j<people; j++){
            System.out.print("BMI report of person " + (j+1) + " : \n");
            System.out.print("Height : " + data[j][1] + " \n");
            System.out.print("Weight : " + data[j][0] + " \n");
            System.out.print("BMI : " + data[j][2] + " \n");
            System.out.print("Weight Status : " + status[j] + " \n");
        }
        input.close();
    }
}
