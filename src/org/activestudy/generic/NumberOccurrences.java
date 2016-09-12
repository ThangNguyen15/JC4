package org.activestudy.generic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ThangNguyen on 9/5/2016.
 */
public class NumberOccurrences {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Study\\JB 2016\\code\\JC4\\example.txt"))) {
            String string = "";
            String str = "";
            while ((string = bufferedReader.readLine()) != null) {
                str += string;
            }

            char[] charArray = str.toCharArray();
            Map<Character, Integer> charCounter = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = charArray[i];
                if (charCounter.containsKey(charArray[i])) {
                    charCounter.put(ch, charCounter.get(ch) + 1);
                } else {
                    charCounter.put(ch, 1);
                }
            }

            for (Character character : charCounter.keySet()) {
                System.out.println("Number occurences of " + character + ": " + charCounter.get(character));
            }

        }
    }
}

