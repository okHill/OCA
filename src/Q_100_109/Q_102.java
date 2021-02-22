package Q_100_111;

public class Q_102 {

    public static void main(String[] args) {
//          first version

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        System.out.println(sb);
        System.out.println(s);

        // we cannot compare an object with string.
        // we need to use toString method.

        if (sb.toString().equals(s.toString())){    // s.toString is redundant.
            System.out.println("Match 1");
        }else if(sb.equals(s)){     // StringBuilder needs toString method
            System.out.println("Match 2");
        }else {
            System.out.println("No Match");
        }
    }
}

        //second version
//        StringBuilder sb = new StringBuilder(5);
//        String s = "";
//        if (sb.equals(s)){
//            System.out.println("Match 1");
//        }else if(sb.toString().equals(s.toString())){
//            System.out.println("Match 2");
//        }else {
//            System.out.println("Not Match");
//        }

//third version
//        StringBuilder sb = new StringBuilder("Java");
//        String s = "Java";
//        if(sb.equals(s)){
//            System.out.println("Match 1");
//        }else {
//            System.out.println("Not Match");
//        }


/*
What is the result?
A.	Match 1
B.	Match 2
C.	No Match
D.	A NullPointerException is thrown at runtime.
Answer: A

 */


//just for different
//class Deneme{
//    String s;
//    public Deneme(String s){
//        this.s = s;
//    }
//    public String toString(){
//        return s;
//    }
//
//    public static void main(String[] args) {
//        Deneme t = new Deneme("Java");
//        System.out.println(t);
//    }
//}