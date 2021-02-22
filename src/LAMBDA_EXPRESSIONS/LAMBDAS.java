package LAMBDA_EXPRESSIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface IntOp {
        int sum(int x, int y);
    }

public class LAMBDAS {

    public static void main(String[] args) {
        IntOp tp;
        tp = (x,y) -> x + y;
        System.out.println("Lambda: " + tp.sum(10, 20));

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 87, 90, 99));

        System.out.println("Original list: " + list);

        list.removeIf(x -> x % 2 != 0);
        System.out.println("Even Numbers: " + list);
    }
}
