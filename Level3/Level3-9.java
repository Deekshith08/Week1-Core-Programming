//9
/*Write a program Euclidean distance between two points as well as the equation of the 
line using those two points. Use Math functions Math.pow() and Math.sqrt()
 */

import java.util.Scanner;
import java.lang.Math;
class EuclideanDistance{
    public static double calculateDistance(double x1,double y1,double x2,double y2){
        double distance = Math.sqrt((x2-x1)*(x2-x1)) + Math.sqrt((y2-y1)*(y2-y1));
        return distance;
    }
    public static double[] EquationofLine(double x1, double y1, double x2, double y2){
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m * x1;
        double[] mb = {m,b};
        return mb;
    } 
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 : ");
        x1 = input.nextDouble();
        System.out.print("Enter y1 : ");
        y1 = input.nextDouble();
        System.out.print("Enter x2 : ");
        x2 = input.nextDouble();
        System.out.print("Enter y2 : ");
        y2 = input.nextDouble();

        double distance = EuclideanDistance.calculateDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance is : " + distance);
        double[] mb = EuclideanDistance.EquationofLine(x1, y1, x2, y2);
        System.out.println("Equation of Line is y = " + mb[0] +" * x "+ mb[1] );

        input.close();
    }
}
