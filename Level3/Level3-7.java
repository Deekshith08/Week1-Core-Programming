//7
/* Write a program to generate a six-digit OTP number using 
Math.random() method. Validate the numbers are unique by 
generating the OTP number 10 times and ensuring all the 10 OTPs 
are not the same
 */

import java.lang.Math;
class OTP{
    public static int[] generateOTP(int size){
        int[] otpArr = new int[10];
        for(int i=0; i<otpArr.length; i++){
            otpArr[i] = (int)(Math.random()*900000 + 100000);
        }
        return otpArr;
    }
    public static boolean uniqueCheck(int[] otpArr){
        for(int i=0; i<otpArr.length; i++){
            for(int j=0; j<otpArr.length; j++){
                if(i!=j && otpArr[i]==otpArr[j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int size =10;
        int[] otpArr = OTP.generateOTP(size);
        System.out.println("The generated OTP's are : ");
        for(int i=0; i<otpArr.length; i++){
            System.out.println(otpArr[i]);
        }
        boolean res = OTP.uniqueCheck(otpArr);
        if (res==true) System.out.println("OTP's are unique");
        else System.out.println("OTP's are not unique");
    }
}