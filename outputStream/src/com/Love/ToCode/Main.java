package com.Love.ToCode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {


        try {
            FileOutputStream outputStream = new FileOutputStream("example.txt",true);

            char H = 'H';
            outputStream.write(H);
            String message = " Hello outputstream!";
            outputStream.write(message.getBytes());
            outputStream.close();

        } catch (Exception e) {
            System.out.print(e.toString());
        }

    }
}
