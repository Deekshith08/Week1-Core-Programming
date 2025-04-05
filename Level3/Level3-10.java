//10
/*Write a program to find the 3 points that are collinear using the slope formulae and area of triangle 
formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
 */

import java.util.Scanner;
class AreaAndCollinear{
    public static boolean collinear(double x1,double y1,double x2,double y2,double x3,double y3){
        double ab = (y2 - y1)/(x2 - x1);
        double bc = (y3 - y2)/(x3 - x3);
        double ac =  (y3 - y1)/(x3 - x1);
        if(ab == bc && bc == ac) return true;
        else return false;

    }
    public static double AreaofTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area;
    } 
    public static void main(String[] args) {
        double x1,y1,x2,y2,x3,y3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 : ");
        x1 = input.nextDouble();
        System.out.print("Enter y1 : ");
        y1 = input.nextDouble();
        System.out.print("Enter x2 : ");
        x2 = input.nextDouble();
        System.out.print("Enter y2 : ");
        y2 = input.nextDouble();
        System.out.print("Enter x3 : ");
        x3 = input.nextDouble();
        System.out.print("Enter y3 : ");
        y3 = input.nextDouble();

        boolean collinear = AreaAndCollinear.collinear(x1, y1, x2, y2, x3, y3);
        if(collinear == true) System.out.println("Given points are collineaer");
        else System.out.println("Given points are not collineaer");
        double area = AreaAndCollinear.AreaofTriangle(x1, y1, x2, y2, x3, y3);
        System.out.println("Area of triangle : "  + area);

        input.close();
    }
}
