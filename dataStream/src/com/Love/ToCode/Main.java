package com.Love.ToCode;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// data Streams are used to read java primitives from a byte and also read calculations
        File file = new File("example.txt");
        if (file.exists()){
            System.out.println("file already exist! "+file.getName());
        }else
        {
            try{
                if (file.createNewFile()){
                    System.out.println("file was created : "+ file.getAbsolutePath());
                }else{
                    System.out.println("cannot creat file!");
                }



            }catch (Exception e){
                System.out.println(e.toString());
            }

        }
        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            out.writeInt(23);
            out.writeDouble(3.5);
            out.writeFloat(7834f);

            out.close();

            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
             int var1 = in.readInt();
             double var2 = in.readDouble();
             float var3 = in.readFloat();

            System.out.println("integer value : "+var1);
            System.out.println("double value : "+var2);
            System.out.println("float value : "+var3);

            in.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
