package hackerrank.medium;

import java.security.MessageDigest;
import java.util.Scanner;

public class GenerateSHA256HashCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String psw = sc.nextLine();
        System.out.println(getSha256(psw));

    }


    public static String getSha256(String value) {
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(value.getBytes());
            return bytesToHex(md.digest());
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    private static String bytesToHex(byte[] bytes) {
        StringBuffer result = new StringBuffer();
        for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        return result.toString();
    }
}
