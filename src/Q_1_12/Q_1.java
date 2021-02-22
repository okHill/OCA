package Q_1_12;

public class Q_1 {

    public static void main(String[] args) {

        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("true")); // casting
        bool[1] = new Boolean(null);    // default value is false

        System.out.println(bool[0] + " " + bool[1]);
    }
}
