//1
/*Create a program to find the shortest, tallest, and mean height of players present in a 
football team.
 */

import java.lang.Math;
class FindAll{
    public static int heightSum(int[] heights){
        int sum = 0;
        for(int i=0; i<heights.length; i++){
            sum += heights[i];
        }
        return sum;
    }
    public static double heightMean(int sum, int[] heights){
        
        return sum/heights.length;
    }
    public static int shortest(int[] heights){
        int min = heights[0];
        for(int i=0; i<heights.length; i++){
            if(heights[i]<min) min =heights[i];
        }
        return min;
    }
    public static int tallest(int[] heights){
        int max = heights[0];
        for(int i=0; i<heights.length; i++){
            if(heights[i]>max) max =heights[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i=0; i<heights.length; i++){
            int a = (int)(Math.random()*250 + 150);
            heights[i] = a;
        } 

        int sum = FindAll.heightSum(heights);
        double mean = FindAll.heightMean(sum, heights);
        int shortest = FindAll.shortest(heights);
        int tallest = FindAll.tallest(heights);
        System.out.println("The heights of players are : ");
        for(int i=0; i<heights.length; i++){
            System.out.println(heights[i]);

        }
        System.out.println("The sum of all heights is : " + sum);
        System.out.println("The mean of all heights is : " + mean);
        System.out.println("The shortest is : " + shortest);
        System.out.println("The tallest is : " + tallest);
    }
}
