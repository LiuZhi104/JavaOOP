package model;

public class Student {
    private int age;
    private String name;
    private  String sex;
    private  String num;

    public Student(int age, String name, String sex, String num) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
