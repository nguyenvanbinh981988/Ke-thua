package He_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;


    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height, String color, boolean filler){
        super(color,filler);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPeriMeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "}, which is a subclass of Shape";
    }
}
