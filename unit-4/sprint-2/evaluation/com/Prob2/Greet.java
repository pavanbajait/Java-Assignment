package com.Prob2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Greet implements Runnable{
    /*
    *As we know once the task is performed by thread, that thread dies, & the thread is expensives as it has lots of method which consumes much space in memory area.
    * Also Creating a new trhread for each new task may causes some perfomenace or memory related problems, to overcome this issue threadpool is introduced.
    * Thread pool is a pool of already created threads ready to do our tasks.
    * Thread pool framework is also known as executor framework. this concept is introduced in java5.
    * if we have 10 different independent tasks are there then we need to create 10 separate threads.
    * But using Thread pool concept ,we create a Thread pool of 5 threads and submit all the 10 tasks to this Threadpool.
    * Here a single thread can perform multiple independent tasks. so that performance will be improved.
    * */

    String name;
    Greet(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("Hello " + name +" First Greet by Thread :"+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thank You "+name +" Last Greet by Thread :"+Thread.currentThread().getName());
    }
}
class Main{
    public static void main(String[] args){
        Greet[] executor={
                new Greet("Pavan"),
                new Greet("Pankaj"),
                new Greet("Akash"),
                new Greet("Nehal"),
                new Greet("Vipul")
        };
        ExecutorService print = Executors.newFixedThreadPool(2);
        for(Greet job:executor){
            print.submit(job);
        }
        print.shutdown();
    }
}
