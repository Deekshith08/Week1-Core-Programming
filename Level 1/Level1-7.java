
//7
//Write a Program to compute the volume of Earth in km^3 and miles^3

import java.lang.Math.*;
class Main {
    public static void main(String[] args) {
        double radiusinkm = 6378;
        double radiusinmiles = radiusinkm/1.6;
        double volume_in_km = (4.0/3.0) * Math.PI * Math.pow(radiusinkm,3);
        double volume_in_miles = (4.0/3.0) * Math.PI * Math.pow(radiusinmiles,3);
        
        
        System.out.println("The volume of earth in cubic kilometers is " + volume_in_km + " and cubic miles is " +  volume_in_miles
 );
    }
}