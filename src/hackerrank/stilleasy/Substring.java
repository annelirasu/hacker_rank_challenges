package hackerrank.stilleasy;


import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> subs=new java.util.ArrayList<>();

        for(int pos=0; pos<=s.length()-k;pos++){
            String sub=s.substring(pos,pos+k);
            subs.add(sub);
        }
        String[] subs2=new String[subs.size()];
        subs2=subs.toArray(subs2);
        java.util.Arrays.sort(subs2);
        smallest=subs2[0];
        largest=subs2[subs.size()-1];

        StringBuilder sb=new StringBuilder();

        return smallest + "\n" + largest;
    }
}
