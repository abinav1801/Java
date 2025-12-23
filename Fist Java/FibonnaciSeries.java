import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Times you want fibo series: ");
        int n = input.nextInt();
        int prev = 0;
        int curr = 1;

        System.out.print("The Fibo Series : " + prev + " " + curr);
        int next = 0;

        for(int i = 2 ; i < n ; i++)
        {
            next = prev + curr;
            prev = curr;
            curr = next;
            System.out.print(" " + next);
        }
        input.close();
    }
}
