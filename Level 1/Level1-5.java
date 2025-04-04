
//5
//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

class Main {
    public static void main(String[] args) {
       int totalPens = 14;
       int students = 3;
       int pen_for_each = totalPens/students;
       int remaining_pens = totalPens%students;
        System.out.println("The Pen Per Student is " + pen_for_each + " and the remaining pen not distributed is " + remaining_pens
);
    }
}