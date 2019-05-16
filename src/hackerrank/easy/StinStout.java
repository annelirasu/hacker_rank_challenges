package hackerrank.easy;

import java.util.Scanner;

public class StinStout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }
}
