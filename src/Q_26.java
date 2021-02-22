public class Q_26 {

}
    class TestScope {

        public static void main(String[] args) {
            int var1 = 200;
            System.out.print(doCalc(var1)); // instance variable
            System.out.print(" " + var1);   // local variable
        }

        static int doCalc(int var1) {
            var1 = var1 * 2;
            return var1;

            //what is the result?
        }
}
