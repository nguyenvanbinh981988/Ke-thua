package Quan_ly_NV;

public class FullTimeEmployer extends Employer{
    private float heso;

    public FullTimeEmployer(){
        super();
    }

    public FullTimeEmployer(int id, String name, int age, float heso){
        super(id,name,age);
        this.heso = heso;
    }

    public void setHeso(float heso) {
        this.heso = heso;
    }

    public float getHeso() {
        return heso;
    }

    public float salary(){
        return (heso*30*500000);
    }

    @Override
    public String toString() {
        return "FullTimeEmployer{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", heso=" + getHeso() +
                ", salary=" + salary() +
                '}';
    }
}
