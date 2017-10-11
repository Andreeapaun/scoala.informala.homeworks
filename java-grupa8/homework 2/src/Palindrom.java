import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        //Program to check Palindrom number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = scanner.nextInt();
        int rev = 0, rem = 0, num1 = 0;
        num1 = num;

        //Logic to get the reverse of the number
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == num1) {
            System.out.print("Congratulations! " + num1 +  " is a palindrom");
        } else {
            System.out.print("Mirror mirror on the wall "  + num1  + " is not a palindrom at all");
        }

    }
}
