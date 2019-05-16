package hackerrank.easy;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = new String[3];
        int[] x = new int[3];

        for (int i = 0; i < 3; i++) {
            s1[i] = sc.next();
            x[i] = sc.nextInt();
            sc.nextLine();

        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String intFormatted = String.format("%03d", x[i]);

            System.out.println(padRight(s1[i], 15) + intFormatted);
        }
        System.out.println("================================");
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

}
