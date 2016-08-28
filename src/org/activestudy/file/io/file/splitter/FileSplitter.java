package org.activestudy.file.io.file.splitter;

import java.io.*;

/**
 * Created by ThangNguyen on 8/28/2016.
 */
public class FileSplitter {
    public static void splitter(String sourceFilePath, int numberOfPieces) throws IOException {
        File file = new File(sourceFilePath);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFilePath));

        int index = 0;
        byte[] buffer = new byte[(int)file.length()/numberOfPieces];
        int i;

        while ((i = bufferedInputStream.read(buffer)) != -1) {
            index++;
            File newFile = new File(file.getName() + "." + index);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
            bufferedOutputStream.write(buffer);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }

        bufferedInputStream.close();
    }
}
