package hackerrank.stilleasy;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < a.length; i++) {
                int m = scan.nextInt();
                a[i]=m;
        }
        scan.close();
        int countOfNegativeSubArrays=0;
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
