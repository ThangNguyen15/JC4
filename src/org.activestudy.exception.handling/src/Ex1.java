package org.activestudy.exception.handling.src;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ThangNguyen on 8/12/2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        int number;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        while (check) {
            try {
                System.out.println("Nhap vao 1 so nguyen: 1");
                number = input.nextInt();
                System.out.println("So vua nhap la: " + number);
                check = false;
            } catch (InputMismatchException ex) {
                System.out.println("Ban can nhap so nguyen");
                input.nextLine();
            }
        }
    }
}
