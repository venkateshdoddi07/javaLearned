package com.homework.exceptions;

class MyThread extends Thread {

    // This method contains the task of the thread
    public void run() {

        // currentThread() → gives the thread currently running
        System.out.println("Running thread: " + Thread.currentThread().getName());

        try {
            // sleep() → pauses thread for 2 seconds (2000 ms)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread execution completed: " + getName());
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        // Creating thread object
        MyThread t1 = new MyThread();

        // Setting name for thread
        t1.setName("MyFirstThread");

        // isAlive() → checks if thread is running (before start)
        System.out.println("Before start, isAlive: " + t1.isAlive());

        // start() → starts a new thread (calls run internally)
        t1.start();

        // isAlive() → checks after starting thread
        System.out.println("After start, isAlive: " + t1.isAlive());

        try {
            // join() → main thread waits until t1 finishes execution
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // After thread completes
        System.out.println("After join, isAlive: " + t1.isAlive());

        // currentThread() → gives main thread info
        System.out.println("Current thread: " + Thread.currentThread().getName());

        System.out.println("Main thread finished execution");
    }
}