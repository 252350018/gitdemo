package com.ruide;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
    public static void main(String[] args){
        System.out.println("hello world~~~~");
        File file = new File("g:/a.txt");
        if (file.exists()) {
            System.out.println("this is my exists file");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream inputStream = new FileInputStream(file);
            int cout = inputStream.available();
            System.out.println(cout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
