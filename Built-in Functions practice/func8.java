//8

import java.util.Scanner;

class TemperatureConverter{
    public static double CtoF(double temp){
        return (temp*(9.0/5.0))+32;
        }
    public static double FtoC(double temp){
        return (temp-32)*(5.0/9.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        double temp = input.nextDouble();
        System.out.println("To convert to celsius enter 'c' and 'f' for fahrenheit");
        char in = input.next().charAt(0);

        if(in=='c'){
            double res = FtoC(temp);
            System.out.println("Temperature in celsius : " + res);
        }
        else{
            double res = CtoF(temp);
            System.out.println("Temperature in Fahrenheit : " + res); 
        }
        input.close();
        
    }
}