package hackerrank.stilleasy;

import java.util.Scanner;

class UsernameValidator {
    /*
     *Test case:
     * 8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
     */
    public static final String regularExpression = "^(?!.*@)[a-zA-Z][a-zA-Z\\d_]{7,29}$";
    //starts with non case sensitive letter, continues with letters, _ and digits, non @, number of chars8-30

}

public class RegexForUsername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }


    //^[a-z A-Z 0-9 _]{8,80}$


}
