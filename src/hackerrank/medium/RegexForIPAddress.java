package hackerrank.medium;

import java.util.Scanner;

public class RegexForIPAddress {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{

    public String pattern="^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}\n" +
            " (?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}
