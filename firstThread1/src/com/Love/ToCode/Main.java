package com.Love.ToCode;

public class Main {

    public static void main(String[] args)  {
	serverThread  serverThread = new serverThread("server1");
//        serverThread  serverThread2 = new serverThread("server2");
//        serverThread2.setPriority(Thread.);
//        System.out.println(serverThread2.getName()+" priority is "+ serverThread2.getPriority());
//        serverThread2.start();
        serverThread.start();


    }
}
