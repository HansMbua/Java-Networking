package com.Love.ToCode;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("example.txt");
        if (file.exists()){
            System.out.println("file already created! ");
        }else{
            try{
                if (file.createNewFile()){
                    System.out.println("file created ! ");
                }else
                {
                    System.out.println("file not created ");
                }
            }catch (Exception exception){
                System.out.println(exception.toString());
            }

        }


        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example1.txt"));

             String line = null;

             while((line = bufferedReader.readLine()) != null){
                 bufferedWriter.write(line);
                 bufferedWriter.newLine();
             }
             bufferedReader.close();
             bufferedWriter.close();


        }catch (Exception exception){

        }
    }
}
