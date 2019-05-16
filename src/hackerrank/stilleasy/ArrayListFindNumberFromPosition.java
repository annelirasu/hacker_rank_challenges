package hackerrank.stilleasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFindNumberFromPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        //add rows
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            String[] intTokens = sc.nextLine().split("\\s");
            for (int j = 0; j < intTokens.length; j++) {
                row.add(Integer.parseInt(intTokens[j]));
            }
            rows.add(row);
        }


        int q = sc.nextInt(); //number of queries
        sc.nextLine();

        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            String[] intTokens = sc.nextLine().split("\\s");
            for (int j = 0; j < intTokens.length; j++) {
                row.add(Integer.parseInt(intTokens[j]));
            }
            queries.add(row);
        }

        for(int k=0; k<queries.size();k++){
            ArrayList<Integer> queryLine=queries.get(k);
            int lineNr=queryLine.get(0);
            int searchablePosition=queryLine.get(1);

            ArrayList<Integer> line =rows.get(lineNr-1);
            try {
                int queryAnswer = line.get(searchablePosition);
                System.out.println(queryAnswer);
            }catch (Exception e){
                System.out.println("ERROR!");

            }

        }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}
