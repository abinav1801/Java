import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        float p = input.nextFloat();

        System.out.print("Enter the Time : ");
        float t = input.nextFloat();

        System.out.print("Enter the rate : ");
        float r = input.nextFloat();

        float si;

        si = (p*r*t)/100;

        System.out.print("The Simple Intrest is " + si);

        input.close();
    }
}
