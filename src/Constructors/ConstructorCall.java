package Constructors;

public class ConstructorCall {

    public ConstructorCall() {

    }

    public ConstructorCall(boolean b) {
    }

    private ConstructorCall(int i) {

    }

    public static void main(String[] args) {
       new ConstructorCall();
       new ConstructorCall(5);
       ConstructorCall call = new ConstructorCall(true);

    }
}
