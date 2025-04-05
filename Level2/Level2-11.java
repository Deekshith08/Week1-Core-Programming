//11
/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math 
functions Math.pow() and Math.sqrt()
 */

import java.util.Scanner;
import java.lang.Math;

class Quadratic {
    public static double[] roots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0];  
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[]{root};  
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};  
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        System.out.print("Enter value of c: ");
        c = input.nextInt();

        double[] roots = Quadratic.roots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is " + roots[0]);
        } else {
            System.out.println("The roots are " + roots[0] + " and " + roots[1]);
        }
        input.close();
    }
}