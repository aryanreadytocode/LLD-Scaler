package com.lld.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setBatchName("LLD")
                .setName("Raj")
                .setGradeYear(2016)
                .setPsp(90)
                .setYoe(1)
                .build();

        System.out.println(s);
    }
}
