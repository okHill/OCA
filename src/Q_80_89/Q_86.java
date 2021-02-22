package Q_80_89;

public class Q_86 {
    }

    class Vehicle {
        int x;

        Vehicle() {     // Const. #1

            this(10); // line n1
            // calling the other constructor
        }

        Vehicle(int x) {
            this.x = x;
        } // Const. #2
    }
    class Car extends Vehicle {
        int y;

        Car() {
            super(10); // line n2
        }

        Car(int y) {
            super(y);   // calls super class const. with one param.
            this.y = y; // initializes class member
        }
        public String toString() {
            return super.x + ":" + this.y;
        }

        public static void main(String[] args) {
            Vehicle y = new Car(20);
            System.out.println(y);
        }
    }
    //What is the result?
    // A. Compilation fails at line n2.
    // B. Compilation fails at line n1.
    // C. 20:20
    //D. 10:20
    //Answer: C

