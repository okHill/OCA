package Q_11_20;

public class Q_36 {
}
     class App36 {

        public static void main(String[] args) {
            String str1 = "Java";
            String str2 = new String ("java");
            //line n1
            if (str2.equalsIgnoreCase(str1.toLowerCase())) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }
}
//     which code fragment, when inserted at line n1, enables the App class to print Equal?
//     if(str2.equals(str1.toLowerCase()))

