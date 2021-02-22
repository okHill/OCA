package Q_1_12;

public class Q_3 {

    public static void main(String[] args) {

        int num [][] = new int[1][3];

        for (int i = 0; i < num.length; i++) {


            for(int j = 0; j < num[i].length; j++) {

//                System.out.println(num[i] [j] = 10);

                System.out.print("Num [" + i + "] Num [" + j + "] = ");
                System.out.println(num[i] [j] = 10);
            }
        }
    }

/*

Whic option represents the state of the num array after succesful completion of the outer loop?

num [0] [0] = 10;
num [0] [1] = 10;
num [0] [2] = 10;

    the array looks like this:

    num =  [{10, 10, 10}]

* */

}
