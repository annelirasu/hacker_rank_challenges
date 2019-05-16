package hackerrank.stilleasy;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {

    /* Enter your code here. Print output to STDOUT. */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);

        String[] forSorting=new String[2];
        forSorting[0]=A;
        forSorting[1]=B;
        Arrays.sort(forSorting);
        if (forSorting[0].equals(A)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

       String Asb=new String(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase());
        String Bsb=new String(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());

        System.out.println(Asb+" "+Bsb);


    }

}

