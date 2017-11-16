import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int N = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= N; i++)
            s = s + i;
        System.out.println("Sum is " + s);
    }
}