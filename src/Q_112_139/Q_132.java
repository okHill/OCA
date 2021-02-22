package Q_112_139;

public class Q_132 {
}

    class X {

        int i;
        static int j; // static. The last value remains.

        public static void main(String[] args) {

            X x1 = new X();
            X x2 = new X();
            x1.i = 3;
            x1.j = 4;
            x2.i = 5;
            x2.j = 6;

            System.out.println(
                            x1.i + " "+
                            x1.j + " "+
                            x2.i + " "+
                            x2.j

            );
        }
}
   /*
   What is the result?
    A. 3 4 5 6
    B. 3 4 3 6
    C. 5 4 5 6
    D. 3 6 5 6
    Answer: D
    */

   /*
   Q_ 77

   class X {
   static int i;
   int j;
   public static void main (String [] args) {
    X x1 = new X();
    X x2 =new X();
     x1. i= 3;
      x1.j = 4;
      x2.i = 5;
      x2.j = 6;
      System.out.println (
                   x1.i + " " +
                   x1.j + " " +
                   x2.i + " " +
                   x2.j);
                   What is the result?
                   A. 3 4 5 6
                   B. 3 4 3 6
                   C. 5 4 5 6
                   D. 3 6 4
                   6 Answer: C
    */
