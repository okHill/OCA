package Q_140_165;

public class Q_154 {

    int count;

    public static void displayMsg() {

        //	System.out.println("Welcome visit count"+ count++);//hata burda cunku count u static bir method icinde cagirmaya calismis
    }
    public static void main(String[] args) {

        Q_154.displayMsg();
        displayMsg();
    }

}
