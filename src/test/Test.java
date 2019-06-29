package test;


import model.Student;

public class Test {
    public static void main(String[] args) {
        Student student=new Student(18,"张三","男","1001");
        System.out.println(student.getName());
        System.out.println(student.getSex());
        System.out.println(student.getAge());
        System.out.println(student.getNum());
    }
}
