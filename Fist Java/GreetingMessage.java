import java.util.Scanner;
public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your name : ");
        String name = input.next();

        System.out.print("Hello " + name + ", Welcome!");

        input.close();
    }
}
