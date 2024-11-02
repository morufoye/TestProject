package org.example;

public class Child {

    public Integer age;
    private String level;

    private String address;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
           throw new IllegalArgumentException("Negative value not allowed");
        }
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
