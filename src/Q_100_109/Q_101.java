package Q_100_111;

public class Q_101 {
}

    abstract class Planet{
        protected void revolve(){

        }
        abstract void rotate();
    }

    class Earth extends Planet{

//        private void revolve(){ // this is line 8
        public void revolve(){   // more accessible - B

        }
//        private void rotate(){
        protected void rotate(){    // more accessible - C

        }
    }
/*
    Which two modifications enable the code to compile? or
    question might be three modifications
        A. Make the method at line 8 protected.
        B.	Make the method at line 8 public.
        C.	Make the method at line 10 protected.
        D.	Make the method at line 4 public.
        E.	Make the method at line 2 public.
    Answer: AC veya BC
 */
