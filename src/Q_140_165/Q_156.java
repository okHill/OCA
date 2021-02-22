package Q_140_165;

public class Q_156 {

    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();

        b1=(A)b2;//line 1
        A b3=(B) b2;//line 2
        b1.test();
        b3.test();
    }
}

        class A{
            public void test() {
                System.out.println("A");
            }
        }
        class B extends A{
            public void test() {
                System.out.println("B");
            }
        }
        class C extends A{
            public void test() {
                System.out.println("C");
            }
        }
