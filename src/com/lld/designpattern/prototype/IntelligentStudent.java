package com.lld.designpattern.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                super.toString()+
                "iq=" + iq +
                '}';
    }
}
