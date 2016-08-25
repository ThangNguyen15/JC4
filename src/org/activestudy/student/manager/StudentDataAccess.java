package org.activestudy.student.manager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
                Student tempStudent = studentList.get(i);
                outStream.writeObject(tempStudent);
            }
            outStream.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
