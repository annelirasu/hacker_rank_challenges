package hackerrank.stilleasy;

import java.util.Scanner;

public class ExeptionHandling {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int x =scan.nextInt();
            int y = scan.nextInt();

            int z=x/y;
            System.out.println(z);


        }catch (Exception e){
            if(e instanceof java.lang.ArithmeticException){
                System.out.println(e.toString());
            }else {
                String eClass = (e.getClass()).toString();
                String message = eClass.substring(6);
                System.out.println(message);
            }
        }


        scan.close();
    }
}
