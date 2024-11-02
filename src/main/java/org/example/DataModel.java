package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    public String name;
    public String regNo;
    public List<Integer> courses = new ArrayList<>();

    public DataModel(String name, String regNo, List<Integer> courses) {
           this.name = name;
           this.regNo = regNo;
           this.courses = courses;
    }

}
