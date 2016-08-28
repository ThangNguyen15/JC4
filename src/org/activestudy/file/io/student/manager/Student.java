package org.activestudy.file.io.student.manager;

import java.io.Serializable;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class Student implements Serializable{
    private String id;
    private String name;
    private String gender;
    private int age;

    public void setId(String id) {
        this.id = id;
    }

    public Student() {

    }

    public Student(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getId() + "; " + this.getName() + "; " + this.getGender() + "; " + this.getAge();
    }
}