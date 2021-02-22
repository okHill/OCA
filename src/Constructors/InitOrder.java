package Constructors;

//    Order: SSIC
//      Super Class
//      Static Variables & Initializers
//      Instance Variables & Initializers
//      The Constructor

public class InitOrder {

     static {add(2);}
    static void add(int num) { System.out.println(num + " "); }
    InitOrder() {add(5);}
    static {add(4);}
    {add(6);}
    static {new InitOrder();} // This static method does the same
                            // thing with the main method below.
    {add(8);}

    public static void main(String[] args) {

//        new InitOrder();
    }
}
