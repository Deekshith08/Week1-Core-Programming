//5
/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to 
do the following.  Please define static methods for all the UnitConvertor class methods 
 */

import java.util.Scanner;
class UnitConverters {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }
    public static double convertMilesToKm(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters;
    }
    public static double convertInchesTocm(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        return cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in yards: ");
        double yards = input.nextDouble();

        double feet = UnitConverters.convertYardsToFeet(yards); 
        System.out.println("Distance in feet: " + feet);

        System.out.print("Enter the distance in inches: ");
        double inches = input.nextDouble();
        double cm = UnitConverters.convertInchesTocm(inches);
        System.out.println("Distance in cm: " + cm);

        input.close();
    }
}

