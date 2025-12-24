package Functions;

import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = input.nextInt();

        boolean result = PaliCheck(num);

        if(result == true)
        {
            System.out.print("It is a Palindrome");
        }
        else{
            System.out.print("It is not a Palindrome.");
        }

        input.close();
    }

    static boolean PaliCheck(int num)
    {
        int dup = num;
        int result = 0;
        while(dup != 0)
        {
            int rem = dup % 10;
            result = result * 10 + rem;
            dup /= 10;
        }

        return num == result;
    }
}
