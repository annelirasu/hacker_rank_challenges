package hackerrank.easy;

import java.util.LinkedList;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> lines=new LinkedList<>();
        boolean endOfFile=false;
        while(!endOfFile&&sc.hasNext()) {
            String line = sc.nextLine();
            lines.add(line);

            if(line.contains("end-of-file")||lines.size()==10000) endOfFile=true;;
        }
        for(int i=0; i<lines.size();i++){
            int j=1+i;
            System.out.println(j+" " +lines.get(i));
        }
    }
}
