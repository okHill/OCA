package DataPassingAmontMethods;

public class CallerNotAffected {


//        # Assignments made in the method does not affect the caller.

    public static void main(String[] args) {

        int num = 4;
        newNumber(num);             // caller -> num 4
//      newNumber(myNum : 4);       // it should be like this if assigned.
        System.out.println(num);    // -> num 4
    }

    public static void newNumber(int myNum) { // -> parameter

        myNum = 8;    // -> num 4
    }                 // -> num 8 -> it is assigned anywhere.

}
