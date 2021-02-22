package Method_Overloading;

public class ReferenceTypes {

    public void fly(String s) {
        System.out.println("String ");
    }

    public void fly(Object o) {
        System.out.println("Object ");
    }

    public static void main(String[] args) {

        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(256);  // the closest type is Object
                        // int is autoboxed to Integer
    }
}
