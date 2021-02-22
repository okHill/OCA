package Q_70_79;

public class Q_73 {
    }
    class MyField2 {
        int x;
        int y;
        public void doStuff(int x, int y){
            x = x;
            y = this.y; // 'this' has no effect here.
//            this.y = y; // 'this' could make it different
        }
        public void display(){
            System.out.println(x + " " + y + " : ");
        }
        public static void main(String[] args) {
            MyField2 m1 = new MyField2();
            m1.x = 100;
            m1.y = 200;

            MyField2 m2 = new MyField2();
            m2.doStuff(m1.x, m1.y);  // -> m1.x = 0; -> m1.y = 0;

            m1.display();   // -> 100 200 :
            m2.display();   // -> 0 0 :
        }
    }
/*
    What's the result?  A
    A) 100 200 : 0  0 :
    B) 100 200 : 100 0 :
    C) 100 200 : 100 200 :
    D) 0 0 : 100 0 :

    Correct answer: A
*/

//    class MyField {
//        int x;
//        int y; //
//        public void doStuff(int x, int y){ //100 200
//            this.x = x; //100
//            y = this.y; //0
//            //this.y = y; olursa cavap 100 200 100 100
//        }
//        public void display(){
//            System.out.print(x + " " + y + " : ");
//        }
//
//        public static void main(String[] args) {
//            MyField m1 = new MyField();
//            m1.x = 100;
//            m1.y = 200;
//            MyField m2 = new MyField();
//            m2.doStuff(m1.x, m1.y); //100 200
//            m1.display();
//            m2.display();
//        }
        //ANSWER = 100 200 : 100 0 :

