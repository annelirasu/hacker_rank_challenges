package hackerrank.stilleasy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//set salvestab mittekorrastatud järjekorras unikaalseid objektipaare

public class UsingASet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];



        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set< String> pairs=new HashSet<>();
        for (int j=0; j<pair_left.length;j++){
            String aPair=pair_left[j]+" "+pair_right[j];
            pairs.add(aPair);
            System.out.println(pairs.size());
        }

//Write your code here

    }
}
