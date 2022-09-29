package com.Prob2;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTPExecutor implements Runnable{
    String name;
    MyTPExecutor(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name +" job Started to executing by Thread :"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(name +"...job executed by Thread :"+Thread.currentThread().getName()); }
}

class Main{
    public static void main(String[] args) {
        MyTPExecutor[] mt = {
                new MyTPExecutor("My First Program"),
                new MyTPExecutor("My Second Program"),
                new MyTPExecutor("My Third Program"),
                new MyTPExecutor("My Fourth Program"),
                new MyTPExecutor("My Fifth Program"),
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (MyTPExecutor x : mt) {
            executor.submit(x);
        }
        executor.shutdown();
    }
}