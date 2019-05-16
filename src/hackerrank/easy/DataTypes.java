package hackerrank.easy;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        LinkedList<Long> numbers = new LinkedList<>();
//        for (int j = 0; j < t; j++) {
//            long nr = sc.nextLong();
//            numbers.add(nr);
//            sc.nextLine();
//        }

//        long minShort=Long.MIN_VALUE;
//        long maxShorte=Long.MAX_VALUE;
//        System.out.println(minShort);
//        System.out.println(maxShorte);

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                sc.nextLine();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }

                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }


                if (x >= -9223372036854775808l && x <= 9223372036854775807l) {
                    System.out.println("* long");

                }


            } catch (
                    Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
