package hackerrank.stilleasy;

import java.util.Scanner;

class MyCalculator {
  public long power(int a, int b) throws Exception {

      long x=-1;
      if(a<0|b<0){
          throw new java.lang.Exception("n or p should not be negative.");

      }else if(a==0&&b==0){
          throw new java.lang.Exception("n and p should not be zero.");
      }
      try {
          x=(long)Math.pow((double)a,(double)b);
          return x;
      } catch (Exception e) {
          String eClass = (e.getClass()).toString();
          String message = eClass.substring(6);
          System.out.println(message+" "+e.getMessage());
      }
      return x;


  }


}

public class PowerOfExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
