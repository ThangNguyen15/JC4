package org.activestudy.textscanner;

import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ThangNguyen on 10/7/2016.
 */
public class AdvancedFileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        BlockingQueue<String> queueReader = new ArrayBlockingQueue(1024);
        BlockingQueue<String> queueWriter = new ArrayBlockingQueue(1024);

        new Thread(() -> {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader
                        (new FileInputStream("D:\\Study\\JB 2016\\code\\fuck.txt")));
                String s = "";
                while ((s = reader.readLine()) != null) {
                    queueReader.put(s);
                }
                queueReader.put("EOF");

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    String s = queueReader.take();
                    if (s.equals("EOF")) {
                        queueWriter.put(s);
                        break;
                    }
                    if (!(s.startsWith("84")) || s.contains("fuck")) {
                        queueWriter.put(s);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                        (new FileOutputStream("D:\\Study\\JB 2016\\code\\result.txt")));

                while (true) {
                    String s = queueWriter.take();
                    if (s.equals("EOF")) {
                        break;
                    }
                    writer.write(s);
                    writer.newLine();
                }
                writer.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }


        }).start();
    }
}