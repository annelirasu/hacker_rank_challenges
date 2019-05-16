package hackerrank.stilleasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ListChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();


        while (N-- > 0) {
            int n = scan.nextInt();
            list.add(n);
            //N--;
        }
        //scan.nextLine();
        int Q = scan.nextInt();
       scan.nextLine();
        while (Q > 0) {
            String order = scan.nextLine();
            order=order.trim().toLowerCase();
            boolean isInsert=order.equals("insert");
            if (isInsert) {
                String[] insertParameters = scan.nextLine().split("\\s+");
                int index = Integer.parseInt(insertParameters[0]);
                int number = Integer.parseInt(insertParameters[1]);
                if(index<=list.size() ){
                    list.add(index, number);
                }else{
                    list.add(number);
                }

            } else if (order.equals("delete")) {
                int index = scan.nextInt();
                if(scan.hasNext())scan.nextLine();
                list.remove(index);
            }

            Q--;
        }
        scan.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
