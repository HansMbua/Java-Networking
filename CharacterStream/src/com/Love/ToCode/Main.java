package com.Love.ToCode;

import java.io.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        File file = new File("Example.txt");

        if (file.exists()){
            System.out.println("File created already !");

        }
        else {
            try{
                if (file.createNewFile()){  //when file is created it returns true
                    System.out.println(" file is created ");
                    System.out.println("File path: "+file.getAbsolutePath());

                }
                else
                {
                    System.out.println("file not created ");

                }
            }catch (Exception e ){
                System.out.println(e.toString());
            }

        }


	 try{

         OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(file.getName()));
         InputStreamReader in = new InputStreamReader(new FileInputStream(file.getName()));
         // reading from from output stream
//         System.out.println(out.getEncoding());

         out.write("welcome to java networking");
         out.flush();
         //reading from an input stream
         int data  = in.read();

         while (data != -1){
             System.out.print((char) data);
             data = in.read();
         }



     }catch (Exception e){
         System.out.println(e.toString());
     }
    }
}
