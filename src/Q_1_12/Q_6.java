package Q_1_12;

import java.io.IOException;

public class Q_6 {}

    class X {

        public void printFileContent() throws IOException {
            /* Code goes here */
            }
        }

    class Test {

        public static void main(String[] args) throws Exception {

            X qobj = new X();

            qobj.printFileContent();

        }
    }

    /*
    * Which two modifications should you make so that
    * the code compiles successfully (chose two).
    * */

//            try {
//                throw new IOException();
//            } catch (Exception e) {}      // Exception is higher than IOException
//                catch (IOException e) {} // 'java.io.IOException' has
                                           //  already been caught