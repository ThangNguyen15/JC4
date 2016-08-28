package org.activestudy.file.io.student.manager;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ThangNguyen on 8/25/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        int option;

        Student student = new Student();
        StudentManager studentManager = new StudentManager();
        List<Student> studentList = studentManager.getStudentList();
        try {
            do {
                System.out.println("Student management program.");
                System.out.println("===========MENU============");
                System.out.println("1. Add student.");
                System.out.println("2. Remove student.");
                System.out.println("3. Edit student");
                System.out.println("4. Show all student.");
                System.out.println("5. Write to binary file.");
                System.out.println("6. Read from binary file.");
                System.out.println("7. Write to text file.");
                System.out.println("8. Read from text file.");
                System.out.println("9. Quit program.");
                System.out.println("Your option: ");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter ID: ");
                        student.setId(input.nextLine());
                        System.out.println("Enter name: ");
                        student.setName(input.nextLine());
                        student.setGender("Enter gender: ");
                        student.setGender(input.nextLine());
                        System.out.println("Enter age: ");
                        student.setAge(input.nextInt());
                        studentManager.addStudent(student);
                        if (studentManager.addStudent(student)) {
                            System.out.println("Add successfully");
                        } else {
                            System.out.println("Add failed!");
                        }
                        break;
                    case 2:
                        System.out.println("Enter ID of student you want to remove: ");
                        String id = input.nextLine();
                        studentManager.removeStudent(id);
                        if (studentManager.removeStudent(id)) {
                            System.out.println("Remove successfully");
                        } else {
                            System.out.println("Remove failed!");
                        }
                        break;
                    case 3:
                        System.out.println("1. Edit student's name.");
                        System.out.println("2. Edit student's gender.");
                        System.out.println("3. Edit student's age.");
                        System.out.println("Enter your choice: ");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter ID of student you want to edit: ");
                                id = input.nextLine();
                                System.out.println("Enter new name: ");
                                String newName = input.nextLine();
                                studentManager.modifyName(id, newName);
                                break;
                            case 2:
                                System.out.println("Enter ID of student you want to edit: ");
                                id = input.nextLine();
                                System.out.println("Enter gender: ");
                                String newGender = input.nextLine();
                                studentManager.modifyGender(id, newGender);
                                break;
                            case 3:
                                System.out.println("Enter ID of student you want to edit: ");
                                id = input.nextLine();
                                System.out.println("Enter age: ");
                                int newAge = input.nextInt();
                                studentManager.modifyAge(id, newAge);
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("========STUDENT LIST========");
                        System.out.println(studentManager.showStudent());
                        break;
                    case 5:
                        StudentDataAccess.writeToBinaryFile(studentList);
                        break;
                    case 6:
                        StudentDataAccess.readFromBinaryFile("StudentList.txt");
                        break;
                    case 7:
                        StudentDataAccess.writeToTextFile(studentList);
                        break;
                    case 8:
                        StudentDataAccess.readFromTextFile("ListStudent.txt");
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Try again!");
                }
            } while (option != 9);
        } catch (InputMismatchException ex) {
            System.out.println("Please enter your option again!");
        }
    }
}