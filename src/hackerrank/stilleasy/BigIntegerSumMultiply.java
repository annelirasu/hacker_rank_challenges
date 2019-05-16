package hackerrank.stilleasy;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSumMultiply {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        String m=scanner.nextLine();


        BigInteger a = new BigInteger(n);
        BigInteger b=new BigInteger(m);


        System.out.println(a.add(b));

        System.out.println(a.multiply(b));


        scanner.close();
    }

}
