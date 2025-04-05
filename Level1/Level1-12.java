//12
/*Write a program to calculate various trigonometric functions using Math class given an
angle in degrees*/

import java.lang.Math;
import java.util.Scanner;

class mathClass{
    public double[] calculateTrigonometricFunctions(double angle)
    {
        double[] values = new double[4];
        values[0] = (Math.PI/180)*angle;
        values[1] = Math.sin(values[0]);
        values[2] = Math.cos(values[1]);
        values[3] = Math.tan(values[2]);
        return values;
    }
    public static void main(String[] args) {
        double angleDeg;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees : ");
        angleDeg = input.nextDouble();

        mathClass obj = new mathClass();
        double[] result = obj.calculateTrigonometricFunctions(angleDeg);
        System.out.println("The angle in radians : " + result[0]);
        System.out.println("The sine angle : " + result[1]);
        System.out.println("The cos angle : " + result[2]);
        System.out.println("The tan angle : " + result[3]);
        input.close();
    }
}

