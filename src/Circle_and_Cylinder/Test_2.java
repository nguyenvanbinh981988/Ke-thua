package Circle_and_Cylinder;

public class Test_2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "yellow");
        System.out.println(circle.toString());


        Cylinder cylinder = new Cylinder(10.0,5.0, "blue");
        System.out.println(cylinder.toString());
    }
}
