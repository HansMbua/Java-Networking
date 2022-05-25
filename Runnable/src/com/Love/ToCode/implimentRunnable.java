package com.Love.ToCode;

public class implimentRunnable implements Runnable{
    private int index;

    public implimentRunnable(int index){
        this.index = index;
    }

    @Override
    public void run() {

        int clientNumber = 1;
        while (clientNumber != 100){
            System.out.println("server " +this.index+" sent data to client: "+clientNumber);
            clientNumber++;
        }
    }


    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}
