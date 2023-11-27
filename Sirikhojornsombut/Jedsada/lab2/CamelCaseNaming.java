package sirikhojornsombut.jedsada.lab2;

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two words as arguments.");
            System.out.println("Usage: java CamelCaseNaming <word1> <word2>");
        } else {
            String word1 = args[0];
            String word2 = args[1];

            String camelCaseWord1 = word1.substring(0, 1).toUpperCase() + word1.substring(1).toLowerCase();
            String camelCaseWord2 = word2.substring(0, 1).toUpperCase() + word2.substring(1).toLowerCase();

            String camelCaseResult = camelCaseWord1 + camelCaseWord2;

            System.out.println("Camel Case Result: " + camelCaseResult);
        }
    }
}
