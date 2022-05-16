package Thiet_ke_va_trien_khai_lop_Triangle;

public class Test5 {
    public static void main(String[] args) {
        Shape shape = new Shape(10,10,15);
        System.out.println(shape.toString());

        Triangle triangle = new Triangle(10,10,25,"red");
        System.out.println(triangle.toString());
    }
}
