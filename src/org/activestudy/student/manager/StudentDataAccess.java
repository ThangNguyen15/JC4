package org.activestudy.student.manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class StudentDataAccess {
    public StudentDataAccess() {
    }

    public static void writeToBinaryFile(List<Student> studentList) {
        try {
            FileOutputStream outFile = new FileOutputStream("StudentList.txt");
            ObjectOutputStream outStream = new ObjectOutputStream(outFile);
            for (int i = 0; i < studentList.size(); i++) {
                outStream.writeObject(studentList.get(i));
            }
            outStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Student> readFromBinaryFile(String path) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream inFile = new FileInputStream(path);
            ObjectInputStream inStream = new ObjectInputStream(inFile);
            Student student;
            while ((student = (Student)inStream.readObject()) != null) {
                studentList.add(student);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(studentList.toString());
        return studentList;
    }

    public static void writeToTextFile(List<Student> studentList) {
        try {
            FileWriter outFile = new FileWriter("ListStudent.txt");
            BufferedWriter outStream = new BufferedWriter(outFile);
            String content;
            content = studentList.toString();

            outStream.write(content);
            outStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
