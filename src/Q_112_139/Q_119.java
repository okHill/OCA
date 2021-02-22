package Q_112_139;

public class Q_119 {
}

class Test119 {

    public static final int MIN = 1;

    public static void main(String[] args) {

        int x = args.length;
//        let's see what x is?
        System.out.println(x);

        if (checkLimit(x)) {    //line n1
            System.out.println("Java SE");

        }else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x) {

        return (x >= MIN) ? true : false;
    }
/*
    And Given the commands:
        javac Test.java
        java Test 1
    What is the result?
*/
}

/*
java Test 1 (x <=1 min ===> true olunca "Java SE" CIKAR

A.Java SE
B.Java EE
C.Compilation fails at line n1.
D.A NullPointException is thrown at runtime
Answer:B

//Java Test 1 Yeni Cevap===>Java SE if else yeri degistirilmis **yani cevap Java SE
 */


