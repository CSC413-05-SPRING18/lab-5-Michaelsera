package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {
            File f = new File("src/lab5/Test.java");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            String[] split;
            HashMap<String, Integer> WordCount = new HashMap<String, Integer>();
            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
                split = readLine.trim().split(" ");
                for (String s : split) {
                    if (WordCount.containsKey(s)) {
                        int count = WordCount.get(s);
                        WordCount.put(s, count + 1);

                    } else {

                        if (s.equals("")) {

                        } else {
                            WordCount.put(s, 1);
                        }
                    }
                }
            }
                System.out.println(WordCount);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }


