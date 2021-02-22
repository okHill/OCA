package Q_112_139.Q_127;

    public class CheckingAccount {

        public int amount;
//  line n1

//        Option A:
        public CheckingAccount() {
            amount = 100;   // this keyword is not necessary

//        Option D:
/*      public CheckingAccount() {
            this.amount = 100;  // this keyword can be used as well.

 */   }
}

//      And given the main method below, located in another class,
//      which three pieces of code, when inserted independently,
//      set the value of amount to 100?

    class AnotherClass {

    public static void main(String[] args) {

        CheckingAccount acct = new CheckingAccount();
//  line n2
//        Option E
//        acct.amount = 100;
//        wee need to print to see what it is:
        System.out.println(acct.amount);
    }
}

