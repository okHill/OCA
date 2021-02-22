package Q_11_20;

public class Q_31 {
    /*and given the code fragment:

    Vehicle y = new Car();
    System.out.println(y);

    What is the result?
    */
}

    class Vehicle {
        int x;
        Vehicle(){
            this(10); // line n1
        }
        Vehicle (int x) {
            this.x =x;
        }
    }
    class Car extends Vehicle {
        int y;
        Car(){
//            super();
            this(20); //line n2
                        // Call to 'this()' must be first statement
                        // in constructor body
        }
        Car( int y) {
            this.y =y;
        }
        public String toString(){
            return super.x +":" +this.y;
        }
    }

