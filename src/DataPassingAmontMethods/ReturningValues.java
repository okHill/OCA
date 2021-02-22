package DataPassingAmontMethods;

public class ReturningValues {

    public static void main(String[] args) {

        int number = 1;
        String letters = "abc";

        number(number);             // no assignment. Returned value ignored
        letters = letters(letters); // returned value is used.

        System.out.println(number);
        System.out.println(letters);

    }

    public static int number(int number) {

        number ++;
        return number;
    }

    public static String letters(String letters) {

        letters += "d";
        return letters;
    }
}
