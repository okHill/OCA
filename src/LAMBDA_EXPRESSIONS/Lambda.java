package LAMBDA_EXPRESSIONS;

    interface SinavMerkezi {
        void sinav();   // abstract. Access modifier is optional

        // abstract methods cannot be final, static,
        // or private
        final double PI = 3.14; // this is not abstract.
    }

    abstract class Okul implements SinavMerkezi {

        public void sinav() {
            System.out.println("Ders adi: ");
            System.out.println("Ogretmen adi: ");
            System.out.println("1. soru: ");
            System.out.println("2. soru ");

        }
    }

    class Matematik extends Okul {

        public void sinav() {
            System.out.println("Matematik sinavi: ");
            System.out.println("Dort islem");
            System.out.println("Geometri");
        }
    }

    class Fizik extends Okul {

        public void sinav() {
            System.out.println("Fizik sinavi: ");
            System.out.println("Vektorler");
            System.out.println("Basinc");
        }

    }

    class Biyoloji extends Okul {

    }

    public class Lambda {
        public static void main(String[] args) {

            SinavMerkezi fizik = new Fizik();
            fizik.sinav();
            SinavMerkezi matematik = new Matematik();
            matematik.sinav();
            SinavMerkezi bio = new Biyoloji();
            bio.sinav();
        }
    }

