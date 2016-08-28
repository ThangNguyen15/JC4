package org.activestudy.file.io.org.activestudy.file.encrypter;

import java.io.*;

/**
 * Created by ThangNguyen on 8/28/2016.
 */
public class FileEncrypter {
    public static void encrypter(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        FileInputStream inFile = new FileInputStream(file);
        File encryptedFile = new File("encrypted.txt");
        FileOutputStream outFile = new FileOutputStream(encryptedFile);

        int i;

        while ((i = inFile.read()) != -1) {
            i = i + 5;
            outFile.write(i);
        }
        inFile.close();
        outFile.close();
    }

}
