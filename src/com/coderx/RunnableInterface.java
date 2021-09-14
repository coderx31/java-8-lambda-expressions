package com.coderx;

public class RunnableInterface {
    public static void main(String[] args) {
       Thread myThread = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Printed inside runnable");
           }
       });

        myThread.start();

        // using lambda Just one line
        Thread myLambdaThread = new Thread(() ->System.out.println("Printed inside Lambda Runnable") );
        myLambdaThread.start();
    }
}
