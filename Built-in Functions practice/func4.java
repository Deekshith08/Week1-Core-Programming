//4
/*0
1
1
2
3
5
8
 */

import java.util.Scanner;
class FibonacciGenerator{
    public static void generate(int n){
        int s1=0;
        int s2=1;
        while(n>0){
            System.out.print(s1 + "");
            int s3 = s1+s2;
            s1 = s2;
            s2 = s3;
            n--;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        generate(n);
        input.close();

    }
}
