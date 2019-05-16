package hackerrank.stilleasy;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        scan.close();
        String[] tokens = s.trim().split("[\\W _]+");
        int tokensLength = tokens.length;
        boolean boo=tokens.length==1&&tokens[0].equals("");
       if(boo){
           tokensLength=0;
       }
        System.out.println(tokensLength);
        for (int i = 0; i < tokensLength; i++) {
            System.out.println(tokens[i]);
        }
    }

    //String[]tokens = pdfName.split("[\\-.]");
    //W+  non word delimiter
}
