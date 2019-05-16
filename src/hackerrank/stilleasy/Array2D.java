package hackerrank.stilleasy;

import java.util.Scanner;

public class Array2D {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int biggestSum = (7 * -9);
        for (int k = 0; k < 4; k++) {


            for (int l = 0; l < 4; l++) {
                int sumof1row = arr[k][l] + arr[k][1+l] + arr[k][2 + l];
                int sumOf2Rows = arr[1+k][1+l] + sumof1row;
                int sumOf3Rows = arr[2 + k][l] + arr[2 + k][1+l] + arr[2 + k][2 + l]+sumOf2Rows;
                if (sumOf3Rows > biggestSum) biggestSum = sumOf3Rows;


            }
        }
        System.out.println(biggestSum);
    }

}
