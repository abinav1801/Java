package Condtionalsloops;
import java.util.Scanner;
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int pro = 1;
        int sub = 0;
        int add = 0;

        while(num!=0)
        {
            int rem = num % 10;
            pro = pro * rem;
            add += rem;
            num /= 10;
        }

        sub= pro - add;

        System.out.print("Answer for Subtract Product and Sum of given number is : " + sub);

        input.close();
    }
}
