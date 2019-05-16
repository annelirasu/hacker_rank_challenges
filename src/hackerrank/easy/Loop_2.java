package hackerrank.easy;

import java.util.LinkedList;
import java.util.Scanner;

public class Loop_2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<LinkedList<Integer>> numbers = new LinkedList<>();

        for (int i = 0; i < t; i++) {
            LinkedList<Integer> temp = new LinkedList<>();
            int a = in.nextInt();
            temp.add(a);
            int b = in.nextInt();
            temp.add(b);
            int n = in.nextInt();
            temp.add(n);

            numbers.add(temp);
        }
        in.close();
        //t=numbers.size()
        for (int i = 0; i < t; i++) {
            LinkedList<Integer> temp = numbers.get(i);

            int a = temp.get(0);
            int b = temp.get(1);
            int n = temp.get(2);

            int sum = a;
            for (int k = 0; k < n; k++) {
                double twoInPower = Math.pow((double) 2, (double) k);
                sum = sum + ((int) twoInPower * b);
                System.out.print(sum + " ");
            }
            System.out.println();

        }


    }
}
