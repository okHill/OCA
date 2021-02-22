package Method_Overloading;

public class Primitives {

//    Java looks for the most specific overloaded method
//    automatic conversion from smaller to larger

//    public void fly(int i) {
//        System.out.println("int ");
//    }

    public void fly(long l) {
        System.out.println("long ");
    }

    public static void main(String[] args) {
        Primitives p = new Primitives();

        p.fly(123);     // automatic casting to a larger primitive
        p.fly(123L);
    }
}

    class TooManyConversions {

        public static void play(long l) {
            System.out.println("Long 1 ");
        }

        public static void play(Long... l) {
            System.out.println("Long 2");
        }

        public static void play(String[] args) {
            System.out.println("Long 3");
        }

        public static void main(String[] args) {

//            TooManyConversions t = new TooManyConversions();

            play(4);  // OCA book says it does not compile (?)
            play(4L);
        }

    }
