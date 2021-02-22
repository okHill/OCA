package Q_70_79.Q_75.clothing.pants;

//    line n1

import Q_70_79.Q_75.clothing.Shirt; // A

public class Jeans {

    public void matchShirt() {

//    line n2

        String color = Shirt.getColor();    // A

        if (color.equalsIgnoreCase("Green")) {
            System.out.println("Color mathces");
        }
    }

    public static void main(String[] args) {

        Jeans trousers = new Jeans();
        trousers.matchShirt();
    }
}

/*
Which two sets of actions, independently , enable the code fragment to print Fit?
we inserted the options in answer A :
        line n1: import cltohing.Shirt (since our package starts with Q75 our one has that too)
        line n2 :  String color = Shirt.getColor();

        and it printed Fit on the console
 */


