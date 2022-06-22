package com.Love.ToCode;

import java.io.PrintStream;

public class PrtStream {

    public  PrtStream(){
        try{
            int var1 = 10;
            PrintStream  out = new PrintStream("example2.txt");
            String message = "the value is : " +var1;
            System.out.println(message);

              out.println(message);
              out.close();
        }catch (Exception e){
          e.printStackTrace();
        }


    }



}
