import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a series of numbers:");
        double smallest = in.nextDouble();
        while (in.hasNextDouble()) {
            double input = in.nextDouble();
            if (input < smallest) {
                smallest = input;
            }
        }
        System.out.println("The number is " + smallest);
    }
}

