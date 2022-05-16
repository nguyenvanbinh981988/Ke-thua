package Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getRadius()*getRadius()*height)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + height +
                ", color=" + getColor() +
                "}, Which is a subclass of Circle";
    }
}
