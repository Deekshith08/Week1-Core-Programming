//12
/*Write a program that generates five 4 digit random values and then finds their average
value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
 */

//import java.util.Scanner;
class RandomValues{
    public int[] generate4DigitRandomArray(int size){
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr [i] = (int)(Math.random()*9000+1000);
        }
        return arr;
    }
    public double[] findAverageMinMax(int[] numbers){
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        double avg = sum/numbers.length;
        double min =numbers[0], max =numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        double[] arr = {avg,min,max};
        return arr;
    }
    public static void main(String[] args) {
        int size = 5;

        RandomValues obj = new RandomValues();
        int[] numbers = obj.generate4DigitRandomArray(size);
        double[] res = obj.findAverageMinMax(numbers);
        System.out.println("The random generated numbers are :  ");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("The average is : " + res[0]);
        System.out.println("The minimum number is : " + res[1]);
        System.out.println("The maximum number is : " + res[2]);
    }
}
