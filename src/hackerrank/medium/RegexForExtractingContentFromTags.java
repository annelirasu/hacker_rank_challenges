package hackerrank.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForExtractingContentFromTags {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Pattern tagPattern = Pattern.compile("(<(.+?)>)?(<(.+?)>)(.*?)(</\\4>)(</\\2>)?");
            Matcher m = tagPattern.matcher(line);
           try {
               m.find(); // true?
               String content = m.group(5);
               System.out.println(content);
               while (m.find()) {
                   System.out.println(m.group(5));
               }
           }catch (IllegalStateException e){
               e.getSuppressed();
               System.out.println("none");
               testCases--;
               continue;
           }

            //Write your code here

            testCases--;
        }
    }
        /*
,Pattern.DOTALL
        String testHtml = "xx <tag a =\"b\" c=  \'d\' e=f> contentssss </tag> zz";
        Pattern tagPattern = Pattern.compile("<(\\S+?)(.*?)>(.*?)</\\1>");
        Pattern attValueDoubleQuoteOnly = Pattern.compile("(\\w+)=\"(.*?)\"");
        Pattern attValueAll = Pattern.compile("([\\w:\\-]+)(\\s*=\\s*(\"(.*?)\"|'(.*?)'|([^ ]*))|(\\s+|\\z))");
        Matcher m = tagPattern.matcher(testHtml);
        boolean tagFound = m.find(); // true
        String tagOnly = m.group(0);// <tag a ="b" c= 'd' e=f> contentssss </tag>
        String tagname = m.group(1);// tag
        String attributes = m.group(2);// a ="b" c= 'd' e=f
        String content = m.group(3);// contentssss
        System.out.println("Tag Only   : " + tagOnly);
        System.out.println("Tag Name   : " + tagname);
        System.out.println("Attributes : " + attributes);
        System.out.println("Content    : " + content);
        //m = attValueDoubleQuoteOnly.matcher(attributes);
        m = attValueAll.matcher(attributes);
        while (m.find()) {
            System.out.println(" >> " + m.group(0));
        }*/

}


