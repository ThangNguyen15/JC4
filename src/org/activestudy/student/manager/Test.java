package org.activestudy.student.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class Test {
    public static void main(String[] args) {
        List <Student> studentList = new ArrayList<>();
        Student thang = new Student("1231413456", "Thang", "Male", 20);
        Student duong = new Student("1241424141", "Duong", "Male", 20);
        studentList.add(thang);
        studentList.add(duong);
        StudentDataAccess.writeToBinaryFile(studentList);
    }
}
