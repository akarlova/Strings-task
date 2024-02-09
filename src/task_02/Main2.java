package task_02;

public class Main2 {

    public static void main(String[] args) {

        String list = "orange, plum, tomato, onion, grape, onion";

        getOutput(getData(delOption(list)));
    }

    private static String[] delOption(String string) {

        String change = " onion";

        String correctList = string.replaceAll(change, "");
        correctList = correctList.replaceAll(",", "");

        return correctList.split(" ");

    }

    private static String getData(String[] strings) {

        StringBuilder strBuilder = new StringBuilder();
        int count = 0;
        for (String str : strings) {
            count++;
            strBuilder
                    .append(count)
                    .append(") ")
                    .append(str)
                    .append("\n");
        }
        return strBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

