package com.Prob1;

import java.util.LinkedList;

public class RaceCondition {
    /*
    * Java is a multi-threaded programming language and there is a higher risk to occur race conditions. Because the
    same resource may be accessed by multiple threads at the same time and may change the data.(Data Inconsisstency)
    A race-condition is a condition in which the critical section (a part of the program where shared memory is accessed)
    is concurrently executed by two or more threads. It leads to incorrect behavior of a program.
    In layman terms, a race condition can be defined as, a condition in which two or more threads compete together to
    get certain shared resources.
    * */
// Example:if thread A is reading data from the linked list and another thread B is trying to delete the same data.
//This process leads to a race condition that may result in run time error
    LinkedList<String> list = new LinkedList<>();
    public void add(String name) {
        list.add(name);
        System.out.println(list);
    }
    public void remove(){
        list.remove();
        System.out.println(list);
    }

}

class ThreadB extends Thread{
    RaceCondition rc;

    public ThreadB(RaceCondition rc){
        this.rc=rc;
    }
    @Override
    public void run() {
        rc.remove();
    }
}

class ThreadA extends Thread{
    RaceCondition rc;
    String name;
    public ThreadA(RaceCondition rc, String name){
        this.rc=rc;
        this.name=name;
    }
    @Override
    public void run() {
        rc.add(name);
    }
}

class Main{
    public static void main(String[] args) {
        RaceCondition rc = new RaceCondition();
        ThreadA t1=new ThreadA(rc,"Shyam");
        ThreadB t2=new ThreadB(rc);
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        t2.start();// here there is chance of runtime type exception occured
                    // as both threads use/shared same critical section area
                    // which can be handled by using join method in try catch block or synchronize keyword

    }
}
