package Q_80_89;

public class Q_97_Rectangle {

    private double length;
    private double height;
    private double area;

    public void setLength(double length){
        this.length = length;

    }
    public void setHeight(double height){
        this.height = height;

    }

    public void setArea(){

        area = length * height;
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Q_97_Rectangle rectangle = new Q_97_Rectangle();
        rectangle.setLength(7);
        rectangle.setHeight(5);
        rectangle.setArea();
    }
}

/*
    Which two changes would encapsulate this class and ensure that the area field is
    always equal to length*height whenever the Rectangle class is used?

    A.	Call the setArea method at the end of the setHeight method.
    B.	Call the setArea method at the beginning of the setHeight method.
    C.	Call the setArea method at the end of the setLength method.
    D.	Call the setArea method at the beginning of the setLength method.
    E.	Change the setArea method to private.
    F.	Change the area field to public.
    Answer: AC

 */

