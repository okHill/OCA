package Q_112_139;

public class Q_112 {

    String data = "just data";
    private String privateData = "Encapsulated";
    private final double PI = 3.14;

    public String getData() {
        return data;
    }
    public double getPI() {
        return PI;
    }

    public static void main(String[] args) {
        Q_112 q = new Q_112();
        System.out.println(q.getData());
        System.out.println(q.getPI());
        System.out.println("=======");
        q.data = "Just another data";
        q.privateData = "Changed Value";
        System.out.println(q.data);
        System.out.println(q.privateData);
//        q.PI = 3.0;
    }
    }
/*
    112. What is the name of the Java concept that uses access modifiers to
          protect variables and hide them within a class?
            A. Encapsulation
            B. Inheritance
            C. Abstraction
            D. Instantiation
            E. Polymorphism
            Answer: A
    Explanation: Using the private modifier is the main way that an
    object encapsulates itself and hide data from the outside world.
*/
