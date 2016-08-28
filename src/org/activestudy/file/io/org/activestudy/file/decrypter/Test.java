package org.activestudy.file.io.org.activestudy.file.decrypter;

import java.io.IOException;

/**
 * Created by ThangNguyen on 8/28/2016.
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileDecrypter.decrypter("encrypted.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
