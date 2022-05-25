package com.Love.ToCode;

public class serverThread extends Thread{


    public serverThread(String threadName){
        this.setName(threadName);
    }

    @Override
    public void run() {

        int count = 1;
        try{
            while (count != 99){
                displayMessage(count);
                Thread.sleep(1000);

                count++;
            }
        }

         catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void displayMessage(int count){
        System.out.println(this.getName()+" sent message to user "+ count);
    }



}
