package Q_11_20;

public class Q_16 {

    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].equals("B")) {
                    continue;
                }
                System.out.print(arr[i][j] + " "); // prints before if condition
            }
            continue;               //Continue iterasyonu başa getiriyor
                                //Continue'dan sonra bir şey yazılmıyor. Compile error.
                                // Continue's have no effect in this code.
        }                       // break ends the loop

    }
}

// A B C D E

//        String [] [] arr = {{ "A", "B", "C"},  {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for ( int j = 0; j< arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//                if ( arr[i][j].equals("B")) {
//                   break;
//                }
//            }
//            continue;
//        }
//    }
//A B D E

//    String [] [] arr = {{ "A", "B", "C"},  {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//        for ( int j = 0; j< arr[i].length; j++) {
//            System.out.print(arr[i][j] + " ");
//            if ( arr[i][j].equals("B")) {
//                continue;
//            }
//        }
//        break;
//    }
//}
//A B C

//        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j].equals("B")) {
//                    return;
//                    System.out.println(arr[i][j] + " ");
//                }
//
//            }
//            continue;
//        }
//    }

//Compile fail

//        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//                if (arr[i][j].equals("B")) {
//                    break;
//                }
//            }
//            break;
//        }
//    }
// A B
/**

 A. A B C
 B. A B C D E
 C. A B D E
 D. Compilation fails

 ans:D
 */

