package Q_112_139;

public class Q_128 {
}

    class Caller {

        private void init () {

            System.out.println ("Initialized");
    }

        private void start () {
            init ();
            System.out.println ("Started");
    }

}
/*
    public class TestCall {
        public static void main (String [] args) {
            Caller c = new Caller();
//            c.start();   //  -> cannot access to private method
//            c.init();   //  -> cannot access to private method
    }
}*/
// What is the result?
//  A. Compilation fails at line n1.
//  B. InitializedStartedInitialized
//  C. InitializedStarted
//  D. Compilation fails at line n2
//  Answer : A D



