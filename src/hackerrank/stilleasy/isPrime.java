package hackerrank.stilleasy;

import java.math.BigInteger;
import java.util.Scanner;

public class isPrime {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b = new BigInteger(String.valueOf(n));

        boolean isPrime=b.isProbablePrime(1);
        if(isPrime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
