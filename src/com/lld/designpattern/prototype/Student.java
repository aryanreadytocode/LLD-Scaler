package com.lld.designpattern.prototype;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int age;
    private String batchName;
    private String instructorName;
    private double avgBatchPsp;
    private int yearOfEnrollment;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public Student() {
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

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public Student(Student s) {
        this.batchName = s.batchName;
        this.instructorName = s.instructorName;
        this.avgBatchPsp = s.avgBatchPsp;
        this.yearOfEnrollment = s.yearOfEnrollment;
    }



    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batchName='" + batchName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", yearOfEnrollment=" + yearOfEnrollment +
                '}';
    }
}
