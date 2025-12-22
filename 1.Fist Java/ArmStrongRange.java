import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Starting Range : ");
        int start = input.nextInt();

        System.out.print("Enter the Ending Range : ");
        int end = input.nextInt();

        System.out.print("The Armstrong Numbers are : ");
        for (int first = start ; first <= end ; first++)
        {
            
            int dup = first;
            int sum = 0;
            while(dup != 0)
            {
                int rem = dup % 10;
                sum = sum + (rem * rem * rem);
                dup = dup / 10;
            }
            if(sum == first)
            {
                System.out.print(first + " ");
            }
        }

        input.close();
    }
}
