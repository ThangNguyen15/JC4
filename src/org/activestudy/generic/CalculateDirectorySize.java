package org.activestudy.generic;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ThangNguyen on 9/11/2016.
 */
public class CalculateDirectorySize {
    public static long getDirectorySize(File directory) {
        long sizeOfDirectory = 0;

        File[] listFile = directory.listFiles();

        Queue <File> fileQueue = new LinkedList<>();

        for (File file: listFile) {
            fileQueue.offer(file);
        }

        while (fileQueue.size() > 0) {
            File getFile = fileQueue.poll();
            long sizeOfFile = getFile.length();
            sizeOfDirectory = sizeOfDirectory + sizeOfFile;
        }
        return sizeOfDirectory;
    }

    public static void main(String[] args) {
        File directory = new File("D:\\Study\\JB 2016\\code");
        System.out.println(CalculateDirectorySize.getDirectorySize(directory));
    }
}
