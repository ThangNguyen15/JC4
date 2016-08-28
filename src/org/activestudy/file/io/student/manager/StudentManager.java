package org.activestudy.file.io.student.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class StudentManager {
    private List <Student> studentList = new ArrayList<>();

    public StudentManager() {
    }

    public StudentManager(List<Student> studentList) {
    }

    public boolean isDuplicateId (String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean addStudent (Student student) {
        boolean check = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (isDuplicateId(studentList.get(i).getId())) {
                check = false;
            }
        }

        if (!isDuplicateId(student.getId()) && check) {
            studentList.add(student);
            return true;
        }
        else {
            return false;
        }
    }


    public boolean removeStudent (String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean modifyName (String id, String newName) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.get(i).setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean modifyAge (String id, int newAge) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.get(i).setAge(newAge);
                return true;
            }
        }
        return false;
    }

    public boolean modifyGender (String id, String newGender) {
        for (int i = 0;i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.get(i).setGender(newGender);
                return true;
            }
        }
        return false;
    }

    public String showStudent() {
        String listOfStudent = "";
        for (int i = 0; i < studentList.size(); i++) {
            listOfStudent += studentList.get(i).toString() + "\n";
        }
        return listOfStudent;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
