package org.activestudy.file.io.org.activestudy.file.encrypter;

import java.io.IOException;

/**
 * Created by ThangNguyen on 8/28/2016.
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileEncrypter.encrypter("example.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
