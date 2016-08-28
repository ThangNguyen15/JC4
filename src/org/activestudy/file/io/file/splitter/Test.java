package org.activestudy.file.io.file.splitter;

import java.io.File;
import java.io.IOException;

/**
 * Created by ThangNguyen on 8/28/2016.
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\chabinu\\Downloads\\Music\\Deuces - Chris Brown_ Tyga_ Kevin McCall [MP3 320kbps].mp3");
        try {
            FileSplitter.splitter(file.getPath(),5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
