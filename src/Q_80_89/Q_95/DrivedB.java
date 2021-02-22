package Q_80_89.Q_95;

public class DrivedB extends DrivedA {

    public void Test() {
        System.out.println("DrivedB ");
    }

    public static void main(String[] args) {

        Base b1 = new DrivedB();
        Base b2 = new DrivedA();
        Base b3 = new DrivedB();

        b1 = (Base) b3;
        Base b4 = (DrivedA) b3;
        b1.Test();
        b4.Test();
    }
}
