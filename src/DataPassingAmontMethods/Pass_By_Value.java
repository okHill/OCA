package DataPassingAmontMethods;

public class Pass_By_Value {

//    this is example for PASS-BY-VALUE languages, such a Java.
//    Value change within the method could affect originals in
//    PASS-BY-REFERENCE languages, such as Perl.

    public static void main(String[] args) {

        int original_1 = 1;
        int original_2 = 2;

        swap(original_1, original_2);

        System.out.println(original_1);
        System.out.println(original_2);

//        values a and b changes only within the method.

    }

    public static void swap(int a, int b) {

        int temp = a;

        a = b;
        b= temp;
    }
}
