package com.company.catalog;

public class Person {
    private String first_name;
    private String last_name;
    private int age;
    private Character sex;

    public Person(){}
    public Person(String fn, String ln, int age, Character s){
        this.first_name = fn;
        this.last_name = ln;
        this.age = age;
        this.sex = s;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Character getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
