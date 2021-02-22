package Q_112_139;

public class Q_115 {
}

class Equal {

    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";

        for (String str : str2) {
            str3 = str3 + str;
        }

        boolean b1 = (str1.equals(str3));   // content equality -> true
        boolean b2 = (str1 == str3);        // object equality -> false

        System.out.println(b1 + ", " + b2);

//      let's see their content:

        System.out.println(str1);
        System.out.println(str3);
    }
}
        /*
        What is the result?
        A.false,false
        B.false,true
        C.true,false
        D.true,true
        Answer:C
         */
        //Berat note:just changes lines
        //boolean b1=(str1==str3);
        //boolean b2=(str1.equals(str3));
        //System.out.print(b1+", "+b2);

