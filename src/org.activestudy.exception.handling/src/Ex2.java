package org.activestudy.exception.handling.src;

import java.util.Scanner;

/**
 * Created by ThangNguyen on 8/12/2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        boolean check = true;
        int[] arrayInt = new int[10];
        Scanner input = new Scanner(System.in);
        while (check) {
            try {
                for (int i = 0; i < arrayInt.length; i++) {
                    System.out.print("Nhap gia tri cho phan tu thu ");
                    i = input.nextInt();
                    System.out.print("");
                    arrayInt[i] = input.nextInt();
                }
                check = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Vi tri ban nhap ngoai do dai mang.");
                input.nextLine();
            }
        }
    }
}
