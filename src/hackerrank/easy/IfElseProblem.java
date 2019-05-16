package hackerrank.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class IfElseProblem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        evaluateN(N);

        scanner.close();
    }

    public static void evaluateN(int n){
        if((n%2==1)||(n%2==0&&(n>=6&&n<=20))){
            System.out.println("Weird");
        }else if(n%2==0&&((n>=2&&n<=5)||(n>20))){
            System.out.println("Not weird");
        }

    }
}
