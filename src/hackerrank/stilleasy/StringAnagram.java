package hackerrank.stilleasy;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    static boolean isAnagram(String a, String b) {
       String a2= a.toLowerCase()
                .replaceAll("\\s+","")
                .trim();
        String b2=b.toLowerCase()
                .replaceAll("\\s+","")
                .trim();

        char[] aLetters=a2.toCharArray();
        char[] bLetters=b2.toCharArray();

        Arrays.sort(aLetters);
        Arrays.sort(bLetters);
        a=new String(aLetters);
        b=new String(bLetters);
        if(a.equals(b)) {
            return true;
        }else {
            return false;
        }
        // Complete the function
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
