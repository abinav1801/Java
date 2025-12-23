import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Two Number:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.print("Num1 is greater");
        }
        else if(num2 > num1)
        {
            System.out.print("Num2 is greater");
        }
        else
        {
            System.out.print("Num1 and Num2 is equal");
        }

        input.close();
    }
}
