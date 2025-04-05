//4
/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes 
to do the following.  Please define static methods for all the UnitConvertor class methods
 */

import java.util.Scanner;
class UnitConverter {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;

        return miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;        
        double meters = feet * feet2meters;
        return meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        double miles = UnitConverter.convertKmToMiles(km); 

        System.out.println("Distance in miles: " + miles);

        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        miles = UnitConverter.convertKmToMiles(km);
        System.out.println("Distance in miles: " + miles);

        input.close();
    }
}

