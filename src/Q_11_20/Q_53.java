package Q_11_20;

public class Q_53 {

    //53. Given the code fragment:
    public static void main(String[] args) {
        double discount = 0;
//          int qty = Integer.parseInt(args[0]);
//        line n1
          int qty = 95;



    /*
    And given the requirements:
    If the value of the qty variable is greater than or equal to 90,
    discount = 0.5 If the value of the qty variable is between 80 and 90,
    discount = 0.2
    Which two code fragments can be independently placed at line n1 to meet the requirements? (Choose two.)
     */
//    // A
        if (qty >= 90) { discount = 0.5; }
        if (qty > 80 & qty < 90){discount = 0.2;}
        System.out.println(discount);   // -> 0.5

//    // B
//        discount = (qty >= 90) ? 0.5 : 0;
//        discount = (qty >= 80) ? 0.2 : 0;
//        System.out.println(discount);   // -> 0.2

//    // C
//        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 :0;
//            System.out.println(discount);   // -> 0.5
//
//    //D
//        if(qty >80 && qty < 90) {
//            discount = 0.2;
//        }else {
//            discount = 0;
//        }
//        if(qty > 90){       // supposed to be qty >= 90;
//            discount = 0.5;
//        }else {
//            discount = 0;
//        }
//        System.out.println(discount);   // 0.5; 0.0 if qty = 90.
//
//     //E
//        discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
//            System.out.println(discount);       // -> 0.2

        /*
        A. Option A
        B. Option B
        C. Option C
        D. Option D
        E. Option E
                Answer: AC
         */
    }
}
