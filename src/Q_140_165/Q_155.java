package Q_140_165;

import java.util.ArrayList;

public class Q_155 {


    public static void main(String[] args) {

        ArrayList<Integer> points=new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);


        points.add(null);
        Integer a = 1;
        points.remove(1);

        points.remove(null);
        System.out.println(points);




        //	Integer a = 3;
        //	points.remove(a);
    }

}
