package com.lld.designpattern.prototype;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public Student get(String batchName) {
        return registry.get(batchName);
    }

    public void save(Student student) {
        registry.put(student.getBatchName(), student);
    }
}
