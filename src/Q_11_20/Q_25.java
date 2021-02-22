package Q_11_20;

public class Q_25 {


    interface Downloadable {
        public void download();
    }

    interface Readable extends Downloadable {
        public void readBook();
    }

    abstract class Book implements Readable {

//        Interface methods are not necessary to be implemented in an abstract class.
//        One is implemented, the other is not implemented.

        public void readBook() {

            System.out.println("Read Book");
        }
    }

    class EBook extends Book {

//        Unimplemented methods should be implemented in a class.
//         download() was not implemented before. It needs to be implemented here

        @Override
        public void download() {

        }
        //      already implemented method can be overridden here.
        public void readBook() {

            System.out.println("Read E-Book");
        }
    }
/*

    public class BookStore {

        public static void main(String[] args) {
            Book book1 = new EBook();
            book1.readBook();
            book1.download();
        }
    }
*/


}
