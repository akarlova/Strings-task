package task_01;

public class Main1 {

    public static void main(String[] args) {

        String list = "brange, plum, tomato, onibn, grape";

        getResult(list);

    }

    private static void getResult(String string) {

        String correctList = string.replaceAll("b", "o");

        String[] result = correctList.split(" ");
        int count = 0;
        for (String str : result) {
            count++;
            System.out.println(count + ") " + str);

        }
    }
}
