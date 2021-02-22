package Q_11_20.Q27;

public class Test27   {

    public static int stVar = 100;
    public int var =200;
/*
    public String toString () {
        return stVar + ":" + var;
    }
*/

    public static void main(String[] args) {
        //And given the code fragment
        Test27 t1 = new Test27();
         t1.var =300;
         System.out.println(t1);

        Test27 t2 = new Test27();
        t2.stVar =300;
        System.out.println(t2);
    }
}

//what is the result?
/*
What is the result?
A. 300:300200:300
B. 300:100200:300
C. 300:00:300
D. 100:300300:200
Answer: D
 */