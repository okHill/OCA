package Constructors;

public class General {


        private String color;
        private String name;
        private int height;
        private int length;

//            the default no-argument constructor
//            automatically created if we do not create it.

        public General() {
        }

//            -this- is optional if there is no naming collision

        public General(String color) {
            this.color = color;
            this.name = "White";    // OK, but redundant.

        }
        public General(int length, int theHeight, String color) {
            this.color = color;
            length = this.length;       // not good. Backward
            height = theHeight;         // OK. No naming collision.
        }
}
