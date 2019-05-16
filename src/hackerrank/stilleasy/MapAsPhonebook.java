package hackerrank.stilleasy;

import java.util.*;

public class MapAsPhonebook {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        List<String> searchableNames = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        boolean hasInput = in.hasNextLine();

        while (hasInput) {
            try {
                String s = in.nextLine();
                searchableNames.add(s);
            } catch (Exception e) {
             break;
            }
        }
        //
        for (int i = 0; i < searchableNames.size(); i++) {
            String s = searchableNames.get(i);

            int temp = 0;
            try {
                temp = phoneBook.get(s);
                phoneBook.get(s);
                System.out.println(s + "=" + temp);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}

