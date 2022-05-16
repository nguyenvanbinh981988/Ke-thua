package Quan_ly_NV;

public class Employer {
    private int id;
    private String name;
    private int age;

    public Employer(){}

    public Employer(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "FullTimeEmployer{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", age=" + getAge() +
                '}';
    }
}
