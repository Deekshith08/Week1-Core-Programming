//6
/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to
do the following.  Please define static methods for all the UnitConvertor class methods.
 */

import java.util.Scanner;
class UnitConvert {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double celsius = (farhenheit - 32) * 5 / 9;
        return celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        double farhenheit = (celsius * 9 / 5) + 32;;
        return farhenheit;
    }
    public static double Pounds2Kilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        double kgs = pounds * pounds2kilograms;
        return kgs;
    }
    public static double KilogramsToPounds(double kgs) {
        double kilograms2pounds = 2.20462;
        double pounds = kgs * kilograms2pounds;
        return pounds;
    }
    public static double GallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;
        return liters;
    }
    public static double LitersToGallons(double liters) {
        double liters2gallons = 0.264172; 
        double gallons = liters * liters2gallons;
        return gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temp in farhenheit: ");
        double farhenheit = input.nextDouble();

        double celsius = UnitConvert.convertFarhenheitToCelsius(farhenheit); 
        System.out.println("Temp in celsius : " + celsius);

        System.out.print("Enter the quantity in pounds : ");
        double pounds = input.nextDouble();
        double kgs = UnitConvert.Pounds2Kilograms(pounds);
        System.out.println("Quantity in kgs : " + kgs);

        input.close();
    }
}

