package hackerrank.easy;

import java.util.Scanner;

public class StaticInitializerBlock {
    public static Scanner sc=new Scanner(System.in);

    public static int B=initializeB();
    public static int H=initializeB();
    public static boolean flag=checkInts(B,H);


    private static int initializeB() {
        int b=sc.nextInt();
        sc.nextLine();
        return b;

    }
    private static boolean checkInts(int a, int b){
        if(a<=0||b<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");

            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args){
            if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main



}
