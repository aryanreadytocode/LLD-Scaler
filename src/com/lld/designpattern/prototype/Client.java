package com.lld.designpattern.prototype;

public class Client {

    public static void main(String[] args) {

        Student aprBatch = new Student();
        aprBatch.setBatchName("Apr2022");
        aprBatch.setAvgBatchPsp(96);
        aprBatch.setInstructorName("Sandeep Sinha");
        aprBatch.setYearOfEnrollment(2022);

        Student mayBatch = new Student();
        mayBatch.setBatchName("May2022");
        mayBatch.setAvgBatchPsp(98);
        mayBatch.setInstructorName("Naman Ojha");
        mayBatch.setYearOfEnrollment(2022);

        Student juneBatch = new Student();
        juneBatch.setBatchName("June2022");
        juneBatch.setAvgBatchPsp(100);
        juneBatch.setInstructorName("Tarun Khanna");
        juneBatch.setYearOfEnrollment(2022);


        StudentRegistry registry = new StudentRegistry();
        registry.save(aprBatch);
        registry.save(mayBatch);
        registry.save(juneBatch);

        Student aprPrototype = registry.get("Apr2022");
        Student raj = aprPrototype.clone();
        raj.setId(1);
        raj.setName("Raj");
        raj.setAge(26);
        System.out.println(raj);

        Student mayPrototype = registry.get("May2022");
        Student rahul = mayPrototype.clone();
        rahul.setId(2);
        rahul.setName("Rahul");
        rahul.setAge(28);
        System.out.println(rahul);

        Student junePrototype = registry.get("June2022");
        Student chotu = junePrototype.clone();
        chotu.setId(5);
        chotu.setName("chotu");
        chotu.setAge(32);
        System.out.println(chotu);

    }
}

/*
* Create prototype objects
* Store in registry(map)
* Get the prototype from registry(map)
* Create a clone(deepCopy) of the prototype
* Update the values, and use it
* */
