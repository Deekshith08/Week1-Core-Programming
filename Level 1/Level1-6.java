
//6
//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

class Main {
    public static void main(String[] args) {
        int fee = 125000;
        int discount_percent = 10;
        float discount = (float)fee*((float)discount_percent/100);
        int discounted_fee = fee-(int)discount;
       
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " +  discounted_fee);
    }
}