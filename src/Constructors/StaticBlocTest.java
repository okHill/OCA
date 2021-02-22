package Constructors;

import Q_11_20.Q_19.p2.Test;

public class StaticBlocTest {

    static class Test{

        static int i;
        int j;

        static {
            i = 10;
            System.out.println("static block called ");
        }   // end of static block

    }

    public static void main(String args[]) {

        System.out.println(Test.i);

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
//        This example works only when the inner class is made static.
//        Source: https://www.geeksforgeeks.org/g-fact-79/
    }
}
