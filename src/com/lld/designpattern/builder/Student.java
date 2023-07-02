package com.lld.designpattern.builder;

import com.lld.designpattern.builder.exception.InvalidGradeYearException;
import com.lld.designpattern.builder.exception.InvalidNameException;
import com.lld.designpattern.builder.exception.InvalidYOEException;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradeYear;
    private double psp;
    private String batchName;

    private Student(Builder b) {
        id = b.id;
        name = b.name;
        yoe = b.yoe;
        gradeYear = b.gradeYear;
        psp = b.psp;
        batchName = b.batchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {

        private int id;
        private String name;
        private int yoe;
        private int gradeYear;
        private double psp;
        private String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public void validate() {
            // name should not be null
            //yoe should >=1
            // gradeYear > 2023

            if (name == null)
                throw new InvalidNameException("Name is Invalid");
            if (yoe < 1)
                throw new InvalidYOEException("Invalid year of experience, should be at least 1");
            if (gradeYear >= 2023)
                throw new InvalidGradeYearException("Grade year should be 2022 or earlier");
        }

        public Student build() {
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradeYear=" + gradeYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }
}
