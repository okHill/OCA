package Q_112_139;

public class Q_118 {

    public static void main(String[] args) {
        /*
        Which two code fragments cause a compilation error?(Choose two.)
         */

        float flt = 100.00F;

        float flt2 = (float)1_11.00;    // casting successful

//        Float flt3 = 100.00; // f needed. 100.00f;

        double y1 = 203.22;
//        float flt4 = y1;    // explicit casting needed.
                            // flt4 = (float) y1;

        int y2 = 100;
        float flt5 = (float) y2;
    }
}
