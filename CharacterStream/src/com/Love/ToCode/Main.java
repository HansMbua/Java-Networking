package com.Love.ToCode;

import java.io.*;

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

         out.write("welcome to java networking");
         out.flush();




     }catch (Exception e){
         System.out.println(e.toString());
     }
    }
}
