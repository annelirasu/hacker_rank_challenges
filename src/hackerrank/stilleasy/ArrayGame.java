package hackerrank.stilleasy;

import java.util.Scanner;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) {
        int position = 0;
        int n = game.length;
        //try to go as far as possible using 0-s
        for (int i = 1; i < n; i++) {
            while (position < (n - 1)) {
                //walk for next 0
                if (game[i] == 0) {
                    position = i;
                } else {
                    break;
                }

                try {

                    if (game[position + leap] == 0) {
                        position += leap;

                    }
                } catch (Exception e) { //position is so big, it doesn't exist
                    return true;
                }
                if (position >= n - 1) {
                    return true;
                } else {
                    return false;
                }
            }


            // Return true if you can win the game; otherwise, return false.
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();//hüpata saab ainult nulli peale

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
