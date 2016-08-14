package org.activestudy.exception.handling.src;

import java.util.Scanner;

/**
 * Created by ThangNguyen on 8/12/2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Mời bạn nhập phép tính: ");
            String calculation = input.nextLine();
            String[] operand = calculation.split(" ", 3);
            double result = 0;
            try {
                switch (operand[1]) {
                    case "+":
                        result = Double.parseDouble(operand[0]) + Double.parseDouble(operand[2]);
                        System.out.println("Kết quả phép tính: " + result);
                        check = false;
                        break;
                    case "-":
                        result = Double.parseDouble(operand[0]) - Double.parseDouble(operand[2]);
                        System.out.println("Kết quả phép tính: " + result);
                        check = false;
                        break;
                    case "x":
                        result = Double.parseDouble(operand[0]) * Double.parseDouble(operand[2]);
                        System.out.println("Kết quả phép tính: " + result);
                        check = false;
                        break;
                    case "/":
                        result = Double.parseDouble(operand[0]) / Double.parseDouble(operand[2]);
                        System.out.println("Kết quả phép tính: " + result);
                        check = false;
                        break;
                    default:
                        System.out.println("Bạn đã nhập sai toán tử.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Bạn đã nhập sai toán hạng.");
            }
        }
    }
}