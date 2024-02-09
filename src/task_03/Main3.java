package task_03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {

        getResult(getData(), provideData());

    }

    private static String provideData() {
        String list = "Bob, Alice, Tom, Lucy, Bob, Lisa";
        return list.toUpperCase();
    }

    private static String getData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input searched name");

        return sc.nextLine().toUpperCase().trim();
    }

    private static void getResult(String name, String list) {

        Pattern pattern = Pattern.compile(name);
        Matcher mtch = pattern.matcher(list);

        int count = 0;
        while (mtch.find()) {
            count++;
        }

        if (count > 0) {

            System.out.println(name + " is contained " + count + " time(s) " +
                    "on the list");
        } else {
            System.out.println(name + " is not contained on the list");
        }
    }
}
