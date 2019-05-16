package hackerrank.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class FormattingCurrency {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us=formatUS.format(payment);

        NumberFormat formatIn = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String india=formatIn.format(payment);

        NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=formatChina.format(payment);

        NumberFormat formatFrance = java.text.NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=formatFrance.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
