package Q_1_12.Q_9;

    public class A extends B {

        public A() {    // line n2
            System.out.println("A ");
        }

        public static void main(String[] args) {

            A a = new A();
        }
    }


    class B extends C {
        public B() {                   //line n1
            System.out.println("B");
        }
    }

        class C {
            public C() {
                System.out.println("C");
            }

    }
