package Quan_ly_NV;

public class PartimeEmplayer extends Employer {
    private float workday;

    public PartimeEmplayer() {
        super();
    }

    public PartimeEmplayer(int id, String name, int age, float workday) {
        super(id, name, age);
        this.workday = workday;
    }

    public void setWorkday(float workday) {
        this.workday = workday;
    }

    public float getWorkday() {
        return workday;
    }

    public float salary() {
        return (workday * 200000);
    }

    @Override
    public String toString() {
        return "FullTimeEmployer{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", workday=" + getWorkday() +
                ", salary=" + salary() +
                '}';
    }
}
