package He_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "green";
    private boolean filler = true;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public boolean isFiller() {
        return filler;
    }

    @Override
    public String toString() {
        if (filler) {
            return "A Shape with color of " + color + "and filled";
        } else {
            return "A Shape with color of " + color + "and not filled";
        }
    }
}
