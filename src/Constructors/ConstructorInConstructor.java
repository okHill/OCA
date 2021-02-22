package Constructors;

public class ConstructorInConstructor {

    String s;
    int i;

    public ConstructorInConstructor() {

        this("white", 5);   // appropriate calling; needs to come first.
//        ConstructorInConstructor(s, i);       // does not compile
//        new ConstructorInConstructor(s, i);   // compiles but does not work

    }

    public ConstructorInConstructor(String s, int i) {

        this.s = s;
        this.i = i;

    }
}
