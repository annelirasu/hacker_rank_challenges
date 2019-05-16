package hackerrank.stilleasy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BitSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //lenght of bitSets
        int m = scan.nextInt();//number of ops

        java.util.BitSet A=new java.util.BitSet(n);
        java.util.BitSet B=new java.util.BitSet(n);

       scan.nextLine();
        for (int i=0; i<m; i++){
            String line=scan.nextLine();
            String[] pieces=line.split("\\s+");
            String order=pieces[0].toLowerCase();
            int arg1= Integer.parseInt(pieces[1]);
            int arg2=Integer.parseInt(pieces[2]);

            if(order.equals("and")){
                if(arg1==1) {
                    A.and(B);
                }else{
                    B.and(A);
                }

            }else if(order.equals("set")){
                if(arg1==1) {
                    A.set(arg2);
                }else{
                    B.set(arg2);
                }
            }else if(order.equals("flip")){
                if(arg1==1) {
                    A.flip(arg2);
                }else{
                    B.flip(arg2);
                }
            }else if(order.equals("or")) {
                if (arg1 == 1) {
                    A.or(B);
                } else {
                    B.or(A);
                }
            }else if(order.equals("xor")){
                if (arg1 == 1) {
                    A.xor(B);
                } else {
                    B.xor(A);
                }

            }

            System.out.println(A.cardinality()+" "+B.cardinality());
        }

        scan.close();


    }


}
