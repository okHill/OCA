package Q_11_20;

public class Q_49 {

    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50};
        int x = array.length;
//
//        for (int i = x-1; x > 0; i--) {
//            System.out.print(array[i] + " ");
//            x--;
//        }
//        while (x > 0) {
//            x--;
//            System.out.print(array[x] + " ");
//        }
        while (x > 0) {

            System.out.print(array[--x] + " ");
        }


    }
}
