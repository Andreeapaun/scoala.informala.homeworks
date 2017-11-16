import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumDigitInANumber {
    public static void main(String args[]) throws Exception{

        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(ir);
        System.out.println("Enter any Integer Number: \n");
        int number,largestNumber,rem,copyNumber;
        number=Integer.parseInt(br.readLine());
        copyNumber = number;
        largestNumber=number%10;

        while(number>0){
            rem = number%10;
            number = number/10;
            if(rem>largestNumber){
                largestNumber = rem;
            }
        }
        System.out.println("Input Number   : "+copyNumber+"\nLargest digit  : "+largestNumber);
    }
}

