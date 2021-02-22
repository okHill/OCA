package Constructors;

public class Encapsulation {

    //    JavaBeans

}

    class Swan {

        private int numEggs;
        private boolean happy;

        public boolean isHappy() {
            return happy;
        }

        public int getNumEggs() {
            return numEggs;
        }

        public void setHappy(boolean happy) {
            this.happy = happy;
        }

        public void setNumEggs(int num) {
            numEggs = num;
        }
    }
