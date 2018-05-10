package com.practice.design_pattern.observer;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        teacher.addObserver(s1);
        teacher.addObserver(s2);
        teacher.addObserver(s3);

        teacher.setAction("老师来了");

        System.out.println(s1.getAction());
        System.out.println(s2.getAction());
        System.out.println(s3.getAction());

        System.out.println("================");

        teacher.setAction("老师走了");

        System.out.println(s1.getAction());
        System.out.println(s2.getAction());
        System.out.println(s3.getAction());
    }
}