package hackerrank.stilleasy;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNegativeSubArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int m = scan.nextInt();
            a[i] = m;
        }
        scan.close();
        int countOfNegativeSubArrays = 0;
        int lengthOfSubArr = 1; //start 0, last n-2



        //mitu korda algab kogu array otsast peale
        for (int numberOfSubsArrs = n; numberOfSubsArrs >0 ;numberOfSubsArrs--,lengthOfSubArr++) {

            //
            for (int startPositionOfSubArr = 0; startPositionOfSubArr < numberOfSubsArrs; startPositionOfSubArr++) { //lenghtOfSubarray
                int[] sub = Arrays.copyOfRange(a, startPositionOfSubArr, (startPositionOfSubArr + lengthOfSubArr));
                int subSum = sumArray(sub);
                if (subSum < 0) countOfNegativeSubArrays++;
            }

        }//subarrays

        System.out.println(+countOfNegativeSubArrays);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {

                sum += arr[i];
            }
            return sum;

        }
    }
}
