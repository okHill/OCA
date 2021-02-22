package Q_140_165;

public class Q_147 {


    public static void main(String[] args) {
        FieldInt f=new FieldInt();
        f.printAll();
    }
}

    class FieldInt {
        char c;
        boolean b;
        float f;
        void printAll() {
            System.out.println("c= "+c);//c=
            System.out.println("b= "+b);//b=false
            System.out.println("f= "+f);//f=0.0
        }

}
