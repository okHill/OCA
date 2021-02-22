package Q_11_20;

public class Q_57 {

    String msg;

    Q_57(String msg) {
        this.msg = msg;

    }
}

    class Test {
        public static void main(String[] args) {
            System.out.println("Hello "+ new StringBuilder("Java SE 8"));
            System.out.println("Hello "+ new Q_57("Java SE 8")); //soruda .msg yok. O durumda hush code yazdirir
//            System.out.println("Hello "+ new Q_57("Java SE 8").msg);
        }
    }

