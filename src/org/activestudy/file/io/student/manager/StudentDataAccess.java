package org.activestudy.file.io.student.manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class StudentDataAccess {
    public StudentDataAccess() {
    }

    public static void writeToBinaryFile(List<Student> studentList) throws IOException {
        FileOutputStream outFile = new FileOutputStream("StudentList.txt");
        ObjectOutputStream outStream = new ObjectOutputStream(outFile);
        for (int i = 0; i < studentList.size(); i++) {
            outStream.writeObject(studentList.get(i));
        }
        outStream.close();

    }

    public static List<Student> readFromBinaryFile(String path) throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<>();
        FileInputStream inFile = new FileInputStream(path);
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        Student student;
        while ((student = (Student) inStream.readObject()) != null) {
            studentList.add(student);
        }
        return studentList;
    }

    public static void writeToTextFile(List<Student> studentList) throws IOException {
        FileWriter outFile = new FileWriter("ListStudent.txt");
        BufferedWriter outStream = new BufferedWriter(outFile);
        String[] content = new String[studentList.size()];
        for (int i = 0; i < studentList.size(); i++) {
            content[i] = studentList.get(i).getId() + ";" + studentList.get(i).getName() + ";"
                    + studentList.get(i).getGender() + ";" + studentList.get(i).getAge() + "\n";
        }
        for (int i = 0; i < studentList.size(); i++) {
            outStream.write(content[i]);
            outStream.flush();
        }
        outStream.close();
    }

    public static List<Student> readFromTextFile(String path) throws IOException {
        List<Student> studentList = new ArrayList<>();
        FileReader inFile = new FileReader(path);
        BufferedReader inStream = new BufferedReader(inFile);
        String content;
        while ((content = inStream.readLine()) != null) {
            String[] info = content.split(";");
            for (int i = 0; i < info.length; i += 4) {
                Student student = new Student();
                student.setId(info[i]);
                student.setName(info[i + 1]);
                student.setGender(info[i + 2]);
                student.setAge(Integer.parseInt(info[i + 3]));
                studentList.add(student);
            }
        }
        System.out.println(studentList.toString());
        return studentList;
    }

}
