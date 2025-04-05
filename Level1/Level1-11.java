//1
//Write a program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;
import java.lang.Math;
class calculateWindChill{
    public double calculatewindChill(double temp, double speed){
        double windChill = 35.74 + 0.6215 *temp+ (0.4275*temp - 35.75) * Math.pow(speed,0.16);
        return windChill;
    }
    public static void main(String[] args) {
        int temperature,windSpeed;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        temperature = input.nextInt();

        System.out.print("Enter windspeed : ");
        windSpeed = input.nextInt();
        calculateWindChill obj = new calculateWindChill();

        double res = obj.calculatewindChill(temperature, windSpeed);
        System.out.println("The windchill temperature is : " + res);
        input.close();
    }
}

