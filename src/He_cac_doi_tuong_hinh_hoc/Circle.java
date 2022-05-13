package He_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filler){
        super(color, filler);
        this.radius= radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius*radius)*Math.PI;
    }

    public double getPeriMeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + radius + ", which is a subclass of Shape";
    }
}
