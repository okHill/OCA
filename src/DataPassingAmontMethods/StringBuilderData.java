package DataPassingAmontMethods;


public class StringBuilderData {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
    }

    public static void speak(StringBuilder s) {

        s.append("Webby");  // s is a copy of the variable name
                            // Both point to the same StringBuilder
                            // Changes made to the SB are available
                            // to both references.
    }
}
