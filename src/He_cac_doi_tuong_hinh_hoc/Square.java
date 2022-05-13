package He_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {

    public Square(){
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filler){
        super(side,side,color,filler);
    }

    public double getSide(){
      return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() + ", which is a subclass of Rectangle";
    }



}
