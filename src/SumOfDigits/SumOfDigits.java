package SumOfDigits;

import java.util.stream.Stream;

public class SumOfDigits {

    /*  Functions in Math: f(x) = 3x + 5; x=3 icin f(3) = 14 */

    public static void main(String[] args) {

        System.out.println(sumOfDigits(12345678));
    }

    public static int sumOfDigits(int number) {
        return Stream.of(String.valueOf(number).split(""))
                     .mapToInt(Integer::valueOf) // mapToInt is a Stream method
                     .sum();
    }
}
