package hackerrank.medium;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;

public class SortBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();

        }
        sc.close();

        //siit algab minu lahendus
        BigDecimal[] list = new BigDecimal[n];
        Map<BigDecimal,String> both= new HashMap<>();
        java.util.regex.Pattern p = Pattern.compile("[\\.]\\d+");
        Map<String,Integer> dotStringsOrder= new HashMap<>();


        for (int j = 0; j < n; j++) {
            java.util.regex.Matcher m= p.matcher(s[j]);
            if(m.matches()){
                dotStringsOrder.put(s[j],j);//salvestatud algne index listis
                //nüüd tuleks stringimassiivist otsida sarnane 0.-ga algav väärtus ja teha kindlaks selle indeks
                //kui s[j] on sellest eespool, tuleks vääärtust sorteerimiseks natuke suurendada
                //kui s[j] on sellest tagapool, tuleks väärtust sorteerimiseks natuke vähendada :)


            }

            list[j] = new BigDecimal(s[j]);
            both.put(list[j],s[j]);
        }
        //sorteerin

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[i].compareTo(list[j]) == -1) {
                    BigDecimal temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }

        for(int i=0; i<list.length; i++){
            s[i]=both.get(list[i]);
        }
        //Write your code here

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
